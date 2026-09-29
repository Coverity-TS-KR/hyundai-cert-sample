#!/bin/sh
set -eu

rm -rf out
mkdir -p out
javac -d out src/ComponentDefinition.java src/Case21_MJ_OBJ_012.java
echo "Compile OK"