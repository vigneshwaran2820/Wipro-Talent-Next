class Result {
public static int minOperations(List<Integer> arr) {
    // Write your code here
    int count1=0,count2=0,size=arr.size(),i=0;
    while(i<size-1){
        if(i%2==0){
            if(arr.get(i)>=arr.get(i+1)){
                count1++;
                i+=2;
                continue;
            }
        }
        else{
            if(arr.get(i)<=arr.get(i+1)){
                count1++;
                i+=2;
                continue;
            }
        }
        i++;
    }
    i=0;
    while(i<size-1){
        if(i%2==0){
            if(arr.get(i)<=arr.get(i+1)){
                count2++;
                i+=2;
                continue;
            }
        }
        else{
            if(arr.get(i)>=arr.get(i+1)){
                count2++;
                i+=2;
                continue;
            }
        }
        i++;
    }
    if(count1<count2){
        return count1;
    }
    else{
        return count2;
    }
    }

}
