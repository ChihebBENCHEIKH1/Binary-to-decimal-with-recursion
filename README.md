# Binary to Decimal with Recursion

The "Binary to Decimal with Recursion" app is a simple Java application that converts a binary number to its decimal equivalent using recursion.

## How It Works

The app takes a binary number as input and recursively calculates its decimal value. It follows these steps:

1. The binary number is provided as input to the recursive function.
2. The function checks the base case:
   - If the binary number is empty or has only one digit, it returns the value of that digit.
3. If the base case is not met, the function proceeds to the recursive step:
   - It takes the first digit of the binary number and multiplies it by 2 raised to the power of the remaining digits.
   - It recursively calls itself with the remaining digits of the binary number.
   - It adds the calculated value from the previous step to the value returned by the recursive call.
4. Finally, the function returns the decimal equivalent of the binary number.

## Usage

To use the "Binary to Decimal with Recursion" app, follow these steps:

1. Compile the Java source file:
   ```shell
   javac BinaryToDecimal.java
```
2. Run the application:
 ```shell
java BinaryToDecimal
```
Enter a binary number when prompted.

The app will calculate and display the decimal equivalent of the binary number.
## Example
Let's say we want to convert the binary number "1010" to decimal using the "Binary to Decimal with Recursion" app. Here's how it would work:

Run the app and enter the binary number "1010".

The app will calculate the decimal equivalent:

Starting with the first digit "1", we have:
1 * (2 ^ 3) (2 raised to the power of 3, which is 8)
The recursive call is made with the remaining digits "010".
Moving to the next digit "0", we skip the multiplication as the digit is zero.
The next digit "1" gives us:
1 * (2 ^ 1) (2 raised to the power of 1, which is 2)
The recursive call is made with the remaining digit "0".
Finally, we have the last digit "0", which is zero.
The app adds the calculated values together:

8 + 0 + 2 + 0 = 10
The app displays the result: The decimal equivalent of 1010 is 10.
## Contribution
Contributions to the "Binary to Decimal with Recursion" app are welcome. If you have any ideas or improvements, feel free to submit a pull request.
## License
This project is licensed under the MIT License. See the LICENSE file for details.
