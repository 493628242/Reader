package com.gray.reader;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

/**
 * @author wjy on 2018/4/4.
 */
public class MySlidingAdapter extends com.martian.libsliding.SlidingAdapter<String> {
    private String words;
    private Context context;
    private LayoutInflater inflater;
    private String title;
    private String unreadWord;
    private String readedWord;
    private String currentRead;

    public MySlidingAdapter(Context context, String s, String title) {
        words = s;
        unreadWord = s;
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.title = title;

    }

    @Override
    public View getView(View contentView, String s) {
        ViewHolder viewHolder;
        if (contentView == null) {
            contentView = inflater.inflate(R.layout.layout_normal_book,
                    null, false);
            viewHolder = new ViewHolder(contentView);
        } else {
            viewHolder = (ViewHolder) contentView.getTag();
        }
        setContent(viewHolder, s);
        contentView.setTag(viewHolder);
        return contentView;
    }

    private void setContent(ViewHolder viewHolder, String s) {
        viewHolder.content.setText(s);
        viewHolder.subTitle.setText(title);
        viewHolder.content.setText(s);
        if (!hasPrevious()) {
            viewHolder.title.setVisibility(View.GONE);
        } else {
            viewHolder.title.setVisibility(View.VISIBLE);
            viewHolder.title.setText(title);
        }
    }

    @Override
    public String getCurrent() {
        return unreadWord;
    }

    @Override
    public String getNext() {

        return unreadWord;
    }

    @Override
    public String getPrevious() {

        return readedWord;
    }

    @Override
    public boolean hasNext() {
//        return unreadWord == null || unreadWord.isEmpty();
        return false;
    }

    @Override
    public boolean hasPrevious() {
        return false;
//        return words.equals(unreadWord) || readedWord == null || readedWord.isEmpty();
    }

    @Override
    protected void computeNext() {

    }

    @Override
    protected void computePrevious() {
    }

    class ViewHolder {
        private View itemView;
        TextView subTitle;
        TextView title;
        ReadTextView content;

        public ViewHolder(View view) {
            itemView = view;
            subTitle = view.findViewById(R.id.sub_title);
            title = view.findViewById(R.id.title);
            content = view.findViewById(R.id.content);
        }
    }
}
