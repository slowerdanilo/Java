package horaAtualizada;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try { 
            // URL para a API de horário em tempo real
            URL url = new URL("https://worldtimeapi.org/api/ip");

            // Conexão HTTP para a URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Método de solicitação como GET
            connection.setRequestMethod("GET");

            // Verificando se a resposta da solicitação HTTP foi bem-sucedida
            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                // Leia a resposta da API
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Analise a resposta como JSON e obtenha o valor do campo "datetime"
                String json = response.toString();
                String datetime = json.substring(json.indexOf("datetime") + 13, json.indexOf("datetime") + 32);

                // Imprima o horário obtido
                System.out.println("Horário atual: " + datetime);
            } else {
                System.out.println("Erro na solicitação HTTP: " + connection.getResponseCode());
            }

            // Feche a conexão HTTP
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
