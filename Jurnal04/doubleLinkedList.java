import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;

public class doubleLinkedList {
    LinkedList<tugas> daftarTugas;

    public doubleLinkedList() {
        daftarTugas = new LinkedList<>();
    }

    // untuk input data
    public void inputData(tugas inputBaru) {
        daftarTugas.add(inputBaru);
        System.out.println("Tugas telah diinputkan");
    }

    // untuk hapus data bagian depan
    public void hapusDataDepan() {
        daftarTugas.removeFirst();
        System.out.println("Tugas telah dihapus");
    }

    // untuk hapus data bagian belakang
    public void hapusDataBelakang() {
        daftarTugas.removeLast();
        System.out.println("Tugas telah dihapus");
    }

    public void tampilan() {
        for (tugas Tugas : daftarTugas) {
            System.out.println("mata kuliah = " + Tugas.matkul);
            System.out.println("mata kuliah = " + Tugas.namaTugas);
            System.out.println("mata kuliah = " + Tugas.deadline);
        }

    }

    public void tampilanTerurut(Comparator<tugas> comparator) {
        LinkedList<tugas> sortedList = new LinkedList<>(daftarTugas);
        Collections.sort(sortedList, comparator);
        for (tugas tugas : sortedList) {
            System.out.println(tugas);
        }

    }
}