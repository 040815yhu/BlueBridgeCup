package DataStructure.Demo03;

/**
 * @Author YwaiX
 * @Date 2024/2/19 16:32
 * @Description MyList
 * 线性表(列表)的接口定义
 */
public interface MyList<E> {
    /**
     * 添加元素
     * @param element 要添加的元素
     */
    void add(E element);
    
    /**
     * 在指定位置添加元素
     * @param index 指定位置
     * @param element 添加元素
     */
    void add(int index , E element);
    
    /**
     * 删除元素
     * 根据元素删除
     * @param element 要删除的元素
     * @return 返回是否删除成功
     */
    boolean remove(E element);
    
    /**
     * 根据下标删除元素
     * @param index 要删除的元素下标
     */
    E remove(int index);
    
    /**
     * 修改元素
     * @param index 要修改的元素下标
     * @param element 修改后的元素
     */
    E set(int index , E element);
    
    /**
     * 查询元素是否在集合中存在
     * @param o 要查询的元素
     * @return 返回一个布尔值表示是否存在
     */
    boolean contains(Object o);
    
    /**
     * 返回当前下标的元素
     * @param index 元素下标
     * @return 返回当前下标的元素
     */
    E get(int index);
    
    /**
     * 返回元素的下标
     * @param o 元素
     * @return 返回元素的下标
     */
    int indexOf(Object o);
    
    /**
     * 返回元素个数
     * @return 元素个数
     */
    int size();
    
    /**
     * 结合判空
     * @return 如果集合为空返回false,否则返回true
     */
    boolean isEmpty();
}
