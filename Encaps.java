public class Encaps {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
    
public class Main {
    public static void main(String[] args) {
        Encaps obj = new Encaps();
        obj.setId(10);
        System.out.println("Id is: " + obj.getId());
    }
}
