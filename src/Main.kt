//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val pageVisitTracker = PageVisitTracker()
    pageVisitTracker.trackPageVisit("home")
    pageVisitTracker.trackPageVisit("about")
    pageVisitTracker.trackPageVisit("Promo")
    pageVisitTracker.trackPageVisit("Promo")
    pageVisitTracker.trackPageVisit("home")
    pageVisitTracker.trackPageVisit("about")
    pageVisitTracker.trackPageVisit("login")
    pageVisitTracker.trackPageVisit("about")
    pageVisitTracker.trackPageVisit("about")
    pageVisitTracker.trackPageVisit("login")








    val topVisitedPages = pageVisitTracker.getTopPages()
   println("Top 5 most visited pages")

    topVisitedPages.forEachIndexed{index,Pair ->
//        println("${index + 1}.${Pair.second} was visited ${Pair.second} times")

    }
    println(topVisitedPages)
}
class PageVisitTracker(){

    private val pageVisits = mutableMapOf<String,Int>()
    fun trackPageVisit(page:String){
        pageVisits[page] = pageVisits.getOrDefault(page,0) + 1 }
    fun getTopPages():List<Pair<String,Int>>{
        return pageVisits.toList().sortedByDescending{it.second}.take(5)
    }

}