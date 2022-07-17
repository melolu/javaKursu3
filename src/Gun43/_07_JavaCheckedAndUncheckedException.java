package Gun43;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _07_JavaCheckedAndUncheckedException {
    public static void main(String[] args) {

        try {
            FileInputStream file=new FileInputStream("liste.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
