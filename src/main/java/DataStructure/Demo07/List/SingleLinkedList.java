package DataStructure.Demo07.List;

/**
 * @Author YwaiX
 * @Date 2024/2/22 19:27
 * @Description SingleLinkedList
 */
public class SingleLinkedList<T> implements MyList<T> {
    private ListNode<T> first;
    private ListNode<T> last;
    private int size;
    
    @Override
    public void add(T element) {
        if (first == null) {
            first = new ListNode<T>(element);
            last = first;
        } else {
            last.next = new ListNode<T>(element);
            last = last.next;
        }
        size++;
    }
    
    @Override
    public void delete(T element) {
        ListNode<T> p = first;
        ListNode<T> pre = null;
        while (p != null) {
            if (p.data.equals(element)) {
                if (p == first) {
                    first = first.next;
                } else {
                    pre.next = p.next;
                }
                break;
            }
            pre = p;
            p = p.next;
        }
        size--;
    }
    
    @Override
    public void delete(int index) {
        if (index<0||index>=size){
            return;//啥也不干
        }
        int i = 0;//指针指向的节点的索引
        ListNode<T> p = first;
        ListNode<T> pre = null;
        while (p != null) {
            if (i == index) {
                if (p == first) {
                    first = first.next;
                } else {
                    pre.next = p.next;
                }
                break;
            }
            pre = p;
            p = p.next;
            i++;
        }
        size--;
    }
    
    @Override
    public void update(int index, T newElement) {
        if (index<0 ||index>=size){
            return;
        }
        int i = 0;//指针指向的节点的索引
        ListNode<T> p = first;
        while (p != null) {
            if (i == index) {
                p.data = newElement;
            }
            p = p.next;
            i++;
        }
    }
    
    @Override
    public boolean contains(T target) {
        ListNode<T> p = first;
        while (p != null) {
            if (p.data.equals(target)) {
                if (p == first) {
                    return true;
                }
            }
            p = p.next;
        }
        return false;
    }
    
    @Override
    public T at(int index) {
        if (index<0||index>=size){
            return null;
        }
        int i = 0;//指针指向的节点的索引
        ListNode<T> p = first;
        while (p != null) {
            if (i == index) {
                return p.data;
            }
            p = p.next;
            i++;
        }
        return null;
    }
    
    @Override
    public int indexOf(T element) {
        int i = 0;//指针指向的节点的索引
        ListNode<T> p = first;
        while (p != null) {
            if (p.data.equals(element)) {
                return i;
            }
            p = p.next;
            i++;
        }
        return -1;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        ListNode<T> p = first;
        while (p != null) {
            sb.append(p.data);
            if (p.next != null) {
                sb.append(",");
            }
            p = p.next;
        }
        sb.append("]");
        return sb.toString();
    }
    
    @Override
    public boolean hasNext() {
        return false;
    }
    
    @Override
    public T next() {
        return null;
    }
}
