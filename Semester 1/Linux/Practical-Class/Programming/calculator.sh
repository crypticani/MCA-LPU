#!/bin/sh

echo "Enter a: "
read a
echo "Enter b: "
read b

echo Addition: `expr $a + $b`
echo Subtraction: `expr $a - $b`
echo Multiplication: `expr $a \* $b`
echo Division: `expr $a / $b`
echo Modulus: `expr $a % $b`

echo Equality: `expr $a == $b`
echo Not Equality: `expr $a != $b`

#Relational operators
if [ $a -eq $b ]
then
echo "Equality: True"
else
echo "Equality: False"
fi

if [ $a -ne $b ]
then
echo "Not equals to: True"
else
echo "Not equals to: False"
fi

if [ $a -gt $b ]
then
echo "Greater than: True"
else
echo "Greater than: False"
fi

if [ $a -lt $b ]
then
echo "Less than: True"
else
echo "Less than: False"
fi

if [ $a -ge $b ]
then
echo "Greater equals to: True"
else
echo "Greater equals to: False"
fi

if [ $a -le $b ]
then
echo "Less than equals to: True"
else
echo "Less than equals to: False"
fi

#Boolean operators
if [ ! $a == $b ]
then
echo "NOT: True"
else
echo "NOT: False"
fi

if [ $a -lt 20 -o $b -gt 9 ]
then
echo "OR: 1 is true"
else
echo "OR: False"
fi

if [ $a -lt 20 -a $b -gt 100 ]
then
echo "AND: True"
else
echo "AND: False"
fi


