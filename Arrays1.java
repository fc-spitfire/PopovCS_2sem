import java.util.Scanner;

class Arrays1{
    public static void main(String[] args){
       Scanner _input = new Scanner(System.in);
       
       System.out.print("Введите n: ");
       int n = _input.nextInt();
       
       System.out.print("Введите a: ");
       int a = _input.nextInt();
       
       System.out.print("Введите d: ");
       int d = _input.nextInt();

       _input.close();
       
       int[] arr = new int[n];
       arr[0] = a;
       
       System.out.println("Ответ: ");

       for(int i = 1; i < n; i++){
           arr[i] = arr[i-1] * d;
           System.out.println(arr[i-1]);
       }

       System.out.println(arr[n-1]);
    }
}