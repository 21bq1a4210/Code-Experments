class Demo {//start of Demo class
    static int i=0;//to know how many times construtr is invoking
    Demo(){//start of constructor
        System.out.println("i am in cont of class "+(i++));//promt
        Demo y=new Demo();//new obj for Demo class 
    }//end of constructor
    public static void main(String[] args) {//start of main method
        Demo x=new Demo();//creating new obj for Demo
    }//end of main method
};//end of class
/*Exception in thread "main" java.lang.StackOverflowError
        at java.base/java.nio.Buffer.<init>(Buffer.java:245)
        at java.base/java.nio.CharBuffer.<init>(CharBuffer.java:288)
        at java.base/java.nio.HeapCharBuffer.<init>(HeapCharBuffer.java:78)
        at java.base/java.nio.CharBuffer.wrap(CharBuffer.java:408)
        at java.base/sun.nio.cs.StreamEncoder.implWrite(StreamEncoder.java:281)
        at java.base/sun.nio.cs.StreamEncoder.write(StreamEncoder.java:132)
        at java.base/java.io.OutputStreamWriter.write(OutputStreamWriter.java:205)
        at java.base/java.io.BufferedWriter.flushBuffer(BufferedWriter.java:120)
        at java.base/java.io.PrintStream.writeln(PrintStream.java:722)
        at java.base/java.io.PrintStream.println(PrintStream.java:1028) */
