package om.introduct.javacourse.basics;

public class Tasks_GroupB {
    public static void main(String[] args) {

        // task 13
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int fact = 1;
//
//        for(int i = 1; i <= n; i++){
//            fact = fact * i;
//        }
//
//        System.out.println(fact);

        // task 15
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        if(a >= b && a >= c){
//            System.out.println(a);
//        } else if(b >= a && b >= c){
//            System.out.println(b);
//        } else {
//            System.out.println(c);
//        }

        //version 2
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        int max = a;
//
//        if(b > max){
//            max = b;
//        }
//        if(c > max){
//            max = c;
//        }
//        System.out.println(max);

        //task 23
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a = 0;
//        int b = 1;
//
//        for(int i=1; i<=n; i++){
//            System.out.println(a);
//            int next = a + b;
//            a = b;
//            b = next;
//        }


        // task 24
//        Scanner sc = new Scanner(System.in);
//        int n;
//
//        do {
//            n = sc.nextInt();
//            if(n >= 0){
//                System.out.println(n);
//            }
//        } while(n >= 0);


        // version 2
//        Scanner sc = new Scanner(System.in);
//        int n;
//
//        while(true){
//            n = sc.nextInt();
//
//            if(n < 0){
//                break;
//            }
//
//            System.out.println(n);
//        }


        // task 29

//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int min = a;
//
//        if(b < min){
//            min = b;
//        }
//
//        for(int i=min; i>=1; i--){
//            if(a % i == 0 && b % i == 0){
//                System.out.println(i);
//                break;
//            }
//        }


        // task 30

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(); // n = 3
//        int sum = 0;
//
//        for(int i=1; i<=n; i++){
//            int m = sc.nextInt();
//            sum = sum + m;
//        }
//
//        System.out.println(sum);


        // task 35
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum = 0;
//
//        for(int i=1; i<n; i++){
//            if(n % i == 0){
//                sum = sum + i;
//            }
//        }
//
//        if(sum == n){
//            System.out.println("PERFECT");
//        } else {
//            System.out.println("NOT PERFECT");
//        }


        // task 37
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        while(true){
//            System.out.println(n);
//            if(n == 1){
//                break;
//            }
//            if(n % 2 == 0){
//                n = n / 2;
//            } else {
//                n = n * 3 + 1;
//            }
//        }

    }
}
