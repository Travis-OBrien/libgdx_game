package java_source;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Disposable;

/**
 * Created by Travis on 1/20/14.
 */
public class WorldRenderer implements Disposable {

    OrthographicCamera orthographicCamera;
    SpriteBatch spriteBatch;
    WorldController worldControllerl;

    public WorldRenderer(WorldController worldControllerl) {
        this.worldControllerl = worldControllerl;
    }

    private void init(){}

    public void render(){}

    public void resize(int width, int height){}

    @Override
    public void dispose() {

    }
}
