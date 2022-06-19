import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KhuPho town = new KhuPho();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {

            System.out.println("Nhập số nhà:");
            scanner.nextLine();
            String soNha = scanner.nextLine();

            List<Nguoi> persons = new ArrayList<>();
            System.out.println("Nhập số người : ");
            int number = scanner.nextInt();

            for (int j = 0; j < number; j++) {

            }
            town.addHoGiaDinh(new HoGiaDinh(persons, soNha));
            town.toString();
        }
    }
}
