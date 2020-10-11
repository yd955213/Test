import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginTest {
    private Login login = new Login();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void successLoginTest() {
        boolean result = login.login("yd", "123456");
        System.out.println(result);
        assertTrue(result);
    }
    @Test
    public void nullUserNameTest() {
        /*
        注意：这里使用null、""时结果是不一样的；null不等于""
        字符串为空判断
        String st = "123";
        if (null != st && st.length() > 0)
         */
        login.login(null, "123456");
        assertEquals("验证用户名为空的返回结果", "登录失败，用户名或密码不能为空", login.getLoginMassage());
    }
    @Test
    public void nullPassWordTest() {
        login.login("yd", null);
        assertEquals("验证用密码为空的返回结果", "登录失败，用户名或密码不能为空", login.getLoginMassage());
    }
    @Test
    public void failLoginTest() {
        login.login("yd", "123");
        assertEquals("验证用密码输入错误的返回结果", "登录失败，用户名或密码错误", login.getLoginMassage());
    }
}