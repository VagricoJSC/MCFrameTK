\encoding UTF-8

ALTER TABLE mst_purc_ret_act_d_p_all
 ADD CONSTRAINT mst_purc_ret_act_d_p_all_ck01 CHECK (sundry_itm_flg IN ('0', '1'));

