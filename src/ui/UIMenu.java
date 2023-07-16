package ui;

import model.Doctor;
import model.Patient;

import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS ={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opcion deseada");

        int response = 0;

        do{
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                System.out.println("Doctor");
                response=0;
                authUser(1);
                break;
                case 2:
                    response=0;
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");

                default:
                    System.out.println("Please select a correct answer");
            }


        }while (response != 0);
    }


}
