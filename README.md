# Combined Java & Rust Code Coverage Demo

This is a demo project that goes along a
[blog post](https://questdb.io/blog/rust-coverage/). It showcases the tools and
steps needed to create a test coverage report that involves both Java and Rust
code, including Rust code accessed by JUnit tests via JNI.

The file `cover.sh` is a standalone script you can run locally to get the
coverage reports, as well as publish the results to an arbitrary PR you
specify on the command line.

The file `.github/workflows/coverage.yml` is a GitHub workflow file that does
these steps automatically on each PR.

----

Copyright (C) 2024 Marko Topolnik
