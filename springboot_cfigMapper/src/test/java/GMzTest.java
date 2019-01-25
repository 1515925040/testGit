import com.dyq.MyApplication;
import com.dyq.dao.StudentMapper;
import com.dyq.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 丁艳青
 * @site www.dyq.com
 * @company xxx
 * @create 2019-01-21 21:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyApplication.class)
public class GMzTest {
    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void test1(){
        Student student = studentMapper.selectByPrimaryKey(96);
        System.out.println(student);
    }
}
