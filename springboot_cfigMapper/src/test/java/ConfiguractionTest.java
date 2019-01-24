import com.alibaba.druid.pool.DruidDataSource;
import com.dyq.MyApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 丁艳青
 * @site www.dyq.com
 * @company xxx
 * @create 2019-01-21 21:16
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyApplication.class)
public class ConfiguractionTest {
    @Autowired
    private DruidDataSource druidDataSource;
    @Test
    public void test(){
        String driverClassName = druidDataSource.getDriverClassName();
        System.out.println(driverClassName);
    }
}
