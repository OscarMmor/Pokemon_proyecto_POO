
package Datos;
import java.io.Serializable; // Útil si planeas guardar/cargar objetos
public class Pokemon {
    
    private int id; // Podría ser el número de Pokedex
    private String nombre;
    private String tipo1;
    private String tipo2; // Opcional
    private String habilidad;
    // Puedes agregar más campos como descripción, ruta de imagen, etc.

    // Constructor vacío (útil para algunas librerías)
    public Pokemon() {
    }

    // Constructor con parámetros
    public Pokemon(int id, String nombre, String tipo1, String tipo2, String habilidad) {
        this.id = id;
        this.nombre = nombre;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.habilidad = habilidad;
    }

    // Getters y Setters para todos los atributos
    // Puedes generarlos automáticamente en NetBeans:
    // Clic derecho en el editor -> Insert Code... -> Getter and Setter... -> Select All -> Generate

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    // (Opcional) toString para facilitar la depuración
    @Override
    public String toString() {
        return "Pokemon{" + "id=" + id + ", nombre=" + nombre + ", tipo1=" + tipo1 + '}';
    }
}

