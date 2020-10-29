package bfs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * The type Breadth first search test.
 */
@DisplayName("BFS")
class BreadthFirstSearchTest {

    private static Map<String, List<String>> graph = new HashMap<>();

    /**
     * Find seller.
     */
    @Test
    void findSeller() {
        graph.put("you", Arrays.asList("alice", "bob", "claire"));
        graph.put("bob", Arrays.asList("anuj", "peggy"));
        graph.put("alice", Arrays.asList("peggy"));
        graph.put("claire", Arrays.asList("thom", "jonny"));
        graph.put("anuj", Collections.emptyList());
        graph.put("peggy", Collections.emptyList());
        graph.put("thom", Collections.emptyList());
        graph.put("jonny", Collections.emptyList());
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        final boolean you = bfs.search(graph, "you");
        System.out.println("Found? "+you);
    }
}