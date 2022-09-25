package Taller2.Taller2;

import javax.swing.*;

public class SeleccionBaloncesto {
    protected int documento;
    protected String nombre;
   protected String apellido;
    protected int edad;
    public SeleccionBaloncesto(int documento, String nombre, String apellido, int edad) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
        void concentrarse(){
            JOptionPane.showMessageDialog(null, "Los jugadores de la seleccion se concentran para el siguiente partido");
    }
        void viajar(){
            JOptionPane.showMessageDialog(null, "La seleccion viajara a Brasil el martes por la tarde");
        }
}
