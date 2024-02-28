package pattern;

public class pattern7 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<2*n;i++){
            int totalcol = i >n ? 2*n -i : i;
            int nspace = n -totalcol;
            for(int s=0;s<nspace;s++){
                System.out.print(" ");
            }
            for(int j=0;j< totalcol;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
