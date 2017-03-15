// first solution
// O(3^n)

int tripleStep(int n){
    if (n ==  0){
        return 1;
    }
    else if(n < 3){
        return n;
    }
    return tripleStep(n - 1) + tripleStep(n - 2) + tripleStep(n - 3);
}



// O(n)

int steps(int n){
    int[] arr = new int[n+1];
        Arrays.fill(arr, -1);
    return steps(n, arr);
}

@overload
int steps(int n, int[]  memno){
    if(n == 0){return 1;}
    if(n < 3){
        memno[n] = n;
        return;
    }else if(memno[n]> -1]) {
        return memno[n];
    }
    memno[n] = steps(n -3 , memno) + steps(n -2, memno) + steps(n -1, memno);
    return memno[n];
}