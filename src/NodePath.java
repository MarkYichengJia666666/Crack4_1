import com.sun.corba.se.impl.orbutil.graph.Graph;
import java.util.LinkedList;

/**
 * Created by jiayicheng on 17/7/31.
 */

public class NodePath {
    enum State {Unvisited, Visiting, Visited;}

    boolean search(Graph g, Nde start, Nde end) {
        if (start == end) return true;

        LinkedList<Nde> graph = new LinkedList<Nde>();//里面存的是Node，所以要用链表实现队列操作

        //   a.state = State.Unvisited;//给所有的点都赋值未经历。
        Nde u;
        start.state = State.Visiting;
        graph.addLast(start);

        while (graph != null) {
            u = graph.removeFirst();
            if (u != null) {
                for (Nde v : u.getAdjacent()) {
                    if (v.state == State.Unvisited)
                    {
                        if (v == end)
                            return true;
                        else {
                            v.state = State.Visiting;
                            graph.addLast(v);
                        }
                    }
                }
                u.state = State.Visited;
            }

        }
        return false;
    }
}
