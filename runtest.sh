#!/bin/bash

# สร้างโฟลเดอร์เก็บ .class ถ้าไม่มี
mkdir -p out

# compile main + test + stub
javac -cp lib/junit-platform-console-standalone.jar -d out $(find main test -name "*.java")

# run junit console
java -jar lib/junit-platform-console-standalone.jar --class-path out --scan-classpath
