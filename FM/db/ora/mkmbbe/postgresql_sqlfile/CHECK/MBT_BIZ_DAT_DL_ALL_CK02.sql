\encoding UTF-8

ALTER TABLE mbt_biz_dat_dl_all
 ADD CONSTRAINT mbt_biz_dat_dl_all_ck02 CHECK (dwnld_flg IN ('0', '1'));

