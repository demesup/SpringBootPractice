package beanlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "beanLifecycleAppContext.xml"
        );

        Item item = context.getBean("item", Item.class);
        item.doSomething();

        for (int i = 0; i < 5; i++) {
            context.getBean("itemPrototype", Item.class).doSomething();
        }

        context.close();
    }
}
