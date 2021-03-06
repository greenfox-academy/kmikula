import java.util.ArrayList;

public class Fibonacci {

    ArrayList<Long> fibonacciNrs;

    public Fibonacci() {
        this.fibonacciNrs = new ArrayList<>();
    }

    public long fibonacci(int index) {

        fibonacciNrs.add(0l);
        fibonacciNrs.add(1l);

        int k = 2;

        while (fibonacciNrs.size() <= (index+1) ) {

            Long sumOfPreviousTwo = Long.valueOf(fibonacciNrs.get(k - 2) + fibonacciNrs.get(k - 1));
            fibonacciNrs.add(sumOfPreviousTwo);
            k++;

        }
        return fibonacciNrs.get(index);
    }
}