public class Formatter {
    private int hundreds = 0, decades = 0, units = 0;

    Formatter(int value){
        hundreds = value / 100 * 100;
        decades = (value - hundreds * 100) / 10 * 10;
        units = value % 10;
    }

    String format(){
        StringBuilder result = new StringBuilder("");
        result.append(Roman.getValue(hundreds));
        result.append(Roman.getValue(decades));
        result.append(Roman.getValue(units));
        return result.toString();
    }
}
