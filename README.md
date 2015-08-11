This program is designed to be run in two different ways: through the Dalvik virtual machine and through the Java virtual machine.

To run it in the Java virtual machine, simply compile and run (omit MainActivity.java):

	javac -cp app/src/main/java app/src/main/java/com/example/inheritance/C*.java app/src/main/java/com/example/other/C3.java
	java -cp app/src/main/java com.example.inheritance.C4

The output of this program shows that C2 successfully overrides the behavior of C1 but that C3 overrides neither C2 or C1:

	C1: C2
	C2: C2
	C3: C3

To run it in the Dalvik virtual machine, import the project into Android Studio and run it on an Android Virtual machine *with API 19*. The Android code doesn't use C4 at all; instead, it mimics the same behavior in MainActivity.java. Although it displays information on the emulated screen instead of in the terminal, MainActivity's output is essentially the following:

	C1: C3
	C2: C3
	C3: C3