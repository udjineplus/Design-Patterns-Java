package creational.builder;

class Foreman {

    private Builder builder = null;

    Foreman(Builder builder) {
        this.builder = builder;
    }

    void construct() {
        builder.buildBasement();
        builder.buildStorey();
        builder.buildRoof();
    }
}
