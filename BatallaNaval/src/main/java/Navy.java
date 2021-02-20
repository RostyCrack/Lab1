import java.util.ArrayList;

public class Navy {

    private String name;
    private ArrayList<Navy> names;
    private ArrayList<Aircraft> aircrafts;
    private AircraftCarrier carriers;
    private ArrayList<Ship> ships;
    private ArrayList<Marine> marines;

    public final String nombreFlota() {

        String nombre = name;
        return nombre;
    }

    public int alias(String nombre) {

        int repetidos = 0;

        for (int i = 0; i < this.names.size(); i++) {

            if (this.names.get(i).equals(nombre)) {
                repetidos++;
            }
        }

        return repetidos;
    }

    public int disponibilidadEnPortaAviones() {

        int disponibles;
        int capacity = this.carriers.getCapacity();

        disponibles = capacity - this.aircrafts.size();

        return disponibles;
    }
}
