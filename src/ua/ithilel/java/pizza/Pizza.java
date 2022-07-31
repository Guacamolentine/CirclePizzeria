package ua.ithilel.java.pizza;

public class Pizza {

    private Composition[] compositions;
    private String name;
    private int cost;
    private double basis;

    public Pizza(String name, int cost, double basis) {
        this.name = name;
        this.cost = cost;
        this.basis = basis;
    }
    public Composition[] getCompositions(){
        return compositions;
    }
    public void setCompositions(Composition[] compositions){
        this.compositions = compositions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public double getBasis() {
        return basis;
    }

    public void setBasis(double basis) {
        this.basis = basis;
    }
}
