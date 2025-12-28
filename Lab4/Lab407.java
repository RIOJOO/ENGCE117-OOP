class Resource {
    private String id;

    public Resource(String id) {
        this.id = id;
        System.out.println("Resource " + id + " created.");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Resource " + id + " finalized (destroyed).");
        super.finalize();
    }
}

public class Lab407 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        Resource r1 = new Resource(sc.next());
        Resource r2 = new Resource(sc.next());
        Resource r3 = new Resource(sc.next());

        r1 = null; r2 = null;
        System.gc();

        r3 = null;
        System.gc();
    }
}