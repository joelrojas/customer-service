#!/bin/sh

mkdir target/dependency
(cd target/dependency; jar -xf ../*.jar)
ls -ahl target