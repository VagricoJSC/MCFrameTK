\encoding UTF-8

ALTER TABLE mam_biz_rsn_cmn
 ADD CONSTRAINT mam_biz_rsn_cmn_ck05 CHECK (purc_dscnt_flg IN ('0', '1'));

