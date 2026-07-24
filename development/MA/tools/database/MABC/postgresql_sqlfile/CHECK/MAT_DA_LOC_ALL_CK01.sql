\encoding UTF-8

ALTER TABLE mat_da_loc_all
 ADD CONSTRAINT mat_da_loc_all_ck01 CHECK (rd_flg IN ('0', '1'));

