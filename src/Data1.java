public class Data1 extends AbstractDatabase {
    @Override
    void update() {
        System.out.println("data1 güncelledi");
    }

    @Override
    void get() {
        System.out.println("data1 verileri aldı");
    }
}
