package DoanhThu;

import java.time.LocalDateTime;

public class SuKienMotLan extends SuKien {

    private LocalDateTime date;
    private int giatri;

    public SuKienMotLan(LocalDateTime ngay, String tenSK, String loaiSK, int giaTri) {
        super(tenSK, loaiSK);
        this.date = ngay;
        this.giatri = giaTri;
    }

    public int getGiatri() {
        return giatri;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
