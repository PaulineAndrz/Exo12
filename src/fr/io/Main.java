package fr.io;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        NomPrenomReader nomPrenomReader = new NomPrenomReader();
        UtilisateurWriter utilisateurWriter = new UtilisateurWriter();

        try {
            System.out.println(nomPrenomReader.readNom());
            System.out.println(nomPrenomReader.readPrenom());
            utilisateurWriter.writeUtilisateur("src/fr/io/fichier.csv", nomPrenomReader.readNom(), nomPrenomReader.readPrenom(), 3 );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
