package utils;

import java.util.Comparator;

import Models.Contacto;

public class ContactoComparatorConNumero implements Comparator<Contacto> {

    @Override
    public int compare(Contacto o1, Contacto o2) {
        
        //primero el apellido orden alfabetico
        int comparacionApellidos = o1.getApellido().compareTo(o2.getApellido());

        if(comparacionApellidos != 0){
            return comparacionApellidos;
        }

        //segundo si son iguales comparo por el nombre orden alfabetico
        int comparacionNombre = o1.getNombre().compareTo(o2.getNombre());

        if(comparacionNombre != 0){
            return comparacionNombre;
        }

        int comparacionNumeros = o1.getNumero().compareTo(o2.getNumero());

        if(comparacionNumeros != 0){
            return comparacionNumeros;
        }else{
            return o2.getNumero().compareTo(o1.getNumero());
        }

    }
    
}
