package itb.cat.m05.recuperacio.uf2.examen;

import java.util.Comparator;

public class FesAlgunaCosa implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}
