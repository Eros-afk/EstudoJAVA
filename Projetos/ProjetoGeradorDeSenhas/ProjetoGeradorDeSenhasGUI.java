import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class ProjetoGeradorDeSenhasGUI extends Application{
    @Override
    public void start(Stage palco){
        palco.setTitle("Gerador de Senhas");

        Label labelTamanhoSenha = new Label("Tamanho da senha: ");
        TextField campoTamanhoSenha = new TextField();
        campoTamanhoSenha.setText("8"); //Sugestão de tamanho de senha

        Label labelSenhaGerada = new Label("Senha gerada: ");
        TextField campoSenhaGerada = new TextField();
        campoSenhaGerada.setEditable(false);

        Button botaoGerar = new Button("Gerar Senha");
        botaoGerar.setOnAction(e -> {
            int tamanhoSenha = Integer.parseInt(campoTamanhoSenha.getText()); //Pego o tamanho desejado
            String senha = ProjetoGeradorDeSenhas.gerarSenha(tamanhoSenha); //Gera a senha
            campoSenhaGerada.setText(senha); //Mostro a senha gerada para o usuário
        });

        VBox caixa = new VBox(labelTamanhoSenha, campoTamanhoSenha, botaoGerar, labelSenhaGerada, campoSenhaGerada);
        caixa.setSpacing(10); //Configura espaçamento entre os componentes
        caixa.setPadding(new Insets(10)); //Adiciona um espaçamento de 10 pixels em todas as bordas
        Scene cena = new Scene(caixa, 250, 200);
        palco.setScene(cena);
        palco.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}