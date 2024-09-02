public class Smartphone {
    private String smartphone;
    public Smartphone(String smartphone){
        this.smartphone = smartphone;
    }

    public String getSmartphone() {
        return smartphone;
    }

    public void setSmartphone(String smartphone) {
        this.smartphone = smartphone;
    }

    @Override
    public String toString() {
        return smartphone;
    }
}