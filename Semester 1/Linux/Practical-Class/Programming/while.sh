#!/bin/bash

echo $'Select operation: \n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus\n6.Equality\n7.Not Equal'
read choice

while [ $choice -ne 0 ]
do

echo "Enter a: "
read a
echo "Enter b: "
read b

if [ $choice -eq 1 ]
then
echo Addition: `expr $a + $b`

elif [ $choice -eq 2 ]
then
echo Subtraction: `expr $a - $b`

elif [ $choice -eq 3 ]
then
echo Multiplication: `expr $a \* $b`

elif [ $choice -eq 4 ]
then
echo Division: `expr $a / $b`

elif [ $choice -eq 5 ]
then
echo Modulus: `expr $a % $b`

elif [ $choice -eq 6 ]
then
echo Equality: `expr $a == $b`

elif [ $choice -eq 7 ]
then
echo Not Equality: `expr $a != $b`
fi
done
