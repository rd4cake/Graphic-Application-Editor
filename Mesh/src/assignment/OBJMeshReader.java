package assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class OBJMeshReader implements MeshReader {
    public HashSet<Polygon> read(String fileName) throws WrongFileFormatException, IOException {
        HashSet<Polygon> polygons = new HashSet<Polygon>();


            ArrayList<String> verticeLine = new ArrayList<String>();

            Scanner input = new Scanner(new BufferedReader(new FileReader(fileName)));

            while (input.hasNext()) {
                String line = input.nextLine();
                Pattern pattern1 = Pattern.compile("v( -?(\\d)*(\\.)?(\\d)*){3}");
                Pattern pattern2 = Pattern.compile("f( [0-9]*){3,}");
                Matcher matcher1 = pattern1.matcher(line.trim());
                Matcher matcher2 = pattern2.matcher(line.trim());

                if (matcher1.matches()) {
                    verticeLine.add(line);
                } else if (matcher2.matches()) {

                    String[] newLine = line.split(" ");

                    LinkedHashSet<Vertex> vertices = new LinkedHashSet<Vertex>();

                    for (int i = 1; i <= newLine.length-1; i++) {
                        String[] curr = verticeLine.get(Integer.parseInt(newLine[i]) - 1).split(" ");
                        Vertex vertex = new Vertex(Double.parseDouble(curr[1]), Double.parseDouble(curr[2]),
                                Double.parseDouble(curr[3]));
                        //System.out.println(String.format("%f %f %f",vertex.x, vertex.y, vertex.z));
                        vertices.add(vertex);
                    }

                    Polygon poly = new Polygon(vertices);
                    polygons.add(poly);
                }
                else{
                    throw new WrongFileFormatException("a line does not follow standard OBJ format");
                }

            }
            input.close();

        return polygons;
    };
}
