package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNumInventario;
    private String nombre;
    private String estado;
    private String lugar;
    private String usuario;

    //Constructor vacio
    public Inventario() {
    }

    //Constructor con paramaetros
    public Inventario(Long idNumInventario, String nombre, String estado, String lugar, String usuario) {
        this.idNumInventario = idNumInventario;
        this.nombre = nombre;
        this.estado = estado;
        this.lugar = lugar;
        this.usuario = usuario;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}