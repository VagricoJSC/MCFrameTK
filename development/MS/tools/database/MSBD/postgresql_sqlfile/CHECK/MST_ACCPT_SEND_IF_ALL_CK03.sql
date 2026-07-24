\encoding UTF-8

ALTER TABLE mst_accpt_send_if_all
 ADD CONSTRAINT mst_accpt_send_if_all_ck03 CHECK (in_to_sundry_flg IN ('0', '1'));

