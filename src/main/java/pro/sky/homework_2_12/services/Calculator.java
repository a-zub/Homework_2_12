package pro.sky.calculator.services;

public interface Calculator {
    public default int getAddition() {

        return 0;
    }
    public default int getSubtraction() {

        return 0;
    }
    public default int getMultiplication() {

        return 0;
    }
    public default double getDivision() {

        return 0;
    }

    public default String getAnswer() {

        return null;
    }

}
