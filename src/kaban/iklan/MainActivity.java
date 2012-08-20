package kaban.iklan;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

public class MainActivity extends Activity {


    private GLSurfaceView mGlView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mGlView = new MainGlSurfaceView(this);
        setContentView(mGlView);
    }
}
