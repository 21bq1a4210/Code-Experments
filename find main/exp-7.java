class Demo {//start of the class 
    public static void main(String[] args) {// start of correct main method
        System.out.println("i am in main 1"); //prompt 
    }//end of main method
    public static void main(int[] args) {//start of another main method let say 1
        System.out.println("i am in main 2");//prompt
    }//end of main method
    public void main(Demo[] args) {//start of another main method let say 2
        System.out.println("i am in main 3");//prompt
    }//end of main method
    public static void main() {//start of another main method let say 3
        System.out.println("i am in main 4");//prompt
    }//end of main method
}
