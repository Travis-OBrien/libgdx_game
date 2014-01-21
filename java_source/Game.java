import clojure.lang.AFunction;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;

/**
 * Created by Travis on 1/20/14.
 */
public class Game implements ApplicationListener {

    public static int WIDTH = 50;
    public static int HEIGHT = 50;
    private boolean paused = false;
    private WorldController worldController;
    private WorldRenderer worldRenderer;

    AFunction render_fn;

    public Game(AFunction render_fn)
    {
        this.render_fn = render_fn;
    }

    public void reLoad(AFunction render_fn)
    {
        this.render_fn = render_fn;
    }

    @Override
    public void create() {
        worldController = new WorldController();
        worldRenderer = new WorldRenderer(worldController);
        paused = false;
    }

    @Override
    public void resize(int width, int height) {
        worldRenderer.resize(width, height);
    }

    @Override
    public void render() {
        render_fn.call();
        if(!paused){
            worldController.update(Gdx.graphics.getDeltaTime());
        }
        Gdx.gl.glClearColor(0x64/255.0f,
                0x95/255.0f,
                0xed/255.0f,
                0xff/255.0f);
        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
        worldRenderer.render();
    }

    @Override
    public void pause() {
        paused = true;
    }

    @Override
    public void resume() {
        paused = false;
    }

    @Override
    public void dispose() {
        worldRenderer.dispose();
    }

    public boolean isPaused() {
        return paused;
    }
}