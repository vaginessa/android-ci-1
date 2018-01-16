package com.app.telerik.common.data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by Giansalex on 16/01/2018.
 */

@Database(entities = {Product.class}, version = 1)
public abstract class StoreDatabase extends RoomDatabase {
    public abstract ProductDao productDao();
}