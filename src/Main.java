import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu rong: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap chieu cao: ");
        double height = Double.parseDouble(scanner.nextLine());
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println(rectangle.display());
        System.out.println("Dien tich hinh chu nhat la: " + rectangle.getArea());
        System.out.println("Chu vi cua hinh chu nhat la: " + rectangle.getPerimeter());
    }
}