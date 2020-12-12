import kotlin.random.Random

fun main() {
    //Test Bubble sort
    val testArray: Array<Int> = Array(100) { Random.nextInt(0, 10000) }
    print("Bubble sort|Before sorting:\n")
    testArray.forEach { print("$it ") }
    SortingFactory.getSort(SortingTypes.BubbleSort).sort(testArray)
    print("\nAfter sorting:\n")
    testArray.forEach { print("$it ") }

    //Test Merge sort
    val testArray1: Array<Int> = Array(100) { Random.nextInt(0, 10000) }
    print("\n\nMerge sort|Before sorting:\n")
    testArray1.forEach { print("$it ") }
    SortingFactory.getSort(SortingTypes.MergeSort).sort(testArray1)
    print("\nAfter sorting:\n")
    testArray1.forEach { print("$it ") }

    //Test Insertion sort
    val testArray2: Array<Int> = Array(100) { Random.nextInt(0, 10000) }
    print("\n\nInsertion Sort|Before sorting:\n")
    testArray2.forEach { print("$it ") }
    SortingFactory.getSort(SortingTypes.InsertionSort).sort(testArray2)
    print("\nAfter sorting:\n")
    testArray2.forEach { print("$it ") }

    //Test Quick sort
    val testArray3: Array<Int> = Array(100) { Random.nextInt(0, 10000) }
    print("\n\nQuick sort|Before sorting:\n")
    testArray3.forEach { print("$it ") }
    SortingFactory.getSort(SortingTypes.QuickSort).sort(testArray3)
    print("\nAfter sorting:\n")
    testArray3.forEach { print("$it ") }

    //Test Heap sort
    val testArray4: Array<Int> = Array(100) { Random.nextInt(0, 10000) }
    print("\n\nHeap sort|Before sorting:\n")
    testArray4.forEach { print("$it ") }
    SortingFactory.getSort(SortingTypes.HeapSort).sort(testArray4)
    print("\nAfter sorting:\n")
    testArray4.forEach { print("$it ") }

    //Test Selection sort
    val testArray5: Array<Int> = Array(100) { Random.nextInt(0, 10000) }
    print("\n\nSelection sort|Before sorting:\n")
    testArray5.forEach { print("$it ") }
    SortingFactory.getSort(SortingTypes.SelectionSort).sort(testArray5)
    print("\nAfter sorting:\n")
    testArray5.forEach { print("$it ") }

}