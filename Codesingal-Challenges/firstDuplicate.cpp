/*
 * First Duplicate
 *
 * Source help:
 *
 * Note: Write a solution with O(n) time complexity and O(1) additional space
 * complexity, since this is what you would be asked to do during a real interview.
 *
 * Given an array a that contains only numbers in the range from 1 to a.length,
 * find the first duplicate number for which the second occurrence has the minimal
 * index. In other words, if there are more than 1 duplicate numbers, return the
 * number for which the second occurrence has a smaller index than the second
 * occurrence of the other numbers does. If there are no such elements, return -1.
 *
 * Example:
 *
 * For a = [2,3,3,1,5,2], the output should be firstDuplicate(a) = 3.
 *
 * There are 2 duplicates: numbers 2 and 3. The second occurrence of 3 has a
 * smaller index than than second occurrence 2 does, so the answer is 3.
 *
 * For a = [2,34,3,5,1], the output should be firstDuplicate(a) = -1.
 *
 * input/output
 *
 * [time limit]500ms
 *
 * [input]array.integer a
 *
 * Guaranteed constraints:
 * 1 <= a.length <= 10^5,
 * 1 <= a[i] <= a.length.
 *
 * [output]integer
 *
 * The element in a that occurs in the array more than once and has the
 * minimal index for its second occurrence. If there are no such elements,
 * return -1.
 *
 */

#include <iostream>
#include <vector>

int firstDuplicate(std::vector<int> a) {

    std::vector<int> duplicate;
    duplicate = a;

    for(int i = 1; i < a.size(); i++) {
       while(duplicate[i] != a[i]) {
           return -1;
       }
    }
}

int main() {
    std::cout<< firstDuplicate({2, 3,3, 1, 5, 2});
    return 0;
}