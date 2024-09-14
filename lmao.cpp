#include <iostream>
using namespace std;

int main(){
    int x;
    cout << "2 + 2 = ";
    cin >> x;
    while(x != 4){
        if(x != 4){    
            cout << "apakah kamu yakin?" << endl;
            cout << "2 + 2 = ";
            cin >> x;
        }
    }
    if(x == 4){
        cout << "jawaban benar, congrats, minum kopi gih";
    }
    return 0;
}

