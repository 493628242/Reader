package com.gray.reader;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.martian.libsliding.SlidingLayout;
import com.martian.libsliding.slider.PageSlider;

public class MainActivity extends AppCompatActivity {
    String content = "　　一夜，天还没亮，屋里漆黑一片，只有落地花罩外一盏小小的宫灯正发着微弱的黄光。\n" +
            "\n" +
            "　　\n" +
            "\n" +
            "　　萧源躺在柔软馨香的被褥里，隔着层层幔帐，隐约可见花罩外几名丫鬟仆妇正在给她熏衣，准备盥漱用具，" +
            "房里安静的连窗外的落雪声都能隐约听见。屋里火墙烧的正暖，萧源翻了一个身，掀了掀被窝散了些热气，“骨碌”一声，熏被的银香球被她无意间踢了下，滚到了地上。\n" +
            "\n" +
            "　　架子床外值夜的丫鬟灵偃正在望着窗户发呆，听到银香球落地的声音，打了一个激灵，轻手轻脚的掀起一角床帘查看，" +
            "见萧源已经睁开了眼睛，就轻声说：“夫人说这几天天气太冷，姑娘们身子又弱，就不用这么早起身请安了，让你们多睡一会，" +
            "姑架子床外值夜的丫鬟灵偃正在望着窗户发呆，听到银香球落地的声音，打了一个激灵，轻手轻脚的掀起一角床帘查看，" +
            "见萧源已经睁开了眼睛，就轻声说：“夫人说这几天天气太冷，姑娘们身子又弱，就不用这么早起身请安了，让你们多睡一会，" +
            "身请安了，让你们" + "\n" +
            "\n" +
            "一夜，天还没亮，屋里漆黑一片，只有落地花罩外一盏小小的宫灯正发着微弱的黄光。\n" +
            "\n" +
            "　　\n" +
            "\n" +
            "　　萧源躺在柔软馨香的被褥里，隔着层层幔帐，隐约可见花罩外几名丫鬟仆妇正在给她熏衣，准备盥漱用具，房里安静的连窗外的落雪声都能隐约听见。屋里火墙烧的正暖，萧源翻了一个身，掀了掀被窝散了些热气，“骨碌”一声，熏被的银香球被她无意间踢了下，滚到了地上。\n" +
            "\n" +
            "　　\n" +
            "\n" +
            "　　架子床外值夜的丫鬟灵偃正在望着窗户发呆，听到银香球落地的声音，打了一个激灵，轻手轻脚的掀起一角床帘查看，见萧源已经睁开了眼睛，就轻声说：“夫人说这几天天气太冷，姑娘们身子又弱，就不用这么早起身请安了，让你们多睡一会，姑架子床外值夜的丫鬟灵偃正在望着窗户发呆，听到银香球落地的声音，打了一个激灵，轻手轻脚的掀起一角床帘查看，见萧源已经睁开了眼睛，就轻声说：“夫人说这几天天气太冷，姑娘们身子又弱，就不用这么早起身请安了，让你们多睡一会，姑　　\n" +
            "\n" +
            "　　\n" +
            "\n" +
            "　　架子床外值夜的丫鬟灵偃正在望着窗户发呆，听到银香球落地的声音，打了一个激灵，轻手轻脚的掀起一角床帘查看，见萧源已经睁开了眼睛，就轻声说：“夫人说这";
    private SlidingLayout mSlidingLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(new VPAdapter());
//        mSlidingLayout = (SlidingLayout) findViewById(R.id.sliding_container);
//        mSlidingLayout.setOnTapListener(new SlidingLayout.OnTapListener() {
//
//            @Override
//            public void onSingleTap(MotionEvent event) {
//                int screenWidth = getResources().getDisplayMetrics().widthPixels;
//                int x = (int) event.getX();
//                if (x > screenWidth / 2) {
//                    mSlidingLayout.slideNext();
//                } else if (x <= screenWidth / 2) {
//                    mSlidingLayout.slidePrevious();
//                }
//            }
//        });
//        mSlidingLayout.setAdapter(new MySlidingAdapter(this, content,"第一章 aaa"));
//        mSlidingLayout.setSlider(new PageSlider());
    }

    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     */
    public int dip2px(float dpValue) {
        final float scale = getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     */
    public int px2dip(float pxValue) {
        final float scale = getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

    class VPAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return Integer.MAX_VALUE;
        }


        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return view == object;
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            LayoutInflater from = LayoutInflater.from(container.getContext());
            View view = from.inflate(R.layout.layout_normal_book, container, false);
            ReadTextView tv = view.findViewById(R.id.content);
            container.addView(view);
            int heightPixels = getResources().getDisplayMetrics().heightPixels;
            int height = heightPixels - dip2px(50);
            Log.e("height", height + "");
            int lineBounds = tv.getLineBounds(1, new Rect());
            Log.e("lineBounds", lineBounds + "");
            tv.setText(content);
            return view;
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            if (object instanceof View) {
                container.removeView((View) object);
            }
        }
    }


}

