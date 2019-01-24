import com.dyq.Application;
import com.dyq.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 丁艳青
 * @site www.dyq.com
 * @company xxx
 * @create 2019-01-22 19:36
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class AopTest {
    @Autowired
    private UserService userService;
    @Test
    public void test1(){
        userService.test01();
    }

}
