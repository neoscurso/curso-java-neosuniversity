Prerrequisites
==

Install Homebrew

Command Line Tools (CLT) for Xcode:

```
 $ xcode-select --install
```

Install brew using command line
```
$ /usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
```

Install MySQL
===================

At this time of writing, Homebrew has MySQL version 5.7.15 as default
 in its main repository :
*	Enter the following command : 
```
 $ brew info mysql
 ```
 
*	Expected output: mysql: stable 5.7.15 (bottled)

To install MySQL enter : 
```
$ brew install mysql
```

Additional configuration
Homebrew
*	Install brew services first :
```
     $ brew tap homebrew/services
```
*	Load and start the MySQL service :
```
      $ brew services start mysql
```

 Expected output : Successfully started mysql (label: homebrew.mxcl.mysql)

*	Check of the MySQL service has been loaded : 
   $ brew services list 1
*	Verify the installed MySQL instance :
```
 $ mysql -V
```
 Expected output : Ver 14.14 Distrib 5.7.15, for osx10.12 (x86_64)

MySQL
Open Terminal and execute the following command to set the root password:
```
  $  mysqladmin -u root password 'discom'
```
Important : Use the single ‘quotes’ to surround the password and make sure to select a strong password!

Database Management

To manage your databases, I recommend using Sequel Pro, a MySQL management tool designed for macOS. 

