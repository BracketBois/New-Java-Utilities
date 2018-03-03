/* A Utilities class designed and created by Bracket Bois (Eren, Denzel and Nabeel)
 * March 3rd 2018
 * Build Version 1.0
 */

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

}
