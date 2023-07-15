package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int multipliedNumber = 0;

        if (multiplyByAndToInclusive==0){

            return;
        }
        if (multiplyByAndToInclusive>0) {
            while (multipliedNumber <= multiplyByAndToInclusive) {
                int result = multipliedNumber * multiplyByAndToInclusive;
                System.out.println(result);
                multipliedNumber++;
            }
        }else{
            int multiplyByAndToInclusiveNeg = multiplyByAndToInclusive *(-1);
                while (multipliedNumber <= multiplyByAndToInclusiveNeg) {
                    int result = multipliedNumber * multiplyByAndToInclusiveNeg;
                    System.out.println(result*-1);
                    multipliedNumber++;
            }



        }
    }
}