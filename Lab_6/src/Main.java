import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Task 1: ");
        int n=1686117;
        int sum=0;

        sum = GetSumParnie(n, sum);
        System.out.println(n);
        System.out.println(sum);


        System.out.println("Task 2: ");
        float X=-5;
        int y=0;
        Task2(X);

        System.out.println("Task 3: ");
        n=2235649;
        int sumParnie=0;
        int sumNeparnie=0;
        while (n!=0)
        {
            if ((n%10)%2==0)
                sumParnie++;
            else sumNeparnie++;
            n/=10;
        }
        System.out.println(n);
        System.out.println("Sum parnie: "+sumParnie+" Sum neparnie: "+sumNeparnie);

        
        System.out.println("Task 4");
        n=9854761;
        System.out.println(n);
        while (n!=0)
        {
            System.out.println(n%10);
            n/=10;
        }


        System.out.println("Task 5:");
        int A=1;
        int B=5;
        System.out.println(A + " to " +B);
        Task5(A, B);



        System.out.println("Task 6: ");
        n = 6;
        int res = 1;
        System.out.println(n);
        Task6(n, res);


        System.out.println("Task 7:");
        Task7(in, n);


        System.out.println("Task 8: ");
        n = 498756;
        System.out.println(n);
        Task8(n);

        System.out.println("Task 9: ");
        n=243;
        sum=0; int tver=1;
        for(int i =n; i!=0; i/=10){
            sum+=(n%10);
            tver*=(n%10);
        }
        System.out.println(n);
        System.out.println("Sum: "+sum+"\n"+"Tver: "+tver);



        System.out.println("Task 10");
        n=11;
        System.out.println(n);
        Task10(n);
    }

    private static void Task10(int n) {
        int first=0,second=1,third;
        System.out.print(first+"\t"+second+"\t");
        for (int i = 2; i< n; i++)
        {
            third=first+second;
            System.out.print(third+"\t");
            first=second;
            second=third;
        }
    }

    private static void Task7(Scanner in, int n) {
        int res = 0;
        while(true){
            n = in.nextInt();
            if(n < 2) break;

            int countDelitels = 0;
            for(int i = 2; i< n; i++){
                if(n % i == 0)
                    countDelitels++;
            }

            if(countDelitels == 0)
                res++;
        }
        System.out.println("Result: "+res);
    }

    private static void Task8(int n) {
        for(int i = n; i != 0; i /= 10) {
            System.out.println(i % 10 + " \t");
        }
    }

    private static void Task6(int x, int res) {
        for(int i = 1; i != x + 1; ++i) {
            res *= i;
            System.out.println(i + "!=" + res);
        }
    }

    private static void Task5(int A, int B) {
        int facr;
        for(int i = A; i<= B; i++)
        {
            facr = i*i*i;
            System.out.println(i +"^3 = "+facr);
        }
    }

    private static void Task2(float x) {
        while (x <=5)
        {
            System.out.println("x = "+ x +" y = "+ (5-(x * x)/2));
            x +=0.5;
        }
    }

    private static int GetSumParnie(int n, int sum) {
        while (n !=0)
        {
            if ((n %10)%2==0)
                sum +=(n %10);
            n /=10;
        }
        return sum;
    }
}


