
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.web.WebView;
import javafx.scene.web.WebEngine;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;


public class ProjetoMiniWebBrowser extends Application{

    @Override
    public void start(Stage palco){
        TextField campoURL = new TextField();
        WebView navegador = new WebView();
        WebEngine motor = navegador.getEngine();

        //Carregar uma página da web quando o usuário pressiona Enter
        campoURL.setOnAction(evento -> motor.load(formataURL(campoURL.getText())));

        Button botaoVoltar = new Button("← Voltar");

        botaoVoltar.setOnAction(e -> {
            if (motor.getHistory().getCurrentIndex() > 0) {
                motor.getHistory().go(-1);
            }
        });

        HBox barra = new HBox(botaoVoltar, campoURL);

        VBox vbox = new VBox();
        vbox.getChildren().addAll(barra, navegador);

        Scene cena = new Scene(vbox);

        palco.setTitle("Meu Browser Java");
        palco.setScene(cena);
        palco.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

    //Método para inserir http se o usuário não digitar
    public String formataURL(String url){
        if (!url.startsWith("http://") && !url.startsWith("https://")){
            url = "http://" + url;
        }
        return url;
    }
}