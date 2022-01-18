echo "Name: "
read name
echo "No of times: "
read i
a=0
while [ $a -lt $i ]
do
echo "$name"
a=`expr $a +1`
done
