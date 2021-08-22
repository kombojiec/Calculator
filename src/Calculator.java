import java.io.IOException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        //Ввод и проверка данных на кол-во элементов
        String[] input = sc.nextLine().split(" ");
        if(input.length != 3){
            try {
                throw new IOException();
            } catch (IOException e){
                System.out.println("Введены некорректные данные");
            }
            return;
        }

        //Валидация введённых данных
        if(!DataValidator.isValid(input)) return;

        // Переменные
        boolean roman = !((int)input[0].charAt(0) >= 48 && (int)input[0].charAt(0) <= 57);
        int result;
        Calculation calculation;
        Formatter format;

        // Вычисление и вывод результата
        if(!roman){
            calculation = new Calculation(input, false);
        }else{
            calculation = new Calculation(input, true);
        }
        try {
            result = calculation.calculate();
            if(roman) {
                if(result > 0){
                    format = new Formatter(result);
                    System.out.println(format.format());
                }else{
                    System.out.println("Число не может быть меньше 1");
                }
            }else{
                System.out.println(result);
            }
        }catch (IOException e){
            System.out.println("Деление на ноль запрещено операцией");
        }
    }
}


