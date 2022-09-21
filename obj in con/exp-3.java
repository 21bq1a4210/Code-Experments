class Demo {
    static int i=0;
    Demo(){
        System.out.println("i am in cont of class "+(i++));
        Demo y=new Demo();
    }
    public static void main(String[] args) {
        Demo x=new Demo();
    }
}
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