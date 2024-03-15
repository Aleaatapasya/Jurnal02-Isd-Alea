import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) {
        GenArrayList<Atk> daftarAtk = new GenArrayList<>(5);
        GenArrayList<Bag> daftarBag = new GenArrayList<>(5);
        daftarAtk.addData(new Atk("A1001", "Cat Air", "Joyko", 10));
        daftarAtk.addData(new Atk("A1002", "Rautan", "Faber Castel", 20));
        daftarAtk.addData(new Atk("A1003", "Spidol", "Snowman", 35));
        daftarAtk.addData(new Atk("A1004", "Kertas Hvs", "Sidu", 50));
        daftarAtk.addData(new Atk("A1005", "Pulpen", "Kenko", 15));

        daftarBag.addData(new Bag("B2001", "Sling Bag", "Charles & Keith", 5));
        daftarBag.addData(new Bag("B2001", "Waist Bag", "Eiger", 15));
        daftarBag.addData(new Bag("B2001", "Hand Bag", "Elizabeth", 25));
        daftarBag.addData(new Bag("B2001", "Tote Bag", "Hush Puppies", 30));
        daftarBag.addData(new Bag("B2001", "Backpack", "Fjallraven Kanken", 40));

        daftarAtk.display();
        daftarBag.display();
    }
}
