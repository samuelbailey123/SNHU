// #include <iostream> 
// #include <vector> 

// using namespace std; 

// int partition(vector<int> num, int low, int high){ 
//     int pivot = num[high];    // pivot 
//     int i = (low - 1);  // Index of smaller element 
//     for (int j = low; j <= high- 1; j++){ 
//         // If current element is smaller than or 
//         // equal to pivot 
//         if (num[j] <= pivot){ 
//             i++;    // increment index of smaller element 
//             swap(num[i], num[j]); 
//         } 
//     } 
//     swap(num[i + 1], num[high]); 
//     return (i + 1); 
// } 

// void swap(vector<int>& v, int x, int y);
// // void quicksort(vector<int> &vec, int L, int R) {
// //     int i, j, mid, piv;
// //     i = L;
// //     j = R;
// //     mid = L + (R - L) / 2;
// //     piv = vec[mid];
// //     while (i<R || j>L){
// //         while (vec[i] < piv)
// //             i++;
// //         while (vec[j] > piv)
// //             j--;
// //         if (i <= j){
// //             swap(vec, i, j);
// //             i++;
// //             j--;
// //         }
// //         else{
// //             if (i < R)
// //                 quicksort(vec, i, R);
// //             if (j > L)
// //                 quicksort(vec, L, j);
// //             return;
// //         }
// //     }
// //  }
// void quicksort(vector<int> num, int left, int right){
//     int i,j,mid,piv; 
//     i = left; 
//     j = right; 
//     mid = left + (right-left) /2; 
//     piv = num[mid];
//     while(i<right || j>left){
//         while(num[i] < piv)
//             i++;
//         while(num[j] > piv)
//             j--; 
//         if (i<=j){
//             swap(num,i,j); 
//             i++;
//             j--; 
//         }
//         else{
//             if(i<right)
//                 quicksort(num,i,right);
//             if(j>left)
//                 quicksort(num,left,j);
//                 return; 
//         }
//     }
// }
// void printArray(vector<int> num){ 
//     int i; 
//     for (i=0; i < num.size(); i++) 
//         printf("%d ", num[i]); 
//     printf("\n"); 
// } 
// void swap(vector<int>& v, int x, int y) {
//     int temp = v[x];
//     v[x] = v[y];
//     v[y] = temp;
// }

// int main(){
//     vector<int> vect;
//     for (int i=10; i>0; i--){
//         vect.push_back(i);
//     }
//     quicksort(vect,0,vect.size());
//     printArray(vect);

// }
#include <iostream> 
#include <vector> 

using namespace std; 

void swap(vector<int>& v, int x, int y) {
    int temp = v[x];
    v[x] = v[y];
    v[y] = temp;
}

int partition(vector<int> num, int left, int right, int pivot){
    while(left <= right){
        while(num[left] < pivot){
            left++; 
        }
        while(num[right] > pivot){
            right --;
        }
        if(left<=right){
            swap(num,left,right);
            left++;
            right--; 
        }
    }
    return left; 
}
void quickSort(vector<int> num, int left, int right){
    if(left >= right){
        return; 
    }
    int pivot = (left + right) / 2; 
    int index = partition(num,left,right,pivot);
    quickSort(num, left, index -1); 
    quickSort(num, index, right); 
}
void qs(vector<int> num){
    quickSort(num,0,num.size()-1);
}
void printArray(vector<int> num){ 
    int i; 
    for (i=0; i < num.size(); i++) 
        printf("%d ", num[i]); 
    printf("\n"); 
} 
int main(){
    vector<int> test; 
    for (int i=10; i<10; i--){
        test.push_back(i); 
    }
    qs(test);
    printArray(test);
    
}