import java.net.URL;

public class Demo {

    public static void main(String[] args) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        String packName = "org.simpleframework";

        URL resource = classLoader.getResource(packName.replace(".", "/"));

        System.out.println(resource);
    }

}
