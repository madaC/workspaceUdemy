package exceptions;

public class Exceptions {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            System.out.println("Enter a whole number to divide: ");
//            int x = scanner.nextInt();
//
//            System.out.println("Enter a whole number to divide by: ");
//            int y = scanner.nextInt();
//
//            int z = x / y;
//            System.out.println("Result: " + z);
//        } catch (InputMismatchException | ArithmeticException e) {
//            System.out.println("You can't divide by letters ");
//        } catch (Exception e) {
//            System.out.println("Something went wrong!");
//        } finally {
//            System.out.println("This will always print!");
//            scanner.close();
//        }

        int[] nums = new int[5];
        try {
            System.out.println("In try 1");
            errorMethod(nums);
            System.out.println("In try 2");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("In catch 1");
        } catch (Exception e) {
            System.out.println("In catch 2");
        }
        //rest of the program
        System.out.println("Rest of the program");


        int[] numer = {4, 8, 16, 32};
        int[] denom = {2, 0, 4, 4};

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] / denom[i]);
            } catch (ArithmeticException ex) {
                System.out.println("You can't divide by zero");

            }
        }
    }

    public static void errorMethod(int[] nums) {
        nums[10] = 25;
    }

}



