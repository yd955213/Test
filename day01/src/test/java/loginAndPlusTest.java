import org.junit.runner.RunWith;
import org.junit.runners.Suite;
/**
 * @author yd
 * @Title: TestSuite
 * @Package java
 * @Description: 这是一个TestSuite, 用于管理执行测试类：LoginParamTest、LoginTest
 * @date 2020/10/11 14:08
 */
@RunWith(Suite.class)
//根据Suite.SuiteClasses里面写的类的顺序依次执行测试用例
@Suite.SuiteClasses({LoginParamTest.class, LoginTest.class})
public class loginAndPlusTest {

}
