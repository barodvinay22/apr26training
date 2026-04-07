import java.util.Scanner;// Import

// Control Statments
// If-Else Statmenet And Switch case
class ControlStatment{
    // public static void main(String...a){
    //     int ageOfPerson= 20;
    //     if(ageOfPerson>18){
    //         System.out.print("Able to Vote");
    //     }else{
    //         System.out.print("Not eligible to Vote");
    //     }
    // }
    public static void main(String...a){
        Scanner sc=new Scanner(System.in);// Here we are creating object of Scanner class and holding this object sc reference
        //in is an static object of InputStream
        System.out.println("Enter Day Number");//java.lang default package
        int dayNumber =sc.nextInt();
        // if(dayNumber==1){
        //     System.out.print("Sunday");
        // }else if (dayNumber==2){
        //     System.out.print("Monday");
        // }else if(dayNumber==3){
        //     System.out.print("Tuesday");
        // }
        switch(dayNumber){
            case 1:
            System.out.print("Sunday");
            break;
            case 2:
            System.out.print("Monday");
            break;
            case 3:
            System.out.print("Tuesday");
            break;
            case 4:
            System.out.print("Wednesday");
            break;
            case 5:
            System.out.print("Thursday");
            break;
            case 6:
            System.out.print("Friday");
            break;
            case 7:
            System.out.print("Saturday");
            break;
            default:
            System.out.print("Invalid Day Number");

        }
    }

}