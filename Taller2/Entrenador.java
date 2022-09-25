package Taller2.Taller2;

import javax.swing.JOptionPane;

public class Entrenador extends SeleccionBaloncesto {
    private int tarjetaPro;

    public Entrenador(int documento, String nombre, String apellido, int edad, int tarjetaPro) {
        super(documento, nombre, apellido, edad);
        tarjetaPro = tarjetaPro;
    }
    void dirigirPartido(){
        JOptionPane.showMessageDialog(null,"El entrenador "+ this.nombre +" "+ this.apellido+" de documento "+ this.documento+" Y edad de "
                                                                + this.edad + " ha dirigido mas de 20 partidos de la seleccion su tarjetapro es "+ this.tarjetaPro);
    }
    void dirigirEntrenamiento(){
        JOptionPane.showMessageDialog(null,"El entrenador organizara el entrenamiento del martes por la noche");
    }
}
