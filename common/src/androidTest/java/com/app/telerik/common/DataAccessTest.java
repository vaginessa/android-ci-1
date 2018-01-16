package com.app.telerik.common;

import android.arch.persistence.room.Room;
import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.app.telerik.common.data.Product;
import com.app.telerik.common.data.StoreDatabase;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class DataAccessTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        StoreDatabase database = Room.databaseBuilder(appContext, StoreDatabase.class, "sqliteDBs").build();

        List<Product> products = database.productDao().getAll();
        assertEquals(0, products.size());
    }
}
