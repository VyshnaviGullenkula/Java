package Keywords;

public class thisconstructor {
        int side1;
        int side2;

        public thisconstructor() {
            this(4, 4);
        }

        public thisconstructor(int side1, int side2) {
            this.side1 = side1;
            this.side2 = side2;
        }

        public int calculateArea() {
            return this.side1 * this.side1;
        }

        public static void main(String[] args) {
            thisconstructor square = new thisconstructor();
            System.out.println("Area of square: " + square.calculateArea());
        }
    }

