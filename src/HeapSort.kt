class HeapSort : Sorting {
    override fun <T : Comparable<T>> sort(arr: Array<T>): Array<T> {
        for (i in ((arr.size / 2) - 1) downTo 0) {
            siftDown(arr, i, arr.size - 1)
        }
        for (i in arr.size - 1 downTo 1) {
            val temp = arr[0]
            arr[0] = arr[i]
            arr[i] = temp
            siftDown(arr, 0, i - 1)
        }
        return arr
    }

    private fun <T : Comparable<T>> siftDown(arr: Array<T>, rootIndex: Int, lastIndex: Int) {
        val leftChildIndex = (2 * rootIndex) + 1
        val rightChildIndex = (2 * rootIndex) + 2
        var maxElemIndex = rootIndex
        if (leftChildIndex <= lastIndex && arr[leftChildIndex] > arr[rootIndex]) {
            maxElemIndex = leftChildIndex
        }
        if (rightChildIndex <= lastIndex && arr[rightChildIndex] > arr[maxElemIndex]) {
            maxElemIndex = rightChildIndex
        }

        if (maxElemIndex != rootIndex) {
            val temp = arr[rootIndex]
            arr[rootIndex] = arr[maxElemIndex]
            arr[maxElemIndex] = temp
            siftDown(arr, maxElemIndex, lastIndex)
        }

    }

}