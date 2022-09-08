package assignment;

import java.util.LinkedHashSet;

public class Polygon extends GraphicalObject{
    LinkedHashSet<Vertex> vertices;

    public Polygon(LinkedHashSet<Vertex> vertices){
        this.vertices = vertices;
    }

    @Override
    public void transform(double[][] matrix){
        for (Vertex v : vertices) {
            v.transform(matrix);
        }
    }

    @Override
    public int hashCode(){
        int hash = 0;
        for (Vertex v : vertices) {
            hash+=v.hashCode();
        }

        return hash;
    }

    @Override
    public boolean equals(Object obj){

        if(obj == null)
            return false;
        if(! (obj instanceof Polygon))
            return false;
        Polygon p = (Polygon)obj;
        return vertices.equals(p.vertices);
    }
}
