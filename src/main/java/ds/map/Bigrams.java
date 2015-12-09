package ds.map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by skupunarapu on 12/9/2015.
 */
public class Bigrams {
    public static void main(String[] args) throws IOException {
        readFile();
    }

    private static void readFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                line = br.readLine();
            }
            String everything = sb.toString();
        } finally {
            br.close();
        }
    }

}
