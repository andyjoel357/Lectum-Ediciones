package modelo;

public class Inventario {

    private int id_libro;
    private String titulo;
    private String autor;
    private int numero_paginas;
    private String codigo;
    private String stock;

    public Inventario() {
        this.id_libro = 0;
        this.titulo = "";
        this.autor = "";
        this.numero_paginas = 0;
        this.codigo = "";
        this.stock = "";
    }

    public Inventario(int id_libro, String titulo, String autor, int numero_paginas, String codigo, String stock) {
        this.id_libro = id_libro;
        this.titulo = titulo;
        this.autor = autor;
        this.numero_paginas = numero_paginas;
        this.codigo = codigo;
        this.stock = stock;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumero_paginas() {
        return numero_paginas;
    }

    public void setNumero_paginas(int numero_paginas) {
        this.numero_paginas = numero_paginas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

}
