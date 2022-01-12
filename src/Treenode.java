public class Treenode {

    private int data;

    private Treenode leftChild;

    private Treenode RightChild;

    public void insert(int value){
        if(data == value) return;

        if(value < data){
            if(leftChild == null){
                    leftChild = new Treenode(value);
            }
            else {
                leftChild.insert(value);
            }
        }
        else {
            if(RightChild == null){
                    RightChild = new Treenode(value);
            }
            else {
                RightChild.insert(value);
            }
        }
    }
    public void InorderTravasal(){

        if(leftChild != null){
            leftChild.InorderTravasal();
        }
        System.out.print(data + ", ");
        if(RightChild != null){
            RightChild.InorderTravasal();
        }

    }

    public Treenode(int value) {
        this.data = value;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Treenode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Treenode leftChild) {
        this.leftChild = leftChild;
    }

    public Treenode getRightChild() {
        return RightChild;
    }

    public void setRightChild(Treenode rightChild) {
        RightChild = rightChild;
    }
}
