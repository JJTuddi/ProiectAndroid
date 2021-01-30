package com.example.networkingaf.data;
/*
import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.networkingaf.CardviewOrar;

@Database(entities = Database.class, version = 1)
public abstract class OrarDatabase extends RoomDatabase {

    private static OrarDatabase instance;

    public abstract OrarDao orarDao();

    public static synchronized OrarDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    OrarDatabase.class, "orar_database").fallbackToDestructiveMigration().addCallback(roomCallBack).build();
        }
        return instance;
    }

    private static RoomDatabase.Callback roomCallBack = new RoomDatabase.Callback(){
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateDbAsyncTask(instance).execute();
        }

        @Override
        public void onOpen(@NonNull SupportSQLiteDatabase db) {
            super.onOpen(db);
        }
    };

    private static class PopulateDbAsyncTask extends AsyncTask<Void, Void, Void> {
        private OrarDao orarDao;

        private PopulateDbAsyncTask(OrarDatabase db) {
            orarDao = db.orarDao();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            orarDao.insert(new DateOrar("Curs AF", "08", "10", "Curs Smecher", "Online", 1));
            orarDao.insert(new DateOrar("Curs AF part 2", "10", "12", "Facem android", "Tot online", 2));
            orarDao.insert(new DateOrar("Curs AF", "10", "12", "Facem android", "Tot online", 3));
            orarDao.insert(new DateOrar("Curs AF", "10", "12", "Facem android", "Tot online", -1));
            return null;
        }
    }
}
*/