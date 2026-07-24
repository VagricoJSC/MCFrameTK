\encoding UTF-8

ALTER TABLE mst_ordsnd_gi_schd_if_all
 ADD CONSTRAINT mst_ordsnd_gi_schd_if_all_ck01 CHECK (alloc_flg IN ('0', '1'));

