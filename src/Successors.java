public class Successors {
    public static Position findPosition(int val, int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                if(arr[i][j]==val) return new Position(i, j);
            }
        }
        return null;
    }

    public static Position[][] getSuccessorArray(int[][] arr){
        Position[][] ans = new Position[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                ans[i][j] = findPosition(arr[i][j]+1, arr);
            }
        }
        return ans;
    }
}
