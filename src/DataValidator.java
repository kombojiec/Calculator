import java.io.IOException;

public class DataValidator {
    static public boolean isValid(String[] arr) throws IOException {
        try {
            // проверка оператора
            if (Operators.isOperator(arr[1])) {
                // Проверка на римскую СС
                if (Roman.isValue(arr[0])) {
                    if (Roman.isValue(arr[2])) {
                        return true;
                    } else try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("Введены данные разного типа");
                        return false;
                    }
                }
                // Проверка на число в арабской СС
                try {
                    if (Integer.parseInt(arr[0]) >= 0 && Integer.parseInt(arr[0]) <= 10) {
                        if (Integer.parseInt(arr[2]) >= 0 && Integer.parseInt(arr[2]) <= 10) {
                            return true;
                        } else try {
                            throw new IOException();
                        } catch (IOException e) {
                            System.out.println("Введено некорректное значение");
                            return false;
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Введено некорректное значение");
                    return false;
                }
            }else throw new IOException();
        }catch (IOException e){
            System.out.println("Введён не корректный оператор");
            return false;
        }
        return false;
    }
}
