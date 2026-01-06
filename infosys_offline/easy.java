package infosys_offline;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class easy {
    public static int dfs(int node, int parent, int sum, List<List<Integer>> adjList, List<Integer> values, int k) {
        int pathsTillNodeSubtree = 0;

        for (int neighbour : adjList.get(node)) {
            if (neighbour != parent) {
                int childPaths = dfs(neighbour, node, sum + values.get(neighbour), adjList, values, k);
                pathsTillNodeSubtree += childPaths;
            }
        }

        boolean isLeaf = true;
        for (int nei : adjList.get(node)) {
            if (nei != parent) {
                isLeaf = false;
                break;
            }
        }

        if (isLeaf && sum % k == 0) {
            return 1;
        }

        return pathsTillNodeSubtree;
    }

    public static int checkLuckyPaths(int n, int k, List<List<Integer>> edges, List<Integer> values) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 1; i < edges.size(); i++) {
            List<Integer> edge = edges.get(i);
            int u = edge.get(0) - 1;
            int v = edge.get(1) - 1;
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        int paths = dfs(0, -1, values.get(0), adjList, values, k);
        return paths;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        List<List<Integer>> edges = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            String[] arr = line.trim().split("\\s+");

            int u = Integer.parseInt(arr[0]);
            int v = Integer.parseInt(arr[1]);
            edges.add(Arrays.asList(u, v));
        }

        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            values.add(Integer.parseInt(br.readLine()));
        }

        int res = checkLuckyPaths(n, k, edges, values);
        bw.write(res + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}