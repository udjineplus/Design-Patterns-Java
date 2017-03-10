package creational.prototype;

class Concrete1 extends Prototype {

    Concrete1(int id) {
        super(id);
    }

    @Override
    public Prototype clone() {
        return new Concrete1(id);
    }

}
