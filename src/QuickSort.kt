class QuickSort : Sorting {
    override fun <T : Comparable<T>> sort(arr: Array<T>): Array<T> {
        sortArrPart(arr, 0, arr.size - 1)
        return arr
    }

    private fun <T : Comparable<T>> sortArrPart(arr: Array<T>, beginIndex: Int, endIndex: Int) {
        if (beginIndex < endIndex) {
            val pivot = partition(arr, beginIndex, endIndex)
            sortArrPart(arr, beginIndex, pivot - 1)
            sortArrPart(arr, pivot + 1, endIndex)
        }
    }

    private fun <T : Comparable<T>> partition(arr: Array<T>, beginIndex: Int, endIndex: Int): Int {
        val pivot = arr[endIndex]
        var i = beginIndex - 1
        for (j in beginIndex until endIndex) {
            if (arr[j] <= pivot) {
                i++
                val temp = arr[j]
                arr[j] = arr[i]
                arr[i] = temp
            }
        }

        val temp = arr[endIndex]
        arr[endIndex] = arr[i + 1]
        arr[i + 1] = temp
        return i + 1
    }
}