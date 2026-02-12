


class exception_3 {

    public static void main(String args[]) {
        try {
           String s =null;
           System.out.println(s.charAt(2));
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
