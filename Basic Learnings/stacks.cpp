#include <iostream> 
#include <stack> 

using namespace std; 

void showstack(stack<int> s){
    while (!s.empty()){ 
        cout << '\t' << s.top(); 
        s.pop(); 
    } 
    cout << '\n'; 
}

int main(){
    stack<int> s; 
    s.push(10); 
    s.push(30); 
    s.push(20); 
    s.push(5); 
    showstack(s);
    cout << s.size();
    cout << s.top();
}