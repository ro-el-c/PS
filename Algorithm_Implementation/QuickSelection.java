// K 번째 수

// Quick Sort
// 평균 : O(nlogn), 최악 : O(n^2)

// Quick Selection
// 평균 시간 복잡도 : O(n)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QuickSelection {
    static int N, K;

    public static void quickSort(int[] arr, int lo, int hi){
        if(lo >= hi)
            return;

        // 정렬 후, 피봇 위치
        int part = partition(arr, lo, hi);

        if(part+1 == K)
            return;
        else if(part+1 < K)
            quickSort(arr, part+1, hi);
        else
            quickSort(arr, lo, part-1);
    }

    public static int partition(int[] arr, int lo, int hi){
        int mid = (lo + hi) / 2;
        swap(arr, lo, mid);

        int pivot = arr[lo];
        int i=lo, j=hi;

        while(i < j){
            // 오른쪽에서 왼쪽으로 pivot 보다 작은 값 찾음
            // <= 로 하면?
            while(pivot < arr[j])
                j--;

            // 왼쪽에서 오른쪽으로 pivot 보다 큰 값 찾음
            while(i < j && pivot >= arr[i])
                i++;

            // 찾은 두 값 위치 바꾸기
            swap(arr, i, j);
        }

        // lo == hi 일 때, 피봇과 위치 교환
        // 정렬 후, 피봇 위치 return
        arr[lo] = arr[i];
        arr[i] = pivot;
        return i;
    }

    public static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = arr[x];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        quickSort(arr, 0, N-1);

        System.out.print(arr[K-1]);
    }
}