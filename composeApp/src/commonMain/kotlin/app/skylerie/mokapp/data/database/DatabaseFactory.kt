package app.skylerie.mokapp.data.database

import app.skylerie.mokapp.MokAppDatabase

interface DatabaseFactory {
    fun create(clean: Boolean = false): MokAppDatabase
}

