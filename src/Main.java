import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws java. io. IOException {

        FileWriter writer = new FileWriter("demo.txt",true);

        writer.write("Hello file! \n");
        writer.write("Second line! \n");

        writer.close();

        File realMadrid = new File("demo.txt");

        Scanner eyes = new Scanner(realMadrid);

        while (eyes.hasNextLine()) {
            String data = eyes.nextLine();
            System.out.println(data);
        }

        eyes.close();
    }
}