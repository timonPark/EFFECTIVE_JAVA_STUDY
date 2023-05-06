package me.timonpark.ejs.effectivejavastudy.item03.staticFactoryMethod;

public class Elvis02 {
    public static Elvis02 INSTANCE;
    private Elvis02(){}

    public static Elvis02 getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new Elvis02();
        }
        return INSTANCE;
    }
}
