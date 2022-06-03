# VendingMachineProgram
Write a program to design Vending Machine using Java

Features
Written in uncomplicated Go (Golang)
No installation necessary - just use the binary.
Stupidly easy to use
Supports all Github-supported .gitignore files
Works on Mac, Linux and (maybe) Windows
Supports other version control systems (.hgignore)
Installation
After install, make sure to run joe u. This will download all .gitignore files in ~/joe-data/ folder.

Option 1: Binary
VendingMachineProgram is available for OSX (macOS), Linux and Windows.

Download the latest binary from the Releases page. It's the easiest way to get started with VendingMachineProgram.


Option 2: From source
$ git clone git@github.com:karan/joe.git
$ cd joe/
$ chmod +x tool.sh
$ ./tool.sh build
Usage
Commands:
ls | list       list all available files
u | update      update all available gitignore files
g | generate    generate gitignore files
Basic usage
$ joe g java    # outputs .gitignore file for java to stdout
To update your .gitignore files at any time, simply run:

$ joe u
