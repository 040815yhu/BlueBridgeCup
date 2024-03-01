package Demo07.List;

/**
 * @Author YwaiX
 * @Date 2024/2/22 17:33
 * @Description ListNode
 * 节点
 */
public class ListNode<T> {
    T data;
    ListNode<T> pre;
    ListNode<T> next;
    
    
    public ListNode(T data) {
        this.data = data;
    }
}
