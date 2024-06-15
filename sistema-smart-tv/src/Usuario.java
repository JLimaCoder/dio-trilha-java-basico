public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();


        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual : " + smartTv.volume);
        

        System.out.println("Canal Atual : " +smartTv.canal);

        smartTv.mudarCanal(7);
        smartTv.mudarCanal(13);
        smartTv.mudarCanal(15);

        System.out.println("Canal Atual : " +smartTv.canal);


        System.out.println("TV LIGADA ? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo Status -> TV LIGADA ? " + smartTv.ligada);

        smartTv.desligar ();
        System.out.println("Novo Status -> TV LIGADA ? " + smartTv.ligada);



    }
}
