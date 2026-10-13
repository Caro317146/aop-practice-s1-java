package homework.h07;
// https://leetcode.com/problems/number-complement/
public class NumberComplement {
    public int findComplement(int num) {
        int mask = 1;
        while (mask < num) {
            mask = (mask << 1) | 1;
        }
        return num ^ mask;
    }
}
          
      
