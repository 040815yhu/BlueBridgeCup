package Demo07.List;

/**
 * @Author YwaiX
 * @Date 2024/2/23 13:51
 * @Description DoubleLinkList
 */
public class DoubleLinkList<T> implements MyList<T> {
    private ListNode<T> first = new ListNode<T>(null);
    private ListNode<T> last = new ListNode<T>(null);
    private int size;
    
    public DoubleLinkList() {
        first.next = last;
        last.pre = first;
    }
    
    @Override
    public void add(T element) {
        ListNode<T> newNode = new ListNode<T>(element);
        last.pre.next = newNode;
        newNode.next = last;
        newNode.pre = last.pre;
        last.pre = newNode;
        size++;
    }
    
    @Override
    public void delete(T element) {
        ListNode<T> p = first.next;
        while (p != last) {
            if (p.data.equals(element)) {
                p.pre.next = p.next;
                p.next.pre = p.pre;
                p.next = null;
                p.pre = null;
                size--;
                break;
            }
            p = p.next;
        }
    }
    
    @Override
    public void delete(int index) {
        if (index < 0 || index >= size) {
            return;//啥也不干
        }
        int i = 0;//指针指向的节点的索引
        ListNode<T> p = first.next;
        while (p != last) {
            if (i == index) {
                p.pre.next = p.next;
                p.next.pre = p.pre;
                p.next = null;
                p.pre = null;
                size--;
                break;
            }
            p = p.next;
            i++;
        }
    }
    
    @Override
    public void update(int index, T newElement) {
        if (index < 0 || index >= size) {
            return;
        }
        int i = 0;//指针指向的节点的索引
        ListNode<T> p = first.next;
        while (p != last) {
            if (i == index) {
                p.data = newElement;
            }
            p = p.next;
            i++;
        }
    }
    
    @Override
    public boolean contains(T target) {
        ListNode<T> p = first.next;
        while (p != last) {
            if (p.data.equals(target)) {
                return true;
            }
            p = p.next;
        }
        return false;
    }
    
    @Override
    public T at(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        int i = 0;//指针指向的节点的索引
        ListNode<T> p = first.next;
        while (p != last) {
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
        ListNode<T> p = first.next;
        while (p != last) {
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
        ListNode<T> p = first.next;
        while (p != last) {
            sb.append(p.data);
            if (p.next != last) {
                sb.append(",");
            }
            p = p.next;
        }
        sb.append("]");
        return sb.toString();
    }
    
    private ListNode<T> now = first;
    
    @Override
    public boolean hasNext() {
        return now.next != last;
    }
    
    @Override
    public T next() {
        ListNode<T> next = now.next;
        now = now.next;
        return next.data;
    }
}
