import androidx.room.Database
import androidx.room.RoomDatabase

// data Package argument
// Another entities class, update version 1, Keep schema false
@Database(entities = [Item:class], version = 1, exportSchema = false)

// InventoryDatabase -> RoomDatabase
abstract class InventoryDatabase : RoomDatabase() {}
