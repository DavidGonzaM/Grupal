package modelos;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author David
 */
//@Entity
//@Table(name="alumno")
public class Alumno implements Serializable {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
//    @Column(name="nombre")
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//    @Column(name="dni")
    private Integer DNI;

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }
//    @Column(name="fecha")
    private Date fecha;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
//    @Column(name="tipo")
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
//    @Column(name="horas")
    private Integer horas;

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }
    
//    @Column(name="actvidad")
    private String actividad;

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }
    
//    @Column(name="observaciones")
    private String observaciones;

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Alumno() {
    }

    public Alumno(String nombre, Integer DNI, Date fecha, String tipo, Integer horas, String actividad, String observaciones) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fecha = fecha;
        this.tipo = tipo;
        this.horas = horas;
        this.actividad = actividad;
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id 
                + ", nombre=" + nombre 
                + ", DNI=" + DNI 
                + ", fecha=" + fecha 
                + ", tipo=" + tipo 
                + ", horas=" + horas 
                + ", actividad=" + actividad 
                + ", observaciones=" + observaciones + '}';
    }
    
    
    
}
