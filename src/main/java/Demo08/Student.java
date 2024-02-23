package Demo08;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author YwaiX
 * @Date 2024/2/23 20:05
 * @Description Student
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Comparable<Student> {
    private String name;
    private int age;
    
    @Override
    public int compareTo(Student o) {
        int num = this.age - o.age;
        int num2 = num == 0 ? this.name.compareTo(o.name) : num;
        return num2;
    }
}
