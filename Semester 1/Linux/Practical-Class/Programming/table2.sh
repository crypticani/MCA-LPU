echo "Enter the No: "
read num
echo "Table of $num is: "

for ((i=1; i<=10; i++))
do
  	echo `expr $num \* $i`
done
