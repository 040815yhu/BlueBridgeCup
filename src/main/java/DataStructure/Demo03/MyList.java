package DataStructure.Demo03;

/**
 * @Author YwaiX
 * @Date 2024/2/19 16:32
 * @Description MyList
 * 线性表(列表)的接口定义
 */
public interface MyList {
    /**
     * 新增一个元素
     *
     * @param element
     */
    public void add(Object element);
    
    /**
     * 删除相同元素
     *
     * @param element
     */
    public void delete(Object element);
    
    /**
     * 根据索引删除元素
     *
     * @param index
     */
    public void delete(int index);
    
    /**
     * 将指定索引位置的元素替换成新元素
     *
     * @param index
     * @param newElement
     */
    public void update(int index, Object newElement);
    
    /**
     * 当前列表中是否含有target这个元素
     *
     * @param target
     * @return
     */
    public boolean contains(Object target);
    
    /**
     * 返回指定索引处的元素
     *
     * @param index
     * @return
     */
    public Object at(int index);
    
    /**
     * 查找element的索引,如果没有返回-1
     *
     * @param element
     * @return
     */
    public int indexOf(Object element);
}
