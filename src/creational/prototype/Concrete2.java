package creational.prototype;

class Concrete2 extends Prototype {

    Concrete2(int id) {
        super(id);
    }

    @Override
    public Prototype clone() {
        return new Concrete2(id);
    }

}
