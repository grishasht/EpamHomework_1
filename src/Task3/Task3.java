package Task3;

public class Task3{
public String getTypeValue(long number){
        int i = 1;
        if (number < 0) {
            number = ~--number;
            number--;
        }

        while(Math.abs(number) > 0){
            number = number >>> 1;
            i++;
        }
        float tmp = i/8f;

        if (tmp <= 1) return "Type of this number is byte (1 byte)";
        if (tmp <= 2) return "Type of this number is short (2 bytes)";
        if (tmp <= 4) return "Type of this number is int (4 bytes)";
        if (tmp <= 8) return "Type of this number is long (8 bytes)";
        return "Unknown type";
    }
}
