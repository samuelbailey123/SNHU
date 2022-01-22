#include <iostream> 
#include <list> 
#include <iterator>

using namespace std; 

void printList(list<int> const &list){
    copy(list.begin(),list.end(), ostream_iterator<int>(cout, "\n"));
}

int main(){
    list<int> newList; 
    newList.push_back(0); 
    printList(newList);
}