import androidx.room.Database
import androidx.room.RoomDatabase

/* @-data Package argument
part DB entities class, DB update 1, Keep schema false */
@Database(entities = [Item:class], version = 1, exportSchema = false)

// Base generate DB -> InventoryDatabase
abstract class InventoryDatabase : RoomDatabase() {}
  // define a companion object, 
  abstract fun userDao() : UserDao
  //
  companion object {
    
  }
