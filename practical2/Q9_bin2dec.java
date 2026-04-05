
class Q9_bin2dec {

    public static int bin2dec(String binaryString) throws NumberFormatException {

        for (int i = 0; i < binaryString.length(); i++) {
            char ch = binaryString.charAt(i);
            if (ch != '0' && ch != '1') {
                throw new NumberFormatException("Invalid binary number: " + binaryString);
            }
        }
    

    int decimal=0;
    int power=1;

    for(int i=binaryString.length()-1;i>=0;i--)
    {
      if(binaryString.charAt(i)=='1')
      {
        decimal+=power;
      }
      power*=2;
    }
    return decimal;
  }

    public static void main(String[] args){
      String[] testStrings = {"1010", "1111", "1001", "abc", "1021"};

      for(String s: testStrings)
      {
        try
        {
          int dec=bin2dec(s);
          System.out.println("Binary: "+s+" -> Decimal: "+dec);
        }
        catch(NumberFormatException e)  
        {
          System.out.println("Error converting '"+s+"': "+e.getMessage());
        }
      }
    }
}
