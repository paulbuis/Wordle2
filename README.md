# Project 1: Wordle

The `main()` for this project is in the file
`Wordle2.java`. That file is where you need to make
all the changes to the code to make this project work.

Note that, as it is, the program has Wordle clues
coded directly into string literals. Your assignment
is to make it interactive. That is, your program should
repeatedly:

* Prompt the user for input with a `>`
   * if the input is the End-Of-File (Ctrl-Z or Ctrl-D
     depending on your OS.), end the program
   * if the input is the empty string, end the program
* Call `ClueParser.parseClues()` on the input string to get
  an object of type `ClueList`. Append the new `ClueList` to
  an existing `ClueList` using the `ClueList` method `addAll()`.
* Take the combined `ClueList` and pass it to the `Wordle2` class
  method named `outputLikelyWords()`

Note: this program doesn't work on clues generated
from guesses with repeated letters!

To test your program, note that there is output being
generated at the beginning of `outputLikelyWords()` that
comes from converting each clue in the combined `ClueList` into a String.
Similarly, the output generated from `parseClues()`
is generated by reversing the parsing process, so each
input string should be echoed back.

Test your program by letting it help you play either
the original [Wordle](https://www.powerlanguage.co.uk/wordle/)
game (a new puzzle every day by Josh Wardle) or by solving
puzzles in the
[Wordle Archive](https://www.devangthakkar.com/wordle_archive/).

For help on how to play Wordle, use
Google: there are lots of articles out there
that suggest all sorts of strategies, especially
on what to use as one's first guess.