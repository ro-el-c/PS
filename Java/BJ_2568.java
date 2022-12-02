import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_2568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        // A->B로 연결된 전깃줄 쌍 - Map 으로 저장 / key: A, value: B
        Map<Integer, Integer> pair = new HashMap<>(n);
        for (int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            pair.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        // A만 가져와 정렬한
        List<Integer> sort = new ArrayList<>(pair.keySet());
        sort.sort(Comparator.naturalOrder());

        // 정렬된 A에 연결된 전깃줄(B)로 가장 긴 부분 수열(ans)의 "길이" 구하기
        // 길이 구한 후, 리스트에서 처음 ~ 마지막 값
        /*
        *  8 2 9 1 4 6 7 10
           8
           2
           2 9
           1 9
           1 4
           1 4 6
           1 4 6 7
           1 4 6 7 10
        * */
        List<Integer> b_sort = new ArrayList<>(n);
        List<Integer> maxLengthList = new ArrayList<>();
        List<Integer> index = new ArrayList<>(n);
        maxLengthList.add(0); // 첫 비교 index -1 방지
        for (int key : sort) {
            int temp = pair.get(key);
            b_sort.add(temp);

            if (temp >= maxLengthList.get(maxLengthList.size()-1)){ // 리스트의 마지막 값(최댓값)보다 클 경우, 삽입
                maxLengthList.add(temp);
                index.add(maxLengthList.size()-1);
            } else{
                int left = 0;
                int right = maxLengthList.size();

                while(left < right){
                    int mid = (left + right) / 2;
                    if(maxLengthList.get(mid) <= temp){
                        left = mid+1;
                    } else{
                        right = mid;
                    }
                }
                maxLengthList.set(right, temp);
                index.add(right);
            }
        }

        // 실제 수열 구하기
        int order = maxLengthList.size()-1;
        List<Integer> ans = new ArrayList<>();
        for (int i=n-1; i>=0; i--){
            if (index.get(i) == order){
                ans.add(sort.get(i));
                order--;
                if (order<0)
                    break;
            }
        }
        ans.sort(Comparator.naturalOrder());


        sb.append(sort.size()-ans.size()).append("\n");

        // 없는 값 구하기
        int cnt=0;
        for (int i=0; i< sort.size(); i++){
            if (cnt < ans.size()){
                if (ans.get(cnt) == sort.get(i)){
                    cnt++;
                }else{
                    sb.append(sort.get(i)).append("\n");
                }
            }else{
                sb.append(sort.get(i)).append("\n");
            }
        }

        System.out.println(sb);
    }

}
