import java.util.Scanner;

public class Question7 {
    Scanner sc = new Scanner(System.in);
    public void incomeTaxCalculation() {
        System.out.println("Enter income amount: ");
        int income=sc.nextInt();
        System.out.println("Enter status");
       sc.nextLine();
        String status=sc.nextLine();
        double tax=0;

        switch(status){
            case "Single":
                if(income>0 && income<=8350){
                tax=income*0.1;
                }
                else if(income>8350 && income<=33951){
                    tax=income*0.15;
                }
                else if(income>33951 && income<=82250){
                    tax=income*0.25;
                }
                else if(income>82250 && income<=171550){
                    tax=income*0.28;
                }
                else if(income>171550 && income<=372950){
                    tax=income*0.33;
                }
                else if(income>372950){
                    tax=income*0.35;
                }
                break;
            case "Married Filing Jointly":
                if(income>0 && income<=16700){
                    tax=income*0.1;
                }
                else if(income>16700 && income<=67900){
                    tax=income*0.15;
                }
                else if(income>67900 && income<=137050){
                    tax=income*0.25;
                }
                else if(income>137050 && income<=208850){
                    tax=income*0.28;
                }
                else if(income>208850 && income<=372950){
                    tax=income*0.33;
                }
                else if(income>372950){
                    tax=income*0.35;
                }
                break;
            case "Married Filing Separately":
                if(income>0 && income<=8350){
                    tax=income*0.1;
                }
                else if(income>8350 && income<=33951){
                    tax=income*0.15;
                }
                else if(income>33951 && income<=68525){
                    tax=income*0.25;
                }
                else if(income>68525 && income<=104425){
                    tax=income*0.28;
                }
                else if(income>104425 && income<=186475){
                    tax=income*0.33;
                }
                else if(income>186475){
                    tax=income*0.35;
                }
                break;
            case "Head of Household":
                if(income>0 && income<=11950){
                    tax=income*0.1;
                }
                else if(income>8350 && income<=45500){
                    tax=income*0.15;
                }
                else if(income>45500 && income<=117450){
                    tax=income*0.25;
                }
                else if(income>117450 && income<=190200){
                    tax=income*0.28;
                }
                else if(income>190200 && income<=372950){
                    tax=income*0.33;
                }
                else if(income>372950){
                    tax=income*0.35;
                }
                break;
            default:
                System.out.println("Enter correct details");
                break;
        }
        System.out.println(tax);
    }
}
