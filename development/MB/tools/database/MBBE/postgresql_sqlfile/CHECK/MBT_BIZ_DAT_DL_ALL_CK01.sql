\encoding UTF-8

ALTER TABLE mbt_biz_dat_dl_all
 ADD CONSTRAINT mbt_biz_dat_dl_all_ck01 CHECK (print_flg IN ('0', '1'));

