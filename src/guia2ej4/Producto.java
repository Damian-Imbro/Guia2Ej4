/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2ej4;

/**
 *
 * @author Damian
 */
public class Producto implements Comparable<Producto>{
    private int codigo;
    private String descripcion;
    private double precio;
    private Categorias rubro;
    private int stock;

    public Producto(int codigo, String descripcion, double precio, Categorias rubro, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.rubro = rubro;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categorias getRubro() {
        return rubro;
    }

    public void setRubro(Categorias rubro) {
        this.rubro = rubro;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", rubro=" + rubro + ", stock=" + stock + '}';
    }

    @Override
    public int compareTo(Producto t) {
        if (codigo==t.codigo) {
          return 0;  
        }else if (codigo>t.codigo){
            return 1;
        }else{
            return -1;
        }
    }
    
    
}
