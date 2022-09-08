package assignment;

public class Vertex extends GraphicalObject{
    double x;
    double y;
    double z;

    public Vertex(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void transform(double[][] matrix)
    {
        double xOld = x;
        double yOld = y;
        double zOld = z;
        x = matrix[0][0]*xOld + matrix[0][1]*yOld + matrix[0][2]*zOld;
        y = matrix[1][0]*xOld + matrix[1][1]*yOld + matrix[1][2]*zOld;
        z = matrix[2][0]*xOld + matrix[2][1]*yOld + matrix[2][2]*zOld;
    }

    @Override
    public int hashCode(){
        return (int)(Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)+Math.pow(z, 2))*100000000);
    }

    @Override //change to set equality
    public boolean equals(Object obj){
        if(obj == null)
            return false;
        if(! (obj instanceof Vertex))
            return false;
        Vertex p = (Vertex)obj;
        return (this.x==p.x && this.y==p.y && this.z==p.z);
    }

    @Override
    public String toString(){
        return String.format("%f %f %f",x, y, z);
    }


}
