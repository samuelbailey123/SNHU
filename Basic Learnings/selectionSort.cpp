#include <iostream> 
#include <vector>
#include <algorithm> 

using namespace std; 

// void selectionSort(vector<int> num){
//     for (int i=0; i<num.size(); i++){
//         int lowestNum = i; 
//         for (int j=i+1; i<num.size(); j++){
//             if (num[j] < lowestNum){
//                 lowestNum = j; 
//             }
//             swap(num[lowestNum], num[i]);
//         }
//     }
//}
void swap(int *xp, int *yp){  
    int temp = *xp;  
    *xp = *yp;  
    *yp = temp;  
}

void selectionSort(vector<int> array, int size) {
   int i, j, imin;
   for(i = 0; i<size-1; i++) {
      imin = i;   //get index of minimum data
      for(j = i+1; j<size; j++)
         if(array[j] < array[imin])
            imin = j;
         //placing in correct position
         swap(array[i], array[imin]);
   }
}

int main(){
    vector<int> test; 
    for (int i=10; i>0; i--){
        test.push_back(i); 
    }
    cout << "Unsorted: "; 
    for (int i=0; i<test.size(); i++){
        cout << test[i] << " "; 
    }cout << endl; 
    selectionSort(test,test.size()); 
    cout << "Sorted: ";  
    for (int j=0; j<test.size(); j++){
        cout << test[j] << " "; 
    }cout << endl; 

}