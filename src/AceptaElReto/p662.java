package AceptaElReto;

import java.util.PriorityQueue;
import java.util.Scanner;

class Node implements Comparable<Node> {
    int peso;
    int f, c;

    Node(int f, int c, int weight) {
        this.f = f;
        this.c = c;
        this.peso = weight;
    }

    @Override
    public int compareTo(Node o) {
        return this.peso - o.peso;
    }
}
public class p662 {
    static int[] dx = {0, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[] getMin(int startF, int startC, int minCells, int[][] m) {
        int F = m.length;
        int C = m[0].length;
        int[] res = new int[2];

        boolean[][] visited = new boolean[F][C];
        PriorityQueue<Node> q = new PriorityQueue<>();
        q.add(new Node(startF, startC, 0));

        while (!q.isEmpty()) {
            Node current = q.poll();
            if (current.peso < minCells) {
                minCells = current.peso;
                res[0] = current.f + 1;
                res[1] = current.c + 1;
            }
            for (int i = 0; i < 4; i++) {
                int newF = current.f + dx[i];
                int newC = current.c + dy[i];
                if (newF >= 0 && newF < F && newC >= 0 && newC < C && !visited[newF][newC]) {
                    visited[newF][newC] = true;
                    q.add(new Node(newF, newC, current.peso + m[newF][newC]));
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int C, F;
        int[][] m;

        while (s.hasNext()) {
            C = s.nextInt();
            F = s.nextInt();

            m = new int[F][C];
            for (int i = 0; i < F; i++)
                for (int j = 0; j < C; j++)
                    m[i][j] = s.nextInt();

            int startC = 0;
            int startF = F / 2;

            int minCells = (C * F) / 2 + 1;
            int[] res = getMin(startF, startC, minCells, m);

            System.out.println(res[0] + " " + res[1]);
        }

    }
}