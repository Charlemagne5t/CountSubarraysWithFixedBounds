import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1(){
        int[] nums = {1,3,5,2,7,5};
        int minK = 1;
        int maxK = 5;
        long expected = 2;
        long actual = new Solution().countSubarrays(nums, minK, maxK);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        int[] nums = {1,1,1,1};
        int minK = 1;
        int maxK = 1;
        long expected = 10;
        long actual = new Solution().countSubarrays(nums, minK, maxK);

        Assert.assertEquals(expected, actual);
    }
}
