package Keywords;

 class Human {
    void talking() {
        System.out.println("Humans are talking about worldcup match");
    }
}

    class Girl extends Human {
        void talking() {
            super.talking(); // Call the superclass method
            System.out.println("Girls talks about movies");
        }
    }

    public class supermethod{
        public static void main(String[] args) {
            Girl mygirl = new Girl();
            mygirl.talking();
        }
    }
