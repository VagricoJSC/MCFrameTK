\encoding UTF-8

ALTER TABLE fct_print_dat
 ADD CONSTRAINT fct_print_dat_ck01 CHECK (persistent IN ('0', '1'));

