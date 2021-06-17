/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad23;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Hora {
    int horas;
    int minutos;
    int segundos;
    
    public void obtenerSegundos(){
        System.out.println("Ingrese cantidad de segundos");
        Scanner scanner = new Scanner(System.in);
        segundos = scanner.nextInt();
    }
    
    public void convertirSegundos(){
        
        horas = segundos /3600;
        if (segundos>=3600) {
            segundos = segundos / 3600;
        }
        minutos = segundos / 60;
        if (segundos>=60) {
            segundos = segundos % 60;
        }
        System.out.println(horas + ":" + minutos + ":" + segundos);        
    }
}
