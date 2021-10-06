package fr.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class NomPrenomReader {

    public NomPrenomReader() {
    }

    private static ArrayList<String> readFichier(String unNomDeFichier) throws IOException {
        ArrayList<String> resultat = new ArrayList<>();
        BufferedReader reader = null;

        reader = new BufferedReader(new FileReader(unNomDeFichier));
        String ligne = null;

        while((ligne = reader.readLine()) != null) {
            resultat.add(ligne);
        }

        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return resultat;
    }

    public static ArrayList<String> readNom() throws IOException {
        ArrayList<String> listeNoms = new ArrayList<>();
        try {
            listeNoms = readFichier("src/fr/io/nom.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listeNoms;
    }

    public static ArrayList<String> readPrenom() throws IOException {
        ArrayList<String> listePrenoms = new ArrayList<>();
        try {
            listePrenoms = readFichier("src/fr/io/prenom.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listePrenoms;
    }
}
