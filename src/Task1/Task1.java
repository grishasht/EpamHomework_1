package Task1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1{
        public int getNumber(){
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String strNumber = null;
        try {
            strNumber = buffer.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int number = 0;
        if (strNumber.charAt(0) == '0')
            for(int i = strNumber.length()-1, degree = 0; i >= 1 ; i--, degree++) {
                char tmp = strNumber.charAt(i);
                if (tmp == '1') {
                    number += Math.pow(2, degree);
                }
            }
        if (strNumber.charAt(0) == '1') {
            number = -1;
            for (int i = strNumber.length() - 1, degree = 0; i >= 1; i--, degree++) {
                char tmp = strNumber.charAt(i);
                if (tmp == '0') {
                    number -= Math.pow(2, degree);
                }
            }
        }

        return number;
    }
}
