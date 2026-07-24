\encoding UTF-8

ALTER TABLE mam_lg_grp_all
 ADD CONSTRAINT mam_lg_grp_all_ck06 CHECK (gi_minus_stk_chk_flg IN ('0', '1'));

