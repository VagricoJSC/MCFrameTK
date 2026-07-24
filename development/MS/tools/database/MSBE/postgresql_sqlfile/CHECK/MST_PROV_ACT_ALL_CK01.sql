\encoding UTF-8

ALTER TABLE mst_prov_act_all
 ADD CONSTRAINT mst_prov_act_all_ck01 CHECK (upd_flg IN ('0', '1'));

