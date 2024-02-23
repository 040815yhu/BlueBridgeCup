package Demo04.List;

/**
 * @Author YwaiX
 * @Date 2024/2/22 19:27
 * @Description SingleLinkedList
 */
public class SingleLinkedList implements MyList {
    private ListNode first;
    private ListNode last;
    private int size;
    
    @Override
    public void add(Object element) {
        if (first == null){
            first = new ListNode(element);
            last = first;
        }else {
            last.next = new ListNode(element);
            last = last.next;
        }
        size++;
    }
    
    @Override
    public void delete(Object element) {
        ListNode p = first;
        ListNode pre = null;
        while (p != null){
            if (p.data.equals(element)){
                if (p == first){
                    first = first.next;
                }else {
                    pre.next = p.next;
                }
            }
            pre = p;
            p = p.next;
        }
    }
    
    @Override
    public void delete(int index) {
    
    }
    
    @Override
    public void update(int index, Object newElement) {
    
    }
    
    @Override
    public boolean contains(Object target) {
        return false;
    }
    
    @Override
    public Object at(int index) {
        return null;
    }
    
    @Override
    public int indexOf(Object element) {
        return 0;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        ListNode p = first;
        while(p != null){
            sb.append(p.data);
            if (p.next != null){
                sb.append(",");
            }
            p=p.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
