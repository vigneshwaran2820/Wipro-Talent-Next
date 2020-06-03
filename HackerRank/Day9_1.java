int m = teamA.size();
    int n = teamB.size();
    ArrayList<Integer> ans = new ArrayList<Integer>();
    for (int k = 0; k < n; k++) {
        ans.add(0);
    }
    
        for(int i = 0; i < n; ++i) {
            int temp=0;
            for(int j = 0; j < m; ++j) {
                if(teamA.get(j) <= teamB.get(i)) {
                    ++temp; 
                }
            }
            ans.set(i,temp); 
        }
        return(ans);
