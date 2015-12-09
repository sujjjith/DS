package ds.map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * Created by skupunarapu on 12/9/2015.
 */
public class Bigrams {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> hm = readFile();
    }

    private static HashMap<String, Integer> readFile() throws IOException {
        ClassLoader classLoader = Bigrams.class.getClassLoader();
        BufferedReader br = new BufferedReader(new FileReader(classLoader.getResource("file.txt").getFile()));
        HashMap<String, Integer> hm;
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            hm = new HashMap<String, Integer>();
            while (line != null) {
                tokenizeAndPutIntoMap(hm, line);

                sb.append(line);
                line = br.readLine();
            }
        } finally {
            br.close();
        }
        return hm;
    }

    private static void tokenizeAndPutIntoMap(HashMap<String, Integer> hm, String line) {
        StringTokenizer st = new StringTokenizer(line);

        int i = -1;
        int j = 0;
        ArrayList<String> al = new ArrayList<String>();
        while (st.hasMoreElements()) {
            al.add((String) st.nextElement());

            if (i >= 0 && j >= 1) {
                String key = al.get(i) +"_"+ al.get(j);
                if (hm.containsKey(key)) {
                    hm.put(key, hm.get(key) + 1);
                } else
                    hm.put(key, 1);
            }
            i++;
            j++;
        }
    }

}
