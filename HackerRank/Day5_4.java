public static List<Integer> isPower(List<Integer> arr) {
int leftSum = 0;
        int totalSum = 0;
        
        int i = 0;
        int size = arr.size();
        while(i < size) {
            totalSum += arr.get(i);
            i++;
        }
        
        i = 0;
        while(i < size) {
            if(totalSum - arr.get(i) == leftSum) {
                return i;
            } else {
                leftSum += arr.get(i);
                totalSum -= arr.get(i);
            }
            i++;
        }
        
        return -1;
    }
