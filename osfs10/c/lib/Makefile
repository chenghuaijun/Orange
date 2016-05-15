#############################
# Makefile for orangescrt.a #
#############################

# Programs, flags, etc.
ASM		= nasm
CC		= gcc
ASMKFLAGS	= -I ../include/ -I ../include/sys/ -f elf
CFLAGS		= -fno-stack-protector -m32 -I ../include/ -I ../include/sys/ -c -fno-builtin  #加入-fno-stack-protector是为了解决k..c问题
ARFLAGS		= rcs

# This Program
LIB		= ./orangescrt.a

LOBJS		=  syscall.o\
			printf.o vsprintf.o\
			string.o misc.o\
			open.o read.o write.o close.o unlink.o\
			getpid.o \
			fork.o exit.o wait.o
# All Phony Targets
.PHONY :everything final clean realclean all

# Default starting position
everything : $(LIB)

all : realclean everything

clean :
	rm -f $(LOBJS)

realclean :
	rm -f $(LOBJS) $(LIB)

$(LIB) : $(LOBJS)
	$(AR) $(ARFLAGS) $@ $^

./syscall.o : ./syscall.asm
	$(ASM) $(ASMKFLAGS) -o $@ $<

./printf.o: ./printf.c
	$(CC) $(CFLAGS) -o $@ $<

./vsprintf.o: ./vsprintf.c
	$(CC) $(CFLAGS) -o $@ $<

./misc.o: ./misc.c
	$(CC) $(CFLAGS) -o $@ $<

./string.o : ./string.asm
	$(ASM) $(ASMKFLAGS) -o $@ $<

./open.o: ./open.c
	$(CC) $(CFLAGS) -o $@ $<

./read.o: ./read.c
	$(CC) $(CFLAGS) -o $@ $<

./write.o: ./write.c
	$(CC) $(CFLAGS) -o $@ $<

./close.o: ./close.c
	$(CC) $(CFLAGS) -o $@ $<

./unlink.o: ./unlink.c
	$(CC) $(CFLAGS) -o $@ $<

./getpid.o: ./getpid.c
	$(CC) $(CFLAGS) -o $@ $<

./syslog.o: ./syslog.c
	$(CC) $(CFLAGS) -o $@ $<

./fork.o: ./fork.c
	$(CC) $(CFLAGS) -o $@ $<

./exit.o: ./exit.c
	$(CC) $(CFLAGS) -o $@ $<

./wait.o: ./wait.c
	$(CC) $(CFLAGS) -o $@ $<

