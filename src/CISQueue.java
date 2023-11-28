import java.util.LinkedList;

public class CISQueue {

    // Linked list property.
    private LinkedList<Integer> list;
    // Size property.
    private int size;
    // Constructor.
    public CISQueue(){
        this.list = new LinkedList<Integer>();
        this.size = 0;
    }
    // Enqueue. This method adds a node to the end of the linked list.
    public void enqueue(int a){
        list.push(a);
        size +=1;
    }
    // Dequeue. This method removes a node from the beginning of the linked list.
    public Integer dequeue(){
        Integer a = null;
        if(size > 0){
            a = list.pop();
            size -=1;
        }
        return a;
    }
    // isEmpty. Returns a boolean indicating whether the linked list is empty.
    public boolean isEmpty(){
        if (size > 0){
            return false;
        }
        return true;
    }
    // size. Returns the size of the queue.
    public int size(){
        return size;
    }
    // toString. Returns a description of the queue in, for example, the following format:
    // CISQueue{queue=[7, 11], size=2}

    @Override
    public String toString() {

        return "CISQueue{" +
                "queue=" + list +
                ", size=" + size +
                '}';
    }
}
