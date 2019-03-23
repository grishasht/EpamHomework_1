package Task5;

public class Task5{
    public int changeDigit(int number, int digitNumber){
        if (digitNumber > 32) return 0;
        int one = 1;
        one <<= digitNumber-1;

        return number ^ one;
    }
}
