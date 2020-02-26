package spring.beans;

public class Flavor {
    private int flavor_id;
    private String flavor_name;

    public Flavor() {
    }

    public int getFlavor_id() {
        return flavor_id;
    }

    public void setFlavor_id(int flavor_id) {
        this.flavor_id = flavor_id;
    }

    public String getFlavor_name() {
        return flavor_name;
    }

    public void setFlavor_name(String flavor_name) {
        this.flavor_name = flavor_name;
    }
}
