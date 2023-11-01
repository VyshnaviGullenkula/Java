public class Constructor {
        double length;
        double width;
        Constructor()
        {
            System.out.println("Constructor without parameter");
            length= 20;
            width = 10;
        }
        Constructor(int a, int b)
        {
            System.out.println("Constructor with parameter");
            length = a;
            width = b;
        }
        double area()
        {
            return length * width;
        }
    }
    class Rectangle
    {
        public static void main(String args[])
        {
            Constructor rectangle = new Constructor();
            double lb;
            lb = rectangle.area();
            System.out.println("Area of Rectangle " + lb);
            Constructor rectangle1 = new Constructor(25,50);
            lb = rectangle1.area();
            System.out.println("Area of Rectangle " + lb);
        }
    }
