\encoding UTF-8

ALTER TABLE mam_biz_rsn_all
 ADD CONSTRAINT mam_biz_rsn_all_ck13 CHECK (stk_xfr_flg IN ('0', '1'));

