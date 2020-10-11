import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

/**
 * 简单数据驱动测试类
 */
@RunWith(Parameterized.class)
public class LoginParamTest {
    private Login login = new Login();
    private static String userName;
    private static String passWord;
    private static String expectMsg;
    public LoginParamTest(String userName, String passWord, String expectMsg) {
        this.passWord = passWord;
        this.userName = userName;
        this.expectMsg = expectMsg;
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void login() {
        login.login(userName, passWord);
        assertEquals("登录测试结果", expectMsg, login.getLoginMassage());
    }

    @Parameterized.Parameters
    public static Object[][] loginData() {
        Object[][] loginData = new Object[][] {
                {"yd", "123456", "登录成功"},
                {"yd", "", "登录失败，用户名或密码错误"},
                //手动添加一个断言不成功的用例
                {"yd", null, "登录失败，密码不能为空"},
                {null, "123456", "登录失败，用户名或密码不能为空"},
                {"yd1", "123456", "登录失败，用户名或密码错误"},
                {"yd", "1234", "登录失败，用户名或密码错误"},
        };
        return loginData;
    }

}