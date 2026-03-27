class Q4
{
     public static void main(String[] args) { 
        String str = args[0]; 
        for (int i = 0; i < str.length(); i++) { 
            char ch = str.charAt(i); 
            int count = 0; 
 
            for (int j = 0; j < str.length(); j++) { 
                if (str.charAt(j) == ch) { 
                    count++;        
                } 
            } 
            // Print only first occurrence 
            if (str.indexOf(ch) == i) { 
                System.out.println(ch + " : " + count); 
            } 
        } 
    } 
}