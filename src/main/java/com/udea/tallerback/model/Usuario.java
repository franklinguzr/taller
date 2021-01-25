package com.udea.tallerback.model;

import com.sun.istack.NotNull;
import org.springframework.context.annotation.Conditional;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUsuario;
    @NotNull
    private String usuario;
    @NotNull
    private String contraseñaUsuario;
    @NotNull
    private Date fechaInicioUsuario;
    @NotNull
    private Date fechaFinUsuario;
    @NotNull
    private String rolUsuario;
    @NotNull
    private String nombreUsuario;
    @NotNull
    private int idEmpleado;

    public Usuario(int idUsuario, String usuario, String contraseñaUsuario, Date fechaInicioUsuario, Date fechaFinUsuario, String rolUsuario, String nombreUsuario, int idEmpleado) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.contraseñaUsuario = contraseñaUsuario;
        this.fechaInicioUsuario = fechaInicioUsuario;
        this.fechaFinUsuario = fechaFinUsuario;
        this.rolUsuario = rolUsuario;
        this.nombreUsuario = nombreUsuario;
        this.idEmpleado = idEmpleado;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public Usuario() {
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseñaUsuario() {
        return contraseñaUsuario;
    }

    public void setContraseñaUsuario(String contraseñaUsuario) {
        this.contraseñaUsuario = contraseñaUsuario;
    }

    public Date getFechaInicioUsuario() {
        return fechaInicioUsuario;
    }

    public void setFechaInicioUsuario(Date fechaInicioUsuario) {
        this.fechaInicioUsuario = fechaInicioUsuario;
    }

    public Date getFechaFinUsuario() {
        return fechaFinUsuario;
    }

    public void setFechaFinUsuario(Date fechaFinUsuario) {
        this.fechaFinUsuario = fechaFinUsuario;
    }

    public String getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }


}
