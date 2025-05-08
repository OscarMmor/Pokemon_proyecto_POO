
package Datos;

public class Pokemon {
    String nombre;
    String tipo;
    double peso;
    String habilidad;

    public Pokemon(String nombre, String tipo, int numPokedex, double peso, String habilidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.peso = peso;
        this.habilidad = habilidad;
    }

    public Pokemon() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }
}

  
    

