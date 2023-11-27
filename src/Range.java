public class Range extends Main{
    private int start;
    private int end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getLength() {
        return Math.abs(start - end);
    }

    @Override
    public String toString() {
        if (start > end) {
            return "Ошибка: начало диапозона больше, чем конец";
        } else {
            return "Длина диапозона:" + getLength();
        }
    }
}
