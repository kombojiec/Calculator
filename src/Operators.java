public enum Operators {
    SUM("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");
    String value;

    Operators(String value){
        this.value = value;
    }

    public String getOperator(){
        return value;
    }

    public static boolean isOperator(String operator){
        for(Operators item: Operators.values()){
            if(item.value.equals(operator))
                return true;
        }
        return false;
    }

    public static Operators showOperator(String value){
        for(Operators item: Operators.values()){
            if(item.value.equals(value))
                return item;
        }
        return null;
    }

}
