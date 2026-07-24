\encoding UTF-8

ALTER TABLE mam_stk_rpl_all
 ADD CONSTRAINT mam_stk_rpl_all_ck01 CHECK (gi_schd_flg IN ('0', '1'));

