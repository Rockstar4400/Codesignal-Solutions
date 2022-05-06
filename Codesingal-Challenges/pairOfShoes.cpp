/*
 * CODEFIGHTS - BOT: PAIR OF SHOES
 *
 * Yesterday you found some shoes in you room. Each shoe is described
 * by two values.
 *
 * types indicates if it's a left or a right shoe;
 * size is the size of the shoe.
 * Your task is to check whether it is possible to pair the shoes
 * you found in such a way that each pair consists of a right
 * and a left shoe of an equal size.
 *
 * Example:
 *
 * For
 *
 * shoe = [[0,21],
 *         [1,23],
 *         [1,21],
 *         [0,23]]
 *
 * the output should be
 *
 * pairOfShoes(shoes) = true;
 *
 * For
 *
 * shoes = [[0,21],
 *          [1,23],
 *          [1,21],
 *          [1,23]]
 *
 * the output should be
 *
 * pairOfShoes(shoes) = false
 *
 * Input/Output
 *
 * [time limit] 500ms
 * [input] array.array.integer shoes
 *
 * Array of shoes. Each shoes is given in the format [type, size],
 * where type is either 0 or 1 for left and right respectively,
 * and size is a positive integer.
 *
 * Constraints:
 *
 * 1 = shoes.length = 25,
 * 1 = shoes.[i][1] = 100.
 *
 * [output]booleans
 *
 * true if it is possible to pair the shoes, false otherwise.
 *
 */

#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

bool pairOfShoes(vector<vector<int>> shoes) {
    vector<int> leftShoes, rightShoes; // Declared Right and Left vectors

    for (int i = 0; i < shoes.size(); i++) { // Iteration
        if (shoes[i][0] == 0) { // Condition
            leftShoes.push_back(shoes[i][1]);// then push_back in leftShoes [1] in [i] index)
        } else {
            rightShoes.push_back(shoes[i][1]);// then push_back in rightShoes [1] in [i] index
        }
    }

    /*
    ERROR:
    std::reverse(leftShoes.begin(), leftShoes.end()); // Reverse vector leftShoes
    replace:
    BECAUSE: INVERT AND ORDER BOTH VECTORS CAUSE COMPARE NOT MATCH
    */
    sort(leftShoes.begin(), leftShoes.end()); // Reverse vector leftShoes
    sort(rightShoes.begin(), rightShoes.end()); // Sort vector rightShoes

    /* THIS IS FOR VIEW THE SIZE IN EACH SHOES
     for(int i = 0;i < leftShoes.size();i++){
        std::cout << leftShoes[i] << " ";
    }
    std::cout << '\n';

    for(int i = 0;i < rightShoes.size();i++){
        std::cout << rightShoes[i] << " ";
    }
    std::cout << '\n';
    */

    if (leftShoes.size() != rightShoes.size()) {
        return false;
    }
    for (int i = 0; i < leftShoes.size(); i++) {
    if (leftShoes[i] != rightShoes[i]) {
            return false;
        }
    }

    return true;
}

int main() {

    cout << pairOfShoes({{0,21},{1,23},{1,21},{0,23}}) << '\n'; // true
    cout << pairOfShoes({{0,21},{1,23},{1,21},{1,23}}) << '\n'; // false

    return 0;
}