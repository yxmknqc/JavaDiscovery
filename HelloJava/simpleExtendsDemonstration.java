public class simpleExtendsDemonstration {

    public static void main(String[] args) {
        //boxR boxr=new boxR();
        boxS boxs=new boxS(6);
        boxs.showWL();
        //System.out.println((char)('a'+Math.random()*('z'-'a'+1)));
    }
}

class boxR{
    int l=20, w=10;

    public boxR(){
        System.out.println("boxR()");
    }

    public boxR(int a, int b){
        l=a;
        w=b;
        System.out.println("boxR(int,int)");
    }

    void showWL(){
        System.out.println("L:"+l+",W:"+w);
    }
}

class boxS extends boxR {
    int h=5;
    public boxS(){
        l=5;
        w=5;
    }

    public boxS(int a){
        l=w=a;
    }

}





