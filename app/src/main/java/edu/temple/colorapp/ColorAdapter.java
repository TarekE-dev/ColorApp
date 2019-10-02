package edu.temple.colorapp;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ColorAdapter extends BaseAdapter {

    private Context context;
    private String[] colors;

    public ColorAdapter(Context context, String[] colors){
        this.context = context;
        this.colors = colors;
    }


    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int i) {
        if(i < 0 || i >= colors.length){
            return null;
        }
        return colors[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        System.out.println((String) getItem(i));
        TextView textView = new TextView(context);
        textView.setText((String) getItem(i));
        if(i != 0 ) {
            textView.setBackgroundColor(Color.parseColor((String) getItem(i)));
        }
        textView.setTextSize(25);
        return textView;
    }
}
