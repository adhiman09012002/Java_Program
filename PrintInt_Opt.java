import java.util.*;
   class PrintInt_Opt{
         public static void main(String [] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number :");
         int a = sc.nextInt();
         System.out.print("Enter b number :");
         int b = sc.nextInt();
         System.out.print("Enter c number :");
         int c = sc.nextInt();

         int x = (a + b * c);

         System.out.println("a + b * c)  " + "=" + x);
         int y = (a * b + c);

         System.out.println("a * b + c  " + "=" + y);
         int z = (c + a / b);
         System.out.println("c + a / b  " + "=" + z);
         int m = (a % b + c);

         System.out.println("a % b + c   " + "=" + m);

      }
  }
