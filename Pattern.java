import java.util.Scanner;

public class Pattern {

    void pattern1(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }

    void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();

        }
    }

    void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n - 1 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }

    /*
     * Why not just j <= n?
     * Because:
     * j <= n → makes a fixed number of stars per row (square).
     * j <= n - i + 1 → makes stars decrease row by row (triangle).
     * 
     * In short:
     * j <= n → rectangle/square.
     * j <= n - i + 1 → inverted right triangle.
     */
    void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void pattern8(int n) {
        /*
         * in this patter we need to first calucalte the how many spaces need to give
         * before and after star
         */

        for (int i = 0; i < n; i++) {
            /* space */
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            /* star */
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            /* space */
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    void pattern9(int n) {
        /* rows */
        for (int i = 1; i < n; i++) {
            /* space */
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            /* stars */
            for (int j = 1; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            /* Space */
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    void pattern10(int n) {
        // upper half (pyramid)
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half (inverted pyramid)
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern11(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) {
                stars = (2 * n - i);
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern12(int n) {
        for (int i = 0; i <= n; i++) {
            int start = 1;

            if (i % 2 == 0) {
                start = 1;
            } else {
                start = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }

    }

    void pattern13(int n) {
        int space = 2 * (n - 1);

        for (int i = 1; i <= n; i++) {
            // starting of number
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // space in row
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }

    void pattern14(int n) {
        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += 1;
            }
            System.out.println();
        }
    }

    void pattern15(int n) {
        for (int i = 0; i <= n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    void pattern16(int n) {
        for (int i = 0; i <= n; i++) {
            for (char ch = 'A'; ch <= 'A' + (n - i + 1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    void pattern18(int n) {
        for (int i = 0; i <= n; i++) {
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    void pattern19(int n) {
        int initial_space = 0;
        for (int i = 0; i < n; i++) {
            // stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j < initial_space; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            initial_space += 2;
            System.out.println();
        }
        int space = 2 * n - 2;
        for (int i = 0; i < n; i++) {
            // stars
            for (int j = 1; j <= 1 + i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 1 + i; j++) {
                System.out.print("*");
            }
            space -= 2;
            System.out.println();
        }
    }

    void pattern20(int n) {
        int spaces = 2 * n - 2;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n)
                stars = 2 * n - i;
            // star
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < n)
                spaces -= 2;
            else
                spaces += 2;
        }
    }

    void pattern21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    void pattern22(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            // Loop for columns
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int down = (2 * n - 2) - i;

                // Find minimum distance from border
                int minDist = Math.min(Math.min(top, down), Math.min(left, right));

                // Print number
                System.out.print(n - minDist);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = number.nextInt();

        Pattern p = new Pattern();
        //change this function name
        p.pattern22(n);
    }
}
