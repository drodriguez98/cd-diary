package com.campusdual.poo.ex6_almacenamiento;

import com.campusdual.Utils;

    /*

    Crear un programa que sea una agenda.

        - La agenda contendrá una serie de personas, que tendrán información sobre ellas (dni, nombre, apellido, ciudad, código postal y teléfonos (fijos y móviles).
        - La agenda debe tener métodos para añadir, eliminar y listar su contenido.
        - Una persona podrá llamar a otra persona de la agenda (a su número principal).

    */

public class main {

    public static void main(String[] args) {

        System.out.println("CREANDO PERSONA 1 POR DEFECTO");
        Contact c1 = new Contact("77014223D", "Sergio", "Rosado", "Vigo", "36940");
        System.out.println(c1.getName() + " creado/a correctamente");

        System.out.println("CREANDO PERSONA 2 POR DEFECTO");
        Contact c2 = new Contact("77555333L", "María", "Constante", "Coruña", "32879");
        System.out.println(c2.getName() + " creado/a correctamente");

        System.out.println("CREANDO NUEVA PERSONA CON INPUT");
        Contact c3 = new Contact();
        System.out.println(c3.getName() + " creado/a correctamente");

        System.out.println("PERSONA 1 Y 2 POR DEFECTO AÑADIENDO UNO DE SUS NÚMEROS DE TELÉFONO. SI NO TIENEN NINGUNO, ESTE SERÁ EL PRINCIPAL.");

        c1.addContactPhoneNumber("666555444");
        c2.addContactPhoneNumber("622354888");
        c2.addContactPhoneNumber("678256814");

        System.out.println("PERSONA NUEVA  AÑADIENDO UNO DE SUS NÚMEROS DE TELÉFONO CON INPUT. SI NO TIENEN NINGUNO, ESTE SERÁ EL PRINCIPAL.");

        c3.addContactPhoneNumber(Utils.string("Introduzca su número de teléfono: "));

        System.out.println("LLAMADAS ENTRE ESTAS PERSONAS");

        c1.callContact(c2);
        c2.callContact(c3);
        c3.callContact(c1);

        System.out.println("CREANDO AGENDA Y AÑADIENDO CONTACTOS PASÁNDOLE EL DNI DE CADA PERSONA PARA OBTENER SUS DATOS");

        Diary d = new Diary();

        System.out.println("Agenda creada correctamente");

        d.getPhoneBook().put(c1.getDni(), c1);
        d.getPhoneBook().put(c2.getDni(), c2);
        d.getPhoneBook().put(c3.getDni(), c3);

        System.out.println("Buscando Contacto 1 con el DNI 77014223D");
        Contact c20 = d.getPhoneBook().get("77014223D");
        String name1 = d.getPhoneBook().get("77014223D").getName();
        System.out.println("Contacto " + name1 + " encontrado");

        System.out.println("Buscando Contacto 2 con el DNI 77555333L");
        Contact c40 = d.getPhoneBook().get("77555333L");
        String name2 = d.getPhoneBook().get("77555333L").getName();
        System.out.println("Contacto " + name2 + " encontrado");

        System.out.println("LAS PERSONAS SE LLAMAN");

        c20.callContact(c40);

        System.out.println("CONTACTOS DE LA AGENDA");

        d.showPhoneBook();

    }

}