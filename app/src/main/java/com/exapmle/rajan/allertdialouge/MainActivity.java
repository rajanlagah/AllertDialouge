package com.exapmle.rajan.allertdialouge;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlertDiolog();
    }

    private void AlertDiolog() {
    AlertDialugeFragment dialuge=new AlertDialugeFragment();
        dialuge.show(getFragmentManager(),"error");
    }

}
