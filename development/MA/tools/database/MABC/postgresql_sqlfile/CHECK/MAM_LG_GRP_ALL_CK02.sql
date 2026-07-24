\encoding UTF-8

ALTER TABLE mam_lg_grp_all
 ADD CONSTRAINT mam_lg_grp_all_ck02 CHECK (ship_slip_flg IN ('0', '1'));

