import java.util.Scanner;

class Binary2{
    public static void printBinary(int n){
        System.out.print(String.format("%32s", Integer.toBinaryString(n)).replace(" ", "0")); 
    }
        
    public static void printlnBinary(int n){
        printBinary(n);
        System.out.println("");
    }
    public static void main(String[] args){
       Scanner _input = new Scanner(System.in);
       System.out.print("Введите n: ");
       int n = _input.nextInt();
       _input.close();
       System.out.print("Двоичный код n: ");
       printlnBinary(n);
       System.out.printf("Ответ: %d\n", ~n&(n-1));
       System.out.print("Двоичный код: ");
       printlnBinary(~n&(n-1));
    }
}