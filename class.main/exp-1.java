import javax.sound.sampled.SourceDataLine;

class Demo {//start of the class
    static int i=0; //using this in a static method so it shold be in static
    Demo(){//constructor of same class
        System.out.println("i am in con of Demo");//promt
        i++;//to know that how many time does the constructor invoes
    }//end of constructor
    
    public static void main(String[] args) {//start of main method
        Demo x=new Demo();// creating an obj of same class
        System.out.println("i am in main");//promt
        System.out.println(i);//display intial value in i
        Demo.main(args);//invoking the same method
        /*infinty loop here!!!
        try to stop the excusion by (ctrl+c) on cmd
        */
    }//end of main method
};//end of the class
