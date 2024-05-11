public enum ConstantNumber {
    ONE(1),
    TWO(2),
    THREE(3),
    ZERO(0);

    private final int value;

    ConstantNumber(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}
