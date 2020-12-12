object SortingFactory {
    fun getSort(type: SortingTypes): Sorting {
        return when (type) {
            SortingTypes.QuickSort -> QuickSort()
            SortingTypes.BubbleSort -> BubbleSort()
            SortingTypes.MergeSort -> MergeSort()
            SortingTypes.InsertionSort -> InsertionSort()
            SortingTypes.SelectionSort -> SelectionSort()
            SortingTypes.HeapSort -> HeapSort()
        }
    }
}