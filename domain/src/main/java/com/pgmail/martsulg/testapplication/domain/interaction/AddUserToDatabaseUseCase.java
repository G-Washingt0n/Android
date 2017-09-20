package com.pgmail.martsulg.testapplication.domain.interaction;

import com.pgmail.martsulg.data.database.DatabaseManager;
import com.pgmail.martsulg.testapplication.domain.entity.AddUser;
import com.pgmail.martsulg.testapplication.domain.entity.Country;
import com.pgmail.martsulg.testapplication.domain.entity.User;
import com.pgmail.martsulg.testapplication.domain.interaction.base.UseCase;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.annotations.NonNull;

/**
 * Created by lenovo on 05.09.2017.
 */

public class AddUserToDatabaseUseCase extends UseCase<AddUser, Void> {
    @Override
    protected Observable<Void> buildUseCase(final AddUser param) {


        final DatabaseManager databaseManager = new DatabaseManager(param.getContext());
        return Observable.create(new ObservableOnSubscribe<Void>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<Void> e) throws Exception {
                DatabaseManager databaseManager1 = new DatabaseManager(param.getContext());
                databaseManager.open(true);
                databaseManager.insertUser( convert(param.getUser()));
                databaseManager.close();


            }
        }).just(null);
    }

    private com.pgmail.martsulg.data.DBentity.User convert(User user){
        com.pgmail.martsulg.data.DBentity.User userData = new com.pgmail.martsulg.data.DBentity.User();
        userData.setName(user.getName());
        userData.setAge(user.getAge());
        userData.setCountry(convertCountry(user.getCountry()));
        userData.setId(user.getId());

        return userData;

    }


    private com.pgmail.martsulg.data.DBentity.Country convertCountry(Country country){
        com.pgmail.martsulg.data.DBentity.Country countryData = new com.pgmail.martsulg.data.DBentity.Country();
        countryData.setName(country.getName());
        countryData.setId(country.getId());

        return countryData;

    }

}
