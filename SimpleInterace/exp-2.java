interface InterfaceDemo{//start of interface
    /*Interface(){
        System.out.println("real me in interface"); //the interface doesnt contains constructor
    }*/
    //error: <identifier> expected
    //Interface(){
    void method1();//behivour less methods
    void method2();//behivour less methods
}

class IFDemo implements InterfaceDemo{//start of implements class
    IFDemo(){// constructor of the class
        System.out.println("David:i am in con of implements class\nwhere are u Thony nd jack");//promt
    }//end of the constructor
    public void method1(){//start of method1
        System.out.println("Thony:yo i m in method1");//promt
    }//end of the method1
    public void method2(){//start of method2
        System.out.println("jack:okay i am in method2");//promt
    }//end of method2
}//end of IFDemo class

class Demo {//start of Demo class
    public static void main(String[] args) {//jp exigution start from here
        InterfaceDemo x=new IFDemo();//creating constructor of InterfaceDemo type with constructor of IFDemo
        x.method1();//invoking method of InterfaceDemo
        x.method2();//invoking method of InterfaceDemo
        //InterfaceDemo y=new InterfaceDemo();//
    }//end of main method
    
};//end of the Demo class
