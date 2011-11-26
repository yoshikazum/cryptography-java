public class Cryptography {
  /**
   * SRM 480 DIV2 - 250 points
   * I got 205.89 points by solvinb this probrem.
   * @author "Yoshikazu Miyoshi <yoshikazum@gmail.com>"
   *
   */
	public long encrypt(int[] numbers) {
	  long result = 1;
	  
	  for (int i = 0; i < numbers.length; i++) {
      for (int j2 = 0; j2 < numbers.length; j2++) {
        numbers[j2] = ++numbers[j2];
        long current = 1;
        for (int j = 0; j < numbers.length; j++) {
          current *= numbers[j];
        }
        result = Math.max(result, current);
        numbers[j2] = --numbers[j2];
      }
    }
	  return result;
	}

}
