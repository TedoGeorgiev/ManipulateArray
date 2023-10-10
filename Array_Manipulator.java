import java.util.Arrays;
import java.util.Scanner;

public class Array_Manipulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] intArr = Arrays.stream
                        (scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        String input = scanner.nextLine();
        while (!"end".equalsIgnoreCase(input)) {
            if (input.contains("exchange")) {
                int index = Integer.parseInt(input.split(" ") [1]);
                if (index >= intArr.length || index < 0) {
                    System.out.println("Invalid index");
                } else {
                    exchange(intArr, index);
                }
            }


            else if (input.contains("max")) {
                if (input.contains("odd")) {
                    maxOdd(intArr);
                } else {
                    maxEven(intArr);
                }
            }


            else if (input.contains("min")) {
                if (input.contains("odd")) {
                    minOdd(intArr);
                } else {
                    minEven(intArr);
                }
            }
            else if (input.contains("first")) {
                int count = Integer.parseInt(input.split(" ") [1]);
                if (input.contains("even")) {
                    firstCountEven(intArr, count);
                } else {
                    firstCountOdd(intArr, count);
                }
            }
            else if (input.contains("last")) {
                int count = Integer.parseInt(input.split(" ") [1]);
                if (input.contains("even")) {
                    lastCountEven(intArr, count);
                } else {
                    lastCountOdd(intArr, count);
                }
            }

            input = scanner.nextLine();
        }
        System.out.println(Arrays.toString(intArr));

    }

    public static int [] exchange (int[] changeArr, int index) {
//        // 1 2 3 4 5
//        // index 2
//        // firstArr = 1 2 3
//        // secondArr = 4 5
        int[] temp = new int[index + 1];

        for (int i = 0; i <= index; i++) {
            temp[i] = changeArr[i];

        }

        for (int i = 0; i < changeArr.length - index -1 ; i++) {
            changeArr[i] = changeArr [index + 1 + i];

        }

        for (int i = 0; i <= index; i++) {
            changeArr[changeArr.length - index - 1 + i] = temp[i];
        }
        return changeArr;
    }

    public static void maxOdd (int[] inputArr) {

        int maxOdd = Integer.MIN_VALUE;
        int maxIndex = 0;
        boolean isFound = false;

        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] % 2 != 0) {
                isFound = true;
                if(inputArr[i] >= maxOdd) {
                    maxOdd = inputArr[i];
                    maxIndex = i;
                }
            }
        }
        if (isFound) {
            System.out.println(maxIndex);
        } else {
            System.out.println("No matches");
        }
    }

    public static void maxEven (int[] inputArr) {

        int maxEven = Integer.MIN_VALUE;
        int maxIndex = 0;
        boolean isFound = false;

        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] % 2 == 0) {
                isFound = true;
                if(inputArr[i] >= maxEven) {
                    maxEven = inputArr[i];
                    maxIndex = i;
                }
            }
        }
        if (isFound) {
            System.out.println(maxIndex);
        } else {
            System.out.println("No matches");
        }
    }

    public static void minOdd (int[] inputArr) {

        int minOdd = Integer.MAX_VALUE;
        int minIndex = 0;
        boolean isFound = false;

        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] % 2 != 0) {
                isFound = true;
                if(inputArr[i] <= minOdd) {
                    minOdd = inputArr[i];
                    minIndex = i;
                }
            }
        }
        if (isFound) {
            System.out.println(minIndex);
        } else {
            System.out.println("No matches");
        }
    }

    public static void minEven (int[] inputArr) {

        int minOdd = Integer.MAX_VALUE;
        int minIndex = 0;
        boolean isFound = false;

        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] % 2 == 0) {
                isFound = true;
                if(inputArr[i] <= minOdd) {
                    minOdd = inputArr[i];
                    minIndex = i;
                }
            }
        }
        if (isFound) {
            System.out.println(minIndex);
        } else {
            System.out.println("No matches");
        }

    }

    public static void firstCountEven (int[] inputArr, int count) {

        int countEvens = 0;
        String [] evenPrint = new String[count];

        if (count > inputArr.length) {
            System.out.println("Invalid count");
        } else {

            for (int j : inputArr) {
                if (j % 2 == 0 && countEvens < count) {
                    evenPrint[countEvens] = String.valueOf(j);
                    countEvens++;

                }
            }
            if (countEvens == 0) {
                System.out.println("[]");
            } else if (countEvens > 0 && countEvens < count) {
                System.out.println(Arrays.toString(evenPrint).replace(", null", ""));
            } else {
                System.out.println(Arrays.toString(evenPrint));
            }
        }

    }

    public static void firstCountOdd (int[] inputArr, int count) {
        int countOdds = 0;
        String[] oddPrint = new String[count];

        if (count > inputArr.length) {
            System.out.println("Invalid count");
        } else {

            for (int j : inputArr) {
                if (j % 2 != 0 && countOdds < count) {
                    oddPrint[countOdds] = String.valueOf(j);
                    countOdds++;

                }
            }
            if (countOdds == 0) {
                System.out.println("[]");
            } else if (countOdds > 0 && countOdds < count) {
                System.out.println(Arrays.toString(oddPrint).replace(", null", ""));
            } else {
                System.out.println(Arrays.toString(oddPrint));
            }
        }

    }

    public static void lastCountOdd (int[] inputArr, int count) {
        int countOdds = 0;
        String[] oddPrint = new String[count];

        if (count > inputArr.length) {
            System.out.println("Invalid count");
        } else {

            for (int i = inputArr.length - 1; i >= 0; i--) {
                if (inputArr[i] % 2 != 0 && countOdds < count) {
                    oddPrint[count - 1 - countOdds] = String.valueOf(inputArr[i]);
                    countOdds++;

                }
            }
            if (countOdds == 0) {
                System.out.println("[]");
            } else if (countOdds > 0 && countOdds < count) {
                System.out.println(Arrays.toString(oddPrint).replace("null, ", ""));
            } else {
                System.out.println(Arrays.toString(oddPrint));
            }
        }
    }

    public static void lastCountEven (int[] inputArr, int count) {
        int countEvens = 0;
        String[] evenPrint = new String[count];

        if (count > inputArr.length) {
            System.out.println("Invalid count");
        } else {

            for (int i = inputArr.length - 1; i >= 0; i--) {
                if (inputArr[i] % 2 == 0 && countEvens < count) {
                    evenPrint[count - 1 - countEvens] = String.valueOf(inputArr[i]);
                    countEvens++;

                }
            }
            if (countEvens == 0) {
                System.out.println("[]");
            } else if (countEvens > 0 && countEvens < count) {

                System.out.println(Arrays.toString(evenPrint).replace("null, ", ""));
            } else {
                System.out.println(Arrays.toString(evenPrint));
            }
        }
    }

}
