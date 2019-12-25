class MovingAverage {

    /** Initialize your data structure here. */
    int[] arr;
    long sum;
    int n,insert;
    public MovingAverage(int size) {
        arr = new int[size];
        insert=0;
        sum=0;
    }
    
    public double next(int val) {
        if(n<arr.length)
            n++;
        sum -= arr[insert];
        sum += val;
        arr[insert] =val;
        insert = (insert +1)%arr.length;
        return (double)sum/n;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */