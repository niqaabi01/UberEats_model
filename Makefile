# Makefile 
# A simple Makefile
# HelloWorld.class: HelloWorld.java
# javac HelloWorld.java

SRCDIR = src
BINDIR = bin
DOCDIR = doc
TESTDIR = test

JUNIT = ./gson/gson-2.8.6.jar -sourcepath ./src ./src/$*.java


JAVAC = javac
JFLAGS = -g -d $(BINDIR) -cp $(BINDIR)

#to check the src and test folders for the .java files
#also to ensure that class files are in bin 
vpath %.java $(SRCDIR):$(TESTDIR)
vpath %.class $(BINDIR)

.SUFFIXES: .java .class

.java.class:
	$(JAVAC) $(JFLAGS) $<

classes: Person.class Car.class Driver.class Vehicle.class Passenger.class \
		UberApp.class Journey.class UberRide.class Records.class

default: $(CLASSES)

doc:
	javadoc -d $(DOCDIR) -cp $(DOCDIR) $(SRCDIR)/*.java

test_classes: Person.class Car.class Driver.class Vehicle.class Passenger.class \
			UberApp.class Journey.class UberRide.class Records.class
	      
junit: test_classes
	
Person.class: Person.java
	javac -d $(BINDIR) -cp $(JUNIT)
Car.class: Car.java
	javac -d $(BINDIR) -cp $(JUNIT)
Driver.class: Driver.java
	javac -d $(BINDIR) -cp $(JUNIT)
Vehicle.class: Vehicle.java
	javac -d $(BINDIR) -cp $(JUNIT)
Passenger.class: Passenger.java
	javac -d $(BINDIR) -cp $(JUNIT)
UberApp.class: UberApp.java
	javac -d $(BINDIR) -cp $(JUNIT)
Journey.class: Journey.java
	javac -d $(BINDIR) -cp $(JUNIT)
UberRide.class: UberRide.java
	javac -d $(BINDIR) -cp $(JUNIT)
Records.class: Records.java
	javac -d $(BINDIR) -cp $(JUNIT)


#test_classes: SearchItLinearTest.java eDirectoryTest.java #SearchItTest.java PrintItTest.java
	      
#junit: test_classes
#	javac -d $(BINDIR) -cp ../junit/junit-4.12.jar -sourcepath ./src $*.java
#	#java -cp $(BINDIR):$(JUNIT) org.junit.runner.JUnitCore $*.java	

clean:
	rm -f  $(BINDIR)/*.class
	rm -Rf doc
