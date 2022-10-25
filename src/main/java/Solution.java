import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        // depth first search
        return dfs(root, new ArrayList());
    }

    // helper method
    // depth first search
    private List<Integer> dfs(TreeNode root, List<Integer> list) {
        // base case
        if (root == null) {
            return list;
        }

        // if there is a node with a value, add it to the list
        list.add(root.val);

        // traverse left side
        list = dfs(root.left, list);

        // traverse right side
        return dfs(root.right, list);
    }
}
