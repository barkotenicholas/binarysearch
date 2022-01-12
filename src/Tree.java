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

}
