public class Race {
    String leaderName = "";
    int leaderDistance = 0;

    public void drive (Auto auto){
        int distance = auto.speed * 24;
        if (distance > leaderDistance){
            leaderName = auto.name;
            leaderDistance = distance;
        }
    }
}
