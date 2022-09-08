package assignment;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class OBJMeshWriter implements MeshWriter{

    @Override
    public void write(String fileName, HashSet<Polygon> polygons) throws IOException{
        ArrayList<String> lines = new ArrayList<String>();
        int start = 0;
        for (Polygon polygon : polygons) {
            for (Vertex vertex : polygon.vertices) {
                String line = String.format("%c %f %f %f",'v',vertex.x, vertex.y, vertex.z);
                if (lines.contains(line)==false){
                    lines.add(start, line);
                    start+=1;
                }

            }
            // int[] indexes = new int[3];
            ArrayList<Integer> indexes = new ArrayList<Integer>();
            for (Vertex vertex : polygon.vertices) {
                indexes.add(lines.indexOf(String.format("%c %f %f %f",'v',vertex.x, vertex.y, vertex.z)));
            }

            String format = "f";
            for (int i = 0; i<indexes.size(); i++) {
                format += " "+Integer.toString(indexes.get(i)+1);
            }
            lines.add(format);
        }


        FileWriter fileOutput = new FileWriter(fileName, false);
        for (String line : lines) {
            fileOutput.write(line + "\n");
        }
        fileOutput.close();

    };
}
