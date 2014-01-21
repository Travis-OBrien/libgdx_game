

import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

/**
 * Created by Travis on 1/20/14.
 */
public class AppConfig extends LwjglApplicationConfiguration{

    public AppConfig() {
        this.title = "Game";
        this.useGL20 = false;
        this.width = 480;
        this.height = 320;
    }
}
