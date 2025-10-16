# Chapter 1 Challenge 1.4: Config File Validator
# Challenge Name

Config File Validator (Chapter 1, Challenge 1.4)

## Description

This program reads a configuration file (config.txt) and validates its content.
The file must contain:

A version number on the first line (as an integer).

A file path on the second line (as a string).

The program performs two checks:

Ensures the version number is at least 2.

Checks whether the file path exists on the system.

If any condition fails, a proper error message is displayed.

 Example Input/Output
 Sample config.txt (Valid)
2
C:\Users\Solomon\Documents\notes.txt

## Output:
 Config version: 2  
 File path exists: C:\Users\Solomon\Documents\notes.txt  
 Config read attempt finished.

 Sample config.txt (Invalid version)
1
C:\Users\Solomon\Documents\notes.txt

Output:
 Error: Config version too old!  
 Config read attempt finished.

 Sample config.txt (Nonexistent file path)
2
C:\Fake\Path\missingfile.txt

Output:
 I/O Error: Configured file path does not exist: C:\Fake\Path\missingfile.txt  
 Config read attempt finished.

## Reflection
 What I Learned

How to use file input in Java using BufferedReader.

How to handle exceptions like FileNotFoundException, IOException, and NumberFormatException.

Validating external input in a defensive programming style.

Proper use of the finally block for cleaning up resources.

## What Was Difficult

Handling cases where the second line (file path) was empty or null.

Making sure all exception types are handled separately with meaningful messages.

Ensuring that error messages are informative for both developers and users.
