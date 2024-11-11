import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String jsonLivro = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";

        Gson gson = new GsonBuilder().serializeNulls().create();

        Titulo titulo = gson.fromJson(jsonLivro, Titulo.class);

        System.out.println(titulo);

    }
}