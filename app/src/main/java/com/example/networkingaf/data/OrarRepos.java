package com.example.networkingaf.data;
/*
import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

public class OrarRepos {
    private OrarDao orarDao;
    private LiveData<List<DateOrar>> allOrar;

    public OrarRepos(Application application) {
        OrarDatabase database = OrarDatabase.getInstance(application);
        orarDao = database.orarDao();
        allOrar = orarDao.getAll();
    }

    public void insert(DateOrar dateOrar) {
        new InsertOrarAsyncTask(orarDao).execute(dateOrar);
    }

    public void update(DateOrar dateOrar) {
        new UpdateOrarAsyncTask(orarDao).execute(dateOrar);
    }
    private static class UpdateOrarAsyncTask extends AsyncTask<DateOrar, Void, Void> {
        private OrarDao orarDao;

        private UpdateOrarAsyncTask(OrarDao orarDao) {
            this.orarDao = orarDao;
        }

        @Override
        protected Void doInBackground(DateOrar... dateOrars) {
            orarDao.update(dateOrars[0]);
            return null;
        }
    }

    public void delete(DateOrar dateOrar) {
        new DeleteOrarAsyncTask(orarDao).execute(dateOrar);
    }

    private static class DeleteOrarAsyncTask extends AsyncTask<DateOrar, Void, Void> {
        private OrarDao orarDao;

        private DeleteOrarAsyncTask(OrarDao orarDao) {
            this.orarDao = orarDao;
        }

        @Override
        protected Void doInBackground(DateOrar... dateOrars) {
            orarDao.delete(dateOrars[0]);
            return null;
        }
    }

    public void deleteWholeOrar() {
        new DeleteAllOrarAsyncTask(orarDao).execute();
    }

    private static class DeleteAllOrarAsyncTask extends AsyncTask<Void, Void, Void> {
        private OrarDao orarDao;

        private DeleteAllOrarAsyncTask(OrarDao orarDao) {
            this.orarDao = orarDao;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            orarDao.deleteWholeOrar();
            return null;
        }
    }

    public LiveData<List<DateOrar>> getAllOrar() {
        return allOrar;
    }

    private static class InsertOrarAsyncTask extends AsyncTask<DateOrar, Void, Void> {
        private OrarDao orarDao;

        private InsertOrarAsyncTask(OrarDao orarDao) {
            this.orarDao = orarDao;
        }

        @Override
        protected Void doInBackground(DateOrar... dateOrars) {
            orarDao.insert(dateOrars[0]);
            return null;
        }
    }
}
*/