package test;

/**
 * @author ceshi
 * @Title: Test1
 * @Package test
 * @Description:
 * @date 2020/10/110:19
 */
public class Test1 {
    public static void main(String[] args) {
        interface1 test = new interface1() {
            @Override
            public void eat() {
                System.out.println("少吃点，拒绝肥胖");
            }
        };
        test.eat();

        PIg pig = new PIg();
        System.out.println(pig.pet);
        System.out.println(pig.type);
        pig.drink();
        pig.eat();
        Person person = new Person();
        System.out.println(person.person);
        System.out.println(person.type);
        person.drink();
        person.eat();
    }


}
