package Methods;

public class MethodOverriding {
        void run(){
            System.out.println("Vehicle is running");
        }
    }
    //Creating a child class
    class Bike extends MethodOverriding {
        public static void main(String args[]){
            Bike obj = new Bike();
            obj.run();
        }
    }
