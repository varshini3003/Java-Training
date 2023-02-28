package Builder;

public class BuilderDemo {
    public static void main(String[] args) {
        Task task = new TaskBuilder(5).setDescription("My task").setSummary("Test").build();
        System.out.println(task);
    }
}
