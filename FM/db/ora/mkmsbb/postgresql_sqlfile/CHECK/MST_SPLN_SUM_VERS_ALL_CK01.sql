\encoding UTF-8

ALTER TABLE mst_spln_sum_vers_all
 ADD CONSTRAINT mst_spln_sum_vers_all_ck01 CHECK (edited_flg IN ('0', '1'));

