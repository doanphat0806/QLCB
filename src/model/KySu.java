package model;

public class KySu extends CanBo{
    private String nganhDaoTao;

    public KySu(String hoTen, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return "Kỹ Sư :" +
                "Họ Tên:'" + getHoTen() + '\'' +
                ", Tuổi:" + getTuoi() +
                ", Giới Tính:" + getGioiTinh().toString() +
                ", Địa Chỉ:'" + getDiaChi() + '\'' +
                ", Ngành Đào Tạo:'" + nganhDaoTao + '\''
                ;
    }
}

