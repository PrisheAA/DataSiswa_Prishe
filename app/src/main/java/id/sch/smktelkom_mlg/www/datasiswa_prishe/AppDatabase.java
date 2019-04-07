package id.sch.smktelkom_mlg.www.datasiswa_prishe;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {SiswaModel.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract SiswaDao userDao();
}
