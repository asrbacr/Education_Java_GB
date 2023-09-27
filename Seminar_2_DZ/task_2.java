package Seminar_2_DZ;

/**
 * Если необходимо, исправьте данный код 
 * (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 * 
 * try {
 *  int d = 0;
 *  double catchedRes1 = intArray[8] / d;
 *  System.out.println("catchedRes1 = " + catchedRes1);
 * } catch (ArithmeticException e) {
 *  System.out.println("Catching exception: " + e);
*  }
*
 */

    try {
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
        System.out.println("Catching exception: " + e);
    }

