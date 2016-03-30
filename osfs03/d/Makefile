##################################################
# Makefile of pmtestx.asm (x=[1,2,3...])
##################################################

SRC:=pmtest4.asm
BIN:=$(subst .asm,.com,$(SRC))

.PHONY : everything

#超级模式下执行
everything : $(BIN)
	 mount -o loop pm.img /mnt/floppy/   
	 cp $(BIN) /mnt/floppy/ -v
	 umount /mnt/floppy/

$(BIN) : $(SRC)
	nasm $< -o $@

