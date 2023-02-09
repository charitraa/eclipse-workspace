package Day3;

public class LoopingTest {
    public static void main(String[] args) {
        final int MAX = 5;// declare and initialize an array with 5 elements
        int nums[] = new int[MAX];
        nums[0] = 9;
        nums[1] = 10;
        nums[2] = 7;
        nums[3] = 6;
        nums[4] = 2;
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
