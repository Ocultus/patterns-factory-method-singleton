class BubbleSort : Sorting {
    override fun <T : Comparable<T>> sort(arr: Array<T>): Array<T> {
        var swap: Boolean
        do {
            swap = false
            for (i in 0..arr.size - 2) {
                if (arr[i] > arr[i + 1]) {
                    val temp = arr[i]
                    arr[i] = arr[i + 1]
                    arr[i + 1] = temp
                    swap = true
                }
            }
        } while (swap)
        return arr
    }
}