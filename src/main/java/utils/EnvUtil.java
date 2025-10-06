package utils;

import io.github.cdimascio.dotenv.Dotenv;

public class EnvUtil {
    private static final Dotenv dotenv = Dotenv.configure()
        .ignoreIfMissing()
        .load();

    public static String get(String key) {
        return dotenv.get(key);
    }

    public static String getOrDefault(String key, String defaultValue) {
        String value = dotenv.get(key);
        return value != null ? value : defaultValue;
    }
}

