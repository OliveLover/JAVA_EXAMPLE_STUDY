public class ManageHeight {
    int[][] gradeHeights;

    public static void main(String[] args) {
        ManageHeight manageHeight = new ManageHeight();
        manageHeight.setData();
        manageHeight.printHeight(1, 3, 5);
        //manageHeight.printHeight(1, 2, 3, 4, 5);
        System.out.println("------------------------------------------");
        //manageHeight.printAverage(1, 2, 3, 4, 5);
        manageHeight.printAverage(2, 4);

    }

    public void setData() {
        gradeHeights = new int[][]{   {170, 180, 173, 175, 177},
                {160, 165, 167, 186},
                {157, 177, 187, 176},
                {173, 182, 181},
                {170, 180, 165, 177, 172}};
    }

    public void printHeight(int ...classNo) {
        for (int k : classNo) {
            int gradHeightsLength = gradeHeights[k - 1].length;
            System.out.printf("Class No.:%d\n", k);
            for (int i = 0; i < gradHeightsLength; i++) {
                System.out.println(gradeHeights[k - 1][i]);
            }
        }
    }

    public void printAverage(int ...classNo) {
        for(int k: classNo) {
            int sum = 0;
            double avg;
            int gradHeightsLength = gradeHeights[k-1].length;
            System.out.printf("Class No.:%d\n", k);
            for(int i=0; i < gradHeightsLength; i++) {
                sum += gradeHeights[k-1][i];
            }
            avg = (double)sum/gradHeightsLength;
            System.out.println("Height average: " + avg);
        }
    }

}
