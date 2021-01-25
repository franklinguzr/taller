package com.udea.tallerback.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="vehiculos")
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idVehiculo;
    private String placaVehiculo;
    private Date fechaInicioVehiculo;
    private int cedulaPropietarioVehiculo;
    private String colorVehiculo;
    private String marcaVehiculo;
    private Date fechaFinalVehiculo;
    @NotNull
    private int idPropietarioVehiculo;
    @NotNull
    private int idTipoVehiculo;
    private String modeloVehiculo;
    private String usuarioInicioVehiculo;
    private String usuarioFinalVehiculo;
    @NotNull
    private int idEmpleado;

    public Vehiculo() {
    }

    public Vehiculo(int idVehiculo, String placaVehiculo, Date fechaInicioVehiculo, int cedulaPropietarioVehiculo, String colorVehiculo, String marcaVehiculo, Date fechaFinalVehiculo, int idPropietarioVehiculo, int idTipoVehiculo, String modeloVehiculo, String usuarioInicioVehiculo, String usuarioFinalVehiculo, int idEmpleado) {
        this.idVehiculo = idVehiculo;
        this.placaVehiculo = placaVehiculo;
        this.fechaInicioVehiculo = fechaInicioVehiculo;
        this.cedulaPropietarioVehiculo = cedulaPropietarioVehiculo;
        this.colorVehiculo = colorVehiculo;
        this.marcaVehiculo = marcaVehiculo;
        this.fechaFinalVehiculo = fechaFinalVehiculo;
        this.idPropietarioVehiculo = idPropietarioVehiculo;
        this.idTipoVehiculo = idTipoVehiculo;
        this.modeloVehiculo = modeloVehiculo;
        this.usuarioInicioVehiculo = usuarioInicioVehiculo;
        this.usuarioFinalVehiculo = usuarioFinalVehiculo;
        this.idEmpleado = idEmpleado;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public Date getFechaInicioVehiculo() {
        return fechaInicioVehiculo;
    }

    public void setFechaInicioVehiculo(Date fechaInicioVehiculo) {
        this.fechaInicioVehiculo = fechaInicioVehiculo;
    }

    public int getCedulaPropietarioVehiculo() {
        return cedulaPropietarioVehiculo;
    }

    public void setCedulaPropietarioVehiculo(int cedulaPropietarioVehiculo) {
        this.cedulaPropietarioVehiculo = cedulaPropietarioVehiculo;
    }

    public String getColorVehiculo() {
        return colorVehiculo;
    }

    public void setColorVehiculo(String colorVehiculo) {
        this.colorVehiculo = colorVehiculo;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public Date getFechaFinalVehiculo() {
        return fechaFinalVehiculo;
    }

    public void setFechaFinalVehiculo(Date fechaFinalVehiculo) {
        this.fechaFinalVehiculo = fechaFinalVehiculo;
    }

    public int getIdPropietarioVehiculo() {
        return idPropietarioVehiculo;
    }

    public void setIdPropietarioVehiculo(int idPropietarioVehiculo) {
        this.idPropietarioVehiculo = idPropietarioVehiculo;
    }

    public int getIdTipoVehiculo() {
        return idTipoVehiculo;
    }

    public void setIdTipoVehiculo(int idTipoVehiculo) {
        this.idTipoVehiculo = idTipoVehiculo;
    }

    public String getModeloVehiculo() {
        return modeloVehiculo;
    }

    public void setModeloVehiculo(String modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    public String getUsuarioInicioVehiculo() {
        return usuarioInicioVehiculo;
    }

    public void setUsuarioInicioVehiculo(String usuarioInicioVehiculo) {
        this.usuarioInicioVehiculo = usuarioInicioVehiculo;
    }

    public String getUsuarioFinalVehiculo() {
        return usuarioFinalVehiculo;
    }

    public void setUsuarioFinalVehiculo(String usuarioFinalVehiculo) {
        this.usuarioFinalVehiculo = usuarioFinalVehiculo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
}
