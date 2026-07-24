\encoding UTF-8

CREATE OR REPLACE VIEW mam_loss_rsn_$s(
	itm_typ,
	itm_typ_d_cd,
	loss_rsn_cd,
	def_disp_flg,
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
	mam_loss_rsn_$s_mam_loss_rsn_all_org.itm_typ,
	mam_loss_rsn_$s_mam_loss_rsn_all_org.itm_typ_d_cd,
	mam_loss_rsn_$s_mam_loss_rsn_all_org.loss_rsn_cd,
	mam_loss_rsn_$s_mam_loss_rsn_all_org.def_disp_flg,
	mam_loss_rsn_$s_mam_loss_rsn_all_org.memo1,
	mam_loss_rsn_$s_mam_loss_rsn_all_org.memo2,
	mam_loss_rsn_$s_mam_loss_rsn_all_org.memo3,
	mam_loss_rsn_$s_mam_loss_rsn_all_org.del_flg,
	mam_loss_rsn_$s_mam_loss_rsn_all_org.del_usr_id,
	mam_loss_rsn_$s_mam_loss_rsn_all_org.del_usr_nm,
	mam_loss_rsn_$s_mam_loss_rsn_all_org.del_ts,
	mam_loss_rsn_$s_mam_loss_rsn_all_org.ins_usr_id,
	mam_loss_rsn_$s_mam_loss_rsn_all_org.ins_usr_nm,
	mam_loss_rsn_$s_mam_loss_rsn_all_org.ins_ts,
	mam_loss_rsn_$s_mam_loss_rsn_all_org.ins_func_id,
	mam_loss_rsn_$s_mam_loss_rsn_all_org.upd_cntr,
	mam_loss_rsn_$s_mam_loss_rsn_all_org.upd_usr_id,
	mam_loss_rsn_$s_mam_loss_rsn_all_org.upd_usr_nm,
	mam_loss_rsn_$s_mam_loss_rsn_all_org.upd_ts,
	mam_loss_rsn_$s_mam_loss_rsn_all_org.upd_func_id,
	mam_loss_rsn_$s_mam_loss_rsn_all_org.upd_srv_req_no
FROM
	mam_loss_rsn_all mam_loss_rsn_$s_mam_loss_rsn_all_org
WHERE
	0 = 0
	AND mam_loss_rsn_$s_mam_loss_rsn_all_org.co_cd = (SELECT co_cd FROM fct_context mam_loss_rsn_$s_fct_context WHERE pid = pg_backend_pid())
	AND (mam_loss_rsn_$s_mam_loss_rsn_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_loss_rsn_$s_maw_del_flg_ctl_W WHERE lower(mam_loss_rsn_$s_maw_del_flg_ctl_W.tbl_nm) = 'mam_loss_rsn'))
;

