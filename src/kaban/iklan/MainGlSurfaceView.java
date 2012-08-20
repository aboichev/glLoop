package kaban.iklan;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class MainGlSurfaceView extends GLSurfaceView {

    public MainGlSurfaceView(Context context){
        super(context);

        // Create an OpenGL ES 2.0 context
        setEGLContextClientVersion(2);
        // Render the view only when there is a change in the drawing data
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);

        // Set the Renderer for drawing on the GLSurfaceView
        setRenderer(new MainRenderer());

    }


}
