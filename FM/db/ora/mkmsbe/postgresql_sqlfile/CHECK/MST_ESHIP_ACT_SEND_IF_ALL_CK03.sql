\encoding UTF-8

ALTER TABLE mst_eship_act_send_if_all
 ADD CONSTRAINT mst_eship_act_send_if_all_ck03 CHECK (tdlv_sundry_flg IN ('0', '1'));

