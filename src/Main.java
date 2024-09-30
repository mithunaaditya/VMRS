import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableCors( cors -> {
                cors.addRule(it -> { it.anyHost(); });
            });
                })
                .get("/", ctx -> ctx.result("{\"text\": \"Hello World\"}"))
                .start(7070);
    }
}