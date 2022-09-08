package assignment;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class OFFMeshWriter implements MeshWriter {

    @Override
    public void write(String fileName, HashSet<Polygon> polygons) throws IOException {
        ArrayList<String> lines = new ArrayList<String>();
        int numPoly = 0;
        int start = 0;
        for (Polygon polygon : polygons) {

            numPoly += 1;

            for (Vertex vertex : polygon.vertices) {

                String line = String.format("%f %f %f", vertex.x, vertex.y, vertex.z);
                if (lines.contains(line) == false) {
                    lines.add(start, line);
                    start += 1;
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
            format += "  220 220 220";
            lines.add(format);

            // int[] indexes = new int[3];
            // int counter = 0;
            // for (Vertex vertex : polygon.vertices) {
            //     indexes[counter] = lines.indexOf(String.format("%f %f %f", vertex.x, vertex.y, vertex.z));
            //     counter += 1;
            // }
            // lines.add(String.format("3 %d %d %d %d %d %d", indexes[0], indexes[1], indexes[2], 220, 220, 220));
        }


        FileWriter fileOutput = new FileWriter(fileName, false);
        int numVertex = lines.size() - numPoly;
        lines.add(0, "OFF");
        lines.add(1, String.format("%d %d 0", numVertex, numPoly));

        for (String line : lines) {
                fileOutput.write(line + "\n");
        }
        fileOutput.close();


    }

}
