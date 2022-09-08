package assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PLYMeshReader implements MeshReader{
    public HashSet<Polygon> read(String fileName) throws WrongFileFormatException, IOException{
        HashSet<Polygon> polygons = new HashSet<Polygon>();

            ArrayList<String> verticeLine = new ArrayList<String>();

            Scanner input = new Scanner(new BufferedReader(new FileReader(fileName)));
            //check headers
            String[] regexes={"ply", "format ascii 1\\.0", "element vertex [0-9]+", "property float32 x","property float32 y", "property float32 z", "element face [0-9]+", "property list uint8 int32 vertex_indices", "end_header"};
            int currLine = 0;
            while (input.hasNext() && currLine < 9){
                String line = input.nextLine();
                if (!(Pattern.compile(regexes[currLine]).matcher(line.trim()).matches()))
                    throw new WrongFileFormatException("Wrong header format for PLY");
                currLine+=1;
            }

            if(currLine < 8) throw new WrongFileFormatException("Header missing details in PLY file");

            //check body

            int check = 0;
            while (input.hasNext()) {

                String line = input.nextLine();
                Pattern pattern1 = Pattern.compile("-?(\\d)*(\\.)?(\\d)* -?(\\d)*(\\.)?(\\d)* -?(\\d)*(\\.)?(\\d)*");
                Pattern pattern2 = Pattern.compile("[0-9]*( [0-9]*){3,}");
                Matcher matcher1 = pattern1.matcher(line.trim());
                Matcher matcher2 = pattern2.matcher(line.trim());

                if (matcher1.matches()) {
                    verticeLine.add(line);
                } else if (matcher2.matches()) {
                    check+=1;
                    String[] newLine = line.split(" ");

                    LinkedHashSet<Vertex> vertices = new LinkedHashSet<Vertex>();

                    for (int i = 1; i <= newLine.length-1; i++) {
                        String[] curr = verticeLine.get(Integer.parseInt(newLine[i])).split(" ");
                        Vertex vertex = new Vertex(Double.parseDouble(curr[0]), Double.parseDouble(curr[1]),
                                Double.parseDouble(curr[2]));
                        //System.out.println(String.format("%f %f %f",vertex.x, vertex.y, vertex.z));
                        vertices.add(vertex);
                    }

                    Polygon poly = new Polygon(vertices);
                    polygons.add(poly);
                }
                else{
                    throw new WrongFileFormatException("A line does not follow standard PLY format");
                }

            }
            System.out.println(polygons.size());
            System.out.println(check);
            input.close();

        return polygons;
    }
}
