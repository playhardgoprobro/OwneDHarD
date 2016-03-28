package lab1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class ReadStrings {
    public static ArrayList<String> readStrings(String path, int start, int number) {
        ArrayList<String> lines = new ArrayList<String>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            int counter = 0;
            while ((line = reader.readLine()) != null) {
                counter++;
                if (counter < start) {
                    continue;
                } else if (counter >= start && counter < start + number ) {
                    lines.add(line);
                } else break;
            }
            for(int i=0;i<lines.size();i++){
                if(lines.get(i).toString().isEmpty()){
                    lines.remove(i);
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return lines;
    }

    public static String readAll(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                return line;
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return "";
    }
}
