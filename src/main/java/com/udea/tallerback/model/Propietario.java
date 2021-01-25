package com.udea.tallerback.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="propietarios")
public class Propietario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPropietario;
    private int ceddulaPropietario;
    private String nombrePropietario;
    private int telefonoPropietario;
    private String correoPropietario;
    private Date fechaInicioPropietario;
    private Date fechaFinPropietario;
    private String apellidoPropietario;
    private String usuarioInicioPropietario;
    private String usuarioFinPropietario;
    @NotNull
    private int idVehiculo;
    @NotNull
    private int idUsuario;
    @NotNull
    private int idEmpleado;

    public Propietario(int idPropietario, int ceddulaPropietario, String nombrePropietario, int telefonoPropietario, String correoPropietario, Date fechaInicioPropietario, Date fechaFinPropietario, String apellidoPropietario, String usuarioInicioPropietario, String usuarioFinPropietario, int idVehiculo, int idUsuario, int idEmpleado) {
        this.idPropietario = idPropietario;
        this.ceddulaPropietario = ceddulaPropietario;
        this.nombrePropietario = nombrePropietario;
        this.telefonoPropietario = telefonoPropietario;
        this.correoPropietario = correoPropietario;
        this.fechaInicioPropietario = fechaInicioPropietario;
        this.fechaFinPropietario = fechaFinPropietario;
        this.apellidoPropietario = apellidoPropietario;
        this.usuarioInicioPropietario = usuarioInicioPropietario;
        this.usuarioFinPropietario = usuarioFinPropietario;
        this.idVehiculo = idVehiculo;
        this.idUsuario = idUsuario;
        this.idEmpleado = idEmpleado;
    }

    public Propietario() {
    }

    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    public int getCeddulaPropietario() {
        return ceddulaPropietario;
    }

    public void setCeddulaPropietario(int ceddulaPropietario) {
        this.ceddulaPropietario = ceddulaPropietario;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public int getTelefonoPropietario() {
        return telefonoPropietario;
    }

    public void setTelefonoPropietario(int telefonoPropietario) {
        this.telefonoPropietario = telefonoPropietario;
    }

    public String getCorreoPropietario() {
        return correoPropietario;
    }

    public void setCorreoPropietario(String correoPropietario) {
        this.correoPropietario = correoPropietario;
    }

    public Date getFechaInicioPropietario() {
        return fechaInicioPropietario;
    }

    public void setFechaInicioPropietario(Date fechaInicioPropietario) {
        this.fechaInicioPropietario = fechaInicioPropietario;
    }

    public Date getFechaFinPropietario() {
        return fechaFinPropietario;
    }

    public void setFechaFinPropietario(Date fechaFinPropietario) {
        this.fechaFinPropietario = fechaFinPropietario;
    }

    public String getApellidoPropietario() {
        return apellidoPropietario;
    }

    public void setApellidoPropietario(String apellidoPropietario) {
        this.apellidoPropietario = apellidoPropietario;
    }

    public String getUsuarioInicioPropietario() {
        return usuarioInicioPropietario;
    }

    public void setUsuarioInicioPropietario(String usuarioInicioPropietario) {
        this.usuarioInicioPropietario = usuarioInicioPropietario;
    }

    public String getUsuarioFinPropietario() {
        return usuarioFinPropietario;
    }

    public void setUsuarioFinPropietario(String usuarioFinPropietario) {
        this.usuarioFinPropietario = usuarioFinPropietario;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
}
