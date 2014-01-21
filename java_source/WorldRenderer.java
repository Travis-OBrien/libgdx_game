

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Disposable;

/**
 * Created by Travis on 1/20/14.
 */
public class WorldRenderer implements Disposable {

    OrthographicCamera orthographicCamera;
    SpriteBatch spriteBatch;
    WorldController worldController;

    public WorldRenderer(WorldController worldController) {
        this.worldController = worldController;
        init();
    }

    private void init(){
        spriteBatch = new SpriteBatch();
        orthographicCamera = new OrthographicCamera(
                Constants.VIEWPORT_WIDTH,
                Constants.VIEWPORT_HEIGHT
        );
        orthographicCamera.position.set(0,0,0);
        orthographicCamera.update();
    }

    public void render(){
        renderTestObjects();
    }

    private void renderTestObjects(){
        spriteBatch.setProjectionMatrix(orthographicCamera.combined);
        spriteBatch.begin();
        for(Sprite sprite : worldController.testSprites){
            sprite.draw(spriteBatch);
        }
        spriteBatch.end();
    }

    public void resize(int width, int height){
        orthographicCamera.viewportWidth =
                (Constants.VIEWPORT_HEIGHT / height) * width;
        orthographicCamera.update();
    }

    @Override
    public void dispose() {
        spriteBatch.dispose();
    }
}
