\encoding UTF-8

ALTER TABLE mam_lg_grp_all
 ADD CONSTRAINT mam_lg_grp_all_ck04 CHECK (ship_inst_flg IN ('0', '1'));

