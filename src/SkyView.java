public class SkyView {
    private double[][]view;
    public SkyView(int numRows, int numCols, double[] scanned){
        this.view = new double[numRows][numCols];
        int s = 0;
        for(int r = 0; r<numRows;r++) {
            if (r % 2 == 0) {
                for (int k = 0; k < numCols ; k++) {
                    view[r][k] = scanned[s];
                    s++;
                }
            }
            else {
                for (int k = numCols- 1; k >= 0; k--) {
                    view[r][k] = scanned[s];
                    s++;
                }

            }
        }
    }


    public double getAverage(int startRow, int endRow, int startCol, int endCol){
        int x = endCol +1 -startCol;
        int y = endRow +1 -startRow;
        int n = x*y;
        double sum = 0;
        for(int row=startRow;row<=endRow;row++){
            for( int column = startCol;column<=endCol;column++){
                sum+= this.view[row][column];
            }
        }
        return sum/n;
    }






    public String toString(){
        String str = "";
        for(int i = 0;i<view.length;i++){
            for(int j = 0;j<view[i].length;j++){
                str+=view[i][j]+"  ";
            }
            str+="\n";
        }
        return str;
    }
}
