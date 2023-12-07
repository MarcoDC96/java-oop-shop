package org.lessons.java.shop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci il numero di prodotti: ");
        int numeroProdotti = Integer.parseInt(scan.nextLine());

    Prodotto [] listaProdotti= new Prodotto[numeroProdotti];

        try {
            for (int i = 0;  i< listaProdotti.length ; i++) {
                System.out.print("Nome prodotto: ");
                String nomeProdotto = scan.nextLine();
                System.out.print("Descrivi il prodotto: ");
                String descrizioneProdotto= scan.nextLine();
                System.out.print("Prezzo prodotto: ");
                double costoProdotto= Double.parseDouble(scan.nextLine());
                System.out.print("Scrivi l'iva: ");
                double costoIva = Double.parseDouble(scan.nextLine());

                Prodotto prodotto = new Prodotto(nomeProdotto, descrizioneProdotto, costoProdotto, costoIva);
                listaProdotti[i] = prodotto;
            }

            System.out.println("Prodotti: ");
            for (int i = 0; i < listaProdotti.length; i++) {
                System.out.println("Nome prodotto: " + listaProdotti[i].getNome());
                System.out.println("Descrivi Prodotto: " + listaProdotti[i].getDescrizione());
                System.out.println("Costo Prodotto: " + listaProdotti[i].getPrezzo() + "€");
                System.out.println("Iva associata al prodotto: " + listaProdotti[i].getIva() + "€");
                System.out.println("Prezzo con iva: " + listaProdotti[i].getPrezzoIva() + "€");
                System.out.println("Codice prodotto: " + listaProdotti[i].getCodice());
                System.out.println("Codice-Nome prodotto: " + listaProdotti[i].getCodiceNome());

            }
        } catch (IllegalArgumentException e) {
            System.out.println("Non valido: " + e.getMessage());
        }


        scan.close();
    }
}
