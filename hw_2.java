// Вывести все простые числа от 1 до 1000

public class hw_2 {
    public static void main(String[] args) {
        int countMax = 1000;
        System.out.println();
        System.out.println("Простые числа от 1 до " + countMax + ":");
        System.out.println();
        System.out.print("2 ");
        boolean isPrime = true;
        for (int i = 3; i < countMax; i = i + 2) {
            for (int j = 3; j < i; j = j + 2) {
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.print(i + " ");
            else isPrime = true;
        }
        System.out.println();
    }  
}
