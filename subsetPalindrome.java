import java.util.*;
public class subsetPalindrome
{
    public static void main(String[]args)
    {
        ArrayList<String> a1=new ArrayList<String>();
        try (Scanner s = new Scanner(System.in)) {
            String s1[]=s.next().split("");
            //find odd palindromic String
            int l=0;
            int r=0;
            for(int i=0; i<s1.length; i++)
            {
                l=i;
                r=i;
                String s2="";
                while(l>=0&&r<s1.length&&s1[l].equals(s1[r]))
                {
                    if(l==i&&r==i)
                    s2=s2+s1[i];
                    else
                    s2=s1[l]+s2+s1[r];
                    l--;
                    r++;
                    a1.add(s2);
                }
              
            }
            //find even palindromic string;
            l=0;
            r=0;
            for(int i=0; i<s1.length; i++)
            {
                l=i;
                r=i+1;
                String s2="";
                while(l>=0&&r<s1.length&&s1[l].equals(s1[r]))
                {
                    s2=s2+s1[l]+s1[r];
                    r++;
                    l--;
                  a1.add(s2);
                }
            }
        }
        Collections.sort(a1);
        System.out.print(a1);
    }
}
