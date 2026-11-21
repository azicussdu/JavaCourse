package om.introduct.javacourse.arrays;

public class Arrays1_GroupB {
    public static void main(String[] args) {

//        int[] arr = {10, 20, 30, 40, 50};
//
//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }


    // sum of all values in array
//        int[] arr = {2, 4, 8, 6, 2, 9};
//        int sum = 0;
//
//        for(int i=0; i<arr.length; i++){
//            sum = sum + arr[i];
//        }
//
//        System.out.println(sum);


    // find max in array
//        int[] arr = {-4, -6, -2, -9, -1, -5};
//        int max = arr[0];
//
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
//
//        System.out.println(max);

    // count even numbers in array
//        int[] arr = {2, 4, 3, 7, 6, 8, 9};
//        int count = 0;
//
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] % 2 == 0){
//                count++;
//            }
//        }
//
//        System.out.println(count);


    // task 1
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//
//        for(int i=0; i<arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

    //task 6
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//
//        for(int i=0; i<arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println(arr[0]);
//        System.out.println(arr[arr.length-1]);

    // My task:
    // Enter N then N numbers
    // find sum of numbers in even indexes and in odd indexes
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sumE = 0, sumO = 0;
//        int[] arr = new int[n];
//
//        for(int i=0; i<arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        for(int i=0; i<arr.length; i++){
//            if(i % 2 == 0){
//                sumE = sumE + arr[i];
//            } else {
//                sumO += arr[i];
//            }
//        }
//
//        System.out.println("Sum of numbers in even indexes: " + sumE);
//        System.out.println("Sum of numbers in odd indexes: " + sumO);


    // My task: find sum of left and right half of array
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int sumL = 0, sumR = 0;
//        int mid = n / 2;
//
//        int[] arr = new int[n];
//
//        for(int i=0; i<arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        for(int i=0; i<mid; i++){
//            sumL = sumL + arr[i];
//        }
//
//        for(int i=mid; i<arr.length; i++){
//            sumR = sumR + arr[i];
//        }
//
//        System.out.println("Left sum: " + sumL);
//        System.out.println("Right sum: " + sumR);

    //2nd way
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int sumL = 0, sumR = 0;
//        int mid = n / 2;
//
//        int[] arr = new int[n];
//
//        for(int i=0; i<arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        for(int i=0; i<arr.length; i++){
//            if(i < mid){
//                sumL = sumL + arr[i];
//            } else {
//                sumR = sumR + arr[i];
//            }
//        }
//
//        System.out.println("Left sum: " + sumL);
//        System.out.println("Right sum: " + sumR);

    // My task: show max and index of max value
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        int max = arr[0];
//        int index = 0;
//
//        for(int i=0; i<arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] > max){
//                max = arr[i];
//                index = i;
//            }
//        }
//
//        System.out.println("Max value: " + max);
//        System.out.println("It's index: " + index);
    }
}
