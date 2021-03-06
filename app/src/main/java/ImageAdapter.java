import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.reddy.viewpager.R;

public class ImageAdapter extends PagerAdapter {
    Context mContext;
    ImageAdapter(Context context)
    {
        this.mContext=context;
    }

    @Override
    public int getCount() {
        return sliderImageId.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==((ImageView)o);

    }
    private  int[] sliderImageId = new int[]
            {
                    R.drawable.apple_web,R.drawable.img
            };

    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(sliderImageId[position]);
        ((ViewPager) container).addView(imageView, 0);
        return imageView;
    }
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((ImageView) object);
    }



}
