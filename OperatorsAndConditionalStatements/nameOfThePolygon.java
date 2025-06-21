import java.util.*;
class PolygonName {
    public static void main(String[] args) {
        int sides = new Scanner(System.in).nextInt();
        switch (sides) {
            case 3: System.out.println("Triangle"); break;
            case 4: System.out.println("Quadrilateral"); break;
            case 5: System.out.println("Pentagon"); break;
            case 6: System.out.println("Big Polygon"); break;
            default: System.out.println("Not Polygon");
        }
    }
}
