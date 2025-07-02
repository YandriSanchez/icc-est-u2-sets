package Controllers;

import java.util.*;

import Models.Contacto;
import utils.ContactoComparator;
import utils.ContactoComparatorConNumero;

public class ContactoController{

    public ContactoController() {
        System.out.println("----- TreeSet de Contactos -----");
        System.out.println("Contactos orden algabetico apellido - nombre");
        runTreeContacto();
        
        System.out.println("");
        System.out.println("Contactos orden alfabetico apelido - nombre - telefono(Des)");
        runTreeContactoConNunmero();
    }

    private void runTreeContacto(){
        ContactoComparator comparator = new ContactoComparator();
        Set<Contacto> contactos = new TreeSet<>(comparator);

        // Agregamos algunos contactos
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez", "123456789"));
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));

        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
    }

    private void runTreeContactoConNunmero(){
        ContactoComparatorConNumero comparatorNumero = new ContactoComparatorConNumero();
        Set<Contacto> contactos = new TreeSet<>(comparatorNumero);

        // Agregamos algunos contactos
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez", "123456789"));
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));

        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
    }
    
}