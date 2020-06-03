public static List<Integer> counts(List<Integer> teamA, List<Integer> teamB) {
    // Write your code here
    int count=0,sum=0,z;
    int sz=teamB.size();
    int sx=teamA.size();   
    List<Integer> teamC=new teamC<Integer>();  
    int sum1;  
    for(int i=0;i<sx;i++)
    {
        
    
            teamB.get(i);
            teamA.get(i);
            for(int j=0;j<sz;j++)
            {
             if(teamA(i)<=teamB(j))
            {
                sum1+=1;               

            }   
            }
            teamC.add(sum);
            sum-=sum;
            
            
       }
       return teamC;
    }
 }
