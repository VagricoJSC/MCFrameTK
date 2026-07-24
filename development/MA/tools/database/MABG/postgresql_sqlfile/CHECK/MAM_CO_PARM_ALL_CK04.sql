\encoding UTF-8

ALTER TABLE mam_co_parm_all
 ADD CONSTRAINT mam_co_parm_all_ck04 CHECK (oper_sum_flg IN ('0', '1'));

