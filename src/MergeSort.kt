import kotlin.math.floor

class MergeSort : Sorting {
    override fun <T : Comparable<T>> sort(arr: Array<T>): Array<T> {
        sortArrPart(arr, 0, arr.size - 1)
        return arr
    }

    private fun <T : Comparable<T>> sortArrPart(arr: Array<T>, beginIndex: Int, endIndex: Int) {
        if (endIndex - beginIndex + 1 != 1) {
            val middleElemIndex = floor((beginIndex + endIndex) / 2.0).toInt()
            sortArrPart(arr, beginIndex, middleElemIndex)
            sortArrPart(arr, middleElemIndex + 1, endIndex)
            merge(arr, beginIndex, middleElemIndex, endIndex)
        }
    }

    private fun <T : Comparable<T>> merge(arr: Array<T>, beginIndex: Int, middleElemIndex: Int, endIndex: Int) {
        val leftArr = arr.copyOfRange(beginIndex, middleElemIndex + 1)
        val rightArr = arr.copyOfRange(middleElemIndex + 1, endIndex + 1)
        var i = 0
        var j = 0
        for (k in beginIndex..endIndex) {
            if ((i <= leftArr.size - 1) && ((j >= rightArr.size) || (leftArr[i] <= rightArr[j]))) {
                arr[k] = leftArr[i]
                i++
            } else {
                arr[k] = rightArr[j]
                j++
            }
        }


    }
}