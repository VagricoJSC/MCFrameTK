\encoding UTF-8

CREATE OR REPLACE VIEW mst_slo_rsn_$s(
	slo_rsn_cd,
	slo_rsn_nm,
	qtn_term_flg,
	qtn_term_sort_seq,
	qtn_rslt_flg,
	qtn_rslt_sort_seq,
	slo_can_flg,
	slo_can_sort_seq,
	memo1,
	memo2,
	memo3,
	del_flg,
	del_usr_id,
	del_usr_nm,
	del_ts,
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
	mst_slo_rsn_$s_mst_slo_rsn_all_org.slo_rsn_cd,
	mst_slo_rsn_$s_mst_slo_rsn_all_org.slo_rsn_nm,
	mst_slo_rsn_$s_mst_slo_rsn_all_org.qtn_term_flg,
	mst_slo_rsn_$s_mst_slo_rsn_all_org.qtn_term_sort_seq,
	mst_slo_rsn_$s_mst_slo_rsn_all_org.qtn_rslt_flg,
	mst_slo_rsn_$s_mst_slo_rsn_all_org.qtn_rslt_sort_seq,
	mst_slo_rsn_$s_mst_slo_rsn_all_org.slo_can_flg,
	mst_slo_rsn_$s_mst_slo_rsn_all_org.slo_can_sort_seq,
	mst_slo_rsn_$s_mst_slo_rsn_all_org.memo1,
	mst_slo_rsn_$s_mst_slo_rsn_all_org.memo2,
	mst_slo_rsn_$s_mst_slo_rsn_all_org.memo3,
	mst_slo_rsn_$s_mst_slo_rsn_all_org.del_flg,
	mst_slo_rsn_$s_mst_slo_rsn_all_org.del_usr_id,
	mst_slo_rsn_$s_mst_slo_rsn_all_org.del_usr_nm,
	mst_slo_rsn_$s_mst_slo_rsn_all_org.del_ts,
	mst_slo_rsn_$s_mst_slo_rsn_all_org.ins_usr_id,
	mst_slo_rsn_$s_mst_slo_rsn_all_org.ins_usr_nm,
	mst_slo_rsn_$s_mst_slo_rsn_all_org.ins_ts,
	mst_slo_rsn_$s_mst_slo_rsn_all_org.ins_func_id,
	mst_slo_rsn_$s_mst_slo_rsn_all_org.upd_cntr,
	mst_slo_rsn_$s_mst_slo_rsn_all_org.upd_usr_id,
	mst_slo_rsn_$s_mst_slo_rsn_all_org.upd_usr_nm,
	mst_slo_rsn_$s_mst_slo_rsn_all_org.upd_ts,
	mst_slo_rsn_$s_mst_slo_rsn_all_org.upd_func_id,
	mst_slo_rsn_$s_mst_slo_rsn_all_org.upd_srv_req_no
FROM
	mst_slo_rsn_all mst_slo_rsn_$s_mst_slo_rsn_all_org
WHERE
	0 = 0
	AND mst_slo_rsn_$s_mst_slo_rsn_all_org.co_cd = (SELECT co_cd FROM fct_context mst_slo_rsn_$s_fct_context WHERE pid = pg_backend_pid())
	AND (mst_slo_rsn_$s_mst_slo_rsn_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mst_slo_rsn_$s_maw_del_flg_ctl_W WHERE lower(mst_slo_rsn_$s_maw_del_flg_ctl_W.tbl_nm) = 'mst_slo_rsn'))
;

