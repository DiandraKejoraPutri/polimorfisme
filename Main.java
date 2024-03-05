package polimorfisme;

public class Main {
    public static void main(String[] args) {
        
         bangundatar BangunDatar = new bangundatar();
         persegi Persegi = new persegi(4);
         segitiga Segitiga = new segitiga(6,3);
         lingkaran Lingkaran = new lingkaran(50);
         
         BangunDatar.luas();
         BangunDatar.keliling();
         
         System.out.println("Luas persegi: "+ Persegi.luas());
         System.out.println("keliling persegi: " + Persegi.keliling());
         System.out.println("Luas segitiga: " + Segitiga.luas());
         System.out.println("Luas lingkaran: " + Lingkaran.luas());
         System.out.println("keliling lingkaran: " + Lingkaran.keliling());
    }
}
