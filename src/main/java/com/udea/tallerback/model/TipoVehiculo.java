package com.udea.tallerback.model;

import javax.persistence.*;

@Entity
@Table(name="tipovehiculos")
public class TipoVehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idTipoVehiculo;
    private String tipoVehiculo;

    public TipoVehiculo(int idTipoVehiculo, String tipoVehiculo) {
        this.idTipoVehiculo = idTipoVehiculo;
        this.tipoVehiculo = tipoVehiculo;
    }

    public TipoVehiculo() {
    }

    public int getIdTipoVehiculo() {
        return idTipoVehiculo;
    }

    public void setIdTipoVehiculo(int idTipoVehiculo) {
        this.idTipoVehiculo = idTipoVehiculo;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
}
