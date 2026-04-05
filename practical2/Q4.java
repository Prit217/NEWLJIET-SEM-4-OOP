
interface Function { 
    int evaluate(int n);  // abstract method 
} 
// Class Half implementing Function interface 
// Q4=half
class Q4_half implements Function { 
 
    // Implementation of evaluate() method 
    public int evaluate(int n) { 
        return n / 2; 
    } 
 
    // Main method to test 
    public static void main(String[] args) { 
 
        Q4_half obj = new Q4_half(); 
 
        int num = 20; 
        System.out.println("Half of " + num + " is " + obj.evaluate(num)); 
 
        num = 15; 
        System.out.println("Half of " + num + " is " + obj.evaluate(num)); 
    }} 