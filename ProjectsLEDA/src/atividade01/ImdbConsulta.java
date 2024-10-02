package atividade01;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Random;

public class ImdbConsulta {
    private static final String API_KEY = "9c71cacb";
    private static final String PALAVRA_CHAVE = "movie"; // Palavra-chave padrão para a busca

    // Método para converter nota de 1-10 para 1-5
    private static int converterNota(double nota10) {
        return (int) Math.max(1, Math.min(5, Math.floor((nota10 + 1) / 2)));
    }

    public static Filme buscarFilme(String titulo) {
        try {
            String tituloCodificado = URLEncoder.encode(titulo, "UTF-8");
            String url = "http://www.omdbapi.com/?t=" + tituloCodificado + "&apikey=" + API_KEY;
            CloseableHttpClient httpClient = HttpClients.createDefault();

            HttpGet request = new HttpGet(url);
            CloseableHttpResponse response = httpClient.execute(request);
            String json = EntityUtils.toString(response.getEntity());
            JSONObject jsonObject = new JSONObject(json);

            if ("True".equals(jsonObject.getString("Response"))) {
                String nome = jsonObject.getString("Title");
                int ano = Integer.parseInt(jsonObject.getString("Year"));
                double notaDouble = Double.parseDouble(jsonObject.getString("imdbRating"));
                int nota = converterNota(notaDouble); // Converter nota de 1-10 para 1-5
                return new Filme(nome, ano, nota);
            } else {
                return new Filme("Desconhecido", 0, 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Filme("Erro", 0, 0);
        }
    }

    public static Filme obterFilmeAleatorio(String palavraChave) {
        try {
            String palavraChaveCodificada = URLEncoder.encode(palavraChave, "UTF-8");
            String url = "http://www.omdbapi.com/?s=" + palavraChaveCodificada + "&apikey=" + API_KEY;
            CloseableHttpClient httpClient = HttpClients.createDefault();

            HttpGet request = new HttpGet(url);
            CloseableHttpResponse response = httpClient.execute(request);
            String json = EntityUtils.toString(response.getEntity());
            JSONObject jsonObject = new JSONObject(json);

            if ("True".equals(jsonObject.getString("Response"))) {
                JSONArray filmesArray = jsonObject.getJSONArray("Search");
                if (filmesArray.length() > 0) {
                    Random random = new Random();
                    // Seleciona um filme aleatório da lista de resultados
                    JSONObject filmeAleatorio = filmesArray.getJSONObject(random.nextInt(filmesArray.length()));
                    String tituloAleatorio = filmeAleatorio.getString("Title");
                    return buscarFilme(tituloAleatorio);
                } else {
                    return new Filme("Desconhecido", 0, 0);
                }
            } else {
                return new Filme("Erro na API", 0, 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Filme("Erro", 0, 0);
        }
    }

    public static Filme[] obterFilmesAleatorios(int quantidade, String palavraChave) {
        Filme[] filmes = new Filme[quantidade];

        for (int i = 0; i < quantidade; i++) {
            filmes[i] = obterFilmeAleatorio(palavraChave);
        }

        return filmes;
    }

    public static void main(String[] args) {
        int quantidade = 5; // Defina a quantidade desejada de filmes aleatórios
        String palavraChave = "barbie"; // Palavra-chave para a busca

        Filme[] filmesAleatorios = obterFilmesAleatorios(quantidade, palavraChave);

        for (Filme filme : filmesAleatorios) {
            System.out.println(filme);
        }
    }
}