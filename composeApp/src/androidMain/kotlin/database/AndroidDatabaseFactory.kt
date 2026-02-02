package database

import android.content.Context
import app.cash.sqldelight.driver.android.AndroidSqliteDriver

class AndroidDatabaseFactory(
    private val context: Context
) : DatabaseFactory {

    override fun create(clean: Boolean): MokAppDatabase {
        val driver = AndroidSqliteDriver(
            schema = MokAppDatabase.Schema,
            context = context,
            name = "mokapp.db"
        )

        if (clean) {
            MokAppDatabase.Schema.drop(driver)
            MokAppDatabase.Schema.create(driver)
        }

        return MokAppDatabase(driver)
    }
}
