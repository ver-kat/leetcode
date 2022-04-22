// 706. Design HashMap

class MyHashMap(var myList: MutableList<Pair<Int, Int>> = mutableListOf()) {

    fun put(key: Int, value: Int) {
        remove(key)
        myList.add(Pair(key, value))
    }

    fun get(key: Int): Int {
        return myList.filter {
            it.first == key
        }.firstOrNull()?.second ?: -1
    }

    fun remove(key: Int) {
        myList = myList.filter {
            it.first != key
        }.toMutableList()
    }
}
