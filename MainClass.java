import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        doubleLinkedList daftar = new doubleLinkedList();

        while (true) {
            // print menu pilihan
            System.out.println("1. Input Tugas");
            System.out.println("2. Delete Tugas");
            System.out.println("3. Lihat List Tugas");
            System.out.println("4. Lihat List Tugas Terurut");
            System.out.println("5. Keluar");

            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                // jika user memilih menu 1. Input Tugas
                case 1:
                    System.out.println("Masukkan nama mata kuliah =");
                    String inputMatkul = input.nextLine();
                    System.out.println("Masukkan nama tugas =");
                    String inputTugas = input.nextLine();
                    System.out.println("Masukkan deadline =");
                    String inputDeadline = input.nextLine();
                    tugas tugasBaru = new tugas(inputMatkul, inputTugas, inputDeadline);
                    daftar.inputData(tugasBaru);
                    break;

                // jika user memilih menu 2. Delete Tugas
                case 2:
                    System.out.println("Pilih hapus?");
                    System.out.println("1. hapus depan?");
                    System.out.println("2. hapus belakang?");

                    int pilihanHapus = input.nextInt();
                    if (pilihanHapus == 1) {
                        daftar.hapusDataDepan();
                    } else if (pilihanHapus == 2) {
                        daftar.hapusDataBelakang();
                    }
                    break;

                // jika user memilih menu 3. Lihat List Tugas
                case 3:
                    daftar.tampilan();
                    break;

                // jika user memilih menu 4. Lihat List Tugas Terurut
                case 4:
                    System.out.println("Pilih kriteria pengurutan:");
                    System.out.println("a. Deadline");
                    System.out.println("b. Nama Mata Kuliah");
                    System.out.println("c. Nama Tugas");
                    String kriteria = input.nextLine();
                    Comparator<tugas> comparator = null;

                    switch (kriteria) {
                        case "a":
                            comparator = Comparator.comparing(tugas::getDeadline);
                            break;
                        case "b":
                            comparator = Comparator.comparing(tugas::getMatkul);
                            break;
                        case "c":
                            comparator = Comparator.comparing(tugas::getNamaTugas);
                            break;
                        default:
                            System.out.println("Pilihan tidak valid");
                            continue;
                    }

                    daftar.tampilanTerurut(comparator);
                    break;

                // jika user memilih menu 5. Keluar
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("kelebihan bang");
            }

        }
    }

}
