interface Interface{//start of interface
    void method1(); //incomplet method
    void method2(); //incomplet method
}//end of interface

abstract class Abstract{//start of abstract class
    abstract void method1();//abstract method
    void method2(){//start of method2
        System.out.println("i am in method2 of abstract class");//promt
    }//end of method2
}//end of abstract class

class IFDemo implements Interface{// implemented class
    IFDemo(){// start of construtor 
        System.out.println("i am in con IFDemo");//promt
    }//end of construtor
    public void method1(){//start of method1
        System.out.println("i am in method1 of interface class");//promt
    }//end of method1
    public void method2(){//start of method2
        System.out.println("i am in method2 of interface class");//promt
    }//end of method2
}//end of impemented class

class AbstractDemo extends Abstract{//start of inherated abstracted class 
    AbstractDemo(){//start of constructor
        System.out.println("i am in con of AbstractDemo");//promt
    }//end of constructor
    void method1(){//start of method1
        System.out.println("i am in method1 of abstract class");//promt
    }//end of method1
}//end of inherated abstracted class
class Demo {
    public static void main(String[] args) {
        Abstract ab=new AbstractDemo();
        ab.method1();
        ab.method2();
        System.out.println("");
        Interface in=new IFDemo();
        in.method1();
        in.method2();
    }
}