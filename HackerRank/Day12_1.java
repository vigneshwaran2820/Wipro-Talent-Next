public static int stockPairs(List<Integer> stocksProfit, long target) {
    // Write your code here
    int z=0;
    int x,y,ans;
     HashMap<String,Integer> map=new HashMap<String,Integer>();
    int n=stocksProfit.size();
    for(int i=0;i<n;i++)
    {
         x=stocksProfit.get(i);
        for(int j=1;j<n;j++)
        { 
            if(i!=j)
            {
             y=stocksProfit.get(j);
             ans=x+y;
             if(ans==target)
             {   
                 String s1=x+" "+y;
                 String s2=y+" "+x;
                map.put(s1,1);
                 if(x==y){
                    z++;
                }
                map.put(s2,1);
             }
            }
        }
    }
        return map.size()/2+z; 
         
        
        }
}
