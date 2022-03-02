class Solution {
    static boolean visited[][];
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};
    static int count;
    
    public int dfs(int[][] picture, int m, int n, int y, int x) {
        visited[y][x] = true;
        count++;
        
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
            if (picture[ny][nx] == picture[y][x] && !visited[ny][nx]) dfs(picture, m, n, ny, nx);
        }
        
        return count;
    }
    
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        int[] answer = new int[2];
        visited = new boolean[m][n];
  
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (picture[i][j] != 0 && !visited[i][j]) {
                    numberOfArea++;
                    count = 0;
                    maxSizeOfOneArea = Math.max(maxSizeOfOneArea, dfs(picture, m, n, i, j));
                }
            }
        }
        
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        
        return answer;
    }
}