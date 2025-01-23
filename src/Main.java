import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            integers.add(i);
        }

        System.out.println("Original ArrayList: " + integers);

        System.out.println("......New List with addAll.......");

        ArrayList<Integer> integers2 = new ArrayList<>();
        integers2.addAll(integers);  //Insert List with addAll
        Collections.reverse(integers2);
        System.out.println("New ArrayList inverted: " + integers2);


        System.out.println(".......With ListIterator.......");

        ListIterator<Integer> iterador = integers.listIterator(); // Creo un ListIterator para la primera lista

        while (iterador.hasNext()) { // Leeo elementos de la primera lista y los  inserto en la segunda
            Integer integer = iterador.next(); // Obtener el siguiente elemento
            integers2.add(integer); // Insertar el elemento en la nueva lista
        }
        System.out.println("New ArrayList full: " + integers2);
    }
}

