package graphs;

public class ArticulationPoint {

    /*
    *
    * Given an undirected and connected graph. connected graph meaning all the vertices are connected and reached from any vertex.
    *
    * Articulation point :-
    *
    *           -> these are the vertices , on removal of those we create multiple components
    *
    *
    * SImpel sol :-
    *       -> delte each node and check if the number of componets increase and greater than 1 . then it is an articulation point
    *
    *               -> rmoving a vertex
    *               -> counting no of comonents using kosaraju or tarzans algorithm
    *
    *
    *
    * Efficient sol :-
    *
    *       -> in dfs if the root vertex has 2 or more children then it is called an articulation point
    *
    *               -> it only work for root node. you can do dfs with all the vertices on by once as source.
    *
    *
    *
    *       Second efficent idea for non root nodes :-
    *
    *               -> if u is a non root node and  has a child v , such that no ancestors are reachable from the subtree
    *                   rooted with v , then u is an articulation point.
    *
    *
    *       -> We can also find articualtion point using tarzans algorithm.
    *
    *
    *       implementaiotn :-
    *
    *               -> keeps track of discovery time of each vertex in dfs and also low (i) - means lowest reachable discouvery time
    *
    *                       -> for non root nodes
    *
    *                               check if low [adj) >= dis(u)
    *
    *
    * */


}
