interface Sorting {
    fun <T : Comparable<T>> sort(arr: Array<T>): Array<T>
}