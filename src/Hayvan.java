public class Hayvan {
    private int yas;
    private double agırlık;
    private String isim;

    public Hayvan() {
    }

    public Hayvan(int yas, double agırlık, String isim) {
        this.yas = yas;
        this.agırlık = agırlık;
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getAgırlık() {
        return agırlık;
    }

    public void setAgırlık(double agırlık) {
        this.agırlık = agırlık;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
