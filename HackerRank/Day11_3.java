public static int maxXor(int lo, int hi, int k) {
    // Write your code here
    int max=0 ,sum=0;
    for(int j=hi;j>lo;j--)
    {
        for(int i=lo;i<hi;i++)
    {
        sum=i^j;
        if(max<sum && sum<=k)
        max=sum;
    }
    }
  return max;
    }

}
