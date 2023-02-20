public class Zero {
    public static void main(String[] args) {
        double a1 = 3./0;
        System.out.println("a1="+a1);
        double a2 = 3./0;
        System.out.println("a2="+a2);
        double a3 = a1-a2;
        System.out.println("a3="+a3);
        double a4 = (int)(a1-a2);
        System.out.println("a4="+a4);
        double a5 = a1+8;
        System.out.println("a5="+a5);
        double a6 = (int)(a1+8);
        System.out.println("a6="+a6);
        double a7 = (int)(a3+8);
        System.out.println("a7="+a7);
    }
}
