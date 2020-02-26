package spring.beans;

public class Snack_Detail {
    private int snack_id;
    private String description;
    private int servings;
    private int times_ordered;

    public Snack_Detail() {
    }

    public int getSnack_id() {
        return snack_id;
    }

    public void setSnack_id(int snack_id) {
        this.snack_id = snack_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public int getTimes_ordered() {
        return times_ordered;
    }

    public void setTimes_ordered(int times_ordered) {
        this.times_ordered = times_ordered;
    }
}
