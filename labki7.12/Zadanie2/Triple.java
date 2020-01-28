public class Triple<L,M,R> extends Pair<L,R> {

    private M middle;

    protected Triple(L left, M middle, R right){
        super(left, right);
        this.middle = middle;
    }

    public M getMiddle(){
        return middle;
    }

    public void setMiddle(M middle){
        this.middle = middle;
    }

}