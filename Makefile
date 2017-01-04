default: build

build:
	scas main.sc main.bin

flash: build
	scwr main.bin

TARGETS := $(shell find . -type d -not -path "*.git*")

test:
	echo $(TARGETS)
	for target in $(TARGETS) ; do \
	  echo $$target ; \
      scas $$target/main.sc test.bin ; \
	done

clean:
	rm *.bin
