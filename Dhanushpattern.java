public class DhanushPattern {
    public static void main(String[] args) {
        int height = 7; // Height of the letters
        int width = 7;  // Width of each letter (may vary per character)
        char[][] canvas = new char[height][50]; // Adjust width as needed

        // Initialize canvas with spaces
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < canvas[i].length; j++) {
                canvas[i][j] = ' ';
            }
        }

        // Draw each letter by modifying the canvas array
        drawD(canvas, 0);
        drawHLetter(canvas, 8);  // Renamed to avoid duplicate method name
        drawA(canvas, 16);
        drawN(canvas, 24);
        drawU(canvas, 32);
        drawS(canvas, 40);
        drawHLetter(canvas, 48); // Using renamed method for the second H

        // Print the canvas
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < canvas[i].length; j++) {
                System.out.print(canvas[i][j]);
            }
            System.out.println();
        }
    }

    // Function to draw 'D'
    static void drawD(char[][] canvas, int offset) {
        for (int i = 0; i < 7; i++) {
            canvas[i][offset] = '*';
            if (i == 0 || i == 6) {
                canvas[i][offset + 1] = '*';
                canvas[i][offset + 2] = '*';
            }
            canvas[i][offset + 3] = '*';
        }
    }

    // Function to draw 'H'
    static void drawHLetter(char[][] canvas, int offset) { // Renamed method
        for (int i = 0; i < 7; i++) {
            canvas[i][offset] = '*';
            canvas[i][offset + 4] = '*';
            if (i == 3) {
                for (int j = 0; j < 5; j++) {
                    canvas[i][offset + j] = '*';
                }
            }
        }
    }

    // Function to draw 'A'
    static void drawA(char[][] canvas, int offset) {
        for (int i = 0; i < 7; i++) {
            canvas[i][offset] = '*';
            canvas[i][offset + 4] = '*';
            if (i == 3) {
                for (int j = 0; j < 5; j++) {
                    canvas[i][offset + j] = '*';
                }
            }
        }
    }

    // Function to draw 'N'
    static void drawN(char[][] canvas, int offset) {
        for (int i = 0; i < 7; i++) {
            canvas[i][offset] = '*';
            canvas[i][offset + 4] = '*';
            canvas[i][offset + i] = '*';
        }
    }

    // Function to draw 'U'
    static void drawU(char[][] canvas, int offset) {
        for (int i = 0; i < 6; i++) {
            canvas[i][offset] = '*';
            canvas[i][offset + 4] = '*';
        }
        canvas[6][offset + 1] = '*';
        canvas[6][offset + 2] = '*';
        canvas[6][offset + 3] = '*';
    }

    // Function to draw 'S'
    static void drawS(char[][] canvas, int offset) {
        for (int j = 0; j < 5; j++) {
            canvas[0][offset + j] = '*';
            canvas[3][offset + j] = '*';
            canvas[6][offset + j] = '*';
        }
        for (int i = 1; i < 3; i++) {
            canvas[i][offset] = '*';
        }
        for (int i = 4; i < 6; i++) {
            canvas[i][offset + 4] = '*';
        }
    }
}
