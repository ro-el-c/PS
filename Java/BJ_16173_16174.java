// 점프왕 쩰리
// 정사각형 내부에서만 움직임 -> 외부 -> 패배
// 출발점 : 좌측 상단
// 이동 : 오른쪽, 아래
// 우측하단 -> 승리 => 종료
// 한 번에 이동할 수 있는 칸의 수 : 현재 칸에 쓰여 있는 수
// -> 초과, 미만 이동 불가능
// 맨 오른쪽 맨 아래 칸에 도달할 수 있는가?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Queue;

public class BJ_16173_16174 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int[][] map = new int[N][N];
        boolean[][] visited = new boolean[N][N];

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int j=0; j<N; j++)
                map[i][j] = Integer.parseInt(st.nextToken());
        }

        // bfs
        Queue<Where> que = new LinkedList<>();
        que.offer(new Where(0, 0));

        while(!que.isEmpty()){
            Where temp = que.poll();
            if(visited[temp.row][temp.col])
                continue;

            int n = map[temp.row][temp.col];
            if(n == -1){
                visited[temp.row][temp.col] = true;
                break;
            }

            visited[temp.row][temp.col] = true;

            if(temp.row + n < N)
                que.offer(new Where(temp.row+n, temp.col));
            if(temp.col + n < N)
                que.offer(new Where(temp.row, temp.col+n));
        }

        if(visited[N-1][N-1])
            System.out.print("HaruHaru");
        else
            System.out.print("Hing");

    }
}

class Where{
    int row, col;

    Where(int x, int y){
        row = x;
        col = y;
    }
}