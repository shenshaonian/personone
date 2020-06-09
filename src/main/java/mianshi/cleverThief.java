package mianshi;//package mianshi;
//
//import org.junit.Test;
//
///**
// * @description:聪明的小偷  https://blog.csdn.net/qq_14927217/article/details/73044567
// * @author: 范子祺
// * @create: 2019-05-27 23:01
// **/
//public class cleverThief {
//    @Test
//    public void test(){
//        int[] a = {1,200,400,100,100,500,1};
//        Long l = houseRobber(a);
//        System.out.println(l);
//    }
//
////    int steal(int[] nums){
////        return 1;
////    }
//
//    /**
//     * 打劫一排
//     * @param A
//     * @return
//     */
//        public long houseRobber(int[] A) {
//            // write your code here
//            if(A.length==0)
//                return 0;
//            if(A.length==1){
//                return A[0];
//            }
//            if(A.length==2){
//                return Math.max(A[1], A[0]);
//            }
//            if(A.length==3){
//                return Math.max(A[1], A[0]+A[2]);
//            }
//            long dp[]=new long[A.length];
//            for(int i=0;i<A.length;i++){
//                if(i==0){
//                    dp[i]=A[i];
//                }else if(i==1){
//                    dp[i]=Math.max(A[0], A[1]);
//                }else if(i==2){
//                    dp[i]=Math.max(A[0]+A[2], A[1]);
//                }else{
////                    dp[i]=Math.max(dp[i-2], dp[i-3])+A[i];
////                    count[i]=max(A[i]+count[i-2],count[i-1]);
//                    dp[i]=Math.max(A[i]+dp[i-2],dp[i-1]);
//                }
//            }
//            return Math.max(dp[A.length-1], dp[A.length-2]);
//
//        }
//
//    /**
//     * 打劫一圈
//     * @param nums
//     * @return
//     */
//    public int houseRobber2(int[] nums) {
//            // write your code here
//            if(nums==null || nums.length == 0)
//                return 0;
//            if(nums.length == 1)
//                return nums[0];
//            if(nums.length == 2)
//                return Math.max(nums[0],nums[1]);
//            if(nums.length == 3)
//                return Math.max(Math.max(nums[0],nums[1]),nums[2]);
//            int len = nums.length;
//            int res1 = houseRobber2(nums,0,len-2);
//            int res2 = houseRobber2(nums,1,len-1);
//            return Math.max(res1,res2);
//        }
//        public int houseRobber2(int[] nums,int start,int end){
//            if(start == end)
//                return nums[start];
//            if(start +1 == end){
//                return Math.max(nums[start],nums[end]);
//            }
//            if(start +2 == end){
//                return Math.max(nums[start]+nums[end],nums[start+1]);
//            }
//            int len = nums.length;
//            int[] dp = new int[len];// 打劫 第i个房间，所能够获得最大值
//            dp[start] = nums[start];
//            dp[start+1] = nums[start+1];
//            dp[start+2] = nums[start+2] + dp[start];
//            for(int s = start + 3;s<= end;s++){
//                dp[s] = nums[s] + Math.max(dp[s-3],dp[s-2]);
//            }
//            return Math.max(dp[end],dp[end-1]);
//        }
//
//    @Test
//    public void test2(){
//        int[] a = {1,2,4,6,8};
////        int l = houseRobber2(a);
//        Long l = houseRobber(a);
//        System.out.println(l);
//    }
//
//
//    /**
//     * wode
//     * @param nums
//     * @return
//     */
//    int steal(int[] nums){
//        if(nums==null || nums.length == 0){
//            return 0;
//        }
//        if(nums.length == 1){
//            return nums[0];
//        }
//        if(nums.length == 2){
//            return Math.max(nums[0],nums[1]);
//        }
//        if(nums.length == 3){
//            return Math.max(Math.max(nums[0],nums[1]),nums[2]);
//        }
//        int[] house1 = new int[nums.length-1];
//
//
//    }
//


//这个暂时看不懂
//@Test
//public void test(){
////        int[] a = {1,200,400,100,100,500,1};
//        int[] a = {1,2,4,6,8,10,12};
//        int i = steal(a);
//        System.out.println(i);
//        }
//
//
//
//public int steal(int[] nums) {
//        // write your code here
//        if(nums.length==0)
//        return 0;
//        if(nums.length==1)
//        return nums[0];
//        if(nums.length==2)
//        return Math.max(nums[0], nums[1]);
//        if(nums.length==3){
//        return Math.max(nums[0], Math.max(nums[1], nums[2]));
//        }
//        int []dp1=new int[nums.length-1];
//        for(int i=0;i<nums.length-1;i++){
//        if(i==0){
//        dp1[i]=nums[i];
//        }else if(i==1){
//        dp1[i]=Math.max(nums[0], nums[1]);
//        }else if(i==2){
//        dp1[i]=Math.max(nums[0]+nums[i], nums[1]);
//        }else{
//        dp1[i]=Math.max(dp1[i-2], dp1[i-3])+nums[i];
//        }
//        }
//
//        int []dp2=new int[nums.length-1];
//        for(int i=1;i<nums.length;i++){
//        if(i==1){
//        dp2[i-1]=nums[i];
//        }else if(i==2){
//        dp2[i-1]=Math.max(nums[i-1], nums[i]);
//        }else if(i==3){
//        dp2[i-1]=Math.max(nums[1]+nums[i], nums[2]);
//        }else{
//        dp2[i-1]=Math.max(dp2[i-3], dp2[i-4])+nums[i];
//        }
//        }
//
//        return Math.max(Math.max(dp1[dp1.length-1], dp1[dp1.length-2]),Math.max(dp2[dp2.length-1], dp2[dp2.length-2]));
//        }
//}
