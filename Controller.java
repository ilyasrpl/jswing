public class Controller {
    public static Controller instance;

    private Model model;
    private View view;
    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void keyPressed(int key) {
        // sementara sek
        this.view.textArea.append(String.valueOf(key));
    }
}