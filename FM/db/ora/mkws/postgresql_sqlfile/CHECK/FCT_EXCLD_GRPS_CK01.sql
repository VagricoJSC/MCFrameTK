\encoding UTF-8

ALTER TABLE fct_excld_grps
 ADD CONSTRAINT fct_excld_grps_ck01 CHECK (man_flg IN ('0', '1'));

