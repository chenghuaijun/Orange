delete fs/open.c 324ln   assert(nr_sects_to_alloc == 0); 
#delete fs/link.c 123ln   assert((fsbuf[byte_idx % SECTOR_SIZE] >> i & 1) == 1);
#delete fs/link.c 136ln   assert(fsbuf[i] == 0xFF);
#delete fs/link.c 147ln   assert((fsbuf[i] & mask) == mask);
change kernel/tty.c 192ln&193ln ALT to CTRL for the keyboard problem(CTRL+F1~F12 switch console :) ) 

make everything;    
cd command;
make install;
make buildimg;
