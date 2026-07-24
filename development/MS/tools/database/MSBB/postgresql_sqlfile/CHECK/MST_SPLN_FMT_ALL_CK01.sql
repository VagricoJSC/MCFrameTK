\encoding UTF-8

ALTER TABLE mst_spln_fmt_all
 ADD CONSTRAINT mst_spln_fmt_all_ck01 CHECK (cst_cd_unit_flg IN ('0', '1'));

