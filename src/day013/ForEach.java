package day013;

public class ForEach {
    public static void main(String[] args) {
        String[] gunler={"Pazartesi","Sali","Carsamba","Persembe","Cuma","Cumartesi","Pazar"};
        System.out.println("Dizinin eleman Sayisi: "+gunler.length);
     /*   for (int i=0;i< gunler.length;i++){
            System.out.println(i);
        }*/
        //Lombok kutuphanesi-clean kod icin
        //For Each Dongusu
        for (String gun:gunler){
            System.out.println(gun);

        }
        //compexity
    }
}
