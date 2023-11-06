/*
Length of the longest substring without repeating characters
Given a string str, find the length of the longest substring without repeating characters.

Example:
For “ABDEFGABEF”, the longest substring are “BDEFGA” and “DEFGAB”, with length 6.

For “BBBB” the longest substring is “B”, with length 1.

For “GEEKSFORGEEKS”, there are two longest substrings shown in the below diagrams, with length 7

*/


fun main(args: Array<String>) {
    val testText = "ABDEFGABEF"
    val splitString = testText.split("")
    var longestString = ""
    for (i in 0..<splitString.size) {
        var localLongestString = splitString[i]
        for (j in i + 1..<splitString.size) {
            if (localLongestString.contains(splitString[j])) {
                if (localLongestString.length > longestString.length) {
                    longestString = localLongestString
                }
                break
            } else {
                localLongestString = "$localLongestString${splitString[j]}"
            }
        }
    }

    print(longestString)
    print(longestString.length)
}