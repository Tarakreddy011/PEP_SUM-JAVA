class D1 {

    public static void main(String[] args) {
       /* int[] arr = {10,2,3,4,5,6,0,44,210};

        int sum = 0;
        int max = 0;
        int max2 = 0;
        int min = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];

            if(arr[i] > max) {
                max2 = max;
                max = arr[i];
            } 
            else if(arr[i] > max2 && arr[i] != max) {
                max2 = arr[i];
            }

            if(arr[i] < min) min = arr[i];
        }



        System.out.println("sum " + sum);
        System.out.println("max " + max);
        System.out.println("max2 " + max2);
        System.out.println("min " + min);


        int[][] arr2d = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        for(int i = 0; )
        */

        int[][] arrtwod = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        for(int i=0; i<arrtwod.length; i++){
            for(int j=0; j<arrtwod[i].length; j++){
                System.out.print(arrtwod[i][j] + "  ");
            }
        }

        for(int i=0; i<arrtwod.length; i++){
            for(int j=0; j<arrtwod[i].length; j++){
                System.out.print(arrtwod[i][j] + "  ");
            }
        }
    }
}