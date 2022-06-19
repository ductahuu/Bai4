import java.util.ArrayList;
import java.util.List;

public class KhuPho {
    List<HoGiaDinh> ls;

    public KhuPho() {
        this.ls = new ArrayList<>();
    }

    public List<HoGiaDinh> getLs() {
        return ls;
    }

    public void setLs(List<HoGiaDinh> ls) {
        this.ls = ls;
    }

    public void addHoGiaDinh(HoGiaDinh hoGiaDinh){
        this.ls.add(hoGiaDinh);
    }
}
