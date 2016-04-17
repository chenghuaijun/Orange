# Makefile for boot

# Programs, flags, etc.
ASM		= nasm
ASMFLAGS	= -I boot/include/

# This Program
ORANGESBOOT	= boot/boot.bin boot/loader.bin

# All Phony Targets
.PHONY : everything clean all   ;一种行为的标号

# Default starting position
everything : $(ORANGESBOOT)

clean :
	rm -f $(ORANGESBOOT)

all : clean everything

boot/boot.bin : boot/boot.asm boot/include/load.inc boot/include/fat12hdr.inc
	$(ASM) $(ASMFLAGS) -o $@ $<

boot/loader.bin : boot/loader.asm boot/include/load.inc \
		  boot/include/fat12hdr.inc boot/include/pm.inc
	$(ASM) $(ASMFLAGS) -o $@ $<


