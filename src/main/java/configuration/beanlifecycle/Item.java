package configuration.beanlifecycle;

public class Item {
    //fabric method is the only chance to create an instance of class
    private Item(){}

    public static Item getInstance(){
        System.out.println("Creating new...");
        return new Item();
    }
    public void doSomething() {
        System.out.println("Item is discovering Spring Boot " + this);
    }

    //prototype does not call destroy method
    private void anyNameDestroy() {
        System.out.println("Destruction..." + this);
    }

    public void anyNameInit() {
        System.out.println("Initialisation..." + this);
    }
}
