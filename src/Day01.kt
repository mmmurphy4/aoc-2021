import readInput

fun main() {
    fun part1(input: List<Int>): Int {
        return input.foldIndexed(0) { i, acc, it ->
            if (i > 0 && input[i - 1] < it) acc + 1 else acc
        }
    }

    fun part2(input: List<Int>): Int {
        return input.foldIndexed(0) { i, acc, it ->
            if (i > 2) {
                val curr = input[i-3] + input[i-2] + input[i-1]
                val next = input[i-2] + input[i-1] + input[i]
                if (curr < next) acc + 1 else acc
            } else acc
        }
//        var inc = 0
//        input.map { it.toBigInteger() }.let { inputNum ->
//            for (i in inputNum.indices) {
//                if (i + 3 >= inputNum.size) break
//                if (inputNum[i] + inputNum[i + 1] + inputNum[i + 2] < inputNum[i + 1] + inputNum[i + 2] + inputNum[i + 3]) inc++
//            }
//        }
//        return inc
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test").map { it.toInt() }
    check(part1(testInput) == 7)


    val input = readInput("Day01").map { it.toInt() }
    println(part1(input))
    println(part2(input))
}
