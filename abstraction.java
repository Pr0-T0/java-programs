abstract class shape{
    public abstract int NumberofSides();
}
class rectangle extends shape{
    public int NumberofSides(){
        return 4;
    }
}
class triangle extends shape{
    public int NumberofSides(){
        return 3;
    }
}
class hexagon extends shape{
    public int NumberofSides(){
        return 6;
    }
}
public class abstraction{
    public static void main(String[] args) {
        rectangle r = new rectangle();
        triangle t = new triangle();
        hexagon h = new hexagon();

        System.out.println("number of sides in a rectangle = "+r.NumberofSides());
        System.out.println("number of sides in a triangle = "+t.NumberofSides());
        System.out.println("number of sides in a hexagon = "+h.NumberofSides());
    }
}
