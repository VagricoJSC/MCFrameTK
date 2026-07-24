\encoding UTF-8

ALTER TABLE mam_act_io_all
 ADD CONSTRAINT mam_act_io_all_ck16 CHECK (itm_mfg_inst_no_flg IN ('0', '1'));

