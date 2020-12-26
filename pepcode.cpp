#include<iostream>
using namespace std;

int multiply(int a,int b)
{
    int c = a*b;
 return c;
}

int add(int a,int b)
{
    int c = a + b;
 return c;
}

int subtract(int a,int b)
{
    int c = b - a;
 return c;
}

int divide(int a,int b)
{
    int c = b / a;
 return c;
}

void printmessage(){
    cout<<"see you soon";
}

void printtableofN(int n){

 for(int i=1;i<=10;i++){

    cout<< to_string(n) + " X " + to_string(i)+ " = " + to_string(n * i)<< endl; 

   }
}
void printtabletillM(int m){
for( int i=1; i<=m;i++){
    printtableofN(i);
    cout<<endl;
}

} 
void oddEven(int n){
  int c = n % 2;
  if(c==0){
    cout<<n<<" -> even"<<endl;
  }
  else {
    cout<<n<<" -> odd"<<endl;
  }
}

void serialorderoddeven(int m){
     for(int i = 1;i <= m; i++){
         oddEven(i);
        
      }
}

void arrayoddeven(int *h){
  int a[100],len;
  for(int i=1;*h!='\0';i++){
     *h++;
     len++;

  }
}

void randomoddeven(int x){
    int a;       
    for(int i = 1; i <= x; i++){
        cin>> a;
        oddEven(a);
        
    }
}
bool isprime_(int n){
    bool prime = true;
    for(int i = 2; i*i <= n; i++){
        if(n % i == 0){
            prime =false;
            break;
        }
    }
    return prime;

}

void isprime(){
    int n;
    cin >> n;
    bool ans = isprime_(n);
    
    if(ans) cout<<"prime"<<endl;
    else cout<<"not prime"<<endl;
}

void primetillN(int low,int high){
  for(int i = low; i <= high; i++){
   bool ans = isprime_(i);
    if(ans) cout<<i<<" is prime";
  
  else{
    cout<<i<<" is not prime";
  }
}
}
int countdigits(int n){
  int count = 0;
  while(n != 0){
    n /= 10;
    count++;
  }
}

int reverseNumber(int n){
    int ans = 0;
    while(n != 0){
        int lastDigit = n % 10;
        n /= 10;
        
        ans = ans * 10 + lastDigit;
              
    }
    cout<<ans<<endl; 
    return ans;
    
}

//  digits of number using reverse number.
void digitsofNumber(int n){ 
     
  int ans = 0;
    while(n != 0){
        int lastDigit = n % 10;
        n /= 10;
        
        ans = ans * 10 + lastDigit;
              
    }

    while(ans!= 0){
        int lastDigit = ans % 10;
        ans /= 10;
        
        cout << lastDigit << endl;
    }
}
// digits of  a number  using power.
int powerOf10(int n){
    int power = 1;
    n /=10;
    while(n != 0){
        n /= 10;
        power *= 10;
    }
    
    return power;
}

void printDigits(int n){
    int power = powerOf10(n);
    while(power != 0){
        int num = n / power;
        int ld = num % 10;
        cout << ld <<endl;
        
        power /= 10;
    }
}

// end

void fibonaccitillN(int n){               // starting from 0
  int x = 0, y = 1;
  cout<< x <<endl<< y <<endl;
  for(int i = 1; i < n - 1 ; i++){
    int c = x + y;
    x = y;
    y = c; 
    cout<< c <<endl;
  }
}


void fibonaccifromN(int p, int q, int n){     // starting from a particular number 'p', goes till 'n' digits.
   cout<< p << endl << q << endl;
   
   for(int i = 1; i < n - 1 ; i++){
      int c = p + q;
      p = q;
      q = c; 
      cout<< c << endl;
    }
  
}

int gcd(int a, int b){                // greatest common divisor.

  int divisor = a;
  int dividend = b;

  while(dividend % divisor != 0){
    int rem = dividend % divisor;
    dividend = divisor;
    divisor = rem;
  }

   return divisor;
}

int lcm(int a,int b,int gcd){
  return (a * (b / gcd));
}

int digits(int n)
{
    int count = 0;
    while(n != 0){
        count++;
        n /= 10;
    }
    return count;
}

int rotate(int n, int r){          // rotating a number at axis = r.
    int len = digits(n);
    r %= len;
    if(r<0) r += len;
    int mul = 1;
    int div = 1;

    for (int i = 1;i <= len; i++){
        if(i <= r) div *= 10;
        else mul *= 10;
    }

    int a = n % div;
    int b = n / div;

return a * mul + b;
}

void pythagoreanTriplet(){
  int a,b,c;  
   bool ans; 
    if(a * a + b*b == c*c || a * a + c*c == b*b || c*c + b*b == a*a ){
     ans = true; 
      }

    cout << (boolalpha) << ans <<endl; 
}

void perfectsquaretillN(int n){           // Curious case of benjamin bulbs.
  for(int i = 1; i*i <= n ; i++ ){
        cout << i*i << endl;
    }

}

int main()
{
// cout<<"Hello"<<endl;
// cout<<"Pepcoders"<<endl;    

//   int a,b;
//   cin>> a >> b; 
//    cout<< multiply(a,b) <<endl;
//     cout<< add(a,b) <<endl;
//     cout<< subtract(a,b) <<endl;
//     cout<< divide(a,b) <<endl;
//   printmessage();

// printtableofN(8);

// int y ;
// cin >>y;
// printtabletillM(y);
// randomoddeven(y);
// serialorderoddeven(54);
//manyoddeven(a);
// fibonaccitillN(y);
// fibonaccifromN(5,8,9);
// lastdigit(54865);
// reverseNumber(54683);
// digitsofNumber(54862);
// int g = gcd (num1,num2);
// int l = lcm(num1,num2,g);
// cout<<g << endl << l <<endl;
// rotatenumber(548647,2);

return 0;
}