 class pattern1{
    public static void main(String[] args) {


        int i, j, row = 9;
       int apha = 69;
        for (i = 0; i <= row; i++) {

            for (j =(row - i)-1; j >= 0; j--) {

                System.out.print(" ");
            }

            for (int k =i-1; k >=0; k--) {

                System.out.print(i+" ");
            }

            System.out.println();
        }
    }
}
