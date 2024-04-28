import java.util.Scanner;

public class Question6 {

    Scanner sc = new Scanner(System.in);
    public void weekday(){
        System.out.println("Please enter the day of the week");
        int userInput=sc.nextInt();
        if(userInput<1 && userInput>7){
            System.out.println("Out of range");
        }
        else {
            switch(userInput){
                case 1: System.out.println("Monday"); break;
                case 2: System.out.println("Tuesday"); break;
                case 3: System.out.println("Wednesday"); break;
                case 4: System.out.println("Thursday"); break;
                case 5: System.out.println("Friday"); break;
                case 6: System.out.println("Saturday"); break;
                case 7: System.out.println("Sunday"); break;
            }
        }

    }
}
