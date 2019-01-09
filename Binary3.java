import java.util.Scanner;

class Binary3{
    public static int multiply(int a, int b){
        int result = 0;
        while (b != 0){
            if ((b&0b1) == 0b1) result += a;
            b >>= 1;
            a <<= 1;
        }
        return result;
    }
    public static void main(String[] args){
       Scanner _input = new Scanner(System.in);
       System.out.print("Введите a: ");
       int a = _input.nextInt();
       System.out.print("Введите b: ");
       int b = _input.nextInt();
       _input.close();
       System.out.println("Ответ: " + ((multiply(18, a) + (b >> 4))&31));
    }
}