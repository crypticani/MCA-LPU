echo "Enter the No: "
read num
echo "Table of $num is: "

for var in 1 2 3 4 5 6 7 8 9 10
do
	echo `expr $num \* $var`
done
