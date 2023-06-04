public class Plate {
    private int food;
    public Plate(int food) {
        if (food < 0) this.food = 0;
        else this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int inFood) {
        if (inFood < this.food)
            this.food = inFood;
    }

    public void addFood(int addfood) {
        this.food = this.food + addfood;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}