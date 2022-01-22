#include <iostream> 

using namespace std; 

struct person{
    int age; 
    string name; 
};

class Node{
    public: 
        int data; 
        Node* next;
        Node* tail; 
        Node* head; 
        person people; 
};
    Node* head = NULL; 
    Node* tail = NULL; 
    Node* second = NULL; 

void printLinkedList(Node* n){// somehow prints a zero at the end, not sure how 
    while (n!=nullptr){
        cout << n->people.name << " " << n->people.age << endl; 
        n = n->next; 
    }
    cout << endl; 
}

void addNewPerson(){//function gives segmentation error, not working
    person people; 
    cout << "What is the name: " << endl; 
    cin >> people.name; 
    cout << "What is the age: " << endl; 
    cin >> people.age; 
    if (head != nullptr){
        head->people = people; 
    }else{
        tail->people = people; 
    }
    printLinkedList(head);
}

int main(){
    Node* head = NULL; 
    Node* tail = NULL; 
    Node* second = NULL; 

    person people; 
    people.age = 23; 
    people.name = "sam"; 

    person people2; 
    people2.age = 11; 
    people2.name = "bailey"; 

    head = new Node(); 
    second = new Node(); 
    //tail = new Node(); 
    
    head->people = people; 
    head->next = second; 
    second->people = people2; 
    second->next = tail; 
    tail = nullptr; 

    printLinkedList(head); 
    // cout << head->people.name << endl; 
    // cout << head->people.age << endl; 
    // cout << second->people.name << endl; 
    // cout << second->people.age << endl; 

    for (int i =0; i<5; i++){
        person people; 
        cout << "Enter name: " << endl; 
        cin >> people.name; 
        cout << "Enter age: " << endl; 
        cin >> people.age; 
        if (head == nullptr){
            head->people; 
        }else{
            second->people; 
        }
    }
    
    

}