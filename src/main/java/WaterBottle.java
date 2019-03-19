public class WaterBottle {

    private int volume;

    public WaterBottle(){
        volume = 100;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void empty(){
        this.volume = 0;
    }

    public void drink(){
        if (this.volume >=10){
            this.volume -= 10;
        } else {
            this.empty();
        }
    }

    public void fill(){
        this.volume=100;
    }
}
