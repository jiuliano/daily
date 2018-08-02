package daily.exercises;

import daily.util.TreeNode;

/**
 * Created by james on 1/22/2017.
 */
public class InsertBst {
    TreeNode<Integer> root = null;

    void insert(int value) {
		root = insert(root, value);
    }

    private TreeNode insert(TreeNode<Integer> node, int value) {
        // TODO

		return node;
	}
}
