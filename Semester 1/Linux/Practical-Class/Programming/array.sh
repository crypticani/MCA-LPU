#!/bin/sh

name="Aniket" #scalar variable
echo $name

#Array Variable
NAME[0]="Aniket"
NAME[1]="A"
NAME[2]="B"
NAME[3]="C"
NAME[4]="D"
NAME[5]="E"

echo "First Name: ${NAME[0]}"
echo "Third Name: ${NAME[2]}"
echo "Sixth Name: ${NAME[5]}"

echo "All Names: ${NAME[*]}"

for var in 0 1 2 3 4 5
do
	echo "${NAME[var]}"
done

