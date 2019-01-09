import java.util.Scanner;

class Binary1{
    public static void main(String[] args){
       Scanner _input = new Scanner(System.in);
       System.out.print("Введите n: ");
       int n = _input.nextInt();
       _input.close();
       System.out.printf("Ответ: %d\n", 2 << (n-1));
    }
}