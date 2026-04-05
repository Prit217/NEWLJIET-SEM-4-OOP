class Q7_calculator {

    public static void main(String[] args) {

        try {

            // -----------------------------------------------
            // STEP 1: Check if exactly 3 arguments are passed
            // -----------------------------------------------
            if (args.length < 3) {
                throw new IllegalArgumentException("Usage: java Calculator <num1> <operator> <num2>");
            }

            // -----------------------------------------------
            // STEP 2: Read values from command line
            // -----------------------------------------------
            double num1     = Double.parseDouble(args[0]); // First number
            String operator = args[1];                      // Operator (+,-,*,/)
            double num2     = Double.parseDouble(args[2]); // Second number

            double result = 0;

            // -----------------------------------------------
            // STEP 3: Perform operation using switch
            // -----------------------------------------------
            switch (operator) {

                case "+":
                    result = num1 + num2;
                    System.out.println("Operation : Addition");
                    break;

                case "-":
                    result = num1 - num2;
                    System.out.println("Operation : Subtraction");
                    break;

                case "*":
                    result = num1 * num2;
                    System.out.println("Operation : Multiplication");
                    break;

                case "/":
                    // Exception: Division by zero
                    if (num2 == 0) {
                        throw new ArithmeticException(
                            "Division by zero is not allowed!"
                        );
                    }
                    result = num1 / num2;
                    System.out.println("Operation : Division");
                    break;

                default:
                    // Exception: Invalid operator
                    throw new IllegalArgumentException(
                        "Invalid operator! Use only: +, -, *, /"
                    );
            }

            // -----------------------------------------------
            // STEP 4: Print Result
            // -----------------------------------------------
            System.out.println("Num1     : " + num1);
            System.out.println("Num2     : " + num2);
            System.out.println("Operator : " + operator);
            System.out.println("Result   : " + result);

        // -----------------------------------------------
        // EXCEPTION HANDLING
        // -----------------------------------------------

        } catch (NumberFormatException e) {
            // When user enters letters instead of numbers
            System.out.println("Error: Invalid number format!");
            System.out.println("Please enter valid numbers (e.g., 10, 3.5)");

        } catch (ArithmeticException e) {
            // When division by zero occurs
            System.out.println("Error: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            // Wrong number of args or invalid operator
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            // Any other unexpected error
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}