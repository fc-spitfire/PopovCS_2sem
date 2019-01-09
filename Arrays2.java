import java.util.Scanner;

class Arrays2{
    public static void main(String[] args){
        Scanner _input = new Scanner(System.in);
       System.out.print("Введите n: ");
       int n = _input.nextInt();
       _input.close();

       int [] arr = new int[n];
       for(int i = 0; i < n; i++){
           arr[i] = (int)(Math.random()*100);
       }
       System.out.println("Ответ: \nИсходный массив");
       for(int i = 0; i < n; i++){
           System.out.print(arr[i] + " ");
       }
       System.out.println("\nВ обратном порядке");
       for(int i = n-1; i >= 0; i--){
           System.out.print(arr[i] + " ");
       }
    }
}