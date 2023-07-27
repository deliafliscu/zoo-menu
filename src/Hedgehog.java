class Hedgehog {
    private String name;

    public Hedgehog(String name) {
        this.name = name;
        System.out.println("Hi, my name is " + name + ".");
    }

    public String getName() {
        return name;
    }
}