import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherAPI {
    private static final String API_KEY = "0faa48242c4123135fbafee5e0f226a7";
    private static final String API_URL = "http://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=metric";
    
    public static void main(String[] args) {
        String city = "London"; // Change this to the desired city
        try {
            URL url = new URL(String.format(API_URL, city, API_KEY));
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setReadTimeout(5000);
            connection.setConnectTimeout(5000);
            
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();
                
                // Parse the JSON response to extract the weather data
                // You can use a JSON parsing library like Jackson or Gson to simplify this
                String temperature = response.toString().split("\"temp\":")[1].split(",")[0];
                String description = response.toString().split("\"description\":\"")[1].split("\",")[0];
                
                System.out.println("Current weather in " + city + ":");
                System.out.println("Temperature: " + temperature + "°C");
                System.out.println("Description: " + description);
            } else {
                System.out.println("Failed to get weather data. Response code: " + responseCode);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
