public class ToDoTester {
    public static void main(String[] args) {
        Task test = new Task("test", "3/5/2023");
        System.out.println(test.getEventName() + " " + test.getDue() + " " + test.isDone());
        //ToDoGUI gui = new ToDoGUI();
        OpenerGUI gui = new OpenerGUI();
    }
}