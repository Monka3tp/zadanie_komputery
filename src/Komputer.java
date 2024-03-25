public interface Komputer extends Comparable<Komputer>{
    void uruchom();
    void zepsujSie();

    @Override
    default int compareTo(Komputer o){
        String nazwa = getClass().getName();
        String nazwaDruga = o.getClass().getName();
        return nazwa.compareTo(nazwaDruga);
    }
}