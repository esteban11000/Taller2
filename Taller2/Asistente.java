package Taller2.Taller2;

import javax.swing.JOptionPane;

public class Asistente extends SeleccionBaloncesto {
    private String titulo;
    private int experiencia;

    public Asistente(int documento, String nombre, String apellido, int edad, String titulo, int experiencia) {
        super(documento, nombre, apellido, edad);
        this.titulo = titulo;
        this.experiencia = experiencia;
    }
    void darMasaje(){
        JOptionPane.showMessageDialog(null,this.nombre+" "+this.apellido+ " de edad de "+ this.edad+" anios es el "+this.titulo+"y tiene "+ this.experiencia+" anios de experiencia");
    }
}
