class Solution1406 {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int prod = 1; //product can not be initialized as zero because we need to multiply that
        while(n>0){
            int r = n % 10;
            sum = sum + r;
            prod = prod * r;
            n = n/10;
        }
        return prod - sum;
    }
}