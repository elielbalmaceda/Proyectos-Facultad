import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        //Propiedades
        private Long idNumInventario;
        
        private String nombre;

        private String estado;
        
        private String lugar;
        
        private String usuario;
        
        //Getters and Setters
        public Long getIdNumInventario() {
        return idNumInventario;
        }
        public void setIdNumInventario(Long idNumInventario) {
        this.idNumInventario = idNumInventario;
        }

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
