package om.introduct.javacourse.arrays;

public class Tasks2_GroupB {
    public static void main(String[] args) {

        //task 18
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//        for(int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        int ind1 = sc.nextInt();
//        int ind2 = sc.nextInt();
//
//        int temp = arr[ind1];
//        arr[ind1] = arr[ind2];
//        arr[ind2] = temp;
//
//        for(int i=0; i<n; i++){
//            System.out.println(arr[i]);
//        }

        // task 22
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        boolean sorted = true;
//
//        int[] arr = new int[n];
//        for(int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        for(int i=0; i<n-1; i++){
//            if(arr[i] > arr[i+1]){
//                sorted = false;
//                break;
//            }
//        }
//
//        if(sorted){
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }

        // task 25
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//        for(int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        int max = arr[0];
//        int count = 0;
//
//        for(int i=0; i<n; i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
//
//        for(int i=0; i<n; i++){
//            if(arr[i] == max){
//                count++;
//            }
//        }
//
//        System.out.println(max);
//        System.out.println(count);


        // task 28
//        Scanner sc = new Scanner(System.in);
//        int r = sc.nextInt();
//        int c = sc.nextInt();
//
//        int[][] arr = new int[r][c];
//        for(int i=0; i<r; i++){
//            for(int j=0; j<c; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        int sum = 0;
//
//        for(int i=0; i<r; i++){
//            for(int j=0; j<c; j++){
//                sum = sum + arr[i][j];
//            }
//            System.out.println(sum);
//            sum = 0;
//        }


        // working with columns (not rows) (same as task 35)
//        int[][] arr = {
//                {1, 1, 2, 2},
//                {3, 3, 4, 4},
//                {5, 5, 6, 6}
//        };
//
//        for(int j=0; j<4; j++){
//            for(int i=0; i<3; i++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }



        // task 29
//        Scanner sc = new Scanner(System.in);
//        int r = sc.nextInt();
//        int c = sc.nextInt();
//
//        int[][] arr = new int[r][c];
//        for(int i=0; i<r; i++){
//            for(int j=0; j<c; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        int sum = 0;
//
//        for(int j=0; j<c; j++){
//            for(int i=0; i<r; i++){
//                sum = sum + arr[i][j];
//            }
//            System.out.println(sum);
//            sum = 0;
//        }


        // task 31-32
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int[][] arr = new int[n][n];
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        int sum1 = 0, sum2 = 0;
//
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                if(i == j){
//                    sum1 = sum1 + arr[i][j];
//                }
//
//                if(i+j == n-1){
//                    sum2 = sum2 + arr[i][j];
//                }
//            }
//        }
//
//        System.out.println(sum1);
//        System.out.println(sum2);

        // task 40
//        Scanner sc = new Scanner(System.in);
//        int r = sc.nextInt();
//        int c = sc.nextInt();
//
//        int[][] arr = new int[r][c];
//        for(int i=0; i<r; i++){
//            for(int j=0; j<c; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        int x = sc.nextInt();
//
//        boolean found = false;
//        for(int i=0; i<r; i++){
//            for(int j=0; j<c; j++){
//                if(arr[i][j] == x){
//                    System.out.println(i + " " + j);
//                    found = true;
//                    break;
//                }
//            }
//            if(found){
//                break;
//            }
//        }
//
//
//        if(!found){
//            System.out.println("-1 -1");
//        }

    }
}









