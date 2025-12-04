/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

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

        int mes = this.fechaPrevista.getMonth();
        int dia = this.fechaPrevista.getDate();

        //  Primavera (Marzo 21 a Junio 20)
        //  Marzo (2), Abril (3), Mayo (4), Junio (5)
        if (mes == 2 && dia >= 21) {
            this.estacion = "Primavera";
        } else if (mes >= 3 && mes <= 4) { // Abril (3), Mayo (4)
            this.estacion = "Primavera";
        } else if (mes == 5 && dia <= 20) { // Junio (5) 1-20
            this.estacion = "Primavera";
        } //  Verano (Junio 21 a Septiembre 20)
        // Meses (0-11): Junio (5), Julio (6), Agosto (7), Septiembre (8)
        else if (mes == 5 && dia >= 21) { // Junio (5) 21+
            this.estacion = "Verano";
        } else if (mes >= 6 && mes <= 7) { // Julio (6), Agosto (7)
            this.estacion = "Verano";
        } else if (mes == 8 && dia <= 20) { // Septiembre (8) 1-20
            this.estacion = "Verano";
        } //  Otoño (Septiembre 21 a Diciembre 20)
        // Meses (0-11): Septiembre (8), Octubre (9), Noviembre (10), Diciembre (11)
        else if (mes == 8 && dia >= 21) { // Septiembre (8) 21+
            this.estacion = "Otoño";
        } else if (mes >= 9 && mes <= 10) { // Octubre (9), Noviembre (10)
            this.estacion = "Otoño";
        } else if (mes == 11 && dia <= 20) { // Diciembre (11) 1-20
            this.estacion = "Otoño";
        } //️ Invierno (Resto del año: Diciembre 21 a Marzo 20)
        // Meses (0-11): Diciembre (11), Enero (0), Febrero (1), Marzo (2)
        else {
            // Incluye: Dic 21-31 (11), Enero (0), Febrero (1), Mar 1-20 (2)
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
