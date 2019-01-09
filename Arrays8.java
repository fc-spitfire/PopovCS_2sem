import java.util.Scanner;

class Arrays8{
    public static void main(String[] args){

        Scanner _input = new Scanner(System.in);
        System.out.printf("Введите n: ");
        int n = _input.nextInt();
        _input.close();
        
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = (int)(Math.random()*100-50);
        }

        System.out.println("Ответ:\nМассив А:");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("Результат:");
        int arrayMax = arr[0];
        int arrayMin = arr[0];
        int minIndex = 0;
        int maxIndex = 0;
        for(int i = 0; i < n; i++){
            if(arrayMax < arr[i]) {arrayMax = arr[i]; maxIndex = i;}
            if(arrayMin > arr[i]) {arrayMin = arr[i]; minIndex = i;}
        }
        arr[maxIndex] = arrayMin;
        arr[minIndex] = arrayMax;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}