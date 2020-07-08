public class aboutFinalMethodKeyIsPrivate {
    public static void main(String[] args) {
        Child child = new Child();
        child.doit1();
        child.doit2();
        child.doit3();
        Parent parent = child;
        System.out.println("");
        parent.doit2();
        parent.doit3();
        System.out.println("");
        Parent realparent = new Parent();
        //realparent.doit1();
        realparent.doit2();
        realparent.doit3();
    }
}

class Parent {
    Parent(){
        //System.out.println("here");
        doit1();
    }

    private final void doit1(){
        System.out.println("Parent doit1;");
    }
    final void doit2(){
        System.out.println("Parent doit2;");
    }
    void doit3(){
        System.out.println("Parent doit3;");
    }
}

class Child extends Parent{
    void doit1(){
        System.out.println("Child doit1");
    }
    void doit3(){
        System.out.println("Child doit3;");
    }
}



