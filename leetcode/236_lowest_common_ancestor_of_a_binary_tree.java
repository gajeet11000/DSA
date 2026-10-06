import java.util.ArrayList;
import java.util.List;

class Solution {
  private boolean pathToNode(TreeNode root, List<TreeNode> path, int val) {
    if (root == null) {
      return false;
    }

    path.add(root);

    if (root.val == val) {
      return true;
    }

    if (pathToNode(root.left, path, val)) {
      return true;
    }

    if (pathToNode(root.right, path, val)) {
      return true;
    }

    path.removeLast();
    return false;
  }

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    List<TreeNode> pPath = new ArrayList<>();
    pathToNode(root, pPath, p.val);

    List<TreeNode> qPath = new ArrayList<>();
    pathToNode(root, qPath, q.val);

    int n = Math.min(pPath.size(), qPath.size());

    int i = 0;
    while (i < n && pPath.get(i).val == qPath.get(i).val) {
      i++;
    }

    return pPath.get(i - 1);
  }

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null) {
      return null;
    }

    if (root == p || root == q) {
      return root;
    }

    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);

    if (left != null && right != null) {
      return root;
    }

    return left == null ? right : left;
  }
}
