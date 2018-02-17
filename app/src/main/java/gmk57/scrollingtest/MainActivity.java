package gmk57.scrollingtest;

import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NestedScrollView scrollView = (NestedScrollView) findViewById(R.id.scrollView);

        Button scrollButton = (Button) findViewById(R.id.scrollButton);
        scrollButton.setOnClickListener(v -> {
            scrollView.scrollTo(0, 0);  // Works (jumps to top without animation)
        });

        Button smoothScrollButton = (Button) findViewById(R.id.smoothScrollButton);
        smoothScrollButton.setOnClickListener(v -> {
            scrollView.smoothScrollTo(0, 0);  // Doesn't work since v26.0.0
//            scrollView.fullScroll(View.FOCUS_UP);  // Doesn't work since v26.0.0
        });
    }
}
