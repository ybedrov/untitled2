#!/usr/bin/env bash

if [ $0 != "-bash" ]; then
    (>&2 echo "can't export variables when invoked directly; use 'source ${BASH_SOURCE[0]}'")
    exit 1
fi

export AWS_ACCESS_KEY_ID=XXXXXXXXXXXXXXXXXX
export AWS_SECRET_ACCESS_KEY=XXXXXXXXXXXXX/XXXXXXX/XXXXXXXXXXXXXXXXXX
(>&2 echo "AWS_ACCESS_KEY_ID and AWS_SECRET_ACCESS_KEY set")
(>&2 echo "use: aws --endpoint https://cdl.qs3.sdsc.edu/")

