package database

import android.content.Context
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import app.skylerie.mokapp.MokAppDatabase
import app.skylerie.mokapp.data.database.DatabaseFactory

class AndroidDatabaseFactory(
    private val context: Context
) : DatabaseFactory {

    override fun create(clean: Boolean): MokAppDatabase {
        if (clean) {
            context.deleteDatabase(DB_NAME)
        }

        val driver = AndroidSqliteDriver(
            schema = MokAppDatabase.Schema,
            context = context,
            name = DB_NAME
        )

        return MokAppDatabase(driver)
    }

    private companion object {
        const val DB_NAME = "mokapp.db"
    }
}
