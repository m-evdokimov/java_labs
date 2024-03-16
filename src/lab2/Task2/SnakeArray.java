package src.lab2.Task2;

public class SnakeArray {
    int[][] arr;
    int rowCount, columnCount;

    public SnakeArray(int r, int c) {
        this.rowCount = r;
        this.columnCount = c;
        this.arr = new int[rowCount][columnCount];

        int maxVal = r * c;
        for (int i = 0; i < maxVal; i++) {
            int rowI = i / columnCount;
            int colI = rowI % 2 == 0 ? i - rowI * columnCount : (columnCount * (rowI + 1) - 1) - i;
            this.arr[rowI][colI] = i; 
        }
    }

    public void print() {
        for (int i = 0; i < this.rowCount; i++) {
            for (int j = 0; j < this.columnCount; j++) {
                System.out.print(this.arr[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
