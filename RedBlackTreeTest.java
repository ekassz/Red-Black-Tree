import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RedBlackTreeTest {
  
  /**
   * This will test enforcement of red-black tree property after
   * the insertion method
   * 
   */
  @Test
  public void testRBTreePropertyAfterInsertion() {
      RedBlackTree<Integer> tree = new RedBlackTree<>();
      tree.insert(30);
      tree.insert(20);
      tree.insert(40);
      tree.insert(50);
      
      assertEquals("[ expected level order traversal ]", tree.toLevelOrderString());
  }

  /**
   * checking to see if the root is indeed always black
   */
  @Test
  public void testRootColor() {
      RedBlackTree<Integer> tree = new RedBlackTree<>();
      tree.insert(10);
      tree.insert(15);
      tree.insert(20);
      // root always black
      assertTrue(tree.root.isBlack(), "Root node should always be black");
  }
  
  /**
   * checking the color of the leaf nodes to see if they match or not
   */
  @Test
  public void testLeafColor() {
      RedBlackTree<Integer> tree = new RedBlackTree<>();
      tree.insert(10);
      tree.insert(15);
      tree.insert(20);
      tree.insert(25);
      // The leaves (null nodes) should always be black
      RedBlackTree.Node<Integer> leafNode = tree.findNodeWithData(25).context[2]; 
      assertTrue(leafNode.isBlack(), "Leaf nodes should always be black");
  }




}
