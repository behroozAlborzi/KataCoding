class SmallestIntegerFinder {
//    fun findSmallestInt(nums: List<Int>): Int = nums.minOf { it }
    fun findSmallestInt(nums:List<Int>):Int = nums.sortedWith(compareBy{it}).first()

}
