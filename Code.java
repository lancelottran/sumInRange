int sumInRange(int[] nums, int[][] queries) {
    HashMap<Integer,Integer> sum = new HashMap<Integer, Integer>();
    int runSum = 0;
    int result = 0;
    int m = 1000000007;
    
    for(int i = 0; i < nums.length; i++)
    {
        runSum += nums[i];
        sum.put(i, runSum);
    }
    
    for(int i = 0; i < queries.length; i++)
    {
        int temp;
        if(queries[i][0] == 0)
            temp = 0;
        else
            temp = sum.get(queries[i][0] - 1);
        
        result = (result + sum.get(queries[i][1]) - temp)%m;
    }
    
    if(result > 0)
        return result;
    else
        return result + m;
}
