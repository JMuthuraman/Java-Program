package sampleprogram;

public class Pattern {

	public static void main(String[] args) {
		 displayPattern();
    }

    public static void displayPattern() {
        int size = 4;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                if (i == 2 && j == 1) {
                    System.out.print("V V");
                } else {
                    System.out.print(" ");
                    System.out.print(i < 2 ? " " : "a");
                }
            }
            System.out.println();
        }
    }





	}