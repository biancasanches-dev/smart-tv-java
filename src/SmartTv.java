import java.io.IOException;

public class SmartTv {
    boolean isOn = false;
    int channel = 10;
    int volume = 30;

    public void setOn () {
        isOn = true;
    }

    public void setOff () {
        isOn = false;
    }

    public void increaseVolume () {
        volume++;
        System.out.println("Aumentando volume: " + volume);
    }

    public void decreaseVolume () {
        volume --;
        System.out.println("Diminuindo volume: " + volume);
    }

    public void increaseChannel () {
        channel++;
        System.out.println("Aumentando canal: " + channel);
    }

    public void decreaseChannel () {
        volume --;
        System.out.println("Diminuindo canal: " + channel);
    }

    public void setChannel (int newChannel) {
       channel = newChannel;
    }

}


