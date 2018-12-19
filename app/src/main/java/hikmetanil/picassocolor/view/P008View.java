package hikmetanil.picassocolor.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class P008View extends View {
    Context context;
    Bitmap bitmap;
    public P008View(Context context, Bitmap bitmap) {
        super(context);
        this.context=context;
        this.bitmap=bitmap;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint=new Paint();
        paint.setARGB(50,0,0,0);
        canvas.drawBitmap(bitmap,0,0,paint);
    }
}
