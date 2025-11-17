/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroVisitasyClima.dto;

import java.util.*;

/**
 *
 * @author Robert
 */
public class Visita {

    private String ciudad;
    private Date fechaPrevista;
    private String estacion;
    private double tempMin;
    private double tempMax;
    private double tempPromedio;

    public Visita(String ciudad, Date FechaPrevista, double tempMin, double tempMax) {
        this.ciudad = ciudad;
        this.fechaPrevista = FechaPrevista;
        setEstacion();
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        setTempPromedio();
    }

    public Visita(String ciudad, Date FechaPrevista) {
        this.ciudad = ciudad;
        this.fechaPrevista = FechaPrevista;
        setEstacion();
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Date getFechaPrevista() {
        return fechaPrevista;
    }

    public void setFechaPrevista(Date FechaPrevista) {
        this.fechaPrevista = FechaPrevista;
    }

    public String getEstacion() {
        return estacion;
    }

    private void setEstacion() {
        /*
        Date inviernoInicio = new Date(this.fechaPrevista.getYear(), 12, 21);
        Date primaveraInicio = new Date(this.fechaPrevista.getYear(), 3, 21);
        Date veranoInicio = new Date(this.fechaPrevista.getYear(), 6, 21);
        Date otoñoInicio = new Date(this.fechaPrevista.getYear(), 9, 21);

        if (this.fechaPrevista.after(otoñoInicio) && this.fechaPrevista.before(inviernoInicio)) {
            this.estacion = "Otoño";
        } else if (this.fechaPrevista.after(inviernoInicio) && this.fechaPrevista.before(primaveraInicio)) {
            this.estacion = "Invierno";
        } else if (this.fechaPrevista.after(primaveraInicio) && this.fechaPrevista.before(veranoInicio)) {
            this.estacion = "Primavera";
        } else if (this.fechaPrevista.after(veranoInicio) && this.fechaPrevista.before(otoñoInicio)) {
            this.estacion = "Verano";
        }*/
        
        if ((this.fechaPrevista.getMonth() >= 2 && this.fechaPrevista.getMonth() <=5) || (this.fechaPrevista.getMonth() == 2 && this.fechaPrevista.getDay() >= 21)) {
            this.estacion = "Primavera";
        } else if ((this.fechaPrevista.getMonth() >= 5 && this.fechaPrevista.getMonth() <=8) || (this.fechaPrevista.getMonth() == 5 && this.fechaPrevista.getDay() >= 21)) {
            this.estacion = "Verano";
        } else if ((this.fechaPrevista.getMonth() >= 8 && this.fechaPrevista.getMonth() <=11) || (this.fechaPrevista.getMonth() == 8 && this.fechaPrevista.getDay() >= 21)) {
            this.estacion = "Otoño";
        } else if (this.fechaPrevista.getMonth() == 11 && this.fechaPrevista.getDay() >= 21) {
            this.estacion = "Invierno";
        } else {
            this.estacion = "Invierno";
        }
    }

    public double getTempMin() {
        return tempMin;
    }

    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }

    public double getTempMax() {
        return tempMax;
    }

    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }

    public double getTempPromedio() {
        return tempPromedio;
    }

    private void setTempPromedio() {
        this.tempPromedio = (this.tempMax + this.tempMin) / 2;
    }

}
