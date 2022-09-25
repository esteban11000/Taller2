package Taller2.Taller2;

import javax.swing.JOptionPane;

public class Jugador extends SeleccionBaloncesto {
    private int Numero;
   private String Posicion;
    public Jugador(int documento, String nombre, String apellido, int edad, int numero, String posicion) {
        super(documento, nombre, apellido, edad);
        Numero = numero;
        Posicion = posicion;
    }
    void jugarPartido(){
        JOptionPane.showMessageDialog(null, "El jugador " + this.nombre + " " +this.apellido +" de "+ this.edad
                + " anios "+ "de numero "+ this.Numero +" con numero de documento "
                + this.documento + " ha jugado 100 partidos y han ganado 85"+ " Y juega de "+ this.Posicion);
    }
    void entrenar(){
        JOptionPane.showMessageDialog(null, "El jugador esta entrenando");
    }
}
