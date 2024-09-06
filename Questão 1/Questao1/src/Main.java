import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(returnResult(2584));

    }


    public static List<Integer> calcFib(int number){
        List<Integer> fibonacci = new ArrayList<>();
        int i = 0;

        while (true) {
            if (i == 0 || i == 1) {
                fibonacci.add(i);
            } else {
                int nextFib = fibonacci.get(i - 1) + fibonacci.get(i - 2);
                if (nextFib > number) {
                    break;
                }
                fibonacci.add(nextFib);
            }
            i++;
        }

        return fibonacci;
    }

    public static boolean checkNumber(List<Integer> fibonacci, int number) {
        for (int num : fibonacci) {
            if (num == number) {
                return true;
            }
        }
        return false;
    }

    public static String returnResult(int size){
        List<Integer> fibonacciSequence = calcFib(size);
        boolean haveNumber = checkNumber(fibonacciSequence, size);
        if(haveNumber){
            return "Pertence a sequência";
        }
        else{
            return "Não pertence a sequência";
        }
    }

}