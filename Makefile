#Donald

JAVAC=/usr/bin/javac
.SUFFIXES: .java .class
SRCDIR=src
BINDIR=bin

$(BINDIR)/%.class:$(SRCDIR)/%.java
	$(JAVAC) -d $(BINDIR)/ -cp $(BINDIR) $<
	
CLASSES = GridBlock.class PeopleCounter.class PeopleLocation.class CounterDisplay.class ClubGrid.class ClubView.class Clubgoer.class ClubSimulation.class

CLASS_FILES=$(CLASSES:%.class=$(BINDIR)/%.class)

default: $(CLASS_FILES)

clean:
	rm $(BINDIR)/*.class
	
run:$(CLASS_FILES)
	java -cp bin ClubSimulation
