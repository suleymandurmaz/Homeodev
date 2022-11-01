public class Sguare {
    private int sideleng;

    public int getSideleng() {
        return sideleng;
    }

    public void setSideleng(int sideleng) {
        this.sideleng = sideleng;


    }

    public int countArea() {
        return sideleng * sideleng;
    }

    public int countPerimeter() {
        return 2 * (sideleng + sideleng);
    }

    public void showInfos() {
        System.out.println(countArea());
        System.out.println(countPerimeter());
    }
}
