public class mains {
    public static void main(String[] args) {
        fight f1 = new fight("Ahemt", 25, 100, 65,50);
        fight f2 = new fight("mehmet", 20, 100, 65,50);
        match match = new match(f1, f2, 70, 60);
        match.run();
    }
}