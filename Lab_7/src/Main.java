public class Main {
    public static void main(String[] args) {

        System.out.println("Task1: ");
        Task1();

        System.out.println("Task2");
        int[] mas= {1,85,5,9,2,4};
        //System.out.println((mas.length));
        Task2(mas);


        System.out.println("Task3:");
        int[] mas3= {1,2,3,4,5,6,7};
        Task3(mas3);

        System.out.println("Task 4:");
        int min=0, max=0;
        int[] mas4= {5,-1,-4,-1,5,9,888};
        PrintMas(mas4);
        Task4(mas4);


        System.out.println("Task 5:");
        int sum1=0,sum2=0;
        int n = 12;
        System.out.println(n/100);
        for (int i=10;i<100;i++){
            int temp = i;
            sum1 = temp/10 + temp%10;

            temp = i*7;
            if(temp/100 == 0)
                sum2 = temp/10 + temp%10;
            else
                sum2 = temp%100 + temp/100 + ((temp%100)/10);
            if(sum1 == sum2)
                System.out.print(i+", ");
        }
        System.out.println();


        System.out.println("Task 6");
        int[] mas6= {2,6,7,-99,76,4,3,5,2,67,9999,1,2,3,4};
        PrintMas(mas6);
        Task6(mas6);

        System.out.println("Task 7:");
        int k =4;
        //int[] mas7= {2,6,7,-99,76,4,3,5,2,67,9,1,2,3,4};
        PrintMas(mas6);
        Task7(k, mas6);

        System.out.println("Task 8:");
        int[] mas8= {2,6,7,99,76,4,3,5,2,67,9999,1,2,3,4};
        PrintMas(mas8);
        SumSimp(mas8);


        System.out.println("Task 9:");
        PrintMas(mas6);
        Task9(mas6);

        System.out.println("Task 10:");
        int[] mas10={2,6,7,0,76,0,3,5,2,67,0,1,2,0,4};
        PrintMas(mas10);
        Task10(mas10);
    }

    private static void Task10(int[] mas10) {
        int n0=0;

        for (int x: mas10) {
            if (x==0) n0++;
        }
        int[] newMas=new int[mas10.length-n0];
        int j=0;
        for(int i = 0; i< mas10.length; i++) {
            if(mas10[i]!=0) {
                newMas[j]= mas10[i];
                j++;
            }
        }
        PrintMas(newMas);
    }

    private static void Task9(int[] mas) {
        int first= mas[0], sec= mas[1], third= mas[2], maxSum;
        for (int i = 3; i< mas.length; i++) {
            maxSum=first+sec+third;
            if (maxSum < (mas[i-2]+ mas[i-1]+ mas[i])) {
                first= mas[i-2];
                sec= mas[i-1];
                third= mas[i];
            }
        }
        System.out.print(first+" ");
        System.out.print(sec+" ");
        System.out.print(third+"\n");
    }

    private static void SumSimp(int[] mas) {
        int sum = 0;
        for (int x: mas) {
            int countDelitels = 0;

            for(int i = 2; i< x; i++){
                if(x % i == 0)
                    countDelitels++;
            }

            if(countDelitels == 0){
                sum++;
            }
        }
        System.out.println(sum);
    }

    private static void Task7(int k, int[] mas) {
        int[] newMas= new int [mas.length];
        for (int i=0;i<newMas.length;i++)
        {
            if (i+ k < mas.length)
                newMas[i]= mas[i+ k];
        }
        PrintMas(newMas);
    }

    private static void Task6(int[] mas) {
        int min;
        int max;
        int[] newMas = new int[mas.length];

        max= 0;
        min= 0;

        for(int i = 0; i< mas.length; i++){
            newMas[i] = mas[i];
            if (mas[i]> mas[max]) max=i;
            else if (mas[i]< mas[min]) min=i;
        }
        int tempMax = max;
        for(int i = min; i<=tempMax;i++){
            newMas[i] = mas[max];
            max--;
        }
        PrintMas(newMas);
    }

    private static void Task4(int[] mas) {
        int max;
        int min;
        max= mas[0];
        min= mas[0];

        for (int x: mas) {
            if (x>max) max=x;
            else if (x<min) min=x;
        }
        for(int i =0; i<mas.length;i++){
            if (mas[i]==max) mas[i]=min;
            else if (mas[i]==min) mas[i]=max;
        }
        PrintMas(mas);
    }

    private static void Task3(int[] mas) {
        PrintMas(mas);
        for(int i = 1; i < mas.length-1; i++)
            if(mas[i]%2 != 0)
                mas[i] += mas[mas.length-1];
        PrintMas(mas);
    }

    private static void PrintMas(int[] mas) {
        for(int i = 0; i< mas.length; i++){
            System.out.print(mas[i]+" ");
        }
        System.out.println(" ");
    }

    private static void Task1() {
        for (int fist=1;fist<10;fist++)
            for (int sec=0;sec<10;sec++)
                for (int thir=0;thir<10;thir++)
                    for (int fourth=0;fourth<10;fourth++)
                        if (fist + sec + thir+fourth==22)
                            System.out.print((fist*1000+sec*100+thir*10+fourth) + ", ");
        System.out.print("\n");
    }

    private static void Task2(int[] mas) {
        int temp;
        for (int i = 0; i< mas.length; i++){
            System.out.print(mas[i]+" ");
        }
        System.out.println();

        for (int i = 0; i< mas.length-1; i++)
        {
            temp= mas[i];
            mas[i]= mas[i+1];
            mas[i+1]=temp;
            i++;
        }
        for (int i = 0; i< mas.length; i++){
            System.out.print(mas[i]+" ");
        }
        System.out.println();
    }
}