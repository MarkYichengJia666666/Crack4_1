/**
 * Created by jiayicheng on 17/7/31.
 */
public class Nde {
    public int value;
    public Nde next;
    public enum state{Unvisited,Visiting,Visited;}
    public Nde(int value)
    {
        this.value=value;
    }

}
