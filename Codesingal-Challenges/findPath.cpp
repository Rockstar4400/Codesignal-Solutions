/*

BOTS - FINDPATH

You are given an n × m matrix, which contains all the integers from 1 to n * m, inclusive,
 each exactly once.

Initially you are standing in the cell containing the number 1. On each turn you are allowed
 to move to an adjacent cell, i.e. to a cell that shares a common side with the one you are
 standing on now. It is prohibited to visit any cell more than once.

Check if it is possible to visit all the cells of the matrix in the order of increasing numbers
 in the cells, i.e. get to the cell with the number 2 on the first turn, then move to 3, etc.

Example

For

matrix = [[1, 4, 5],
          [2, 3, 6]]
the output should be
findPath(matrix) = true;

For

matrix = [[1, 3, 6],
          [2, 4, 5]]
the output should be
findPath(matrix) = false.

Input/Output

[execution time limit] 3 seconds (java)

[input] array.array.integer matrix

A non-empty 2-dimensional array of integers representing a rectangular matrix.

Guaranteed constraints:
1 ≤ matrix.length ≤ 5,
1 ≤ matrix[0].length ≤ 10,
1 ≤ matrix[i][j] ≤ 25.
 */

/* c = total count of cells with valid neighbors, minus count of all cells
 * p = previous number on current row (p is number left of current n)
 * P = ptr to 1st element of cur row, will become Q and then we have prev row
 * Q = ptr to element in prev row (*Q is number above current n).  Increment as we scan through
 *     current row.  Null if we're on the first row.
 *
 * Key insight: you don't have to find the starting point.  Just count all cells in the
 * matrix that have a valid neighbor and subtract the total number of cells.  Because the last
 * number doesn't have a valid neighbor, this difference will be -1, so I started off c (the count)
 * at 1 to offset that, and then when we're done, a count of 0 indicates the matrix is valid and return
 * true, otherwise false.
 *
 * For any cell, only need to check it against its neighbors to its left and above it.  We do not need
 * to directly check to the right or below, because the current node will be above or to the left of
 * some other nodes, and we'll check that edge then.  This way we don't double-count the edges, but
 * as long as an edge differs by 1 or -1, it's a valid neighbor.
 *
 * Therefore, take the difference between the left (n-p) and the top (n-*Q) and take the absolute value
 * (since not sure which is larger).  If that result is 1, it's a valid neighbor so add 1 to c.
 *
 * Size optimization:
 *
 * Subtract one for the current node, and add 0, 1, or 2 back to it for the number of valid edges
 * to the left and above.
 * --c += (abs(n-p) == 1) + (Q && (abs(n - *Q++) == 1))
 *
 * Optimization: replace == 1 with < 2 (since it's a non-negative number):
 * --c += (abs(n-p) < 2) + (Q && (abs(n - *Q++) < 2))
 *
 * But the best I found is this:
 * --c += 1/abs(n-p) + (Q && 1/abs(n - *Q++))
 *
 * 1/x is a way of testing x < 2, and has higher precedence so I could remove parenthesis.
 *
 * Use obligatory return value hack causing desired result to "land" in the proper register.
 *
 * Areas for improvement, maybe.  Braindump:
 * If I could get Q to point to initial values that are valid memory and far enough away from values in
 * the matrix, I could stop testing for Q's nullness and shave off more bytes.  But didn't find a working
 * solution in that area.
 * Also tried tracking the row by index instead of pointer, but that was a bigger solution too.
 * Unexplored idea: use a single loop and manage i,j directly.  Not going to persue due to time.
 *
 */


using namespace std;
#include <iostream>
#include <vector>


bool findPath(std::vector<std::vector<int>> matrix)
{
    typedef int h;// ?

    h k = matrix.size();
    h n = matrix[0].size();
    h j = -1, o = -1;

    for(h i=1; i<=k*n; i++)
        for(h y=0; y<k; y++)
            for(h x=0; x<matrix[y].size(); x++)
                if(i == matrix[y][x])
                {
                    if(j >= 0 && abs(x + y - j - o) != 1) return 0;
                    j = x;
                    o = y;
                }
    return 1;
}

int main() {

    vector<vector<int>> test1 = {{1,4,5},{2,3,6}};
    vector<vector<int>> test2 = {{1,3,6},{2,4,5}};
    vector<vector<int>> test3 = {{2,3,4,5},{1,8,7,6},{12,9,10,11}};

    cout << findPath(test1) << endl;
    cout << findPath(test2) << endl;
    cout << findPath(test3) << endl;

    return 0;
}


