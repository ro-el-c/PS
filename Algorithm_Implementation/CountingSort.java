public class CountingSort {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int[] count = new int[21];
        int[] result = new int[100];

        /* Step 1 */
        for (int i = 0; i < arr.length; i++){
            // arr 배열에 임의의 값을 지정함과 동시에
            arr[i] = (int) (Math.random() * 20 + 1);
            // arr 배열의 값을 index 로 하는 count 배열 값 +1
            count[arr[i]] += 1;
        }

        /* Step 2 */
        for(int i=1; i<count.length; i++)
            count[i] += count[i-1];

        /* Step 3 */
        for(int i=0; i<arr.length; i++){
            int temp = arr[i];
            count[temp]--;
            result[count[temp]] = arr[i];
        }


        /* 배열 비교 출력 */
        System.out.print("array :");
        for(int i=0; i<arr.length; i++){
            if(i%10 == 0)
                System.out.println();
            System.out.print(arr[i] + "\t\t");
        }

        System.out.println();
        System.out.println();

        System.out.print("count :");
        for(int i=0; i<count.length; i++){
            if(i%10 == 0)
                System.out.println();
            System.out.print(count[i] + "\t\t");
        }

        System.out.println();
        System.out.println();

        System.out.print("result :");
        for(int i=0; i<result.length; i++){
            if(i%10 == 0)
                System.out.println();
            System.out.print(result[i] + "\t\t");
        }
    }
}