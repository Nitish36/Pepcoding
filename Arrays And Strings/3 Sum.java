import java.util.*;

public class Main {

  // ~~~~~~~~~~~~User Section~~~~~~~~~~~~
  public static List<List<Integer>> twoSum(int[] nums,int i,int n, int target) {
      int left = i;
      int right = n;
      int sum=0;
      List<List<Integer>> res = new ArrayList<>();
      while(left<right)
      {
          if(left!=i && nums[left]==nums[left-1])
          {
              left++;
              continue;
          }
          sum = nums[left]+nums[right];
          
          if(sum == target)
          {
              List<Integer> subRes = new ArrayList<>();
              subRes.add(nums[left]);
              subRes.add(nums[right]);
              res.add(subRes);
              left++;
              right--;
          }
          else if(sum>target)
          {
              right--;
          }
          else
          {
              left++;
          }
      }
      return res;
  }
  
  public static List<List<Integer>> threeSum(int[] nums, int target) {
    // write your code here
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(nums);
    int n = nums.length;
    int val = 0,targ=0;
    if(n<3){return res;}
    
    for(int i=0;i<=n-3;i++)
    {
        if(i!=0 && nums[i]==nums[i-1]){continue;}
        val = nums[i];
        targ = target - val;
        List<List<Integer>> subRes = twoSum(nums,i+1,n-1,targ);
    
        for(List<Integer> list:subRes)
        {
             list.add(val);
             res.add(list);
        }
    }
    return res;
  }

  // ~~~~~~~~~~Input Management~~~~~~~~~~
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int target = scn.nextInt();
    List<List<Integer>> res = threeSum(arr, target);
    ArrayList<String> finalResult = new ArrayList<>();
    for (List<Integer> list : res) {
      Collections.sort(list);
      String ans = "";
      for (int val : list) {
        ans += val + " ";
      }
      finalResult.add(ans);
    }
    Collections.sort(finalResult);
    for (String str : finalResult) {
      System.out.println(str);
    }
  }

}
