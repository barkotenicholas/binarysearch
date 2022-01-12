public class Treenode {

    private int data;

    private Treenode leftChild;

    private Treenode RightChild;

    public Treenode(int value) {
        this.data = value;
    }

    public Treenode get(int value){
        if(value == data){
            return this;
        }
        if(value < data){
            if(leftChild != null){
                return leftChild.get(value);
            }
        }
        else {
            if(RightChild != null){
                return RightChild.get(value);
            }
        }
        return null;
    }

    public int min(){
        if(leftChild == null){
            return data;
        }
        else {
           return leftChild.min();
        }

    }
    public int max(){
        if(RightChild == null){
            return data;
        }
        else {
            return RightChild.max();
        }
    }
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
