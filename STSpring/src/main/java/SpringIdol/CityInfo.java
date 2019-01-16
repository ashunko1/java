package SpringIdol;

public class CityInfo implements Information{
    private City city;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public void showInfo() {
        if(city == null)
            System.out.println("City information not found");
        else {
            System.out.println("Informations about " + city.getName() + ":");
            System.out.println("State " + city.getState());
            System.out.println("Population " + city.getPopulation());
        }
    }
}
