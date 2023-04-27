package ChapterEight.Estore;

public class State {
    private  GeoPoliticalZone zone;



    public State(GeoPoliticalZone zone) {
        this.zone = zone;
    }

    public void setZone(String zone) {
        this.zone = GeoPoliticalZone.valueOf(zone);
    }
    public GeoPoliticalZone getZone() {
        return zone;
    }
}
