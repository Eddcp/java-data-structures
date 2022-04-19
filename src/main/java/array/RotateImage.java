package array;

public class RotateImage {

    public void process(int[][] nums) {
        flipDiagonally(nums);
        flipHorizontally(nums);
    }

    private void flipDiagonally(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length - i - 1; j++) {
                int current = nums[i][j];
                nums[i][j] = nums[nums.length - j - 1][nums.length - i - 1];
                nums[nums.length - j - 1][nums.length - i - 1] = current;
            }
        }
    }

    private void flipHorizontally(int[][] nums) {
        for (int i = 0; i < nums.length / 2; i++) {
            for (int j = 0; j < nums.length; j++) {
                int current = nums[i][j];
                nums[i][j] = nums[nums.length - i - 1][j];
                nums[nums.length - i - 1][j] = current;
            }
        }
    }
}

