class Solution {
    public boolean isPerfectSquare(int num) {
        double x = Math.sqrt(num);
        return (x == (int)x)? true: false;
    }
}