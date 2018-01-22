
public class Polygon
{
    Point[] points;
    
    public Polygon(Point[] input)
    {
        points = input;
    }
    
    public double perimeter()
    {
        double p = 0;
        
        //adding distance between each adjacent point in array
        for(int i=0; i < points.length-1; i++)
        {
            p+= Math.sqrt(Math.pow(points[i+1].getX()-points[i].getX(),2)+Math.pow(points[i+1].getY()-points[i].getY(),2));
        }
        
        //adding distance between first and last point in array
        p+= Math.sqrt(Math.pow(points[points.length-1].getX()-points[0].getX(),2)+Math.pow(points[points.length-1].getY()-points[0].getY(),2));
 
        return p;
    }
    
    public double area()
    {
        double a = 0;
        
        for(int i = 0; i < points.length-1; i++)
        {
            a += points[i].getX()*points[i+1].getY();
        }
        a += points[points.length-1].getX()*points[0].getY();
        
        for(int i = 0; i < points.length-1; i++)
        {
            a -= points[i].getY()*points[i+1].getX();
        }
        a -= points[points.length-1].getY()*points[0].getX();
        
        a /= 2;
        
        return Math.abs(a);
    }
    
    public String name()
    {
        String name;
        
        switch (points.length) {
            case 3: name = "triange"; break;
            case 4: name = "quadrilateral"; break;
            case 5: name = "pentagon"; break;
            case 6: name = "hexagon"; break;
            case 7: name = "heptagon"; break;
            case 8: name = "octagon"; break;
            case 9: name = "nonagon"; break;
            case 10: name = "decagon"; break;
            default: name = "Not a polygon"; break;
        }
        
        return name;
    }
    
    public String toString()
    {
        String toPrint;
        toPrint = "The points of the polygon are: ";
        for (int i = 0; i < points.length-1; i++)
        {
            toPrint += points[i] + "; ";
        }
        toPrint += points[points.length-1];
        toPrint += ".";
        return toPrint;
    }
}
