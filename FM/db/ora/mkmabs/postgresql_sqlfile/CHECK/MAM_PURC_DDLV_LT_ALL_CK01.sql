\encoding UTF-8

ALTER TABLE mam_purc_ddlv_lt_all
 ADD CONSTRAINT mam_purc_ddlv_lt_all_ck01 CHECK (del_flg IN ('0', '1'));

