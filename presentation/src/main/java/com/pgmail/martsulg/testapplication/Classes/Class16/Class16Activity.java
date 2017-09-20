package com.pgmail.martsulg.testapplication.Classes.Class16;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.pgmail.martsulg.testapplication.R;

import io.realm.Realm;

/**
 * Created by lenovo on 08.09.2017.
 */

public class Class16Activity extends Activity {

    private Realm realm;
    private EditText editText;
    private Button button;
    private UserDb user;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class16);
        editText = (EditText) findViewById(R.id.class16editText);
        button = (Button) findViewById(R.id.class16Button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveData();
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        realm = Realm.getDefaultInstance();
        loadData();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(user!=null)
            user.removeAllChangeListeners();
        realm.close();
    }

    private void saveData(){
        if(user == null){
            user = realm.createObject(UserDb.class);
            realm.beginTransaction();
            user.setId(10);

            realm.commitTransaction();

          /*  user=new UserDb();
            user.setId(10);
            realm.beginTransaction();
            user = realm.copyToRealmOrUpdate(user);
            realm.commitTransaction();
            */

        }

        //сохранение юзера в базу данных Realm
        realm.beginTransaction();
        user.setName(String.valueOf(editText.getText()));
        realm.commitTransaction();
    }

    private void loadData(){

        user = realm.where(UserDb.class)
                .equalTo("id",10)
                .findFirst();

        if(user !=null){
            editText.setText(user.getName());
        }

    }


}
