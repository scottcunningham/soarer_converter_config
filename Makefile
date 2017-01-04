default: build

build:
	scas main.sc main.bin

flash: build
	scwr main.bin

#TARGETS := $(shell find . -type -d -not -path "*.git*")
#
#test:
#	for target in $$(TARGETS) ; do \
#    scas $target/main.sc $target.bin ; \
#	done

clean:
	rm *.bin */*.bin
