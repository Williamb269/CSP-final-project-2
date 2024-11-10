import java.util.Scanner;


public class LinearEquationLogic {


    static void start() {
        Scanner scanner = new Scanner(System.in);
        int x1, y1, x2, y2;
        System.out.println("Please type in you coordinates for x1 and y1 in this format (x1, y1): ");
        int[] coordinates = getCoordinates(scanner.nextLine());  //takes cords frm scnner puts in array
        x1 = coordinates[0];
        y1 = coordinates[1];
        System.out.println("Please type in you coordinates for x2 and y2 in this format (x2, y2): ");
        coordinates = getCoordinates(scanner.nextLine());
        x2 = coordinates[0];
        y2 = coordinates[1];
        if (x1 == x2) {
            System.out.println("Enter new digits, please.");
            start();
        }
        LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
        System.out.println(equation.LineInfo()); // Display line information
    }
    public static int[] getCoordinates(String input) {//basic ahh scanner returns array of numbers
        // Extract the x and y values from the input string
        int x = Integer.parseInt(input.substring(1, input.indexOf(",")));
        int y = Integer.parseInt(input.substring(input.indexOf(" ") + 1, input.indexOf(")")));


        return new int[]{x, y};
    }
}
