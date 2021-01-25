package com.udea.tallerback.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="propietariosvehiculos")
public class PropietarioVehiculo {
    @Id
    private int IdPropietarioVehiculo;
    private int cedulaPropietario;

    public PropietarioVehiculo() {
    }

    public PropietarioVehiculo(int idPropietarioVehiculo, int cedulaPropietario, String placaVehiculo) {
        IdPropietarioVehiculo = idPropietarioVehiculo;
        this.cedulaPropietario = cedulaPropietario;
        this.placaVehiculo = placaVehiculo;
    }

    private String placaVehiculo;

    public int getIdPropietarioVehiculo() {
        return IdPropietarioVehiculo;
    }

    public void setIdPropietarioVehiculo(int idPropietarioVehiculo) {
        IdPropietarioVehiculo = idPropietarioVehiculo;
    }

    public int getCedulaPropietario() {
        return cedulaPropietario;
    }

    public void setCedulaPropietario(int cedulaPropietario) {
        this.cedulaPropietario = cedulaPropietario;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }
}
