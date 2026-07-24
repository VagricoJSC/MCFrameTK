\encoding UTF-8

ALTER TABLE mst_spln_sum_fix_all
 ADD CONSTRAINT mst_spln_sum_fix_all_ck01 CHECK (fix_flg IN ('0', '1'));

