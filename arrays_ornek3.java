package JAVA101;

public class arrays_ornek3 {
    public static void main(String[] args) {
        String[][] star = new String[5][4];

        for (int i = 0; i < star.length;i++){
            for (int j=0;j<star[i].length;j++){
                if (i==0 || i==2 || i==4){
                    star[i][j]="*";
                } else if (j==0 || j==3) {
                    star[i][j]="*";
                }else {
                    star[i][j]=" ";
                }
            }
        }
        for (String[] row : star) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
