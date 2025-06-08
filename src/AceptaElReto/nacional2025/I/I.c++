#include <iostream>

using namespace std;
int main() {
    int c;

    cin >> c;
    for (int j = 0; j < c; ++j) {
        int n;

        cin >> n;
        int res = 1;
        for (int i = 2 ; i <= n; i++) {
            res += (i - 1) * 6;
        }
        cout << res << endl;
    }
    
}