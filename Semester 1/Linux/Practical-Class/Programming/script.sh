#!/bin/bash

#Printing a text message
echo "I am Aniket"

#Taking a variable, assigning a value and printing it
a=10
echo value of a is $a

#Taking value of variable at execution time
echo enter your name
read a
echo Hello $a

#making the variable readonly
readonly a
echo value of a after readonly $a

#unsetting the variable and printing
New=20
unset New
echo value of variable after unset $New
