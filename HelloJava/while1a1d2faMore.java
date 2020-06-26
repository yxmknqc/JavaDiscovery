public class while1a1d2faMore {

    public static void main(String[] args) {
        int a=1;
        double sum=0;
        while(a!=21){
            long jc=1;
            for(int i=1;i<=a;i++)jc*=i;
            sum+=(double)1/jc;
            System.out.println(sum);
            a++;
        }
        System.out.println("the sum= "+sum);
    }
}