import java.util.Objects;
import java.util.Scanner;

public class DemoFunctionalInterface {
    public static void main(String[] args) {
        Reversable r1 = new Reversable() {
            @Override
            public void reverse() {
                int no;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Any Number ");
                no = sc.nextInt();
                int rev = 0;
                while (no > 0) {
                    int d = no % 10;
                    rev = rev * 10 + d;
                    no = no / 10;
                }
                System.out.println("Reverse number: " + rev);
            }
        };
        r1.reverse();


        Reversable r2 = new Reversable() {
            @Override
            public void reverse() {
                String s1;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter any Strring ");
                s1=sc.nextLine();
                String s2 ="";
                for(int i=s1.length()-1;i>=0;i--){
                    s2=s2+s1.charAt(i);
                }
                System.out.println(s2);
            }
        };
        r2.reverse();


    }
    }

