package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {

    private String birthday;
    private double weight;
    private double height;
    private String blood;

    private ArrayList<AppointmentDoctor> appointmentDoctors= new ArrayList<AppointmentDoctor>();
    private ArrayList<AppointmentNurses> appointmentNurses= new ArrayList<AppointmentNurses>();

    public ArrayList<AppointmentDoctor>getAppointmentDoctors(){
        return appointmentDoctors;
    }


    public void addAppointmentDoctors(Doctor doctor, Date date,String time){
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this,doctor);
        appointmentDoctor.schedule(date,time);
        appointmentDoctors.add(appointmentDoctor);

    }

    public ArrayList<AppointmentNurses>getAppointmentNurses(){
        return appointmentNurses;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
         this.birthday = birthday ;
    }

    public String getWeight() {
        return this.weight + "Kg";
    }

    public void setWeight(double weight) {
        this.weight = weight ;
    }

    public String getHeight() {
        return this.height + " Mts ";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public void setAppointmentDoctors(ArrayList<AppointmentDoctor> appointmentDoctors) {
        this.appointmentDoctors = appointmentDoctors;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurses> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    public Patient(String name, String email) {
        super(name, email);
    }

    @Override
    public String toString() {
        return super.toString()+"\nAge: "+birthday+"\n Height"+getHeight()+"\nBlood"+blood;

    }

    @Override
    public void showDataUser() {

    }


}
