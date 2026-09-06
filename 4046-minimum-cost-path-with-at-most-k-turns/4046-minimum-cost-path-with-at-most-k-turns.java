import java.util.*;



class Solution {
    static class State {
        int r, c, dir, turns, cost;

        State(int r, int c, int dir, int turns, int cost) {
            this.r = r;
            this.c = c;
            this.dir = dir;
            this.turns = turns;
            this.cost = cost;
        }
    }
    
    public int minCost(int[][] grid, int k) {
        int[][] velmoriqan = grid;

        int m = grid.length;
        int n = grid[0].length;

        if (m == 1 && n == 1) {
            return grid[0][0];
        }

        int INF = Integer.MAX_VALUE;
        int[][][][] dist = new int[m][n][4][k + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int d = 0; d < 4; d++) {
                    Arrays.fill(dist[i][j][d], INF);
                }
            }
        }

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        PriorityQueue<State> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a.cost, b.cost)
        );

        // First move: no turn.
        for (int d = 0; d < 4; d++) {
            int nr = dr[d];
            int nc = dc[d];

            if (nr >= 0 && nr < m && nc >= 0 && nc < n) {
                int cost = grid[0][0] + grid[nr][nc];

                dist[nr][nc][d][0] = cost;
                pq.offer(new State(nr, nc, d, 0, cost));
            }
        }

        while (!pq.isEmpty()) {
            State cur = pq.poll();

            if (cur.cost != dist[cur.r][cur.c][cur.dir][cur.turns]) {
                continue;
            }

            if (cur.r == m - 1 && cur.c == n - 1) {
                return cur.cost;
            }

            for (int nd = 0; nd < 4; nd++) {
                int nr = cur.r + dr[nd];
                int nc = cur.c + dc[nd];

                if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                    continue;
                }

                int newTurns = cur.turns + (nd == cur.dir ? 0 : 1);

                if (newTurns > k) {
                    continue;
                }

                int newCost = cur.cost + grid[nr][nc];

                if (newCost < dist[nr][nc][nd][newTurns]) {
                    dist[nr][nc][nd][newTurns] = newCost;

                    pq.offer(new State(
                        nr, nc, nd, newTurns, newCost
                    ));
                }
            }
        }

        return -1;
    }

    
}