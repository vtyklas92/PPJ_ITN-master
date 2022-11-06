public class ClimbingStairs {
    public int climbStairs(int n) {

        int[] arr = new int[n+1];

        for (int i = 0; i <= n; i++) {
            arr[i] = i;
        }

        for (int i = 2; i < arr.length; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }

        return arr[n-1]+arr[n];

        }


    public static void main(String[] args) {
        ClimbingStairs test = new ClimbingStairs();
        System.out.println(test.climbStairs(5));
    }
}


