/* A Utilities class designed and created by Bracket Bois (Eren, Denzel and Nabeel)
 * March 4rd 2018
 * Build Version 1.0
 */

import java.util.Random;

class Utils {
  
  public static double roundToX (double number, int x) {
    double rounded;
    // If the second parameter is negative, just returns the number
    if (x<0) {
      return number;
    }
    // Multiplies the number by 10 to the power of how many decimals they want, then rounds that number
    rounded = Math.round(number*(Math.pow(10, x))); 
    rounded /= Math.pow(10, x); // Divides the number by the intial 10^x it was multiplied by before
    return rounded; // returns the rounded number
  }
  
  public static int randInt (int num1, int num2) {
    Random r = new Random();
    int random;
    
    // The first number is greather than the second
    if (num1 >= num2) { 
      random = r.nextInt((num1-num2) + 1) + num2;
    } else { // The second number is greater than the first
      random = r.nextInt((num2-num1) + 1) + num1;
    }
    return random; // Returns the generated number
  }
  
}
