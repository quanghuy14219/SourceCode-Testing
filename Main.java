import java.util.Scanner;

public class Main {
    static String catAndMouse(int x, int y, int z) {
        int dA = x - z;
        int dB = y - z;
        if(dA == dB) {
            return "Mouse C";
        }
        else if(dA < dB) {
            return "Cat A";
        }
        return "Cat B";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.println(catAndMouse(x,y,z));
    }
}
