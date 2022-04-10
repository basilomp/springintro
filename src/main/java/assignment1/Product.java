package assignment1;

public class Product {
    private int id;
    private String title;
    private int cost;

    public Product(int id, String tile, int cost) {
        this.id = id;
        this.title = tile;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", cost='" + cost + " RUR"+ '\'' +
                '}';
    }
}
