package array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> process(int[][] nums) {
        var spiralList = new ArrayList<Integer>();
        if (nums.length == 0) {
            return spiralList;
        }
        
        int rowOne = 0;
        int columnOne = 0;
        int rowTwo = nums.length - 1;
        int columnTwo = nums[0].length - 1;

        while (rowOne <= rowTwo && columnOne <= columnTwo) {
            for (int column = columnOne; column <= columnTwo; column++) {
                spiralList.add(nums[rowOne][column]);
            }
            for (int row = rowOne + 1; row <= rowTwo; row++) {
                spiralList.add(nums[row][columnTwo]);
            }

            if (rowOne < rowTwo && columnOne < columnTwo) {
                for (int column = columnTwo - 1; column > columnOne; column--) {
                    spiralList.add(nums[rowTwo][column]);
                }
                for (int row = rowTwo; row > rowOne; row--) {
                    spiralList.add(nums[row][columnOne]);
                }
            }
            rowOne++;
            rowTwo--;
            columnOne++;
            columnTwo--;
        }
        return spiralList;
    }


}
