package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;


public class App {
            public static void main(String[] args) throws Exception {
                String url = "https://valorant-api.com/v1/sprays";

//        HttpClient client = HttpClient.newHttpClient();
                var client = HttpClient.newHttpClient();
                URI endereco = URI.create(url);
                HttpRequest request = HttpRequest.newBuilder(endereco)
                        .GET()
                        .build();
                HttpResponse<String> response = client.send(request,
                        HttpResponse.BodyHandlers.ofString());
                String body = response.body();
//                System.out.println(body);


                Gson gson = new Gson();
                Type listaSprayTipo = new TypeToken<ArrayList<Spray>>(){}.getType();
                ApiSprays infoSpray = gson.fromJson(body, ApiSprays.class);

                ArrayList<Spray> sprayArray = gson.fromJson(gson.toJson(infoSpray.getData()), listaSprayTipo);


                for (Spray spray : sprayArray) {
                    String nome = spray.getDisplayName();
                    String imagem = spray.getFullTransparentIcon();
                    System.out.println("Nome: " + nome);
                    System.out.println("Imagem: " + imagem);
                    System.out.println("");
                }




           }
        }