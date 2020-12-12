class InsertionSort : Sorting {
    override fun <T : Comparable<T>> sort(arr: Array<T>): Array<T> {
        for (i in 1 until arr.size) {
            val key: T = arr[i]
            var j: Int = i - 1
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]
                j--
            }
            arr[j + 1] = key
        }
        return arr
    }

}