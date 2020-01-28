package com.lambton;

public class ZigZag
{
    public static void main(String[] args)
    {
        String cities[]=new String[]{"Welcome to toronto"};

        for (int i=0;i<cities.length;i++)
        {
            if (cities[i].split("\\s+").length>1){
                String[] splitedArray = cities[i].split("\\s+");  /*https://www.geeksforgeeks.org/split-string-java-examples/*/
                System.out.println(" ");
                for (int j=0;j<splitedArray.length;j++)
                {
                    System.out.print(zigZagString(splitedArray[j]));
                    System.out.print(" ");
                }
                System.out.println(" ");
            }
            else {
                System.out.println(" ");
                System.out.print(zigZagString(cities[i]));
                System.out.println(" ");
            }
        }

    }

    public  static String zigZagString(String temp)
    {
        if (temp.length()>1)
        {
            char s[]=temp.toCharArray();
            int length=s.length;
            if (length%2==0)
            {
                for (int i=0;i<s.length;i+=2)
                {
                    char t=s[i];
                    s[i]=s[i+1];
                    s[i+1]=t;
                }
            }
            else
            {
                char lastChar=s[length-1];
                for (int i=0;i<s.length-1;i+=2)
                {
                    char t=s[i];
                    s[i]=s[i+1];
                    s[i+1]=t;
                }
                /*System.out.println(Arrays.toString(s));*/
                for (int i=length-1;i>(length/2);i--)
                {
                    s[i]=s[i-1];
                }
                s[length/2]=lastChar;
            }
            return new String(s);
        }
        else
        {
            return "No or single value provided";
        }

    }
}
