public class DhanushPattern {
    public static void main(String[] args) {
        int height = 7; 
        int width = 7; 
        char[][] canvas = new char[height][50]; 

   
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < canvas[i].length; j++) {
                canvas[i][j] = ' ';
            }
        }

        
        drawD(canvas, 0);
        drawHLetter(canvas, 8);  
        drawA(canvas, 16);
        drawN(canvas, 24);
        drawU(canvas, 32);
        drawS(canvas, 40);
        drawHLetter(canvas, 48); 

       
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < canvas[i].length; j++) {
                System.out.print(canvas[i][j]);
            }
            System.out.println();
        }
    }

    
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

    
    static void drawHLetter(char[][] canvas, int offset) { 
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

    
    static void drawN(char[][] canvas, int offset) {
        for (int i = 0; i < 7; i++) {
            canvas[i][offset] = '*';
            canvas[i][offset + 4] = '*';
            canvas[i][offset + i] = '*';
        }
    }

    
    static void drawU(char[][] canvas, int offset) {
        for (int i = 0; i < 6; i++) {
            canvas[i][offset] = '*';
            canvas[i][offset + 4] = '*';
        }
        canvas[6][offset + 1] = '*';
        canvas[6][offset + 2] = '*';
        canvas[6][offset + 3] = '*';
    }

   
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
