package spring.beans;

public class Snack {
    private int snack_id;
    private String snack_name;
    private int type_id;
    private int tier;

    public int getSnack_id() {
        return snack_id;
    }

    public void setSnack_id(int snack_id) {
        this.snack_id = snack_id;
    }

    public String getSnack_name() {
        return snack_name;
    }

    public void setSnack_name(String snack_name) {
        this.snack_name = snack_name;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }
}
