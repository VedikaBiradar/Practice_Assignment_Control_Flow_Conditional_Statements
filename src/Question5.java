import java.util.Scanner;

public class Question5 {
    public void grades(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter score: ");
     int x=sc.nextInt();

        if (x >= 0 && x <= 100) {

            if (x >= 90 && x <= 100) {
                System.out.println("Grade A");
            } else if (x >= 80 && x < 90) {
                System.out.println("Grade B");
            } else if (x >= 70 && x < 80) {
                System.out.println("Grade C");
            } else if (x >= 60 && x < 70) {
                System.out.println("Grade D");
            } else if (x < 60) {
                System.out.println("Grade E");

            }
        }
        else{
            System.out.println("Score out of range");
        }
    }
}
