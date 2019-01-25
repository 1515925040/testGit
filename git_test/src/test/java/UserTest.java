import com.dyq.entity.User;
import org.junit.Test;

/**
 * @author 丁艳青
 * @site www.dyq.com
 * @company xxx
 * @create 2019-01-24 22:22
 */

public class UserTest {
    @Test
    public void test1(){
        User user = new User();
        user.setUsername("丁艳青");
        user.setUid("1");
        System.out.println(user);
    }
}
