
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Sets sets = new Sets();

        runHashSet(sets);
        runLinkedHashSet(sets);
        runTreeSet(sets);
        runTreeSetComparador(sets);
        runTreeSetComparadorInvertido(sets);
    }

    public static void runHashSet(Sets sets){

        Set<String> palabrasEjemplo = sets.construirHashSet();

        System.out.println("-----HashSet-----");
        System.out.println("Elementos del HashSet (no se garantiza orden)");
        for (String string : palabrasEjemplo) {
            System.out.println(string);
        }     
    }

    public static void runLinkedHashSet(Sets sets){
        Set<String> palabrasLinkedadasEjemplo = sets.construirLinkedHashSet();

        System.out.println("-----LinkedHashSet-----");
        System.out.println("Elementos del LinkedHashSet (respeta orden de insersion)");
        for (String string : palabrasLinkedadasEjemplo) {
            System.out.println(string);
        }     
    }

    public static void runTreeSet(Sets sets){
        Set<String> palabrasTreeSet = sets.construirTreeSet();

        System.out.println("-----TreeSet-----");
        System.out.println("Elementos del TreeSet (orden xxxxxx)");
        for (String string : palabrasTreeSet) {
            System.out.println(string);
        }     
    }

    public static void runTreeSetComparador(Sets sets){
        Set<String> palabrasTreeSetComparadorEjemplo = sets.construirTreeSetConComparador();

        System.out.println("-----TreeSet con Comparador-----");
        System.out.println("Elementos del TreeSet (orden xxxxxx)");
        for (String string : palabrasTreeSetComparadorEjemplo) {
            System.out.println(string);
        }     
    }

    public static void runTreeSetComparadorInvertido(Sets sets){
        Set<String> palabrasTreeSetComparadorEjemploInvertido = sets.construirTreeSetConComparadorInvertido();

        System.out.println("-----TreeSet con Comparador y Invertido-----");
        System.out.println("Elementos del TreeSet (orden xxxxxx)");
        for (String string : palabrasTreeSetComparadorEjemploInvertido) {
            System.out.println(string);
        }     
    }
}
