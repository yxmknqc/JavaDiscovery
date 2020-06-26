public class printRhombus {

    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            char a[] = new char[15];
            for(int j=0;j<15;j++)a[j]=' ';
            int low=7-i,high=7+i;
            for(int j=low;j<=high;j+=2)a[j]='*';
            for(char x : a)System.out.print(x);
            System.out.println();
        }
        for(int i=5;i>=0;i--){
            char a[] = new char[15];
            for(int j=0;j<15;j++)a[j]=' ';
            int low=7-i,high=7+i;
            for(int j=low;j<=high;j+=2)a[j]='*';
            for(char x : a)System.out.print(x);
            System.out.println();
        }
    }
}