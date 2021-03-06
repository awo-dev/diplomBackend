package deployment;

import config.Config;

/**
 * Created by Christian on 28-04-2017.
 */
public class DeployConfig {
    //----Constants----
    private static final String DEFAULT_CN_REDIRECT_URL = "http://localhost:8080" + Config.BASE_API_PATH + "/" + Config.CN_SERVICE_PATH;

    //----Environment Variables----
    public static final String CN_REDIRECT_URL = (System.getenv("CAMPUSNET_REDIRECT_URL") != null) ?
            System.getenv("CAMPUSNET_REDIRECT_URL"): DEFAULT_CN_REDIRECT_URL;
    public static final String MONGODB_URI = System.getenv("MONGODB_URI");
    public static final String DATABASE_URL = System.getenv("DATABASE_URL");

    public static final String JWT_TOKEN_SECRET = System.getenv("JWT_TOKEN_SECRET");

    public static void main(String[] args) {
        System.out.println(CN_REDIRECT_URL);
        System.out.println(MONGODB_URI);
        System.out.println(DATABASE_URL);
    }
}
