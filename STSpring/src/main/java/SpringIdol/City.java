package SpringIdol;

public class City {
    public void setName(String name) {
        this.name = name;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public Integer getPopulation() {
        return population;
    }

    private String name;
    private String state;
    private Integer population;
}
