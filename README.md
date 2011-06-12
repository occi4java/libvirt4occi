libvirt4occi
------------

The project uses the [occi4java](https://github.com/occi4java/occi4java) implementation.

FAQ
---

Q: Can i use libvirt4occi without occi4java?
A: No, you can not.

Build Project
-------------

You can build this project with maven. Just type:

    mvn install

The maven install process will create a jar file libvirt-{version}.jar in distribution/target/libvirt4occi.libvirt-{version}-packaging.

Usage
-----

You can use the jar file by typing:

    java -jar libvirt-{version}.jar

This will start a OCCI HTTP Server with the libvirt implementation.

Debian Package
--------------

If you don´t want to build libvirt4occi yourself, we are happy to provide a debian package, which you can easily install with:

    dpkg -i libvirt4occi_{version}_all.deb

The package installs all necessary files and includes a daemon to start and stop the occi server.

    /etc/init.d/libvirt4occi start|stop|restart|status

All logger information can be found in /var/log/libvirt4occi/libvirt4occi.log

Config files are located under /usr/share/libvirt4occi/conf. If you change a parameter you have to restart libvirt4occi.

Requirements
------------

A Linux Distribution like [Ubuntu](http://www.ubuntu.com) and some packages:

[occi4java](https://github.com/occi4java/occi4java)

[qemu-kvm](http://www.linux-kvm.org/page/Main_Page)

    apt-get install qemu-kvm

libvirt-bin (interface to start virtual machines)

    apt-get install libvirt-bin

Changelog
---------

0.2

  * Overworked namespaces
  * Changed from junit to testng
  * Integrated process to make a deb file
  * Some minor bug fixes
  
0.1

  * Initial release

(c) 2011 Sebastian Laag, Sebastian Heckmann

