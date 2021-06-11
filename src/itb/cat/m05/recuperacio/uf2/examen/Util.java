package itb.cat.m05.recuperacio.uf2.examen;

import java.util.Collections;
import java.util.List;

public class Util {

    public List<Integer> metodeSenseNomClarEncara(List<Integer> a) {
        Collections.sort(a, new FesAlgunaCosa());
        return a;
    }
}
