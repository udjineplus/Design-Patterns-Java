package creational.prototype;

abstract class Prototype {

    int id;

    Prototype(int id) {
        this.id = id;
    }

    public abstract Prototype clone();

}
