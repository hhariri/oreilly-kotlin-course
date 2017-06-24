package coroutines


import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import rx.Observable

interface GitHub {
    @GET("orgs/{user}/repos")
    fun orgRepos(@Path("user") user: String): Observable<List<Repo>>
}

data class Repo(val name: String)
fun hello(value: String = "It's me") {

}
fun main(args: Array<String>) {
    val retrofit = Retrofit.Builder().apply {
        baseUrl("https://api.github.com")
        addConverterFactory(GsonConverterFactory.create())
        addCallAdapterFactory(RxJavaCallAdapterFactory.create())
    }.build()

    val github = retrofit.create(GitHub::class.java)

    // SEE README_FIRST.txt

    /*asyncRx<Unit> {
        for (org in listOf("Kotlin", "ReactiveX")) {
            val result = github.orgRepos(org).take(5).awaitSingle()
            val repos = result.joinToString()
            println("$org: $repos")
        }
    }*/
}