package Task2;

public class Task2{
    public int invertNumber(int number){
        return number % 2 != 0 ? ~number^1 : ~--number;
    }
}
