public class Domino {
    int top;
    int bottom;

    public Domino() {
        top = 0;
        bottom = 0;
    }

    public Domino(int top, int bottom) {
        this.top = top;
        this.bottom = bottom;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    @Override
    public String toString() {
        return "Domino{" +
                "top=" + top +
                ", bottom=" + bottom +
                '}';
    }

    public void flip() {
        int temp = top;
        top = bottom;
        bottom = temp;
    }

    public void settle() {
        if (top > bottom)
            flip();
    }

    public int compareTo(Domino other) {
        settle();
        other.settle();

        if (top < other.getTop())
            return -1;
        else if (top > other.getTop())
            return 1;
        else {
            if (bottom < other.getBottom())
                return -1;
            else if (bottom > other.getBottom())
                return 1;
            else
                return 0;
        }
    }

    public int compareToWeight(Domino other) {
        int thisTotal = top + bottom;
        int otherTotal = other.getTop() + other.getBottom();

        if (thisTotal < otherTotal)
            return -1;
        else if (thisTotal > otherTotal)
            return 1;
        else
            return 0;
    }

    public boolean canConnect(Domino other) {
        if (top == other.getTop() || top == other.getBottom() || bottom == other.getTop() || bottom == other.getBottom())
            return true;
        else
            return false;
    }
}
