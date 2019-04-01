import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class ListLoader {
    public String getWebFile () {
        String stringJson = null;
        try {
            URL url = new URL("https://goo.gl/Hc8J4n");
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection)url.openConnection();
            StringBuilder stringBuilder = new StringBuilder();
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream())))
                 {
                String str;
                while ((str=bufferedReader.readLine())!=null){
                    stringBuilder.append(str);
                }
                stringJson = stringBuilder.toString();
                System.out.println(stringJson);
            } catch (IOException e){
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringJson;
    }
    public Department [] parseGson (String stringJson){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Department [] staff = gson.fromJson(stringJson, Department [].class);
        String newJson = new GsonBuilder().setPrettyPrinting().create().toJson(staff);
        System.out.println(newJson);
        return staff;
    }
}
