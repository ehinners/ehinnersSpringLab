package spring.beans;

///////////////////////////////////////////////////////NEEDS REWORK//////////////////////////////////////////////////

public class Flavor_Profile {
    private int snack_id;
    private int flavor_id;

    public Flavor_Profile() {
    }

    public int getSnack_id() {
        return snack_id;
    }

    public void setSnack_id(int snack_id) {
        this.snack_id = snack_id;
    }

    public int getFlavor_id() {
        return flavor_id;
    }

    public void setFlavor_id(int flavor_id) {
        this.flavor_id = flavor_id;
    }
}
