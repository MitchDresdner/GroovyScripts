#!/bin/sh
for f in $1/*.pdf
do
 # echo "Processing $f"
 java -jar pdfbox-app-2.0.8.jar ExtractText -console "$f" | groovy LineParser.groovy
done