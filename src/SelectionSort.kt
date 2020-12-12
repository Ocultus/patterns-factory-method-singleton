class SelectionSort : Sorting {
    override fun <T : Comparable<T>> sort(arr: Array<T>): Array<T> {
        var minElem: Int
        for (i in arr.indices) {
            minElem = i
            for (j in i + 1 until arr.size) {
                if (arr[j] < arr[minElem]) {
                    minElem = j
                }
            }
            if (minElem != i) {
                val temp = arr[minElem]
                arr[minElem] = arr[i]
                arr[i] = temp
            }
        }
        return arr
    }
}