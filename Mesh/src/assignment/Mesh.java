package assignment;

import java.io.IOException;
import java.util.HashSet;

public class Mesh extends GraphicalObject{
    HashSet<Polygon> polygons;
    MeshReader reader;
    MeshWriter writer;

    public void setReader(MeshReader reader){
        this.reader = reader;
    }

    public void setWriter(MeshWriter writer){
        this.writer = writer;
    }

    public void readFromFile(String file) throws WrongFileFormatException, IOException{
        polygons = reader.read(file);
    }

    public void writeToFile(String file) throws WrongFileFormatException, IOException{
        writer.write(file, polygons);
    }

    public void transform(double[][] matrix){
        for (Polygon ds : polygons)
            ds.transform(matrix);
    }


    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (!(o instanceof Mesh)) {
            return false;
        }
        Mesh mesh = (Mesh) o;
        return polygons.equals(mesh.polygons);
    }

    @Override
    public int hashCode() {
        int hash = 0;

        for(Polygon poly: polygons){
        	hash+=poly.hashCode();
        }
        return hash;
    }

}
