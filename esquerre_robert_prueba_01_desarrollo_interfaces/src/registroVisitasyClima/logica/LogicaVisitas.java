/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroVisitasyClima.logica;

import java.util.*;
import registroVisitasyClima.dto.Visita;

/**
 *
 * @author Robert
 */
public class LogicaVisitas {

    private static List<Visita> listaVisitas = new ArrayList<>();
    
    private static Visita ultimaVisita;

    public static void addVisita(Visita visita) {
        listaVisitas.add(visita);
    }

    public static List<Visita> getListaVisitas() {
        return listaVisitas;
    }
    
     public static void registrarUltimaVisita(Visita visita){
        ultimaVisita = visita;
    }
    
    public static Visita getUltimaVisita(){
        return ultimaVisita;
    }
}
