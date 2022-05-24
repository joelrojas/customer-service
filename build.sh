#!/bin/sh

mkdir target/dependency
(cd target/dependency; tar -zxf ../*.jar)
ls -ahl target