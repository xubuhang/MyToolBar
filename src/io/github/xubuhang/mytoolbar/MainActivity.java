package io.github.xubuhang.mytoolbar;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//      1��MainActivity�̳�Activityʱ���������ȥ��ActionBar
//      this.requestWindowFeature(Window.FEATURE_NO_TITLE); 
        setContentView(R.layout.activity_main);
//      1��MainActivity�̳�AppCompatActivityʱ���������ȥ��ActionBar
//      getSupportActionBar().hide();
//       2��manifest���Ӧactivity android:theme="@style/Theme.AppCompat.Light.NoActionBar"����ֵ������Զ���ToolBar����ɫ����ʾ
//     Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_launcher);//���õ�����ͼ��
        toolbar.setLogo(R.drawable.ic_launcher);//����app logo
        toolbar.setTitle("Title");//����������
        toolbar.setSubtitle("Subtitle");//�����ӱ���

        toolbar.inflateMenu(R.menu.main);//�������Ͻǵ����˵�
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int menuItemId = item.getItemId();
                Toast.makeText(MainActivity.this, "�����"+menuItemId, Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }

//    ע��Ĭ�ϵĲ˵�
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//        if (id == R.id.action_settings) {
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
}
