package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int evenNumber = 0;
        while (evenNumber <= printTillInclusive) {
            if (evenNumber % 2 == 0) {
                System.out.println(evenNumber);
            }
            evenNumber++;
        }
    }
}
