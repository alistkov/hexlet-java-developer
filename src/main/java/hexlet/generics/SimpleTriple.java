package hexlet.generics;

public class SimpleTriple<L, M, R> implements Triple<L, M, R> {
    private L left;
    private M middle;
    private R right;

    public SimpleTriple(L left, M middle, R right) {
        this.left = left;
        this.middle = middle;
        this.right = right;
    }

    public L getLeft() {
        return left;
    }

    public M getMiddle() {
        return middle;
    }

    public R getRight() {
        return right;
    }

    public void setLeft(L left) {
        this.left = left;
    }

    public void setMiddle(M middle) {
        this.middle = middle;
    }

    public void setRight(R right) {
        this.right = right;
    }

    public SimpleTriple<R, M, L> reverse() {
        return new SimpleTriple<>(getRight(), getMiddle(), getLeft());
    }

    public boolean isEqualTo(SimpleTriple<L, M, R> triple) {
        return left.equals(triple.getLeft())
                && middle.equals(triple.getMiddle())
                && right.equals(triple.getRight());
    }
}
