package Task4;

public class Task4{
    public int euklidianAlg(int firstNumber, int secondNumber) {
        int shift;
        if (firstNumber == 0) return secondNumber;
        if (secondNumber == 0) return firstNumber;

        for (shift = 0; ((firstNumber | secondNumber) & 1) == 0; ++shift) {
            firstNumber >>= 1;
            secondNumber >>= 1;
        }

        while ((firstNumber & 1) == 0)
            firstNumber >>= 1;
            do {
                while ((secondNumber & 1) == 0)
                    secondNumber >>= 1;
                if (firstNumber > secondNumber) {
                    int t = secondNumber;
                    secondNumber = firstNumber;
                    firstNumber = t;
                }
                secondNumber = secondNumber - firstNumber;
            } while (secondNumber != 0);
        return firstNumber << shift;
    }
}
