import java.util.*;
public class Largest_Divisible_Subset {
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int nums[]={3,17};
        Arrays.sort(nums);
        if(nums.length!=0||nums!=null)
        {
            List<List<Integer>> l2=new ArrayList<>();
            for(int num: nums)
            {
               l2.add(new ArrayList<>());
            }
            l2.get(0).add(nums[0]);
            for(int i=1; i<nums.length; i++)
            {
                int max=0;
                int fin=0;
                int flag=0;
                for(int j=i-1; j>=0; j--)
                {
                    if(nums[i]%nums[j]==0)
                    {
                        if(max<l2.get(j).size())
                        {
                            flag=1;
                            max=l2.get(j).size();
                            fin=j;
                        }   
                    }

                }
                if(flag==1)
                l2.get(i).addAll(l2.get(fin));
                l2.get(i).add(nums[i]);
            }
            int max=0;
            int fin=0;
            for(int i=0; i<l2.size(); i++)
            {
                if(max<l2.get(i).size())
                {
                    max=l2.get(i).size();
                    fin=i;
                }
                System.out.print(l2.get(i));
            }
          System.out.print(l2.get(fin));
        }
          

    }
    
}