package com.ashay.swayambhu_1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import java.util.ArrayList;
import java.util.List;

import it.moondroid.coverflow.components.ui.containers.FeatureCoverFlow;

public class General_Event_Main extends AppCompatActivity {

    private FeatureCoverFlow coverFlow_General;

    private General_Event_Adapter GENERALEVENTADAPTER;

    private List<General_Event_1> GeneralEvent1List = new ArrayList<>();
    private TextSwitcher mTitle_General;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general__event__main);


        initData();



        mTitle_General = (TextSwitcher)findViewById(R.id.title_General);
        mTitle_General.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                LayoutInflater inflater = LayoutInflater.from(General_Event_Main.this);
                TextView txt = (TextView) inflater.inflate((R.layout.layout_title),null);
                txt.setTextColor(Color.BLACK);
                txt.setTextSize(30);

                return txt;

            }
        });

        Animation in = AnimationUtils.loadAnimation(this,R.anim.slide_in_top);
        Animation out = AnimationUtils.loadAnimation(this,R.anim.slide_out_bottom);

        mTitle_General.setAnimation(in);
        mTitle_General.setAnimation(out);






        GENERALEVENTADAPTER= new General_Event_Adapter(GeneralEvent1List,this);
        coverFlow_General = (FeatureCoverFlow) findViewById(R.id.coverflow_General);
        coverFlow_General.setAdapter(GENERALEVENTADAPTER);

        coverFlow_General.setOnScrollPositionListener(new FeatureCoverFlow.OnScrollPositionListener() {
            @Override
            public void onScrolledToPosition(int position) {
                mTitle_General.setText(GeneralEvent1List.get(position).getName());


            }

            @Override
            public void onScrolling() {

            }
        });


        coverFlow_General.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                {
                    Intent in = new Intent(getApplicationContext(), JNEC_KBC_open.class);
                    startActivity(in);

                }
                if(position == 1)
                {
                    Intent in = new Intent(getApplicationContext(), SurvivalBattle_open.class);
                    startActivity(in);
                }

                if(position == 2)
                {
                    Intent in = new Intent(getApplicationContext(),Master_vs_Slave_robot.class);
                    startActivity(in);
                }
                if(position == 3)
                {
                    Intent in = new Intent(getApplicationContext(), MrMsTechy_open.class);
                    startActivity(in);
                }
                if(position == 4)
                {
                    Intent in = new Intent(getApplicationContext(), Bestfromwaste_open.class);
                    startActivity(in);
                }
                if(position == 5)
                {
                    Intent in = new Intent(getApplicationContext(), BussinessIdea_open.class);
                    startActivity(in);
                }
                if(position == 6)
                {
                    Intent in = new Intent(getApplicationContext(), Proyekto_open.class);
                    startActivity(in);
                }
                if(position == 7)
                {
                    Intent in = new Intent(getApplicationContext(), Ideathon_open.class);
                    startActivity(in);
                }
                if(position == 8)
                {
                    Intent in = new Intent(getApplicationContext(),Suggestion_box.class);
                    startActivity(in);
                }

                if (position == 9) {
                    Intent in = new Intent(getApplicationContext(), Innovate_open.class);
                    startActivity(in);
                }

                if (position == 10) {
                    Intent in = new Intent(getApplicationContext(), Suggestion_box.class);
                    startActivity(in);
                }

                if (position == 11) {
                    Intent in = new Intent(getApplicationContext(), Suggestion_box.class);
                    startActivity(in);
                }

            }
        });




    }

    private void initData()
    {
        GeneralEvent1List.add(new General_Event_1("JNEC ka KBC", "http://www.miastogier.pl/baza/Encyklopedia/gry/Democracy3_PC/Okladka/okl_democracy3cover.jpg"));
        GeneralEvent1List.add(new General_Event_1("Survival Battle", "http://www.salfordcommunityleisure.co.uk/sites/default/files/styles/page_width_standard/public/uploads/events/Model%20making%20edited%20for%20web.jpg?itok=NoYY2rBb"));
        GeneralEvent1List.add(new General_Event_1("Tech One", "http://thamesandkosmos.com/images/stories/virtuemart/product/620377_roboticsworkshop_model8.jpg"));
        GeneralEvent1List.add(new General_Event_1("Mr. and Ms. Techy", "https://newsignature.com/wp-content/uploads/2017/02/project-management-1024x512.png"));
        GeneralEvent1List.add(new General_Event_1("Best from Waste", "https://image.freepik.com/free-photo/robot-doing-the-peace-sign_1048-3527.jpg"));
        GeneralEvent1List.add(new General_Event_1("Business Idea Competition", "https://image.freepik.com/free-photo/people_1122-1876.jpg"));
        GeneralEvent1List.add(new General_Event_1("Proyekto", "https://image.freepik.com/free-vector/quiz-background-with-items-in-flat-design_23-2147599082.jpg"));
        GeneralEvent1List.add(new General_Event_1("Ideathon", "http://millenniumupdate.in/img/competiton/paper.jpg"));
        GeneralEvent1List.add(new General_Event_1("Speak-up", "https://associationsnow.com/wp-content/uploads/2016/02/0201_suggestion-800x480.jpg"));
        GeneralEvent1List.add(new General_Event_1("Innovate to implement", "https://associationsnow.com/wp-content/uploads/2016/02/0201_suggestion-800x480.jpg"));
        GeneralEvent1List.add(new General_Event_1("Leader in You", "https://associationsnow.com/wp-content/uploads/2016/02/0201_suggestion-800x480.jpg"));
        GeneralEvent1List.add(new General_Event_1("Techno Confetti Poster Competition", "https://associationsnow.com/wp-content/uploads/2016/02/0201_suggestion-800x480.jpg"));

    }
}
