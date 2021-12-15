package by.gbyzzz.task02javaarrays.beans;

public interface Array <T extends Number>  {
    public default T[] getArr() {
        return null;
    }
}
