package com.hadihariri.kotlincourse.inheritance

class GenericRepository<T> : Repository<T> {
    override fun getById(id: Int): T {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAll(): List<T> {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

interface Repo {
    fun <T> getById(id: Int): T
    fun <R> getAll(): List<R>
}

class MyRepo: Repo {
    override fun <T> getById(id: Int): T {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T> getAll(): List<T> {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}