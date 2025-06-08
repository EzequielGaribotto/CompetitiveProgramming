#include <iostream>
#include <map>
#include <sstream>
#include <vector>
#include <algorithm>


using namespace std;
int main() {
    int c;

    cin >> c;

    while (c != 0) {
        map<int, int> inventario;
    for (int i = 0; i < c; ++i) {
        int id, v;
        cin >> id >> v;
        inventario[id] += v;
    }
    int t;
    cin >> t;
    cin.ignore();
    for (int i = 0; i < t; ++i) {
        string op;
        string linea;
        vector<string> transacciones;
        getline(cin, linea);
        istringstream stream(linea);
        string trans;
        if(stream >> trans) {
            op = trans;
        }
        if (op == "comprar") {
            string value;
            int id;
            if (stream >> value) {
                id = stoi(value);
            }
            int v;
            if (stream >> value) {
                v = stoi(value);
            }
            inventario[id] += v;
        }
        else if (op == "vender") {
            string value;
            int id;
            if (stream >> value) {
                id = stoi(value);
            }
            inventario[id] -= 1;
        }
    }
    vector <pair<int, int>> vec(inventario.begin(), inventario.end());
    sort(vec.begin(), vec.end(), [](const auto& a, const auto& b) {
        return a.first < b.first; });

    for (const auto& p : vec) {
        if (p.second != 0) {
            cout << p.first << " " << p.second << endl;
        } 
    }
    cout << "---" << endl;
    cin >> c;
    }   
}