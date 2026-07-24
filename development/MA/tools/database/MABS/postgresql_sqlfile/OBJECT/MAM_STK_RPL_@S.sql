\encoding UTF-8

CREATE OR REPLACE VIEW mam_stk_rpl_$s(
	itm_cd,
	itm_sub1,
	itm_sub2,
	itm_sub3,
	loc_cd,
	st_dt,
	end_dt,
	buf_qty,
	rord_stk_qty,
	gi_schd_flg,
	rord_rqst_qty,
	lot_sizing_flg,
	gi_loc_cd,
	gi_str_ln_cd,
	inpt_gi_loc_cd,
	inpt_gi_str_ln_cd,
	ship_gi_loc_cd,
	ship_gi_str_ln_cd,
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
	mam_stk_rpl_$s_mam_stk_rpl_all_org.itm_cd,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.itm_sub1,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.itm_sub2,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.itm_sub3,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.loc_cd,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.st_dt,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.end_dt,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.buf_qty,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.rord_stk_qty,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.gi_schd_flg,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.rord_rqst_qty,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.lot_sizing_flg,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.gi_loc_cd,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.gi_str_ln_cd,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.inpt_gi_loc_cd,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.inpt_gi_str_ln_cd,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.ship_gi_loc_cd,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.ship_gi_str_ln_cd,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.memo1,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.memo2,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.memo3,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.del_flg,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.del_usr_id,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.del_usr_nm,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.del_ts,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.ins_usr_id,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.ins_usr_nm,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.ins_ts,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.ins_func_id,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.upd_cntr,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.upd_usr_id,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.upd_usr_nm,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.upd_ts,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.upd_func_id,
	mam_stk_rpl_$s_mam_stk_rpl_all_org.upd_srv_req_no
FROM
	mam_stk_rpl_all mam_stk_rpl_$s_mam_stk_rpl_all_org
WHERE
	0 = 0
	AND mam_stk_rpl_$s_mam_stk_rpl_all_org.co_cd = (SELECT co_cd FROM fct_context mam_stk_rpl_$s_fct_context WHERE pid = pg_backend_pid())
	AND (mam_stk_rpl_$s_mam_stk_rpl_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_stk_rpl_$s_maw_del_flg_ctl_W WHERE lower(mam_stk_rpl_$s_maw_del_flg_ctl_W.tbl_nm) = 'mam_stk_rpl'))
;

