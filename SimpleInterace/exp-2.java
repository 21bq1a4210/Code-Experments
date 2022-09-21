interface InterfaceDemo{
    /*Interface(){
        System.out.println("real me in interface");
    }*/
    //error: <identifier> expected
    //Interface(){
    void method1();
    void method2();
}

class IFDemo implements InterfaceDemo{
    IFDemo(){
        System.out.println("David:i am in con of implements class\nwhere are u Thony nd jack");
    }
    public void method1(){
        System.out.println("Thony:yo i m in method1");
    }
    public void method2(){
        System.out.println("jack:okay i am in method2");
    }
}

class Demo {
    public static void main(String[] args) {
        InterfaceDemo x=new IFDemo();
        x.method1();
        x.method2();
        //InterfaceDemo y=new InterfaceDemo();
    }
    
}
