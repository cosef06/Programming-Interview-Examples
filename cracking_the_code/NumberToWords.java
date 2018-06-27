import java.util.*;
public class NumberToWords{

  public static int getDigitCount(int number){

       if(number < 0)
       return -1;

       int count= 0;
       while(number != 0){
           number /= 10;
           ++count;
       }
       //System.out.println("digit count :" + count);
       return count;

   }
   public static int reverse(int number){
     //System.out.println("number is :" + number);
       int reverse = 0;
       while(number != 0){
         reverse = reverse * 10;
         reverse = reverse + number%10;
         number = number/10;
       }
       //System.out.println("reversed version is " + reverse);
       return reverse;
   }
   public static void numberToWords(int number){
       switch (number) {
         case 0:
         System.out.println("Zero");
         break;
         case 1:
         System.out.println("one");
         break;
         case 2:
         System.out.println("two");
         break;
         case 3:
         System.out.println("three");
         break;
         case 4:
         System.out.println("four");
         break;
         case 5:
         System.out.println("five");
         break;
         case 6:
         System.out.println("six");
         break;
         case 7:
         System.out.println("seven");
         break;
         case 8:
         System.out.println("eight");
         break;
         case 9:
         System.out.println("nine");
         break;
         default:
         System.out.println("test");
       }
   }
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int number = sc.nextInt();
     if(number < 0){
         System.out.println("Invalid Value");
         return ;
     }
     int len_original = getDigitCount(number);
     number = reverse(number);
     int len_reversed = getDigitCount(number);
     if(len_original == len_reversed){
         while(len_original-- != 0){
           int temp = number%10;
           number /= 10;
           numberToWords(temp);
         }
     }else{
       int dif = len_original-len_reversed;
       while (len_reversed-- != 0) {
         int temp = number%10;
         number /= 10;
         numberToWords(temp);
       }
       while (dif-- != 0) {
         numberToWords(0);
       }
     }
   }
}
