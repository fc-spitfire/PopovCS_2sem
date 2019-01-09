import java.util.Scanner;

class Arrays7{
    public static void main(String[] args){

       Scanner _input = new Scanner(System.in);
       System.out.print("Введите n: ");
       int n = _input.nextInt();
       System.out.print("Введите k: ");
       int k = _input.nextInt();
       _input.close();

       int[] arr = new int[n];

       for(int i = 0; i < n; i++){
           arr[i] = (int)(Math.random()*100);
       }

       int a = arr[k];

       System.out.println("Ответ:\nМассив А:");

       for(int i = 0; i < n; i++){
           System.out.print(arr[i] + " ");
       }

       System.out.println("\nРезультат преобразования:");

       for(int i = 0; i < n; i++){
           System.out.print((arr[i] + a) + " ");
       }
    }
}