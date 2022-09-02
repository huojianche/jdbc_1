package primary.athefei.contact;

public class Array2Demo {
    public static void main(String[] args) {
        int[][] num = new int[][]{{1,2,3},{4,5},{7,8,9}};
//        System.out.println(num[2][0]);
//        System.out.println(num.length);
        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                System.out.print(num[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
