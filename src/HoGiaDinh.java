import java.util.List;

public class HoGiaDinh {
    private List<Nguoi> list;
    private String soNha;

    public HoGiaDinh(List<Nguoi> list, String soNha) {
        this.list = list;
        this.soNha = soNha;
    }

    public List<Nguoi> getList() {
        return list;
    }

    public void setList(List<Nguoi> list) {
        this.list = list;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    @Override
    public String toString() {
        return "HoGiaDinh{" +
                "list=" + list +
                ", soNha='" + soNha + '\'' +
                '}';
    }
}
