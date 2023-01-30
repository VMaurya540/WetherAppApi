package org.vishal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIMain {
    public static void main(String[] args) throws IOException, InterruptedException {
        var url = "https://api.weatherbit.io/v2.0/current?lat=35.7796&lon=-78.6382&key=7c6bade26542442e985b4c8f677cfc54&include=minutely";
        var request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        var client = HttpClient.newBuilder().build();
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.statusCode());
        System.out.println(response.body());

    }
}