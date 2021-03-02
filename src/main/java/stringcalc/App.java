package stringcalc;

public class App 
{
    public static void main( String[] args )
    {
        //Main Code
    }

    public static int add(String numbers){
        //Kata code
        
        int sum = 0;
        if(numbers.equals(""))
            return sum;

        String temp = "";

        int len = numbers.length();
        
        for (int index = 0; index < len; index++){
            if (isDigit(numbers.charAt(index))){
                temp+=numbers.charAt(index);
            }
        }

        int numbersToInt = Integer.parseInt(temp);


        while(numbersToInt != 0){
            int rem = numbersToInt%10;
            sum+=rem;
            numbersToInt/=10;
        }

        return sum;
    }

    public static boolean isDigit(char check){
        if (check == '0'
        || check == '1'
        || check == '2'
        || check == '3'
        || check == '4'
        || check == '5'
        || check == '6'
        || check == '7'
        || check == '8'
        || check == '9'){
            return true;
        }
        return false;
    }
}