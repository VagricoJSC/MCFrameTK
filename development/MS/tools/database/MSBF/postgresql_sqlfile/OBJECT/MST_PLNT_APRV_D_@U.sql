\encoding UTF-8

CREATE OR REPLACE VIEW mst_plnt_aprv_d_$u(
	plnt_aprv_d_no,
	plnt_aprv_no,
	insp_typ,
	insp_no,
	src_no1,
	src_no2,
	src_no3,
	src_no4,
	base_unit_qty,
	base_unit_cd,
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
	mst_plnt_aprv_d_$u_mst_plnt_aprv_d_all_org.plnt_aprv_d_no,
	mst_plnt_aprv_d_$u_mst_plnt_aprv_d_all_org.plnt_aprv_no,
	mst_plnt_aprv_d_$u_mst_plnt_aprv_d_all_org.insp_typ,
	mst_plnt_aprv_d_$u_mst_plnt_aprv_d_all_org.insp_no,
	mst_plnt_aprv_d_$u_mst_plnt_aprv_d_all_org.src_no1,
	mst_plnt_aprv_d_$u_mst_plnt_aprv_d_all_org.src_no2,
	mst_plnt_aprv_d_$u_mst_plnt_aprv_d_all_org.src_no3,
	mst_plnt_aprv_d_$u_mst_plnt_aprv_d_all_org.src_no4,
	mst_plnt_aprv_d_$u_mst_plnt_aprv_d_all_org.base_unit_qty,
	mst_plnt_aprv_d_$u_mst_plnt_aprv_d_all_org.base_unit_cd,
	mst_plnt_aprv_d_$u_mst_plnt_aprv_d_all_org.sub_char1,
	mst_plnt_aprv_d_$u_mst_plnt_aprv_d_all_org.sub_char2,
	mst_plnt_aprv_d_$u_mst_plnt_aprv_d_all_org.sub_char3,
	mst_plnt_aprv_d_$u_mst_plnt_aprv_d_all_org.ins_usr_id,
	mst_plnt_aprv_d_$u_mst_plnt_aprv_d_all_org.ins_usr_nm,
	mst_plnt_aprv_d_$u_mst_plnt_aprv_d_all_org.ins_ts,
	mst_plnt_aprv_d_$u_mst_plnt_aprv_d_all_org.ins_func_id,
	mst_plnt_aprv_d_$u_mst_plnt_aprv_d_all_org.upd_cntr,
	mst_plnt_aprv_d_$u_mst_plnt_aprv_d_all_org.upd_usr_id,
	mst_plnt_aprv_d_$u_mst_plnt_aprv_d_all_org.upd_usr_nm,
	mst_plnt_aprv_d_$u_mst_plnt_aprv_d_all_org.upd_ts,
	mst_plnt_aprv_d_$u_mst_plnt_aprv_d_all_org.upd_func_id,
	mst_plnt_aprv_d_$u_mst_plnt_aprv_d_all_org.upd_srv_req_no
FROM
	mst_plnt_aprv_d_all mst_plnt_aprv_d_$u_mst_plnt_aprv_d_all_org
WHERE
	0 = 0
	AND mst_plnt_aprv_d_$u_mst_plnt_aprv_d_all_org.co_cd = fcpa_context$f_get_co_cd()
;

