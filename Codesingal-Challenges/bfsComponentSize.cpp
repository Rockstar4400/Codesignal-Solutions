/*

CODEFIGHTS - BOTS - LEVEL 02 - BFSCOMPONENTSIZE

Help Source:


Given the adjacency matrix of an undirected graph with no loops or
multiple edges, find the size of the connected component of vertex 1 (0-based).

Example

For

matrix = [[false, true, false],
          [true, false, false],
          [false, false, false]]
the output should be
bfsComponentSize(matrix) = 2.

The component contains vertices 0 and 1.



For

matrix = [[false, false, true, false],
          [false, false, false, false],
          [true, false, false, true],
          [false, false, true, false]]
the output should be
bfsComponentSize(matrix) = 1.

The component consists of a single vertex 1.



Input/Output

[execution time limit] 0.5 seconds (cpp)

[input] array.array.boolean matrix

Adjacency matrix of the given graph.

Guaranteed constraints:
3 ≤ matrix.length ≤ 10,
matrix[i].length = matrix.length.

[output] integer

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
#include <queue>
using namespace std;

int bfsComponentSize(std::vector<std::vector<bool>> matrix) {

  std::vector<bool> visited(matrix.size(), false );
  std::queue<int> Queue;
  int componentSize = 0;

  visited[1] = true;
  Queue.push(1);

  while (Queue.size() > 0) {
    int currentVertex = Queue.front();
    Queue.pop();
    visited[currentVertex] = true;
    componentSize++;
    for (int nextVertex = 0; nextVertex < matrix.size(); nextVertex++) {
      if (matrix[currentVertex][nextVertex] && !visited[nextVertex]) {
        visited[nextVertex] = true;
        Queue.push(nextVertex);
      }
    }
  }

  return componentSize;
}

int main(){

    cout << bfsComponentSize({
                             {false,true,false},
                             {true,false,false},
                             {false,false,false}})
                             << '\n'; // 2

    cout << bfsComponentSize({{false,false,true,false},
                             {false,false,false,false},
                             {true,false,false,true},
                             {false,false,true,false}})
                             << '\n'; // 1

    cout << bfsComponentSize({{false,false,false},
                              {false,false,false},
                              {false,false,false}})
                             << '\n'; // 1

    cout << bfsComponentSize({{false,true,true},
                              {true,false,false},
                              {true,true,false}})
                             << '\n'; // 3

return 0;
}


