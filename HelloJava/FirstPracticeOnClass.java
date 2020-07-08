public class FirstPracticeOnClass {

    public static void main(String[] args) {
        /*FirstPracticeClass fpc = new FirstPracticeClass();
        fpc.setIntA(7);
        System.out.println(fpc.getIntA());
         */

        /*PracticeRectangle pr = new PracticeRectangle();
        pr.setL(10);
        pr.setW(5);
        pr.showLengthAndWidth();
        System.out.println(pr.getArea());
        */

        /*int b=args.length;
        for(int i=0;i<b;i++)System.out.println(String.valueOf(i));*/
    }
}

class FirstPracticeClass {
    FirstPracticeClass(){}

    private int intA;

    void setIntA(int a){
        this.intA=a;
    }

    int getIntA(){
        return this.intA;
    }
}

class PracticeRectangle{
    private int l=0,w=0;

    void showLengthAndWidth(){
        System.out.println("L:"+l+"\tW:"+w);
    }

    int getArea(){
        return l*w;
    }

    void setL(int a){this.l=a;}
    void setW(int a){this.w=a;}
}