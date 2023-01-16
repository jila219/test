import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("plese Enter numbers sarting point and ending point");
        int start=scanner.nextInt();
        int end= scanner.nextInt();
        for (int i= start; i< end; i++){
            System.out.println(i);
        }



    }
}
