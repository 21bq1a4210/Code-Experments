class Demo {
    public static void main(String[] args) {
        System.out.println("i am in main 1");
    }
    public static void main(int[] args) {
        System.out.println("i am in main 2");
    }
    public void main(Demo[] args) {
        System.out.println("i am in main 3");
    }
    public static void main() {
        System.out.println("i am in main 4");
        
    }
}
