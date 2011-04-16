libvirt4occi
------------

The project uses the occi4java implementation.
https://github.com/occi4java/occi4java

FAQ
---

Q: Can i use libvirt4occi without occi4java?
A: No, you can not.

Build Project
-------------

You can build this project with maven. Just type:
mvn install

The maven install process will create a jar file libvirt-{version}.jar in target/libvirt-{version}-packaging.

Usage
-----

You can use the jar file by typing:
	java -jar libvirt-{version}.jar

This will start a OCCI HTTP Server with the libvirt implementation.

Requirements
------------

occi4java
https://github.com/occi4java/occi4java

qemu-kvm (hypervisor to start virtual machines)
http://www.linux-kvm.org/page/Main_Page
Can also be installed under linux with apt-get (name of the package qemu-kvm).

qemu-img (to create raw files)
http://linux.die.net/man/1/qemu-img
Can also be install under linux with apt-get (name of the package qemu-img).
