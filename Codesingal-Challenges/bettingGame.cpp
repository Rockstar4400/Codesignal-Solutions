
/*
 * CODEFIGHTS - BOTS - BETTINGGAME
 *
The detective is investigating a gambling case and is interrogating n suspects.
They are all telling the same story.

They were playing a game. Initially, they all had the same amount of money,
which was a positive integer. In each round, each of the players optionally
bet an arbitrary amount of money (no more than he or she had at the time)
into a common pot, which, after the round ended, was redistributed among
all the players in some way.

The detective knows exactly how much money each of the players had at the
end of their game and wants to determine whether it is possible that they
are telling the truth. Your task is to help him.

You are given an array l of non-negative integers of length n - the amount
money each player had after the game. Return true if it is possible the
players are telling the truth, and false otherwise.

Example

For l = [3, 4, 8], the output should be
bettingGame(l) = true.

One possible course of the game is that the players had 5 units of
money each and the game lasted only one round. During that round,
all players went all-in and bet 5 each. After the round ended, the pot of 15
was redistributed as [3, 4, 8];

For l = [4, 4, 5, 4], the output should be
bettingGame(l) = false.

Input/Output

[execution time limit] 0.5 seconds (cpp)

[input] array.integer l

An array of non-negative integers - the amounts of money each player allegedly had after the game.

Guaranteed constraints:
3 = l.length = 9,
0 = l[i] = 9.

[output] boolean

true if the end-state is possible, false otherwise.

[C++] Syntax Tips

// Prints help message to the console
// Returns a string
std::string helloWorld(std::string name) {
    std::cout << "This prints to the console when you Run Tests" << std::endl;
    return "Hello, " + name;
}
*/

#include <iostream>
#include <vector>
using namespace std;

bool bettingGame(std::vector<int> l) {

    int s = 0;
    for (int i = 0; i < l.size(); i++) { // Loop for sum of all elements of vector
        s += l[i];
    }

    if (s == 0) {
        return  false ; // THE SOLUTION IS: return false; BEFORE : return ...;
    }
    return s % (int) l.size() == 0;
}

int main(){

    cout << bettingGame({3,4,8}) << '\n'; // true
    cout << bettingGame({4, 4, 5, 4}) << '\n'; // false
    cout << bettingGame({0, 0, 0, 0, 0}) << '\n'; // false
    cout << bettingGame({4, 3, 1, 9, 1, 0, 3}) << '\n'; // true
    cout << bettingGame({5, 0, 0, 0}) << '\n'; // false
    cout << bettingGame({2, 5, 8, 4, 2, 3, 8, 3, 4}) << '\n'; // false
    cout << bettingGame({8, 8, 1, 3, 7, 9}) << '\n'; // true
    cout << bettingGame({0, 5, 2, 8, 6, 4, 2, 2}) << '\n'; // false
    cout << bettingGame({4, 9, 1, 7, 6, 6}) << '\n'; // false

    return 0;
}
