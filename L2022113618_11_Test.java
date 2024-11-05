import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试用例设计原则：等价类划分
 * 分为三种情况：
 * 1. 有多个解，且可以存在重复的解；
 * 2. 仅有一个解；
 * 3. 没有解。
 */
public class L2022113618_11_Test {
    /**
     * 测试目的：测试能否找出多个解，且不重复。
     * 测试用例：[-1,0,1,2,-1,4]
     */
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

    /**
     * 测试目的：测试能否在没有解的情况下正确得到结果
     * 测试用例：[0,1,1]
     */
    @Test
    public void testThreeSum2() {
        int[] nums = new int[]{0, 1, 1};
        List<List<Integer>> trueRes = new ArrayList<>();
        Assert.assertEquals(trueRes, Solution.threeSum(nums));
    }

    /**
     * 测试目的：测试能否在仅有单个解的情况下正确得到结果
     * 测试用例：[0,0,0]
     */
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
