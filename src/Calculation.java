import java.io.IOException;

public class Calculation {
    int x, y;
    String operator;

    Calculation(String[] arr, boolean roman){
        if(roman){
            x = Roman.getNumber(arr[0]);
            y = Roman.getNumber(arr[2]);
        }else{
            x = Integer.parseInt(arr[0]);
            y = Integer.parseInt(arr[2]);
        }
        operator = arr[1];
    }

    int calculate() throws IOException{
        switch (operator){
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "*":
                return x * y;
            case "/":
                if(y != 0)
                    return x / y;
                else throw new IOException();
        }
        return 0;
    }
}
