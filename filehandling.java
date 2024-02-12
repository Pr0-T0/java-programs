import java.io.*;
public class filehandling {
    public static void main(String[] args) throws IOException {
        FileInputStream fi = new FileInputStream("in.txt");
        FileOutputStream ft = new FileOutputStream("out.txt");
        int i = 0;
        while((i = fi.read()) != -1){
            ft.write(i);
        }
        if(ft != null)
            System.out.println("Content  written successfully!");
        fi.close();
        ft.close();
    }
}
