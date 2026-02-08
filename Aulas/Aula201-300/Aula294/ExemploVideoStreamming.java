import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.web.WebView;

public class ExemploVideoStreamming extends Application {
    
    @Override
    public void start(Stage palco) {
        WebView webView = new WebView();

        String urlVideo;
        urlVideo = "https://youtu.be/k1OPjH0a3xs?si=BTGeI19_L4W_aCkP";

        webView.getEngine().load(urlVideo);
        Scene cena = new Scene(webView, 800, 600);

        palco.setTitle("Exemplo de Vídeo de Streamming");
        palco.setScene(cena);
        palco.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}