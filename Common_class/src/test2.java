import java.util.Arrays;

/**
 * @author guoqing
 * @create 2024-03-12-12:46
 * 实现返回两个字符串的最大子字符串，或返回两个字符中中所有的最大子字符串
 */
public class test2 {
    public static void main(String[] args) {
        String s1 = "abcdefgyxxxxx";
        String s2 = "ghgcdefgxxxxx";
        System.out.println(new test2().maxSubstring(s1,s2));
        System.out.println(Arrays.toString(new test2().maxAllSubstring(s1, s2)));


    }

//返回两个字符串的最大子字符串
    public String maxSubstring(String s1,String s2)
    {
        int length = (s1.length() >= s2.length()) ? s2.length():s1 .length();
        String sMax = (s1.length() >= s2.length()) ? s1:s2;
        String sMin = (s1.length() >= s2.length()) ? s2:s1;
        for(int i  = 0; i < length; i++)
        {

            for(int m = 0,n = length - 1 - i;n < length;m++,n++)
            {
                if(sMax.contains(sMin.substring(m,n+1)))
                    return sMin.substring(m,n+1);
            }
        }


        throw new RuntimeException("没有相同子字符串");
    }


//返回两个字符中中所有的最大子字符串
    public String[] maxAllSubstring(String s1,String s2)
    {
        int length = (s1.length() >= s2.length()) ? s2.length():s1 .length();
        String[] res = new String[length];
        int num = 0;
        String sMax = (s1.length() >= s2.length()) ? s1:s2;
        String sMin = (s1.length() >= s2.length()) ? s2:s1;
        for(int i  = 0; i < length; i++)
        {

            for(int m = 0,n = length - 1 - i;n < length;m++,n++)
            {
                if(sMax.contains(sMin.substring(m,n+1)))
                    res[num++] = sMin.substring(m,n+1);
            }
            if(res[0] != null)
            {
               String[] resFinal = new String[num];
               for(int j = 0; j < num;j++)
                {
                    resFinal[j] = res[j];
                }
               return resFinal;
            }
        }


        throw new RuntimeException("没有相同子字符串");
    }

}
