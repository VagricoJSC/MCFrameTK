\encoding UTF-8

ALTER TABLE mam_biz_rsn_all
 ADD CONSTRAINT mam_biz_rsn_all_ck10 CHECK (acxfr_gr_flg IN ('0', '1'));

