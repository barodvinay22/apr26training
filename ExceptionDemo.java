// Exception Handling

// Object is the parent class of all class in java 
// Throwable --> Errors & Exception --> 

class ExceptionDemo{// try catch throw thorws finally
    public static void main(String args[]){
        try{
        int dividend = Integer.parseInt(args[0]);
        int divisor = Integer.parseInt(args[1]);
       
            System.out.println(dividend/divisor);
        }catch(NumberFormatException| ArithmeticException exception){
            System.out.println("Invalid Input");
        }catch(Exception exception){
            System.out.print("Generic Exception");
        }
       
    }
}