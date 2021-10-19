#include <iostream>
using namespace std;
class A {

    public: A(){
        cout << "A "; 
        
    } 
    ~A(){
        cout << "~A ";
    }
};
class B : public A{
    public: B(){ 
        cout << "B "; 
    } 
    ~B(){
        cout << "~B "; 
    }
};
int main(int argc, char** arg){ 
    A* a = new B( ); 
    delete a;
    cout << endl; 

    B* b = new B( ); 
    delete b;

    cout << endl; 
    A* a1 = new A();
    delete a1;
    return 0;
}