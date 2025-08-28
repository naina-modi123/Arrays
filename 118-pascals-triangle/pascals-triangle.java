import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Loop through each row
        for (int rowNum = 0; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();

            // Fill each row
            for (int j = 0; j <= rowNum; j++) {
                // First and last elements are always 1
                if (j == 0 || j == rowNum) {
                    row.add(1);
                } else {
                    int val = triangle.get(rowNum - 1).get(j - 1) + triangle.get(rowNum - 1).get(j);
                    row.add(val);
                }
            }

            triangle.add(row);
        }

        return triangle;
    }
}
