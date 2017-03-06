public class GCD {
    //m and n non negative 0,1,2,3,...
    //GCD greatest integer diviser 
	public int gcd(int a, int b) {

    if(a==b){
        return a;
    }
    else if(a<b){
        if(b%a ==0){
            return a;
        }
        return b%a;
    }
    else {
        if(a%b == 0){
            return b;
        }
        return a%b;
    }
	}
}//End class

