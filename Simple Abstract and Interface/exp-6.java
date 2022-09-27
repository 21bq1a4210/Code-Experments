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
class Demo {//start of the class
    public static void main(String[] args) {//start of the method
        Abstract ab=new AbstractDemo();//creating a object
        ab.method1();//calling method of Abstract class
        ab.method2();//calling method of Abstract class
        System.out.println("");//promt
        Interface in=new IFDemo();//creating an obj to Interface with IFDemo as constructor
        in.method1();//calling method of iterface
        in.method2();//calling method of iterface
    }
}
