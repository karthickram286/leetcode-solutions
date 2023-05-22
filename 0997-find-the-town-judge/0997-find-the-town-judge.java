class Solution {
    public int findJudge(int n, int[][] trust) {
        
        int[] trustPoints = new int[n+1];
        
        for (int[] trusting : trust) {
            trustPoints[trusting[0]]--;     // Decrementing the points if the person trusts someone
            trustPoints[trusting[1]]++;     // Incrementing the points if the person is trusted by someone
        }
        
        boolean judgeFound = false;
        int judge = -1;
        
        for (int i = 1; i <= n; i++) {
            if (trustPoints[i] == n - 1) {          // A judge should have a n-1 points
                judgeFound = true;
                judge = i;
            } else if (trustPoints[i] == n - 1 && judgeFound) {     // If a second judge is found return -1
                return -1;
            }
        }
        
        return judge;
    }
}