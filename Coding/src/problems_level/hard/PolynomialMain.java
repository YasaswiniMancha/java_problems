package problems_level.hard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class PolynomialMain {

    public static void main(String[] args) throws IOException {

        int count1, count2, choice;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        count1 = Integer.parseInt(br.readLine().split(" ")[0]);  //count1- Number of terms in the first polynomial.
        //Reads a line of input, splits it by spaces, and takes the first value as an integer.

        int[] degree1 = new int[count1];    

        int[] coeff1 = new int[count1];

        String nm[] = br.readLine().split(" ");

        for (int i = 0; i < count1; i++) {

            degree1[i] = Integer.parseInt(nm[i]);

        }

        nm = br.readLine().split(" ");

        for (int i = 0; i < count1; i++) {

            coeff1[i] = Integer.parseInt(nm[i]);

        }

        Polynomial first = new Polynomial(0, 0);

        for (int i = 0; i < count1; i++) {

            first = first.plus(new Polynomial(coeff1[i], degree1[i]));

        }

        count2 = Integer.parseInt(br.readLine().split(" ")[0]);

        int[] degree2 = new int[count2];

        int[] coeff2 = new int[count2];

        nm = br.readLine().split(" ");

        for (int i = 0; i < count2; i++) {

            degree2[i] = Integer.parseInt(nm[i]);

        }

        nm = br.readLine().split(" ");

        for (int i = 0; i < count2; i++) {

            coeff2[i] = Integer.parseInt(nm[i]);

        }

        Polynomial second = new Polynomial(0, 0);

        for (int i = 0; i < count2; i++) {

            second = second.plus(new Polynomial(coeff2[i], degree2[i]));

        }

        choice = Integer.parseInt(br.readLine().split(" ")[0]);

        Polynomial result = new Polynomial(0, 0);

        switch (choice) {

            // Add

            case 1: {

                result = first.plus(second);

                System.out.println(result);

                break;

            }

            // Subtract

            case 2: {

                result = first.minus(second);

                System.out.println(result);

                break;

            }

            // Multiply

            case 3: {

                result = first.times(second);

                System.out.println(result);

                break;

            }

            case 4: // Copy constructor

            {

                Polynomial third = new Polynomial(first);

                if (third.coef == first.coef) {

                    System.out.println("false");

                } else {

                    System.out.println("true");

                }

                break;

            }

            case 5: // Copy assignment operator

            {

                Polynomial fourth = new Polynomial(first);

                if (fourth.coef == first.coef) {

                    System.out.println("false");

                } else {

                    System.out.println("true");

                }

                break;

            }

        }

    }

}