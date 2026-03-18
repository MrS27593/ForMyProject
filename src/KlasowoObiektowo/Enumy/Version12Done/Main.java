package KlasowoObiektowo.Enumy.Version12Done;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newBuilder().version(HttpClient.Version.HTTP_1_1).build();
        HttpClient client1 = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("przykladowastrona")).GET().build();
        try {
            HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
            System.out.println(response.version());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
