#!/bin/bash
rm -r rust-coverage*
find . -name \*.profraw | xargs rm
rm -r target
rm -r rust/coverage-demo/target
true
