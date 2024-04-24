package myThing;//import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;


/**
 *  https://www.baeldung.com/java-httpclient-post 关于Java 的 httpclient 的使用
 */
public class HttpClientOfJava9 {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder(URI.create("http://www.baidu.com")).timeout(Duration.ofSeconds(60)).build();


        HttpResponse.BodyHandler<String> handler = HttpResponse.BodyHandlers.ofString();
        HttpResponse<String> response = client.send(request, handler);
        String body = response.body();
        System.out.println("返回的body=="+body);

    }


    //同步调用
    @Test
    public void test2() throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create("http://localhost:8080/demo")).POST(HttpRequest.BodyPublishers.ofString("{\"action\":\"hello\"}")).build();
        HttpResponse.BodyHandler<String> handler = HttpResponse.BodyHandlers.ofString();
        HttpResponse<String> response = client.send(request, handler);
        String body = response.body();
        System.out.println(body);
    }

    //异步调用
    @Test
    public void test3() throws IOException, InterruptedException, ExecutionException {

        HttpClient client = HttpClient.newHttpClient();
        String jsonStringBody = "{\"action\":\"hello\"}";
        HttpRequest request = HttpRequest.newBuilder(URI.create("http://localhost:8080/demo"))
                .POST(HttpRequest.BodyPublishers.ofString(jsonStringBody))
                .timeout(Duration.of(10, ChronoUnit.SECONDS))
                .build();
        HttpResponse.BodyHandler<String> handler = HttpResponse.BodyHandlers.ofString();
        CompletableFuture<HttpResponse<String>> response = client.sendAsync(request, handler);
        HttpResponse<String> result = response.get();
        String body = result.body();
        System.out.println(body);
    }
}
