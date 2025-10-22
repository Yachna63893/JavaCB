package Graph;

import java.util.*;

public class Graph_Bipartite {
    class Solution{
        public boolean isBipartite(int[][] graph) {
            Queue<BipartitePair> q = new LinkedList<>();
            //BFT because disconnected bhi ho sakte hain
            //Visited k liye map lenge beacuse dist store karna hai
            HashMap<Integer, Integer> visited = new HashMap<>();
            for(int i=0; i<graph.length; i++){
                if(visited.containsKey(i)){
                    continue;
                }
                q.add(new BipartitePair(i,0));
                while (!q.isEmpty()) {
                    //1.remove
                    BipartitePair rp = q.poll();
                    //2.ignore if already visited
                    if(visited.containsKey(rp.vtx)){
                        if(visited.get(rp.vtx) != rp.dis){
                            return false;
                        } 
                        continue;
                    }
                    //3.marked visited
                    visited.put(rp.vtx, rp.dis);
                    //4.self work
                    //5.Add unvisited nbrs
                    for(int nbrs:graph[rp.vtx]){
                        if(!visited.containsKey(nbrs)){
                            q.add(new BipartitePair(nbrs, rp.dis+1));
                        }
                    }
                }
            }
            return true;
        }
    }
    class BipartitePair{
        int vtx;
        int dis;
        public BipartitePair(int vtx, int dis){
            this.vtx = vtx;
            this.dis = dis;
        }

    }
}
