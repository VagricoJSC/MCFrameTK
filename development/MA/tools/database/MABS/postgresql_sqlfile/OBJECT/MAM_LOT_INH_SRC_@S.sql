\encoding UTF-8

CREATE OR REPLACE VIEW mam_lot_inh_src_$s(
	par_itm_cd,
	par_itm_sub1,
	par_itm_sub2,
	par_itm_sub3,
	bom_ptn,
	chd_itm_cd,
	chd_itm_sub1,
	chd_itm_sub2,
	chd_itm_sub3,
	lot_inh_col_typ,
	wg_cd,
	prio,
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
	mam_lot_inh_src_$s_mam_lot_inh_src_all_org.par_itm_cd,
	mam_lot_inh_src_$s_mam_lot_inh_src_all_org.par_itm_sub1,
	mam_lot_inh_src_$s_mam_lot_inh_src_all_org.par_itm_sub2,
	mam_lot_inh_src_$s_mam_lot_inh_src_all_org.par_itm_sub3,
	mam_lot_inh_src_$s_mam_lot_inh_src_all_org.bom_ptn,
	mam_lot_inh_src_$s_mam_lot_inh_src_all_org.chd_itm_cd,
	mam_lot_inh_src_$s_mam_lot_inh_src_all_org.chd_itm_sub1,
	mam_lot_inh_src_$s_mam_lot_inh_src_all_org.chd_itm_sub2,
	mam_lot_inh_src_$s_mam_lot_inh_src_all_org.chd_itm_sub3,
	mam_lot_inh_src_$s_mam_lot_inh_src_all_org.lot_inh_col_typ,
	mam_lot_inh_src_$s_mam_lot_inh_src_all_org.wg_cd,
	mam_lot_inh_src_$s_mam_lot_inh_src_all_org.prio,
	mam_lot_inh_src_$s_mam_lot_inh_src_all_org.memo1,
	mam_lot_inh_src_$s_mam_lot_inh_src_all_org.memo2,
	mam_lot_inh_src_$s_mam_lot_inh_src_all_org.memo3,
	mam_lot_inh_src_$s_mam_lot_inh_src_all_org.del_flg,
	mam_lot_inh_src_$s_mam_lot_inh_src_all_org.del_usr_id,
	mam_lot_inh_src_$s_mam_lot_inh_src_all_org.del_usr_nm,
	mam_lot_inh_src_$s_mam_lot_inh_src_all_org.del_ts,
	mam_lot_inh_src_$s_mam_lot_inh_src_all_org.ins_usr_id,
	mam_lot_inh_src_$s_mam_lot_inh_src_all_org.ins_usr_nm,
	mam_lot_inh_src_$s_mam_lot_inh_src_all_org.ins_ts,
	mam_lot_inh_src_$s_mam_lot_inh_src_all_org.ins_func_id,
	mam_lot_inh_src_$s_mam_lot_inh_src_all_org.upd_cntr,
	mam_lot_inh_src_$s_mam_lot_inh_src_all_org.upd_usr_id,
	mam_lot_inh_src_$s_mam_lot_inh_src_all_org.upd_usr_nm,
	mam_lot_inh_src_$s_mam_lot_inh_src_all_org.upd_ts,
	mam_lot_inh_src_$s_mam_lot_inh_src_all_org.upd_func_id,
	mam_lot_inh_src_$s_mam_lot_inh_src_all_org.upd_srv_req_no
FROM
	mam_lot_inh_src_all mam_lot_inh_src_$s_mam_lot_inh_src_all_org
WHERE
	0 = 0
	AND mam_lot_inh_src_$s_mam_lot_inh_src_all_org.co_cd = (SELECT co_cd FROM fct_context mam_lot_inh_src_$s_fct_context WHERE pid = pg_backend_pid())
	AND (mam_lot_inh_src_$s_mam_lot_inh_src_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_lot_inh_src_$s_maw_del_flg_ctl_W WHERE lower(mam_lot_inh_src_$s_maw_del_flg_ctl_W.tbl_nm) = 'mam_lot_inh_src'))
;

