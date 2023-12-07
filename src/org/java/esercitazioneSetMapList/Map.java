package org.java.esercitazioneSetMapList;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap <String, Double> grades = new HashMap<>();
        System.out.println(grades);

        grades.put("Max", 24.7);
        grades.put("Marco", 18.0);
        grades.put("Giuseppe", 19.5);

        System.out.println(grades);

        for (String studente : grades.keySet()) {
            Double voto = grades.get(studente);
            System.out.println("Studente: " + studente);
            System.out.println("Voto:     " + voto);
        }

            System.out.println();

        }
    }

