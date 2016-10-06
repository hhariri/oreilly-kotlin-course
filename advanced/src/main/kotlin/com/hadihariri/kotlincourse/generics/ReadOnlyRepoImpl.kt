package com.hadihariri.kotlincourse.generics

class ReadOnlyRepoImpl<out T> : ReadOnlyRepo<T> {
    override fun getId(id: Int): T {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAll(): List<T> {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}