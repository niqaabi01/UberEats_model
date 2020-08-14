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

classes:Menu.class Menuselect.class Order.class OrderSystem.class \
         UberEatsMobileApp.class UberEatsRestaurantApp.class Restuarant.class
default: $(CLASSES)

doc:
	javadoc -d $(DOCDIR) -cp $(DOCDIR) $(SRCDIR)/*.java

test_classes: Menu.class Menuselect.class Order.class OrderSystem.class \
		 UberEatsMobileApp.class UberEatsRestaurantApp.class Restuarant.class
junit: test_classes
	
Menu.class: Menu.java
	javac -d $(BINDIR) -cp $(JUNIT)
Menuselect.class: Menuselect.java
	javac -d $(BINDIR) -cp $(JUNIT)
Order.class: Order.java
	javac -d $(BINDIR) -cp $(JUNIT)
OrderSystem.class: OrderSystem.java
	javac -d $(BINDIR) -cp $(JUNIT)
UberEatsMobileApp.class: UberEatsMobileApp.java
	javac -d $(BINDIR) -cp $(JUNIT)
UberEatsRestaurantApp.class: UberEatsRestaurantApp.java
	javac -d $(BINDIR) -cp $(JUNIT)
Restuarant.class: Restuarant.java
	javac -d $(BINDIR) -cp $(JUNIT)



#test_classes: SearchItLinearTest.java eDirectoryTest.java #SearchItTest.java PrintItTest.java
	      
#junit: test_classes
#	javac -d $(BINDIR) -cp ../junit/junit-4.12.jar -sourcepath ./src $*.java
#	#java -cp $(BINDIR):$(JUNIT) org.junit.runner.JUnitCore $*.java	

clean:
	rm -f  $(BINDIR)/*.class
	rm -Rf doc
