import com.dyq.MyApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 丁艳青
 * @site www.dyq.com
 * @company xxx
 * @create 2019-02-08 20:31
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyApplication.class)
public class ShiroTest1 {
    @Test
    public void test1(){
        System.out.println("aa");
    }
}
