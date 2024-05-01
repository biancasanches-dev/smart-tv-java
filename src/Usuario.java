public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("-----------Tv desligada-------------- \n" );

        smartTv.isOn = true;

        System.out.println("Ligou a tv");
        System.out.println("Canal atual: " + smartTv.channel);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.setChannel(15);
        System.out.println("\nNovo canal: " + smartTv.channel);

        smartTv.increaseChannel();

        smartTv.decreaseVolume();
        smartTv.decreaseVolume();
    }
}