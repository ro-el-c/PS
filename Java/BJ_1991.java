// 트리 순회
// 이진 트리 입력 받아
// 전위 순회, 중위 순회, 후위 순회 방문 순서대로 출력

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BJ_1991 {
    static StringBuilder sb = new StringBuilder();
    static int N;
    static ArrayList<Node>[] list;

    public static void preorder(int x){
        for(Node temp : list[x]){
            int left = temp.leftchild;
            int right = temp.rightchild;

            sb.append((char)(x+'A'));
            if(left != -19) preorder(left);
            if(right != -19) preorder(right);
        }
    }

    public static void inorder(int x){
        for(Node temp : list[x]) {
            int left = temp.leftchild;
            int right = temp.rightchild;

            if(left != -19) inorder(left);
            sb.append((char) (x + 'A'));
            if(right != -19) inorder(right);
        }
    }

    public static void postorder(int x){
        for(Node temp : list[x]){
            int left = temp.leftchild;
            int right = temp.rightchild;

            if(left != -19) postorder(left);
            if(right != -19) postorder(right);
            sb.append((char)(x+'A'));
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        list = new ArrayList[N];
        for(int i=0; i<N; i++)
            list[i] = new ArrayList<>();

        for(int i=0; i<N; i++){
            String[] temp = br.readLine().split(" ");
            list[temp[0].charAt(0)-'A'].add(new Node(temp[1].charAt(0)-'A', temp[2].charAt(0)-'A'));
        }

        preorder(0);
        sb.append("\n");
        inorder(0);
        sb.append("\n");
        postorder(0);

        System.out.print(sb);

    }

    static class Node{
        int leftchild, rightchild;

        Node(int a, int b){
            leftchild = a;
            rightchild = b;
        }
    }
}
