/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.planetas;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Planetas {
    public static void ejecutar(){

    char valor='S';
    char seguir='A';
    double masa;
    final double GRAV_MAR=3.72; 
    final double GRAV_TIER=9.807; 
    final double GRAV_JUP=24.79;
    final double GRAV_SAT=10.44;
    final double GRAV_PLUT=0.62; 
    int dia = 1;
    String planetas;
    
        while(seguir!='N'&&seguir!='n'){

            System.out.println("Introduce un planeta para averiguar tu masa : (Marte,Tierra,Jupiter,Saturno,Pluton)");
            Scanner teclado = new Scanner(System.in);
            planetas = teclado.nextLine();
            System.out.println("Introduce tu masa en kg: ");
            masa=teclado.nextDouble();
            
            
            switch (planetas){

           
                case "Tierra":    
                System.out.println("El resultado de tu masa  en la Tierra es : " + (masa*GRAV_TIER)+ "N");
                break;

                case "Marte":
                System.out.println("El resultado de tu masa en Marte es : " + (masa*GRAV_MAR)+ "N");
                break;
                case "Jupiter":
                System.out.println("El resultado de tu masa en Júpiter es: " + (masa*GRAV_JUP)+ "N");
                break;
                case "Saturno":
                System.out.println("El resultado de tu masa en Saturno es: " + (masa*GRAV_SAT)+ "N");
                break;
                case "Pluton":
                System.out.println("El resultado de tu masa en Plutón es: " + (masa*GRAV_PLUT)+ "N");
                break;
            
                default:
                System.out.println("No existe este planeta");

    }
    
    
         System.out.println("Hola souy Alex, quieres seguir?");
                seguir=teclado.next().charAt(0);
    }


    }
  }
