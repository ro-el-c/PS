import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_14003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; i++)
            arr.add(Integer.parseInt(st.nextToken()));

        List<Integer> list = new ArrayList<>();
        list.add(0);
        List<Integer> index = new ArrayList<>(n);
        for (int temp : arr){
            if(temp > list.get(list.size() - 1)){
                list.add(temp);
                index.add(list.size()-1);
            }
            else{
                int left = 0;
                int right = list.size() - 1;

                while(left < right){
                    int mid = (left + right) / 2;
                    if(list.get(mid) >= temp){
                        right = mid;
                    }else{
                        left = mid + 1;
                    }
                }
                list.set(right, temp);
                index.add(right);
            }
        }

        // 실제 수열 구하기
        int order = list.size()-1;
        List<Integer> ans = new ArrayList<>();
        for (int i=n-1; i>=0; i--){
            if (index.get(i) == order){
                ans.add(arr.get(i));
                order--;
                if (order<0)
                    break;
            }
        }
        ans.sort(Comparator.naturalOrder());

        System.out.println(ans.size());
        for(int i=0; i<ans.size(); i++)
            System.out.print(ans.get(i) + " ");

    }

}
