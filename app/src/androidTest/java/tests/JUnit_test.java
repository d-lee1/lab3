package tests;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.dlee.lab3_2.MainActivity;
import com.dlee.lab3_2.R;
import com.dlee.lab3_2.*;

/**
 * Created by darien on 4/19/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public JUnit_test() {
        super(MainActivity.class);
    }
    public void test_first()
    {
        mainActivity = getActivity();
        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);

        String tester = textView.getText().toString();
        assertEquals(tester, "Bye World");
    }
}

