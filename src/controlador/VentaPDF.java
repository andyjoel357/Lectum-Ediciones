package controlador;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import vista.InternalFrameInventario.InternalNotaDeVenta;

public class VentaPDF {

    private String institucion;
    private String cliente;
    private String rucCi;
    private String telefono;
    private String direccion;
    private String numeroF;
  

    private String fecha = "";
    private String nombrePDF = "";

    //METODO CARGAR DATOS
    public void Datos(int id) {
        Connection cn = conexion.Conexion.conectar();
        String sql = "select*from cabeceraVenta where id_detalleCabecera= '" + id + "'";
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                numeroF=rs.getString("id_detalleCabecera");
                institucion = rs.getString("institucion");
                cliente = rs.getString("cliente");
                rucCi = rs.getString("ruc_ci");
                direccion = rs.getString("direccion");
                telefono = rs.getString("telefono");

            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("ERROR AL OBTENER DATOS" + e);
        }

    }

    //METODO PARA GENERAR LA FACTURA
    public void generarPDF() {
        try {
            //fecha actual

            Date date = new Date();
            fecha = new SimpleDateFormat("yyyy/MM/dd").format(date);
            String fechaN = "";
            for (int i = 0; i < fecha.length(); i++) {
                if (fecha.charAt(i) == '/') {
                    fechaN = fecha.replace("/", "_");
                }

            }

            nombrePDF = "Venta_" + cliente + "_" + fechaN + ".pdf";

            FileOutputStream archivo;
            File file = new File("src/pdf/" + nombrePDF);
            archivo = new FileOutputStream(file);

            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();

            Image img = Image.getInstance("src/img/logolec.png");
            Paragraph fechas = new Paragraph();
            Font negr = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLUE);
            fechas.add(Chunk.NEWLINE);//agregar neuva linea
            fechas.add("FACTURA: "+numeroF + "\nFecha: " + fecha + "\n\n");

            PdfPTable Encabezado = new PdfPTable(4);

            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);

            float[] ColumnaEncabezado = new float[]{20f, 30f, 70f, 40f};

            Encabezado.setWidths(ColumnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);

            Encabezado.addCell(img);

            String rucE = "1711179166001";
            String nombreE = "LECTUM EDICIONES";
            String telefonoE = "0999930173";
            String direccionE = "Via a Cotogchoa S/N, Av Gral Enriquez";

            Encabezado.addCell("");
            Encabezado.addCell("Ruc: " + rucE + "\nNombre: " + nombreE + "\nTelefono: " + telefonoE + "\nDireccion: " + direccionE);
            Encabezado.addCell(fechas);
            doc.add(Encabezado);

            //Cuerpo
            Paragraph datos = new Paragraph();
            datos.add(Chunk.NEWLINE);
            datos.add("DATOS: " + "\n\n");
            doc.add(datos);

            //datos cliente
            PdfPTable clienteDatos = new PdfPTable(5);
            clienteDatos.setWidthPercentage(100);
            clienteDatos.getDefaultCell().setBorder(0);

            float[] ColumnaCliente = new float[]{20f, 20f, 20f, 20f, 20f};
            clienteDatos.setWidths(ColumnaCliente);
            clienteDatos.setHorizontalAlignment(Element.ALIGN_LEFT);

            PdfPCell cliente1 = new PdfPCell(new Phrase("Cedula/Ruc: ", negr));
            PdfPCell cliente2 = new PdfPCell(new Phrase("Institucion: ", negr));
            PdfPCell cliente3 = new PdfPCell(new Phrase("Cliente: ", negr));
            PdfPCell cliente4 = new PdfPCell(new Phrase("Direccion: ", negr));
            PdfPCell cliente5 = new PdfPCell(new Phrase("Telefono: ", negr));

            cliente1.setBorder(0);
            cliente2.setBorder(0);
            cliente3.setBorder(0);
            cliente4.setBorder(0);
            cliente5.setBorder(0);

            clienteDatos.addCell(cliente1);
            clienteDatos.addCell(cliente2);
            clienteDatos.addCell(cliente3);
            clienteDatos.addCell(cliente4);
            clienteDatos.addCell(cliente5);
            clienteDatos.addCell(rucCi);
            clienteDatos.addCell(institucion);
            clienteDatos.addCell(cliente);
            clienteDatos.addCell(direccion);
            clienteDatos.addCell(telefono);

            doc.add(clienteDatos);

            Paragraph espacio = new Paragraph();
            espacio.add(Chunk.NEWLINE);
            espacio.add("");
            espacio.setAlignment(Element.ALIGN_CENTER);
            doc.add(espacio);

            PdfPTable productos = new PdfPTable(4);

            productos.setWidthPercentage(100);
            productos.getDefaultCell().setBorder(0);

            float[] ColumnaProductos = new float[]{25f, 45f, 30f, 40f};
            productos.setWidths(ColumnaProductos);
            productos.setHorizontalAlignment(Element.ALIGN_LEFT);

            PdfPCell producto1 = new PdfPCell(new Phrase("Cantidad: ", negr));
            PdfPCell producto2 = new PdfPCell(new Phrase("Descipcion: ", negr));
            PdfPCell producto3 = new PdfPCell(new Phrase("Precio Unitario: ", negr));
            PdfPCell producto4 = new PdfPCell(new Phrase("PrecioTotal: ", negr));

            producto1.setBorder(0);
            producto2.setBorder(0);
            producto3.setBorder(0);
            producto4.setBorder(0);

            producto1.setBackgroundColor(BaseColor.LIGHT_GRAY);
            producto2.setBackgroundColor(BaseColor.LIGHT_GRAY);
            producto3.setBackgroundColor(BaseColor.LIGHT_GRAY);
            producto4.setBackgroundColor(BaseColor.LIGHT_GRAY);

            productos.addCell(producto1);
            productos.addCell(producto2);
            productos.addCell(producto3);
            productos.addCell(producto4);

            for (int i = 0; i < InternalNotaDeVenta.jTableLibros.getRowCount(); i++) {
                String cantidad = InternalNotaDeVenta.jTableLibros.getValueAt(i, 1).toString();
                String producto = InternalNotaDeVenta.jTableLibros.getValueAt(i, 2).toString();
                String precio = InternalNotaDeVenta.jTableLibros.getValueAt(i, 3).toString();
                String total = InternalNotaDeVenta.jTableLibros.getValueAt(i, 4).toString();

                productos.addCell(producto);
                productos.addCell(cantidad);
                productos.addCell(precio);
                productos.addCell(total);

            }

            doc.add(productos);

            //total a pagar
            Paragraph info = new Paragraph();

            info.add(Chunk.NEWLINE);
            info.add("Descuento: "+ InternalNotaDeVenta.jTextDescuento.getText()+"%\n\n");
            info.add("Total a pagar: " + InternalNotaDeVenta.jTextTotal.getText());
            info.setAlignment(Element.ALIGN_RIGHT);
            doc.add(info);

            //firma
            Paragraph firma = new Paragraph();
            firma.add(Chunk.NEWLINE);
            firma.add("Firma Autorizada\n\n");
            firma.add("________________________");
            firma.setAlignment(Element.ALIGN_CENTER);
            doc.add(firma);

            Paragraph mensaje = new Paragraph();
            mensaje.add(Chunk.NEWLINE);
            mensaje.add("Gracias por la Compra");
            mensaje.setAlignment(Element.ALIGN_CENTER);
            doc.add(mensaje);

            doc.close();
            archivo.close();

            Desktop.getDesktop().open(file);

        } catch (DocumentException | IOException e) {
            System.out.println("ERROR AL GENERAR PDF " + e);
        }

    }

}
