package test;

/**
 * @author ceshi
 * @Title: 继承AnimInterface接口
 * @Package test
 * @Description:
 * @date 2020/10/110:37
 */
public class PIg implements AnimInterface{
    public String type = "猪";

    @Override
    public void drink() {
        System.out.println("小猪喝水中");
    }

    @Override
    public void eat() {
        System.out.println("小猪在吃饭！");
    }
}
