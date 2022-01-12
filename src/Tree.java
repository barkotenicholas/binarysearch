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


}
