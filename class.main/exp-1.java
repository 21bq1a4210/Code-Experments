import javax.sound.sampled.SourceDataLine;

class Demo {
    static int i=0;
    Demo(){
        System.out.println("i am in con of Demo");
        i++;
    }
    
    public static void main(String[] args) {
        Demo x=new Demo();
        System.out.println("i am in main");
        System.out.println(i);
        Demo.main(args);
           
    }
}
