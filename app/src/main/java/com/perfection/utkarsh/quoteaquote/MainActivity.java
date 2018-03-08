package com.perfection.utkarsh.quoteaquote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView text1 = findViewById(R.id.intro1);
        TextView text2 = findViewById(R.id.intro2);
        TextView text3 = findViewById(R.id.intro3);
        Animation animation1,animation2;
        animation1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        animation2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_down);
        text1.startAnimation(animation1);
        text1.startAnimation(animation2);
        text2.startAnimation(animation1);
        text2.startAnimation(animation2);
        text3.startAnimation(animation1);
        text3.startAnimation(animation2);

        Button btn;
        btn=findViewById(R.id.initbutton);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_third);
                final Random rand=new Random();
                int random=rand.nextInt(19)+0;
                final String[] quotes={" You can do anything, but not everything.",
                        "Perfection is achieved, not when there is nothing more to add, but when there is nothing left to take away.",
                        "The richest man is not he who has the most, but he who needs the least.",
                        "You miss 100 percent of the shots you never take.",
                        "Courage is not the absence of fear, but rather the judgement that something else is more important than fear.",
                        "Well done is better than well said.",
                        "You must be the change you wish to see in the world.",
                        "Talk to Yourself once in a day, otherwise you may miss meeting an excellent person in this World",
                        "Those who dare to fail miserably can achieve greatly.",
                        "To the man who only has a hammer, everything he encounters begins to look like a nail.",
                        "We are what we repeatedly do; excellence, then, is not an act but a habit.",
                        "A wise man gets more use from his enemies than a fool from his friends.",
                        "Do not seek to follow in the footsteps of the men of old; seek what they sought.",
                        "Get busy living or get busy dying.",
                        "Everyone is a genius at least once a year. The real geniuses simply have their bright ideas closer together.",
                        "Twenty years from now you will be more disappointed by the things that you didn’t do than by the ones you did do.",
                        "Work like you don’t need money, love like you’ve never been hurt, and dance like no one’s watching",
                        "Get out of your head and get into your heart. Think less, and Feel more",
                        "Even if you’re on the right track, you’ll get run over if you just sit there.",
                        "People often say that motivation doesn’t last. Well, neither does bathing – that’s why we recommend it daily."};
                final String[] authors={"David Allen","Antoine de Saint-Exupéry","Unknown","Wayne Gretzky","John F. Kennedy",
                        "Benjamin Franklin","Gandhi","Swami Vivekananda","Abraham Maslow","Aristotle","Baltasar Gracian","Basho","Stephen King",
                        "George Lichtenberg","John Ruskin","Mark Twain","Unknown","Osho","Will Rogers","Zig Ziglar"
                };
                TextView quote, author;
                quote =(TextView)findViewById(R.id.quote);
                author=(TextView)findViewById(R.id.author);
                quote.setText(quotes[random]);
                author.setText("-"+authors[random]);

                Button next;
                next=findViewById(R.id.NextQuote);
                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int random=rand.nextInt(19)+0;
                        TextView quote, author;
                        quote =(TextView)findViewById(R.id.quote);
                        author=(TextView)findViewById(R.id.author);
                        quote.setText(quotes[random]);
                        author.setText("-"+authors[random]);

                    }
                });

            }
        });

    }
}
