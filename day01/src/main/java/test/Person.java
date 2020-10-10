package test;

/**
 * @author ceshi
 * @Title: 继承
 * @Package test
 * @Description:
 * @date 2020/10/110:39
 */
public class Person implements AnimInterface{
    public String type = "人";

    @Override
    public void drink() {
        System.out.println("人用杯子装水喝");
    }

    @Override
    public void eat() {
        System.out.println("天哪，他在吃鸡腿！！！");
    }
}
