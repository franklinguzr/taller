package com.udea.tallerback.model;

import com.sun.istack.NotNull;
import org.hibernate.exception.DataException;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="reparaciones")
public class Reparacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idReparacion;
    private String estadoReparacion;
    private String descripcionReparacion;
    private Date fechaInicioReparacion;
    private Date fechaFinReparacion;
    private int costoReparacion;
    @NotNull
    private int idVehiculo;
    @NotNull
    private int idPropietario;
    @NotNull
    private int idTipoVehiculo;
    private String aprovacionProietario;
    @NotNull
    private int idEmpleado;

    public Reparacion(int idReparacion, String estadoReparacion, String descripcionReparacion, Date fechaInicioReparacion, Date fechaFinReparacion, int costoReparacion, int idVehiculo, int idPropietario, int idTipoVehiculo, String aprovacionProietario, int idEmpleado) {
        this.idReparacion = idReparacion;
        this.estadoReparacion = estadoReparacion;
        this.descripcionReparacion = descripcionReparacion;
        this.fechaInicioReparacion = fechaInicioReparacion;
        this.fechaFinReparacion = fechaFinReparacion;
        this.costoReparacion = costoReparacion;
        this.idVehiculo = idVehiculo;
        this.idPropietario = idPropietario;
        this.idTipoVehiculo = idTipoVehiculo;
        this.aprovacionProietario = aprovacionProietario;
        this.idEmpleado = idEmpleado;
    }

    public Reparacion() {
    }

    public int getIdReparacion() {
        return idReparacion;
    }

    public void setIdReparacion(int idReparacion) {
        this.idReparacion = idReparacion;
    }

    public String getEstadoReparacion() {
        return estadoReparacion;
    }

    public void setEstadoReparacion(String estadoReparacion) {
        this.estadoReparacion = estadoReparacion;
    }

    public String getDescripcionReparacion() {
        return descripcionReparacion;
    }

    public void setDescripcionReparacion(String descripcionReparacion) {
        this.descripcionReparacion = descripcionReparacion;
    }

    public Date getFechaInicioReparacion() {
        return fechaInicioReparacion;
    }

    public void setFechaInicioReparacion(Date fechaInicioReparacion) {
        this.fechaInicioReparacion = fechaInicioReparacion;
    }

    public Date getFechaFinReparacion() {
        return fechaFinReparacion;
    }

    public void setFechaFinReparacion(Date fechaFinReparacion) {
        this.fechaFinReparacion = fechaFinReparacion;
    }

    public int getCostoReparacion() {
        return costoReparacion;
    }

    public void setCostoReparacion(int costoReparacion) {
        this.costoReparacion = costoReparacion;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    public int getIdTipoVehiculo() {
        return idTipoVehiculo;
    }

    public void setIdTipoVehiculo(int idTipoVehiculo) {
        this.idTipoVehiculo = idTipoVehiculo;
    }

    public String getAprovacionProietario() {
        return aprovacionProietario;
    }

    public void setAprovacionProietario(String aprovacionProietario) {
        this.aprovacionProietario = aprovacionProietario;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
}
