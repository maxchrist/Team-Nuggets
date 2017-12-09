/**
 * Created by jessicalin on 12/9/17.
 */
import net.obviam.droidz.model.Droid;
import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public void run()
        {
        Canvas canvas;
        while(running)
        {
        canvas=null;
        try{
        canvas=this.surfaceHolder.lockCanvas();

        this.gamePanel.Draw(canvas);

        }
        }
        }

public class ImageHandling extends SurfaceView implements SurfaceHolder.Callback {
    private Car car;

    public ImageHandling(Context context)
    {
        CartPoint point(50,50)
        car=new Car(point, 1, BitmapFactory.decodeResource(getResources(), res.drawable.chicken));
    }
    @Override
    setContentView(res.layout.activity_main);
    protected void Draw(Canvas canvas){
        canvas.drawBitmap(BitmapFactory.decodeResource(getResources(), res.drawable.chicken), 1, 0, NULL);
        //draws to cordinate 1, 0
    }
}