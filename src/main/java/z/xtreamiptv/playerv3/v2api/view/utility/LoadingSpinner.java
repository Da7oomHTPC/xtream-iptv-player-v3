package z.xtreamiptv.playerv3.v2api.view.utility;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import z.xtreamiptv.playerv3.R;

public class LoadingSpinner extends ImageView {
    private static final int IMAGE_RESOURCE_ID = 2131231229;
    private static final int ROTATE_ANIMATION_DURATION = 1000;

    public LoadingSpinner(Context context) {
        super(context, null);
    }

    public LoadingSpinner(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public LoadingSpinner(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setImageResource(R.drawable.logo_spinner);
        startAnimation();
    }

    private void startAnimation() {
        clearAnimation();
        RotateAnimation rotate = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotate.setDuration(1000);
        rotate.setRepeatCount(-1);
        startAnimation(rotate);
    }

    public void setVisibility(int visibility) {
        if (visibility == 0) {
            startAnimation();
        } else {
            clearAnimation();
        }
        super.setVisibility(visibility);
    }
}
