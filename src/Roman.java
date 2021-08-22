public enum Roman {
    I(1),
    II(2),
    III(3),
    IV(4),
    V(5),
    VI(6),
    VII(7),
    VIII(8),
    IX(9),
    X(10),
    XX(20),
    XXX(30),
    XL(40),
    L(50),
    LX(60),
    LXX(70),
    LXXX(80),
    XC(90),
    C(100);

    private int value;
    Roman(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    static public boolean isValue(String value){
        for (Roman item: Roman.values()){
            if(item.toString().equals(value) && item.ordinal() < 10)
                return true;
        }
        return false;
    }

    static public String getValue(int value){
        for (Roman item: Roman.values()){
            if(item.value == value){
                return item.name();
            }
        }
        return "";
    }

    static public int getNumber(String value){
        for(Roman item: Roman.values()){
            if(item.name().equals(value)){
                return item.getValue();
            }
        }
        return 0;
    }

}
