/**
 * Created by dev on 6/22/15.
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Sushil!");
        
        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println("Total:" + myTotal);
        
        int myLastOne = 1000 - myTotal;
        System.out.println("My Last One: "+myLastOne);
        
        byte myByteValue = 10;
        short myShortValue = 2000;
        int myIntValue = 10000;
        long myLongValue = 50000L + 10L * (myByteValue + myShortValue + myIntValue);
        
        System.out.println("My value: "+ myLongValue);
        
        float myFloatValue = 5.25f ;
        System.out.println("my float value: "+ myFloatValue);
        

        double pounds = 200d;
        double kilogram = pounds * 0.45359237d;
        
        System.out.println("total Kilograms: "+ kilogram);
        
       // double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(anotherNumber);
        
        char myChar = '\u0044';
        System.out.println("My Char is: "+myChar);
        
        double first = 20d;
        double second = 80d;
        
        double result = (first + second) * 100;
        
        double remainder = result % 40;
        
        System.out.println("Ramainder value: "+remainder);
        
        boolean isZero = false;
        
        if (remainder == 0) {
        	isZero = true;
        } else {
        	System.out.println("Got some remainder " + remainder);
        }
        
        System.out.println("boolean value is "+isZero);
        
        
    }
}
