package units;

public class Position {
    protected int x;
    protected int y;

    private static int leftSideX = 1;
    private static int leftSideY = 1;
    private static int rightSideX = 10;
    private static int rightSideY = 10;

    protected Position(boolean leftSide) {
        if (leftSide) {
            this.x = leftSideX++;
            this.y = leftSideY;
            if (leftSideX == 11) {
                leftSideX = 1;
                leftSideY++;
            }
        }
        else {
            this.x = rightSideX--;
            this.y = rightSideY;
            if (rightSideX == 0) {
                rightSideX = 10;
                rightSideY--;
            }
        }
    }

    protected Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected double getDistance(Position target) {
        return Math.sqrt(
            Math.pow((this.x - target.x), 2) +
            Math.pow((this.y - target.y), 2));
    }

    @Override
    public boolean equals(Object position) {
        Position pos = (Position) position;
        return this.x == pos.x && this.y == pos.y;
    }
}
