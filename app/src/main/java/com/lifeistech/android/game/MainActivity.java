package com.lifeistech.android.game;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener {

    int number;

    TextView text;

    Button button;

    Clap clapInstance;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView);
        text.setText("0");
        Integer.toString(0);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        clapInstance = new Clap(this.getApplicationContext());

    }

    @Override
    public void onClick(View v) {
        tap(v);
        clapInstance.play();
    }

    public void tap(View v) {
        number = number + 1;
        text.setText(String.valueOf(number));

        if (number == 0) {
//            time = 30;
//            score = 0;
//            timeText.setText(String.valueOf(time));
//            scoreText.setText(String.valueOf(score));

        }
        if (number == 10) {
            Toast.makeText(this, "10回達成！", Toast.LENGTH_SHORT).show();
        }

        if (number == 50) {
            Toast.makeText(this, "50回達成！", Toast.LENGTH_SHORT).show();

        }

        if (number == 100) {
            Toast.makeText(this, "100回達成！", Toast.LENGTH_SHORT).show();

        }

        if (number == 200) {
            Toast.makeText(this, "200回達成！", Toast.LENGTH_SHORT).show();

        }

        if (number == 300) {
            Toast.makeText(this, "300回達成！", Toast.LENGTH_SHORT).show();

        }
        if (number == 400) {
            Toast.makeText(this, "400回達成！", Toast.LENGTH_SHORT).show();

        }
        if (number == 500) {
            Toast.makeText(this, "500回達成！", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "これでこのアプリは終了です！　おめでとうございます！", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "この先は何もありません。RESETを押してください", Toast.LENGTH_SHORT).show();

        }
        if (number == 600) {
            Toast.makeText(this, "...何もないよ？", Toast.LENGTH_SHORT).show();

        }
        if (number == 700) {
            Toast.makeText(this, "悪いことは言わないからRESETを押しなさい？", Toast.LENGTH_SHORT).show();

        }
        if (number == 800) {
            Toast.makeText(this, "時間の無駄だよ...?", Toast.LENGTH_SHORT).show();

        }
        if (number == 900) {
            Toast.makeText(this, "...", Toast.LENGTH_SHORT).show();

        }
        if (number == 1000) {
            Toast.makeText(this, "騒音に負けず　よくぞここまで。素晴らしいです", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "ですが　ここから先、2000回タップしても何も起こりません", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "3000回タップしても何も起こりません", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "4000回タップしても何も起こりません", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "5000回も6000回も7000回もそれからも。", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "あなたの粘りに負けました　私の負けです。", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "簡素ですがエンディングをどうぞ", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "発案　　おれ", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "プログラミング　おれ", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "脚本　おれ　" +
                            "演出　おれ" +
                            "総監督　おれ" +
                            "ナレーター　おれ"
                    , Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "協力　おれ", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "（時間の都合上省略いたします）", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "使用ソフト　AndroidStudio", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "BGM提供元　魔王魂", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "作　こうせい", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "「この先は何もありません」", Toast.LENGTH_SHORT).show();

            Toast.makeText(this, "ここから先、2000回タップしても何も起こりません", Toast.LENGTH_SHORT).show();
        }
    }




    public void reset(View v) {
        number = 0;
        text.setText(String.valueOf(number));
    }


}
