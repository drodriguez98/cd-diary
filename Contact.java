package com.campusdual.poo.ex6_almacenamiento;

import com.campusdual.Utils;

import java.util.ArrayList;
import java.util.List;

public class Contact {

    private String dni;
    private String name;
    private String surname;
    private String city;
    private String postalCode;
    private String primaryNumber;
    private List<String> contactPhoneNumberList = new ArrayList<>();

    // Constructor de Contact.

    public Contact (String dni, String name, String surname, String city, String postalCode) {

        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.postalCode = postalCode;

    }

    public Contact () {

        this.dni = Utils.string("Introduce el dni: ");
        this.name = Utils.string("Introduce el nombre: ");
        this.surname = Utils.string("Introduce el apellido: ");
        this.city = Utils.string("Introduce la ciudad: ");
        this.postalCode = Utils.string("Introduce el código postal: ");

    }

    public String getDni() {

        return dni;

    }

    public String getName() {

        return name;

    }

    public String getPrimaryNumber() {

        return primaryNumber;

    }

    public void setPrimaryNumber (String primaryNumber) {

        this.primaryNumber = primaryNumber;

    }

    public List<String> getContactPhoneNumberList() {

        return contactPhoneNumberList;

    }

    public void addContactPhoneNumber (String phoneNumber) {

        this.getContactPhoneNumberList().add(phoneNumber);

        System.out.println(this.getName() + " ha añadido un nuevo número de teléfono");

        if (this.getPrimaryNumber() == null) {

            this.setPrimaryNumber(phoneNumber);

            System.out.println("Ahora " + phoneNumber + " es su número principal");

        }

    }

    public void callContact (Contact c) {

        if (c.getPrimaryNumber() != null) {

            System.out.println(this.getName() + " llamando a " + c.getName() + " (" + c.getPrimaryNumber() + ")");

        } else {

            System.out.println(c.getName() + " no tiene ningún número de teléfono");

        }

    }

    @Override

    public String toString() {

        return "Contact{" +
                "dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", primaryNumber='" + primaryNumber + '\'' +
                ", contactPhoneNumberList=" + contactPhoneNumberList +
                '}';

    }

}