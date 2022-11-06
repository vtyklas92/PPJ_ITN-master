public class PlusOne {
    private int[] digits;
    public PlusOne(int[] digits) {
        this.digits = digits;
    }

    public int[] plusOneArray(int[] digits){
      try {
          for (int i = digits.length - 1; i >= 0; i--) {
              if (digits[i] == 9 && i != 0) {
                  digits[i] = 0;
                  continue;
              } else if (digits[i] != 9) {
                  digits[i] += 1;
                  break;
              } else if (i == 0 && digits[i] == 9) {
                    digits[i] = 0;
                    digits[i-1] = 0;
              }
          }
            }catch(ArrayIndexOutOfBoundsException e){
          int[] temp = new int[digits.length + 1];
          temp[0] = 1;
          for (int i = 1; i < digits.length; i++) {
              temp[i] = digits[i];
          }
          digits = temp;
        }

      return digits;
    }

    public static void main(String[] args) {
        int[] digits = {1,8,2};
        PlusOne result = new PlusOne(digits);
//        result.plusOneArray(digits);

        for (int x : result.plusOneArray(digits)){
            System.out.print(x + " ");
        }

    }
}
