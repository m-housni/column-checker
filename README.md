Here is a program that checks that every line of a text file has a space character in column 10. This might be used to verify the correct formatting of columnar data or of assembly language source programs.

The program is used with redirection:
```
C:\>javac ColumnCheck.java

C:\>java ColumnCheck < datafile.txt
```
With input redirection, the operating system sends characters to the program from a file, not from the keyboard. Now when the program is running nextLine() reads one line from the file.

An improved program might ask the user for several column numbers to check.
