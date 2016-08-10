package com.sqq.nioclient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button bt_send,bt_connect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_connect = (Button) findViewById(R.id.bt_connect);
        bt_send = (Button) findViewById(R.id.bt_send);
        bt_send.setOnClickListener(this);
        bt_connect.setOnClickListener(this);

        /*ConnectionsPool pool = new ConnectionsPool(5);
        for(int i=0;i<5;i++){
            Connection con = new Connection(i);
            pool.putConnection(con);
        }

        pool.getConnection().setConnected();
        Log.d("con", "" + pool.getConnection().getConnectionId());
        Log.d("con", "" + pool.getConnection().getConnectionId());
        Connection con = new Connection(6);
        pool.putConnection(con);
        Log.d("con", "" + pool.getConnection().getConnectionId());*/
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_connect:
                break;
            case R.id.bt_send:
                EditText et = (EditText) findViewById(R.id.et_text);
                String s = et.getText().toString();

                if(!TextUtils.isEmpty(s)) {
                    if(TcpService.getInstance().send(s)){
                        Log.d("Client", "发送成功");
                    }else{
                        Log.d("Client","发送失败");
                    }
                }
                break;
        }
    }
}
