package java9.httpClient;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TodoRepository {

    String getTodo() throws URISyntaxException, IOException, InterruptedException {
        // implement here
        // use HttpResponse.BodyHandlers.ofString() handler
        // return response body
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(new URI("https://jsonplaceholder.typicode.com/todos/1"))
                .GET()
                .build();

        return HttpClient
                .newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString())
                .body();
    }

}
