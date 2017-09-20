package com.pgmail.martsulg.data.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.pgmail.martsulg.data.DBentity.Country;
import com.pgmail.martsulg.data.DBentity.User;

import java.util.List;

/**
 * Created by lenovo on 06.09.2017.
 */

public class DatabaseManager {
    private Context context;
    private DBHelper dbHelper;
    private SQLiteDatabase database;

    public DatabaseManager(Context context){
        this.context = context;
        dbHelper = new DBHelper(context);
    }

    public void open(boolean isWritable){
        if(isWritable) {
            database = dbHelper.getWritableDatabase();

        } else {
            database = dbHelper.getReadableDatabase();

        }
    }

    public void close(){
        if(database!=null){
            database.close();
        }
    }

    public void insertUser(User user){

        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO user ('name', 'age', 'countryId')");
        sql.append("VALUES (");
        sql.append("'");
        sql.append(user.getName());
        sql.append("',");
        sql.append(user.getAge());
        sql.append(",");
        sql.append(user.getCountry().getId());
        sql.append(")");

        Log.e("DataBaseManager", "insertUser() sql = " + sql.toString());
        database.execSQL(sql.toString());
    }

    public void updateUser(User user){
    }

    public List<User> getUsers(){
        return null;
    }

    public User getUserById(String id){

       Cursor cursor = database.rawQuery("SELECT * FROM user INNER JOIN country ON " +
               "user.countryId=country.id WHERE id = ?",new String[]{String.valueOf(id)});

        if(cursor !=null){
            User user = new User();

            cursor.moveToFirst();
            int userId = cursor.getInt(0);
            String name = cursor.getString(1);
            int age = cursor.getInt(2);
            int countryId = cursor.getInt(3);
            String countryName = cursor.getString(4);

            // Заполняем объект User
            user.setId(userId);
            user.setName(name);
            user.setAge(age);

            // заполняем объект Country
            Country country = new Country();
            country.setId(countryId);
            country.setName(countryName);

            //добавляем объект Country в User
            user.setCountry(country);


            return user;

        } else {
            Log.e("DatabaseManager", "getUserByID() cursor is null");

        }
        return null;
    }




}
