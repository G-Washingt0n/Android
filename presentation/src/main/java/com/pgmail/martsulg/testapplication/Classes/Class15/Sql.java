package com.pgmail.martsulg.testapplication.Classes.Class15;

/**
 * Created by lenovo on 04.09.2017.
 */

public class Sql {

    //  "SELECT * FROM user" - все данные из таблицы user
    //  "SELECT id, name FROM user" - только поля id и name из таблицы user
    //  "SELECT * FROM user WHERE countryId = 1" - выборка только пользователей с countryId == 1

    //  "SELECT * FROM user INNER JOIN country ON user.countryId = country.id" - выборка из
        // таблиц user и country одновременно только если возможно их соединить.
        // по условию "user.countryId == country.id", возвращает одну ибъединенную таблицу

    //  "SELECT * FROM user LEFT JOIN country ON user.countryId = country.id" - выборка из
        // таблиц user и country - все из таблицы user и если в country ничего не нашлось то справа
        // будет nullБ возвращает одну объединенную таблицу

    //  "SELECT * FROM user RIGHT JOIN country ON user.countryId = country.id" -
        // вернет все что справа в таблице country и то что совпадает в таблице user

    //  "SELECT * FROM user LIMIT 20" - вернет только перввых 20 записей


    //  "SELECT * FROM user LIMIT 20" - вернет только записи от 20 до 40


    //  "SELECT * FROM user ORDER BY age ASC(DESC)" - вернет значения сортированные по возрастанию(убыванию)


}
