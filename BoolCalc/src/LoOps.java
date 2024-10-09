public class LoOps {

    public boolean AND(boolean x, boolean y) {
        return x && y;
    }

    public boolean OR(boolean x, boolean y) {
        return x || y;
    }

    public boolean NOT(boolean x) {
        return !x;
    }

    public boolean XOR(boolean x, boolean y) {
        return x ^ y;
    }

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
