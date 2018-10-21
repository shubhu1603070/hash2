package com.wishwheels.www.hash2.fragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.ButtonBarLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.wishwheels.www.hash2.R;


public class FragmentTwo extends Fragment implements View.OnClickListener{

    Button  btniel, btstep,btelon;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_two, container, false);





        btniel = v.findViewById(R.id.angry_btn);
        btniel.setOnClickListener(this);

        btelon = v.findViewById(R.id.angry_btnb);
        btelon.setOnClickListener(this);

        btstep = v.findViewById(R.id.angry_btnc);
        btstep.setOnClickListener(this);
return v;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.angry_btn :
          nielfrag g= new nielfrag();
                android.support.v4.app.FragmentManager f= getFragmentManager();
                if(f.getBackStackEntryCount()>0){
                    f.popBackStack();
                }
                android.support.v4.app.FragmentTransaction ft = f.beginTransaction();
                ft.replace(R.id.frammm,g).addToBackStack(null).commit();
                break;

            case R.id.angry_btnb :
                elonfrag h= new elonfrag();
                android.support.v4.app.FragmentManager l= getFragmentManager();
                if(l.getBackStackEntryCount()>0){
                    l.popBackStack();
                }
                android.support.v4.app.FragmentTransaction y = l.beginTransaction();
                y.replace(R.id.frammm,h).addToBackStack(null).commit();
                break;
            case R.id.angry_btnc :
                stepfrag a= new stepfrag();
                android.support.v4.app.FragmentManager b= getFragmentManager();
                if(b.getBackStackEntryCount()>0){
                    b.popBackStack();
                }
                android.support.v4.app.FragmentTransaction c = b.beginTransaction();
                c.replace(R.id.frammm,a).addToBackStack(null).commit();
                break;
        }
    }
}


  /*  ListView list;

    String[] maintitle ={
            "Title 1","Title 2",
            "Title 3","Title 4",
            "Title 5",
    };

    String[] subtitle ={
            "Sub Title 1","Sub Title 2",
            "Sub Title 3","Sub Title 4",
            "Sub Title 5",
    };

    Integer[] imgid={
            R.drawable.sk
          ///  , R.drawable.download_2,
        //    R.drawable.download_3,R.drawable.download_4,
         //   R.drawable.download_5,
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myadapter adapter=new myadapter(this, maintitle, subtitle,imgid);
        list=(ListView) list.findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
                if(position == 0) {
                    //code specific to first list item
                    //Toast.makeText(getApplicationContext(),"Place Your First Option Code",Toast.LENGTH_SHORT).show();
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    //Toast.makeText(getApplicationContext(),"Place Your Second Option Code",Toast.LENGTH_SHORT).show();
                }

                else if(position == 2) {

               //     Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 3) {

                //    Toast.makeText(getApplicationContext(),"Place Your Forth Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 4) {

                   // Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false);
    }

}*/