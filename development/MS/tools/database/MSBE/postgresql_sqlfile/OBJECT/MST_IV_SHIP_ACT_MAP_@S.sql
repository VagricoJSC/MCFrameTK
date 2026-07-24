\encoding UTF-8

CREATE OR REPLACE VIEW mst_iv_ship_act_map_$s(
	iv_d_no,
	ship_act_d_no,
	ship_schd_no,
	ship_alloc_sts_no,
	base_unit_qty,
	fix_flg,
	ship_act_fix_flg,
	sub_char1,
	sub_char2,
	sub_char3,
	ins_usr_id,
	ins_usr_nm,
	ins_ts,
	ins_func_id,
	upd_cntr,
	upd_usr_id,
	upd_usr_nm,
	upd_ts,
	upd_func_id,
	upd_srv_req_no
	)
AS
SELECT
	mst_iv_ship_act_map_$s_mst_iv_ship_act_map_all_org.iv_d_no,
	mst_iv_ship_act_map_$s_mst_iv_ship_act_map_all_org.ship_act_d_no,
	mst_iv_ship_act_map_$s_mst_iv_ship_act_map_all_org.ship_schd_no,
	mst_iv_ship_act_map_$s_mst_iv_ship_act_map_all_org.ship_alloc_sts_no,
	mst_iv_ship_act_map_$s_mst_iv_ship_act_map_all_org.base_unit_qty,
	mst_iv_ship_act_map_$s_mst_iv_ship_act_map_all_org.fix_flg,
	mst_iv_ship_act_map_$s_mst_iv_ship_act_map_all_org.ship_act_fix_flg,
	mst_iv_ship_act_map_$s_mst_iv_ship_act_map_all_org.sub_char1,
	mst_iv_ship_act_map_$s_mst_iv_ship_act_map_all_org.sub_char2,
	mst_iv_ship_act_map_$s_mst_iv_ship_act_map_all_org.sub_char3,
	mst_iv_ship_act_map_$s_mst_iv_ship_act_map_all_org.ins_usr_id,
	mst_iv_ship_act_map_$s_mst_iv_ship_act_map_all_org.ins_usr_nm,
	mst_iv_ship_act_map_$s_mst_iv_ship_act_map_all_org.ins_ts,
	mst_iv_ship_act_map_$s_mst_iv_ship_act_map_all_org.ins_func_id,
	mst_iv_ship_act_map_$s_mst_iv_ship_act_map_all_org.upd_cntr,
	mst_iv_ship_act_map_$s_mst_iv_ship_act_map_all_org.upd_usr_id,
	mst_iv_ship_act_map_$s_mst_iv_ship_act_map_all_org.upd_usr_nm,
	mst_iv_ship_act_map_$s_mst_iv_ship_act_map_all_org.upd_ts,
	mst_iv_ship_act_map_$s_mst_iv_ship_act_map_all_org.upd_func_id,
	mst_iv_ship_act_map_$s_mst_iv_ship_act_map_all_org.upd_srv_req_no
FROM
	mst_iv_ship_act_map_all mst_iv_ship_act_map_$s_mst_iv_ship_act_map_all_org
WHERE
	0 = 0
	AND mst_iv_ship_act_map_$s_mst_iv_ship_act_map_all_org.co_cd = (SELECT co_cd FROM fct_context mst_iv_ship_act_map_$s_fct_context WHERE pid = pg_backend_pid())
;

