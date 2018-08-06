#!/usr/bin/env bash
java -server -Xms128m -Xmx128m -cp target/*:lib/* interware.mx.leveldb_micro
