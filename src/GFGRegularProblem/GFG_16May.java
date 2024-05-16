package GFGRegularProblem;

import java.util.*;

/*Divisibility tree

* Given a tree with n nodes where n is even. The tree is numbered from 1 to n, has n - 1 edges and is rooted at node 1. Your task is to eliminate the maximum number of edges resulting in a set of disjoint trees where the number of nodes in each tree is divisible by 2.
Example 1:
Input:
n = 10
edges = {{2,1},{3,1},{4,3},{5,2},{6,1},{7,2},{8,6},{9,8},{10,8}}
Output:
2
Explanation:
Original tree:
After removing edge 1-3 and 1-6, each remaining component consists of even number of nodes.
Example 2:
Input:
n = 4
edges = {{2,1},{4,2},{1,3}}
Output:
1
Explanation:
After removing 2-1, each remaining component consists of even number of nodes.
Your Task:
You don't need to read or print anyhting. Your task is to complete the function minimumEdgeRemove() which takes n and edges as input parameters and returns the maximum number of edges that need to be removed from the given tree.
Expected Time Complexity: O(n)
Expected Space Complexity: O(n)
Constraints:
1 <= n <= 105
edges.length == n - 1
1 <= edges[i][0], edges[i][1] <= n
* */
class DivisibilityTree {
    public int minimumEdgeRemove(int n, int[][] edges) {
        List<Integer>[] tree = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            tree[u].add(v);
            tree[v].add(u);
        }

        int[] subtreeSize = new int[n + 1];
        dfs(1, -1, tree, subtreeSize);

        int removableEdges = 0;
        for (int i = 2; i <= n; i++) {
            if (subtreeSize[i] % 2 == 0) {
                removableEdges++;
            }
        }

        return removableEdges;
    }

    private void dfs(int node, int parent, List<Integer>[] tree, int[] subtreeSize) {
        subtreeSize[node] = 1;
        for (int neighbor : tree[node]) {
            if (neighbor != parent) {
                dfs(neighbor, node, tree, subtreeSize);
                subtreeSize[node] += subtreeSize[neighbor];
            }
        }
    }
}

public class GFG_16May {
    public static void main(String[] args) {
        DivisibilityTree sol = new DivisibilityTree();
        System.out.println(sol.minimumEdgeRemove(10, new int[][]{{2, 1}, {3, 1}, {4, 3}, {5, 2}, {6, 1}, {7, 2}, {8, 6}, {9, 8}, {10, 8}})); // Output: 2
        System.out.println(sol.minimumEdgeRemove(4, new int[][]{{2, 1}, {4, 2}, {1, 3}})); // Output: 1
    }
}
