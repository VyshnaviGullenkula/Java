package Methods;

public class MethodOverloading {
        static String company(String s1)
        {
            return ("Name of the Company: " +s1);
        }
        static String company(String s1, String s2)
        {
            return ("Type of the Company: " +s1+" - "+s2);
        }
        static int company(int num)
        {
            return num;
        }
        public static void main(String args[])
        {
            System.out.println(company("Qualizeal"));
            System.out.println(company("IT Industry", "Software Compnay"));
            System.out.println("Total number of Employees: " +company(500));
        }
    }