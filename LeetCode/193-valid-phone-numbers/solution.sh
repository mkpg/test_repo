# Read from the file file.txt and output all valid phone numbers to stdout.
while read line
do
if echo "$line" | grep -Eq "^([0-9]{3}-[0-9]{3}-[0-9]{4}|\([0-9]{3}\)\ [0-9]{3}-[0-9]{4})$"
then
    echo "$line"
fi
done < file.txt