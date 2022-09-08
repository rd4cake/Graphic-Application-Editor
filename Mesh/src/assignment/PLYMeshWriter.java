package assignment;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class PLYMeshWriter implements MeshWriter{

    @Override
    public void write(String fileName, HashSet<Polygon> polygons) throws IOException {
        ArrayList<String> lines = new ArrayList<String>();
        int numPoly = 0;
        int start = 0;
        for (Polygon polygon : polygons) {

            numPoly+=1;

            for (Vertex vertex : polygon.vertices) {

                String line = String.format("%f %f %f",vertex.x, vertex.y, vertex.z);
                if (lines.contains(line)==false){
                    lines.add(start,line);
                    start+=1;
                }

            }

            ArrayList<Integer> indexes = new ArrayList<Integer>();
            for (Vertex vertex : polygon.vertices) {
                indexes.add(lines.indexOf(String.format("%f %f %f",vertex.x, vertex.y, vertex.z)));
            }

            String format = Integer.toString(indexes.size());
            for (int i = 0; i<indexes.size(); i++) {
                format += " "+Integer.toString(indexes.get(i));
            }
            lines.add(format);
        }


        FileWriter fileOutput = new FileWriter(fileName, false);

        int numVertex = lines.size()-numPoly;
        lines.add(0,"ply");
        lines.add(1,"format ascii 1.0");
        lines.add(2,String.format("element vertex %d", numVertex));
        lines.add(3,"property float32 x");
        lines.add(4,"property float32 y");
        lines.add(5,"property float32 z");
        lines.add(6,String.format("element face %d", numPoly));
        lines.add(7,"property list uint8 int32 vertex_indices");
        lines.add(8,"end_header");

        for (String line : lines) {
            fileOutput.write(line + "\n");
        }
        fileOutput.close();


    }

}
