class Rectangle {

    // Fields
    int length;
    int width;

    // Parameterized Constructor
    Rectangle() {
        length = 0;
        width = 0;
    }

    // Method to calculate area
    int getArea() {
        return length * width;
    }

    // Main method
    public static void main(String[] args) {

        // Creating object with values
        Rectangle r = new Rectangle();

        // Printing area
        r.getArea();
    }
}
