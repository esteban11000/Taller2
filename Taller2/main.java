package Taller2.Taller2;

public class main {

    public static void main(String[] args) {
       Jugador j1 = new Jugador(1234,"Juan","Perez",25,59,"delantero");
       Entrenador e1 = new Entrenador(3956,"Pablo","Camargo",35,1462);
       Asistente a1 = new Asistente(5586,"Ivan","Gonzalez",32,"Manager",3);

       j1.jugarPartido();
       j1.entrenar();
       j1.concentrarse();
       j1.viajar();
       e1.dirigirPartido();
       e1.dirigirEntrenamiento();
       a1.darMasaje();
    }

}
