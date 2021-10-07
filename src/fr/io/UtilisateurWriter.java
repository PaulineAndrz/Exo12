package fr.io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class UtilisateurWriter {

    public UtilisateurWriter() {
    }

    public static void writeUtilisateur(String unNomDeFichier, ArrayList<String> desNoms, ArrayList<String> desPrenoms, int combien) throws IOException {
        ArrayList<String> genres = new ArrayList();
        genres.add("M");
        genres.add("Mme");
        BufferedWriter writer = null;
        Random rand = new Random();

        try {
            writer = new BufferedWriter(new FileWriter(unNomDeFichier));

            for (int i = 0; i < combien; i++) {
                String randomGenre = genres.get(rand.nextInt(genres.size()));
                writer.write(randomGenre);
                String randomNoms = desNoms.get(rand.nextInt(desNoms.size()));
                writer.write(randomNoms);
                String randomPrenoms = desPrenoms.get(rand.nextInt(desPrenoms.size()));
                writer.write(randomPrenoms);
                writer.newLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
