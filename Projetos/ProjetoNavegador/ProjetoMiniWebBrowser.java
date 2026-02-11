
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.web.WebView;

public class ProjetoMiniWebBrowser extends Application{

    @Override
    public void start(Stage palco){
        TextField campoURL = new TextField();
        WebView navegador = new WebView();
        WebEngine motor = navegador.getEngine();

        //Carregar uma página da web quando o usuário pressiona Enter
        campoURL.setOnAction(evento -> motor.load(campoURL.getText()));

        VBox vbox = new VBox();
        vbox.getChildren().addAll(campoURL, navegador);
        Scene cena = new Scene(vbox);

        palco.setTitle("Meu Browser Java");
        palco.setScene(cena);
        palco.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}