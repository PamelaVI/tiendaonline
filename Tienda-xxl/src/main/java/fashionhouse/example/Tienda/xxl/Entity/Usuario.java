package fashionhouse.example.Tienda.xxl.Entity;
import java.io.Serializable;
import java.time.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="Usuario")
public class Usuario implements Serializable {
    @Id
    @JsonProperty("id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String nombre; 
    private String apellido;
    private String direccion;
    private LocalDate fecha_creacion;
    
    public Usuario( Long id,String nombre, String apellido, String direccion,LocalDate fecha_creacion){
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.direccion=direccion;
        this.fecha_creacion=fecha_creacion;

    }
    public Usuario(){

    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre( String nombre){
        this.nombre=nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    public LocalDate getFecha_creacion(){
        return fecha_creacion;
    }
    public void setFecha_creacion(LocalDate fecha_creacion){
        this.fecha_creacion=fecha_creacion;
    }
}
