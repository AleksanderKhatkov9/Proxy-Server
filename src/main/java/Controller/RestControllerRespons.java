package Controller;

import model.Respons;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

@RestController
public class RestControllerRespons {
    private static String rest_url;

    //GET Http URL = http://127.0.0.1/nginx/statistics
    public static String readUsingBufferedReader() throws IOException {
        URL url = new java.net.URL("http://127.0.0.1/nginx/statistics");
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line = "";
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = buffReader.readLine()) != null) {
            stringBuilder.append(line + "\n");
            rest_url = stringBuilder.toString();
        }
        return rest_url;
    }
    
    @RequestMapping("/RestStatus")
    public Respons getRespons() throws IOException {
        String res = readUsingBufferedReader();
        String[] out = res.split(" ");
        String n3 = out[2];
        String n1 = n3.substring(0, 1);
        int num1 = Integer.parseInt(n1);
        String n8 = out[7];
        int num2 = Integer.parseInt(n8);
        String n9 = out[8];
        int num3 = Integer.parseInt(n9);
        String n10 = out[9];
        int num4 = Integer.parseInt(n10);
        Respons respons = new Respons();
        respons.setActiveConnections(num1);
        respons.setAccepts(num2);
        respons.setHandled(num3);
        respons.setRequests(num4);
        return respons;
    }
}
