\encoding UTF-8

ALTER TABLE mam_co_parm_all
 ADD CONSTRAINT mam_co_parm_all_ck07 CHECK (stk_bp_flg IN ('0', '1'));

