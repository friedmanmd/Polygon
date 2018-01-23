public class PolygonTester
{
    public static void main(String[] args)
    {
        Point[] points = new Point[4];
        points[0] = new Point(1,7);
        points[1] = new Point(9,7);
        points[2] = new Point(9,-1);
        points[3] = new Point(1,-1);
        
        Polygon poly = new Polygon(points);
        
        System.out.println("The perimeter of the " + poly.name() + " is\t" + poly.perimeter());
        System.out.println("The area of the " + poly.name() + " is\t" + poly.area());
        
        points = new Point[5];
        points[0] = new Point(1,7);
        points[1] = new Point(9,7);
        points[2] = new Point(13, 3);
        points[3] = new Point(9,-1);
        points[4] = new Point(1,-1);
        
        poly = new Polygon(points);
        
        
        System.out.println(poly);
        
        System.out.println("The perimeter of the " + poly.name() + " is\t" + poly.perimeter());
        System.out.println("The area of the " + poly.name() + " is\t" + poly.area());
        
    }
}
