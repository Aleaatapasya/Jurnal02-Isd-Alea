import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;

public class tugas implements Comparable<tugas> {
    String matkul;
    String namaTugas;
    String deadline;

    public tugas(String matkul, String namaTugas, String deadline) {
        this.matkul = matkul;
        this.namaTugas = namaTugas;
        this.deadline = deadline;

    }

    @Override
    public int compareTo(tugas other) {
        return this.deadline.compareTo(other.deadline);
    }

    // untuk mendapatkan nilai deadline, matkul, dan namaTugas
    public String getDeadline() {
        return deadline;
    }

    public String getMatkul() {
        return matkul;
    }

    public String getNamaTugas() {
        return namaTugas;
    }

    @Override
    public String toString() {
        return "Tugas [matkul=" + matkul + ", tugas=" + namaTugas + ", deadline=" + deadline + "]";
    }
}
