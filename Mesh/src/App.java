import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.Console;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

import assignment.*;

public class App {
    public static void main(String[] args) throws Exception {
        Pattern pattern1 = Pattern.compile("format ascii 1.0");
        Pattern pattern2 = Pattern.compile("format ascii 1.0");
        Matcher matcher1 = pattern1.matcher("format ascii 120");
        final int x = 2;
        // Matcher matcher2 = pattern2.matcher("V 213121 2131");
        // ArrayList<String> lines = new ArrayList<String>();
        // ArrayList<Integer> num = new ArrayList<Integer>();
        // lines.add("cum");
        File file = new File("car.off");
        File file2 = new File("bruh.ply");

        System.out.println(matcher1.matches());

        Mesh mesh = new Mesh();
        mesh.setReader(new OFFMeshReader());
        mesh.setWriter(new PLYMeshWriter());
        try {
            mesh.readFromFile(file.getAbsolutePath().toString());
            mesh.writeToFile(file2.getAbsolutePath().toString());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
