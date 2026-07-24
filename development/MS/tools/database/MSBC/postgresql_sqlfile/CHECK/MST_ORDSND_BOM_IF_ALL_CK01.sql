\encoding UTF-8

ALTER TABLE mst_ordsnd_bom_if_all
 ADD CONSTRAINT mst_ordsnd_bom_if_all_ck01 CHECK (ph_flg IN ('0', '1'));

