make realclean;
make everything;
cd ./command;
make realclean ;
rm *tar *bin;
make install;
cd ..;
make buildimg;

