import java.util.Scanner;

public class spotknack_java_beginner {  public static void main(String[] args) {


////        ###1. Print Even Numbers

//        for (int i = 1; i <= 50; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }




//  //       ### 2. Sum of Multiples of 5

//        for(int i=1;i<=100;i++){
//            if(i%5==0){
//                System.out.println(i);
//            }
//        }




//### 3. Prime Number Checker

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int flag = 0;
//        int m = n / 2;
//        for (int i = 2; i <= m; i++) {
//            if (n % i == 0) {
//                flag = flag + 1;
//                break;
//            }
//        }
//        if (flag == 1) {
//            System.out.println("not a prime number");
//        } else {
//            System.out.println("its a prime number");
//        }




////         ### 4. Fibonacci Series

//        int n1=0,n2=1,n3;
//        System.out.println("enter the number");
//        Scanner sc=new Scanner(System.in);
//        int tot= sc.nextInt();
//        System.out.println(n1);
//        System.out.println(n2);
//        for(int i=1;i<=tot;i++){
//            n3=n1+n2;
//            n1=n2;
//            n2=n3;
//            System.out.println(n2);
//        }





//         ### 5. Count and Sum of Positive and Negative Numbers

//        Scanner sc = new Scanner(System.in);
//        int a[] = new int[10];
//        for (int i = 0; i < 10; i++) {
//            a[i] = sc.nextInt();
//
//        }
//        int pos = 0, neg = 0;
//        for (int i : a) {
//            if (i > 0) {
//                pos++;
//            } else {
//                neg++;
//            }
//        }
//        System.out.println(pos);
//        System.out.println(neg);







//        ### 7. Sum of Digits

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a, last, sum = 0;
//        a = n;
//     while (a != 0) {
//            last = a % 10;
//            sum += last;
//            a /= 10;
//        }
//        System.out.println(sum);




//        ### 8. Number Guessing Game

//        int num=7;
//        Scanner sc=new Scanner(System.in);
//        do{
//            int guess=sc.nextInt();
//            if(num==guess){
//                System.out.println("congrats");
//                break;
//            }
//            else {
//                System.out.println("try again");
//            }
//        }while(num!=10);



    }
}
