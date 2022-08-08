package day013;

public class Yagislar {
    public static void main(String[] args) {
        String[] aylar={"Ocak","Subat","Mart","Nisan",
                "Mayis","Haziran","Temmuz","Agustus",
                "Eylul","Ekim","Kasim","Aralik"};
        double[] yagislar={40.5,35.3,39.3,42.2,51.3,35.2,
        14.1,12.5,18.0,27.5,31.5,44.6};
        //Yillik toplam yagis miktari
        //En cok yagis olan ay?
        //En az yagis alan ay?
        double toplam=0.0;
        double enFazla=0.0;
        int index=0;
        int enAz=0;
        for (int i=0;i<yagislar.length;i++){
            toplam+=yagislar[i];

            if (yagislar[i]>enFazla){

                enFazla = yagislar[i];
                index=i;

            }
        }
        System.out.println("En fazla"+enFazla);
        System.out.println("Ay :" +aylar[index]);
        System.out.println(String.format("Toplam yagis miktari= %5.1f",toplam));
    }

}
