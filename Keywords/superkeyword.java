package Keywords;

class Mobile {
        int contacts;

        public Mobile(int contacts) {
            this.contacts = contacts;
        }
    }

    class Bluetooth extends Mobile {
        String brand;

        public Bluetooth(int contacts, String brand) {
            super(contacts);
            this.brand = brand;
        }

    }

    public class superkeyword {
        public static void main(String[] args) {
            Bluetooth myBluetooth = new Bluetooth(250,"Realme");
            System.out.println("Brand: " + myBluetooth.brand);
            System.out.println("Contacts: " + myBluetooth.contacts);
        }
}