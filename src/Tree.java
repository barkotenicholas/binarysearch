public class Tree {

    private Treenode root;

    public void insert(int value){

        if(root == null){
            root = new Treenode(value);
        }else {
            root.insert(value);
        }
    }

    public void traverseInorder(){

        if(root != null){
            root.InorderTravasal();
        }
    }

    public Treenode get(int value){

        if(root != null){
            return  root.get(value);
        }

        return null;
    }

    public int min(){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        else {
            return root.min();
        }
    }
    public int max(){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        else {
            return root.max();
        }
    }

    public void delete(int value){
        root = delete(root,value);
    }

    private Treenode delete(Treenode subtree,int value){

        if(subtree == null) return null;

        if(value < subtree.getData()){
            subtree.setLeftChild(delete(subtree.getLeftChild(),value));
        }
        else if(value > subtree.getData()){
            subtree.setRightChild(delete(subtree.getRightChild(),value));
        }
        else {
            if(subtree.getLeftChild() == null){
                return subtree.getRightChild();
            }else if(subtree.getRightChild() == null){
                return subtree.getLeftChild();
            }

            subtree.setData(subtree.getRightChild().min());

            subtree.setRightChild(delete(subtree.getRightChild(), subtree.getData()));
        }

        return subtree;

    }
}
