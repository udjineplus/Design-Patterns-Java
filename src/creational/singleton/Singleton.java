package creational.singleton;

class Singleton {

    private static Singleton instance;

    private String singletonData = "";

    private Singleton() {}

    static synchronized Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    void singletonOperation() {
        singletonData = "singleton date";
    }

    String getSingletonData() {
        return singletonData;
    }
}
