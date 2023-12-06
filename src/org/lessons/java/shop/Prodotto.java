package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    //ATTRIBUTI
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;

    //COSTRUTTORE
    public Prodotto(String nome, String descrizione, double prezzo, double iva) {
        this.codice = generaCodice();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    //GETTER - SETTER

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    //METODI

    private int generaCodice(){
        Random random = new Random();
        return random.nextInt(1000, 10000);
    }

    public double getPrezzoIva() {
        return (prezzo * iva) / 100;
    }

        public String getCodiceNome(){
        return codice +"-"+ nome;
    }
}
