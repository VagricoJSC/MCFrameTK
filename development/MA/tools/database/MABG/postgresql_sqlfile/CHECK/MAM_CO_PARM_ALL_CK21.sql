\encoding UTF-8

ALTER TABLE mam_co_parm_all
 ADD CONSTRAINT mam_co_parm_all_ck21 CHECK (excel_alc_flg IN ('0', '1'));

