package GFGRegularProblem;

import java.util.*;

/* Number of Good Components
* Given an undirected graph with v vertices(numbered from 1 to v) and e edges. Find the number of good components in the graph.
A component of the graph is good if and only if the component is fully connected.
Note: A fully connected component is a subgraph of a given graph such that there's an edge between every pair of vertices in the component, the given graph can be a disconnected graph.
Example 1:
Input:
e=3
v=3
edges={{1, 2},{1, 3},{3, 2}}
Output:
1
Explanation:
We can see that there is only one component in the graph and in this component there is a edge between any two vertces.
Example 2:

Input:
e=5
v=7
edges={{1, 2},{7, 2},{3, 5},{3, 4},{4, 5}}
Output:
2
Explanation:
We can see that there are 3 components in the graph. For 1-2-7 there is no edge between 1 to 7, so it is not a fully connected component. Rest 2 are individually fully connected component.
Your Task:
You don't need to read input or print anything. Your task is to complete the function findNumberOfGoodComponent(), which takes an integer e and v and edges[][] as input parameters and returns an integer denoting the number of good components.

Expected Time Complexity: O(v+e)
Expected Auxiliary Space: O(depth of the graph)

Constraints:
1 <= edges[i][0], edges[i][1] <= v
1 ≤ v, e ≤ 104
All edges are unique
* */
class GoodComponent {
    public int findNumberOfGoodComponent(int e, int v, int[][] edges) {
        int ans = 0;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= v; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        int[] vis = new int[v + 1];
        for (int i = 1; i <= v; i++) {
            if (vis[i] == 0) {
                List<Integer> path = new ArrayList<>();
                DFS(adj, i, path, vis);
                boolean isGoodComponent = true;
                for (int node : path) {
                    if (adj.get(node).size() != path.size() - 1) {
                        isGoodComponent = false;
                        break;
                    }
                }
                if (isGoodComponent) ans++;
            }
        }
        return ans;
    }

    private void DFS(List<List<Integer>> adj, int src, List<Integer> path, int[] vis) {
        vis[src] = 1;
        path.add(src);
        for (int nbr : adj.get(src)) {
            if (vis[nbr] == 0) {
                DFS(adj, nbr, path, vis);
            }
        }
    }
}
public class GFG_13May {
    public static void main(String[] args) {
        GoodComponent solution = new GoodComponent();

        int e1 = 3;
        int v1 = 3;
        int[][] edges1 = { {1, 2}, {1, 3}, {3, 2} };
        System.out.println(solution.findNumberOfGoodComponent(e1, v1, edges1)); // Output: 1

        int e2 = 5;
        int v2 = 7;
        int[][] edges2 = { {1, 2}, {7, 2}, {3, 5}, {3, 4}, {4, 5} };
        System.out.println(solution.findNumberOfGoodComponent(e2, v2, edges2)); // Output: 2
    }
}
