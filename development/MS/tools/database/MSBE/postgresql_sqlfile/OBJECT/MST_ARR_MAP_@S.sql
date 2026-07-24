\encoding UTF-8

CREATE OR REPLACE VIEW mst_arr_map_$s(
	arr_act_no,
	ship_act_d_no,
	iv_ship_act_d_no,
	arr_qty,
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
	mst_arr_map_$s_mst_arr_map_all_org.arr_act_no,
	mst_arr_map_$s_mst_arr_map_all_org.ship_act_d_no,
	mst_arr_map_$s_mst_arr_map_all_org.iv_ship_act_d_no,
	mst_arr_map_$s_mst_arr_map_all_org.arr_qty,
	mst_arr_map_$s_mst_arr_map_all_org.sub_char1,
	mst_arr_map_$s_mst_arr_map_all_org.sub_char2,
	mst_arr_map_$s_mst_arr_map_all_org.sub_char3,
	mst_arr_map_$s_mst_arr_map_all_org.ins_usr_id,
	mst_arr_map_$s_mst_arr_map_all_org.ins_usr_nm,
	mst_arr_map_$s_mst_arr_map_all_org.ins_ts,
	mst_arr_map_$s_mst_arr_map_all_org.ins_func_id,
	mst_arr_map_$s_mst_arr_map_all_org.upd_cntr,
	mst_arr_map_$s_mst_arr_map_all_org.upd_usr_id,
	mst_arr_map_$s_mst_arr_map_all_org.upd_usr_nm,
	mst_arr_map_$s_mst_arr_map_all_org.upd_ts,
	mst_arr_map_$s_mst_arr_map_all_org.upd_func_id,
	mst_arr_map_$s_mst_arr_map_all_org.upd_srv_req_no
FROM
	mst_arr_map_all mst_arr_map_$s_mst_arr_map_all_org
WHERE
	0 = 0
	AND mst_arr_map_$s_mst_arr_map_all_org.co_cd = (SELECT co_cd FROM fct_context mst_arr_map_$s_fct_context WHERE pid = pg_backend_pid())
;

