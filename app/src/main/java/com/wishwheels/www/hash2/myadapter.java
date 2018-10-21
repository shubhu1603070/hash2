package com.wishwheels.www.hash2;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.wishwheels.www.hash2.fragments.FragmentTwo;

/*ublic class myadapter extends ArrayAdapter<String> {

private final FragmentTwo context;
private final String[] maintitle;
private final String[] subtitle;
private final Integer[] imgid;

public myadapter(FragmentTwo context, String[] maintitle, String[] subtitle, Integer[] imgid) {
        super(context, R.layout.mylistml,maintitle);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.maintitle=maintitle;
        this.subtitle=subtitle;
        this.imgid=imgid;

        }

public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylistml, null,true);

        TextView titleText = (TextView) rowView.findViewById(R.id.title);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.subtitle);

        titleText.setText(maintitle[position]);
        imageView.setImageResource(imgid[position]);
        subtitleText.setText(subtitle[position]);

        return rowView;

        };

        }
*/