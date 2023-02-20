public class Main {

    public static void main(String[] args) {
        int a=1,b=5,c=3,d=4,e=8;
        int  max = a;

        if (a>b) max=a;
        else if (b>c) max=b;
        else if (c>d) max=c;
        else if (d>e) max=d;
        else max=e;

        int max_second = a;
        if (a>b && a !=max) max_second=a;
        else if (b>c && b !=max) max_second=b;
        else if (c>d && c !=max) max_second=c;
        else if (d>e && d !=max) max_second=d;
        else if (e !=max) max_second=e;

        System.out.println(max);
        System.out.println(max+" and "+ max_second);

    }
}
