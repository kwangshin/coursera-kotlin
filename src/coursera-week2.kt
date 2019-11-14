fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}

fun isValidIdentifier(s: String): Boolean {
    if (s.isEmpty()) return false
    if (s[0] in '0'..'9') return false

    fun isValidCharacter(char: Char) =
        char == '_' || char in '0'..'9' ||
                char in 'a'..'z' || char in 'A'..'Z'

    for (char in s) {
        if (!isValidCharacter(char)) return false
    }

    return true
}