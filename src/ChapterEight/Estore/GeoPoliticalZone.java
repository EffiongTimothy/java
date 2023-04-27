package ChapterEight.Estore;

public enum GeoPoliticalZone {
    NORTH_CENTRAL(new String[]{"Benue", "FCT","Kogi","Kwara","Nasarawa","Niger","Plateau"}),
    NORTH_EAST(new String[]{"Adamawa","Bauchi","Borno","Gombe","Taraba","Yobe"}),
    NORTH_WEST(new String[]{"Kaduna","kastina","Kano","Kebbi","Sokoto","Jigawa","Zamfara"}),
    SOUTH_EAST(new String[]{"Abia","Anambra","Ebonyi","Enugu","Imo"}),
    SOUTH_SOUTH(new String[]{"Awka-Ibom","Bayelsa","Cross-River","Delta","Edo","Rivers"}),
    SOUTH_WEST(new String[]{"Ekiti","Lagos","Osun","Ondo","Ogun","Oyo"});

private String[] zone;

GeoPoliticalZone(String[] state){
    this.zone = state;
}

    public String[] getZone() {
        return zone;
    }

    public void setZone(String[] zone) {
        this.zone = zone;
    }

//public static GeoPoliticalZone stateOfInstance(String name){
//
//}
//    for (GeoPoliticalZone zone:GeoPoliticalZone.values()) {
//        System.out.println();
//}
}
