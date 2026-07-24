\encoding UTF-8

CREATE OR REPLACE VIEW mst_re_ext_hst_$s(
	mfg_inst_no,
	ref_ord,
	mfg_inst_rev,
	re_ext_typ,
	chng_no,
	oper_chng_flg,
	intr_rmrks,
	plm_cnt_rmrks,
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
	mst_re_ext_hst_$s_mst_re_ext_hst_all_org.mfg_inst_no,
	mst_re_ext_hst_$s_mst_re_ext_hst_all_org.ref_ord,
	mst_re_ext_hst_$s_mst_re_ext_hst_all_org.mfg_inst_rev,
	mst_re_ext_hst_$s_mst_re_ext_hst_all_org.re_ext_typ,
	mst_re_ext_hst_$s_mst_re_ext_hst_all_org.chng_no,
	mst_re_ext_hst_$s_mst_re_ext_hst_all_org.oper_chng_flg,
	mst_re_ext_hst_$s_mst_re_ext_hst_all_org.intr_rmrks,
	mst_re_ext_hst_$s_mst_re_ext_hst_all_org.plm_cnt_rmrks,
	mst_re_ext_hst_$s_mst_re_ext_hst_all_org.sub_char1,
	mst_re_ext_hst_$s_mst_re_ext_hst_all_org.sub_char2,
	mst_re_ext_hst_$s_mst_re_ext_hst_all_org.sub_char3,
	mst_re_ext_hst_$s_mst_re_ext_hst_all_org.ins_usr_id,
	mst_re_ext_hst_$s_mst_re_ext_hst_all_org.ins_usr_nm,
	mst_re_ext_hst_$s_mst_re_ext_hst_all_org.ins_ts,
	mst_re_ext_hst_$s_mst_re_ext_hst_all_org.ins_func_id,
	mst_re_ext_hst_$s_mst_re_ext_hst_all_org.upd_cntr,
	mst_re_ext_hst_$s_mst_re_ext_hst_all_org.upd_usr_id,
	mst_re_ext_hst_$s_mst_re_ext_hst_all_org.upd_usr_nm,
	mst_re_ext_hst_$s_mst_re_ext_hst_all_org.upd_ts,
	mst_re_ext_hst_$s_mst_re_ext_hst_all_org.upd_func_id,
	mst_re_ext_hst_$s_mst_re_ext_hst_all_org.upd_srv_req_no
FROM
	mst_re_ext_hst_all mst_re_ext_hst_$s_mst_re_ext_hst_all_org
WHERE
	0 = 0
	AND mst_re_ext_hst_$s_mst_re_ext_hst_all_org.co_cd = (SELECT co_cd FROM fct_context mst_re_ext_hst_$s_fct_context WHERE pid = pg_backend_pid())
;

