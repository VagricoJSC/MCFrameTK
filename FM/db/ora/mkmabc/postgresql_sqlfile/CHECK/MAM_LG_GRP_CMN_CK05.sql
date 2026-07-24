\encoding UTF-8

ALTER TABLE mam_lg_grp_cmn
 ADD CONSTRAINT mam_lg_grp_cmn_ck05 CHECK (ship_slip_act_flg IN ('0', '1'));

