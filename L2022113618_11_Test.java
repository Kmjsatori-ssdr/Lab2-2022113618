import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class L2022113618_11_Test {
    @Test
    public void testThreeSum1() {
        int[] nums = new int[]{-1, 0, 1, 2, -1, 4};
        List<List<Integer>> trueRes = new ArrayList<>();
        trueRes.add(new ArrayList<>() {{
            add(-1);
            add(-1);
            add(2);
        }});
        trueRes.add(new ArrayList<>() {{
            add(-1);
            add(0);
            add(1);
        }});
        Assert.assertEquals(trueRes, Solution.threeSum(nums));
    }

    @Test
    public void testThreeSum2() {
        int[] nums = new int[]{0, 1, 1};
        List<List<Integer>> trueRes = new ArrayList<>();
        Assert.assertEquals(trueRes, Solution.threeSum(nums));
    }

    @Test
    public void testThreeSum3() {
        int[] nums = new int[]{0, 0, 0};
        List<List<Integer>> trueRes = new ArrayList<>();
        trueRes.add(new ArrayList<>() {{
            add(0);
            add(0);
            add(0);
        }});
        Assert.assertEquals(trueRes, Solution.threeSum(nums));
    }
}
