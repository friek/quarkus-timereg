#!/usr/bin/env bash

cd $(dirname "$0")
if [ ! -e "app.env" ]; then
  echo "app.env does not exist"
  exit 1
fi

export $(cat app.env | xargs)
exec mvn compile quarkus:dev