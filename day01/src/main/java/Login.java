/**
 * @author yd
 * @Title: 用户登录类
 * @Package JUnitTestSimple
 * @Description:这是一个用户登录类,用于JUnit测试
 * @date 2020/10/11 09:29
 */
public class Login {
    private String loginMassage = "";
    public boolean login(String userName, String passWord) {
        boolean isOk = false;
        if (null != userName && null != passWord) {
            if (userName.equals("yd") && passWord.equals("123456")) {
                loginMassage = "登录成功";
                isOk = true;
            }else {
                loginMassage = "登录失败，用户名或密码错误";
            }
        }else {
            loginMassage = "登录失败，用户名或密码不能为空";
        }
        return isOk;
    }

    public String getLoginMassage() {
        return loginMassage;
    }
}
