class Solution {
    public int addDigits(int num) {
        
        num += num/10+num%10;
        return num;
        
    }
}