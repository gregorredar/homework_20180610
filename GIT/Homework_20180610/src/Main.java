import java.util.Scanner;

public class Main {
    static int maxLength = 0;
    static int minLength = 0;
    static String longestName = null;
    static String shortestName = null;
    static int counter;
    static String repeating;

    public static void main(String[] args) {


    createTable();


    }

    private static void createTable() {
        print("Enter number of names: ");
        Integer num1 = readIntFromConsole();
        String[] table = new String[num1];
        print("Table length: " + table.length);
        print("---------------");


// ENTERING NAMES

        for (int i = 0; i < table.length; i++) {
            print("Type a name: ");
            String name = readStrFromConsole();
            table[i] = name;
            print("---------------");
        }


// LONGEST NAME

        for (int i = 0; i < table.length; i++) {
            if (table[i].length() > maxLength) {
                maxLength = table[i].length();
                longestName = table[i];
            }
        }

        print("Najdłuższe imię: " + longestName);



//SHORTEST NAME

        for (int i = 0; i < table.length; i++) {
            minLength = table[0].length();
            if (table[i].length() <= minLength) {
                minLength = table[i].length();
                shortestName = table[i];
            }
        }

        print("Najkrótsze imię: " + shortestName);


// REPEATING NAMES

        for (int i = 0; i < table.length; i++) {
            int counter = 0;
            String repeating = null;
            if (table[i].hashCode() == table[i].hashCode()) {
                counter++;
                repeating = table[i];
            }
            System.out.println(repeating + "(" + counter + ")");
        }


    }


        private static Integer readIntFromConsole () {

        return new Scanner(System.in).nextInt();
        }

        private static String readStrFromConsole () {

        return new Scanner(System.in).nextLine();
        }

        private static void print (String text){

        System.out.println(text);
        }

}




