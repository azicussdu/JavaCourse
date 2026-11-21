package om.introduct.javacourse.arrays;

public class Arrays1_GroupA {
    public static void main(String[] args) {

        // arrays 1
//        int[] arr = {10, 20, 30, 40, 50};
//        System.out.println(arr[2]);
//        arr[1] = 100;
//
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }

        // arrays 2
//        int[] arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 33;

        // sum of array
//        int[] arr = {1, 5, 3, 7, 8, 9};
//        int sum = 0;
//
//        for(int i=0; i<arr.length; i++){
//            sum = sum + arr[i];
//        }
//
//        System.out.println(sum);

        // find max and its index
//        int[] arr = {1, 5, 3, 9, 8, 4};
//        int max = arr[0];
//        int index = 0;
//
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] > max){
//                max = arr[i];
//                index = i;
//            }
//        }
//
//        System.out.println("index of max: " + index);
//        System.out.println("max value: " + max);


        // count even numbers
//        int[] arr = {2, 5, 4, 6, 7, 8, 2, 7};
//        int count = 0;
//
//        for(int i=0; arr.length>i; i++){
//            if(arr[i] % 2 == 0){
//                count++;
//            }
//        }
//
//        System.out.println("amount of even numbers: " + count);

        // sum of numbers under even indexes
//        int[] arr = {2, 5, 4, 6, 7, 8, 2, 7};
//        int sum = 0;
//
//        for(int i=0; i<arr.length; i++){
//            if(i % 2 == 0){
//                sum = sum + arr[i];
//            }
//        }
//
//        System.out.println(sum);

        //Swap min and max in the array
//        int[] arr = {2, 5, 4, 6, 7, 8, 2, 7};
//        int max = arr[0];
//        int min = arr[0];
//        int maxInd = 0;
//        int minInd = 0;
//
//        // print before change
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//
//        // find max, min and their indexes
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] > max){
//                max = arr[i];
//                maxInd = i;
//            }
//            if(arr[i] < min){
//                min = arr[i];
//                minInd = i;
//            }
//        }
//
//        // swap max and min using their indexes
//        arr[maxInd] = min;
//        arr[minInd] = max;
//
//        // print after swap
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();


    // MyTask: sum of numbers between 2 zeros
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt(); // n is length
//        int[] arr = new int[n];
//        int firstInd = 0, lastInd = 0;
//
//        for(int i=0; i<arr.length; i++){
//           arr[i] = sc.nextInt();
//        }
//
//        //find index of first 0
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] == 0){
//                firstInd = i;
//                break;
//            }
//        }
//
//        for(int i=arr.length-1; i>=0; i--){
//            if(arr[i] == 0){
//                lastInd = i;
//                break;
//            }
//        }
//
//        int sum = 0;
//        for(int i=firstInd+1; i<lastInd; i++){
//            sum = sum + arr[i];
//        }
//
//        System.out.println("sum: " + sum);

    }
}








