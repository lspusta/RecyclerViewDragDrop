package itkido.me.smoothbottombartest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.gauravk.bubblenavigation.BubbleNavigationLinearView;
import com.gauravk.bubblenavigation.listener.BubbleNavigationChangeListener;

import org.w3c.dom.Text;

import me.ibrahimsn.lib.OnItemSelectedListener;
import me.ibrahimsn.lib.SmoothBottomBar;

public class MainActivity extends AppCompatActivity {
    SmoothBottomBar bottomBar;
    TextView text;
    private BubbleNavigationLinearView bubbleNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        bottomBar = findViewById(R.id.bottomBar);
        text = findViewById(R.id.text);
        bubbleNavigation = findViewById(R.id.bubbleNavigation);




        bubbleNavigation.setNavigationChangeListener(new BubbleNavigationChangeListener() {
            @Override
            public void onNavigationChanged(View view, int position) {
                //navigation changed, do something
                if (position == 0){
                    text.setText("Home");
                }else if (position == 1){
                    text.setText("Store");
                }

            }
        });


        bottomBar.setOnItemSelectedListener(new OnItemSelectedListener() {

            @Override
            public void onItemSelect(int i) {
                if (i == 0){
                    bubbleNavigation.setVisibility(View.VISIBLE);
                    text.setText("Home");
                }else if (i == 1){
                    bubbleNavigation.setVisibility(View.INVISIBLE);
                    text.setText("Leadership");
                }else if (i == 2){
                    bubbleNavigation.setVisibility(View.INVISIBLE);
                    text.setText("Store");
                }else if (i == 3){
                    bubbleNavigation.setVisibility(View.INVISIBLE);
                    text.setText("Profile");
                }

            }
        });
    }
}
