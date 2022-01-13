public class Main {

    public static void main(String[] args) {
         Tree tree = new Tree();

         tree.insert(25);
         tree.insert(20);
         tree.insert(15);
         tree.insert(27);
         tree.insert(30);
         tree.insert(29);
         tree.insert(26);
         tree.insert(22);
         tree.insert(32);


//         tree.traverseInorder();

//
//         System.out.println(tree.get(32      ));
//         System.out.println(tree.get(27));
//         System.out.println(tree.get(1557));
//
//         System.out.println(tree.max());
//         System.out.println(tree.min());
         tree.traverseInorder();
         tree.delete(25);
         System.out.println();
         tree.traverseInorder();

    }
}
