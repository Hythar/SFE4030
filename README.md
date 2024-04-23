
## Overview
The `RomanNumeral` Java includes a class for converting Roman numerals to integers. The source code includes the `RomanNumeral` class with its method for conversion, and a `RomanNumeralTest` class for testing the conversion method. The project utilizes a simple testing framework with annotations to denote test methods.

## Features
- **RomanNumeral Class**: This class contains a method `romanToInt(String s)` which converts a string representing a Roman numeral into its integer value.
- **Immutable Map**: The class uses an immutable map to store the Roman numeral characters and their corresponding integer values.
- **Test Cases**: The `RomanNumeralTest` class contains test cases for basic and complex Roman numeral strings.

## Usage
To use the `RomanNumeral` class, create an instance of the class and call the `romanToInt(String s)` method with a Roman numeral string as an argument.

```java
RomanNumeral romanConverter = new RomanNumeral();
int number = romanConverter.romanToInt("IX"); // returns 9
System.out.println(number);
```

## Testing
The application includes a basic testing setup with two methods:
- `testRomanToIntBasic()`: Tests the conversion of a simple Roman numeral.
- `testRomanToIntComplex()`: Tests the conversion of a more complex Roman numeral that includes subtractive notation.

The `RomanNumeralTest` class provides a placeholder for an `assertEquals` method, which needs to be implemented or replaced with an assertion method from a proper testing library.

## Setup
Compile the Java classes using a Java compiler:
```sh
javac RomanNumeral.java
RomanNumeralTest.java
```

Run the tests:
```sh
java RomanNumeralTest
```
