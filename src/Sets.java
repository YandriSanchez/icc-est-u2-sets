import java.util.*;

public class Sets{

    public Sets(){

    }

    public Set<String> construirHashSet(){
        Set<String> palabras = new HashSet<>();

        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Pera");
        palabras.add("Laptop");
        
        return palabras;
    }

    public Set<String> construirLinkedHashSet(){
        Set<String> palabrasLinkedadas = new LinkedHashSet<>();

        palabrasLinkedadas.add("Laptop");
        palabrasLinkedadas.add("Manzana");
        palabrasLinkedadas.add("Pera");
        palabrasLinkedadas.add("Celular");
        palabrasLinkedadas.add("Laptop");
        palabrasLinkedadas.add("Pera");
        palabrasLinkedadas.add("Laptop");
        
        return palabrasLinkedadas;

    }

    public Set<String> construirTreeSet(){
        Set<String> palabrasTreeSet = new TreeSet<>();

        palabrasTreeSet.add("Laptop");
        palabrasTreeSet.add("Manzana");
        palabrasTreeSet.add("Pera");
        palabrasTreeSet.add("Celular");
        palabrasTreeSet.add("Laptop");
        palabrasTreeSet.add("Pera");
        palabrasTreeSet.add("Laptop");
        
        return palabrasTreeSet;
    }

    public Set<String> construirTreeSetConComparador(){
       
        //Crear un comparator
        Comparator<String> comparadorLonguitud = new Comparator<String>() {
            //@Override
            public int compare(String s1, String s2){
                //Comparamos la longuitud
                int result = Integer.compare(s1.length(), s2.length());

                //si tienen la misma longitud, comparamos alfabeticamente
                if(result == 0){
                    return s1.compareTo(s2);
                }

                return result;
                
            }
        };
       
        Set<String> palabrasTreeSetComparador = new TreeSet<>(comparadorLonguitud);

        palabrasTreeSetComparador.add("Laptop");
        palabrasTreeSetComparador.add("Manzana");
        palabrasTreeSetComparador.add("Pera");
        palabrasTreeSetComparador.add("Celular");
        palabrasTreeSetComparador.add("Laptop");
        palabrasTreeSetComparador.add("Pera");
        palabrasTreeSetComparador.add("Laptop");
        palabrasTreeSetComparador.add("Celulas");
        
        return palabrasTreeSetComparador;
    }

    public Set<String> construirTreeSetConComparadorInvertido(){
       
        //Crear un comparator
        Comparator<String> comparadorLonguitud = new Comparator<String>() {
            //@Override
            public int compare(String s1, String s2){
                //Comparamos la longuitud
                int result = Integer.compare(s2.length(), s1.length());

                //si tienen la misma longitud, comparamos alfabeticamente
                if(result == 0){
                    return s2.compareTo(s1);
                }

                return result;
                
            }
        };
       
        Set<String> palabrasTreeSetComparadorInvertido = new TreeSet<>(comparadorLonguitud);

        palabrasTreeSetComparadorInvertido.add("Laptop");
        palabrasTreeSetComparadorInvertido.add("Manzana");
        palabrasTreeSetComparadorInvertido.add("Pera");
        palabrasTreeSetComparadorInvertido.add("Celular");
        palabrasTreeSetComparadorInvertido.add("Laptop");
        palabrasTreeSetComparadorInvertido.add("Pera");
        palabrasTreeSetComparadorInvertido.add("Laptop");
        palabrasTreeSetComparadorInvertido.add("Celulas");
        
        return palabrasTreeSetComparadorInvertido;
    }
}