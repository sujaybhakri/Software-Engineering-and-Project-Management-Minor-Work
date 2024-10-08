#include <stdio.h>
#include <assert.h>

int divide(int numerator, int denominator) {
    assert(denominator != 0); // Ensure denominator is not zero by using assert()
    return numerator / denominator;
}

int main() {
    int result = divide(10, 2);
    printf("Result: %d\n", result);

    result = divide(10, 0);
    printf("Result: %d\n", result);

    return 0;
}
