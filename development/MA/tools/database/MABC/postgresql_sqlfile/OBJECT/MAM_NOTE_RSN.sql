\encoding UTF-8

CREATE OR REPLACE VIEW mam_note_rsn(
	note_rsn_cd,
	note_rsn_nm,
	base_note_rsn_nm,
	dpt_id_flg,
	slip_cnt_id,
	ac_cd,
	sub_ac_cd,
	abs_b_typ,
	abstract2,
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
	mam_note_rsn_mam_note_rsn_all_org.note_rsn_cd,
	mam_note_rsn_mam_note_rsn_lcl_all_lcl.note_rsn_nm,
	mam_note_rsn_mam_note_rsn_all_org.note_rsn_nm AS base_note_rsn_nm,
	mam_note_rsn_mam_note_rsn_all_org.dpt_id_flg,
	mam_note_rsn_mam_note_rsn_all_org.slip_cnt_id,
	mam_note_rsn_mam_note_rsn_all_org.ac_cd,
	mam_note_rsn_mam_note_rsn_all_org.sub_ac_cd,
	mam_note_rsn_mam_note_rsn_all_org.abs_b_typ,
	mam_note_rsn_mam_note_rsn_all_org.abstract2,
	mam_note_rsn_mam_note_rsn_all_org.memo1,
	mam_note_rsn_mam_note_rsn_all_org.memo2,
	mam_note_rsn_mam_note_rsn_all_org.memo3,
	mam_note_rsn_mam_note_rsn_all_org.del_flg,
	mam_note_rsn_mam_note_rsn_all_org.del_usr_id,
	mam_note_rsn_mam_note_rsn_all_org.del_usr_nm,
	mam_note_rsn_mam_note_rsn_all_org.del_ts,
	mam_note_rsn_mam_note_rsn_all_org.ins_usr_id,
	mam_note_rsn_mam_note_rsn_all_org.ins_usr_nm,
	mam_note_rsn_mam_note_rsn_all_org.ins_ts,
	mam_note_rsn_mam_note_rsn_all_org.ins_func_id,
	mam_note_rsn_mam_note_rsn_all_org.upd_cntr,
	mam_note_rsn_mam_note_rsn_all_org.upd_usr_id,
	mam_note_rsn_mam_note_rsn_all_org.upd_usr_nm,
	mam_note_rsn_mam_note_rsn_all_org.upd_ts,
	mam_note_rsn_mam_note_rsn_all_org.upd_func_id,
	mam_note_rsn_mam_note_rsn_all_org.upd_srv_req_no
FROM
	mam_note_rsn_all mam_note_rsn_mam_note_rsn_all_org
LEFT OUTER JOIN
	mam_note_rsn_lcl_all mam_note_rsn_mam_note_rsn_lcl_all_lcl
ON
	mam_note_rsn_mam_note_rsn_all_org.note_rsn_cd = mam_note_rsn_mam_note_rsn_lcl_all_lcl.note_rsn_cd
	AND mam_note_rsn_mam_note_rsn_all_org.co_cd = mam_note_rsn_mam_note_rsn_lcl_all_lcl.co_cd
	AND mam_note_rsn_mam_note_rsn_lcl_all_lcl.lcl_cd = (SELECT lcl_cd FROM fct_context mam_note_rsn_fct_context WHERE pid = pg_backend_pid())
WHERE
	0 = 0
	AND mam_note_rsn_mam_note_rsn_all_org.co_cd = (SELECT co_cd FROM fct_context mam_note_rsn_fct_context WHERE pid = pg_backend_pid())
	AND (mam_note_rsn_mam_note_rsn_all_org.del_flg = '0' OR mapa_context$f_get_del_flg_ctl() = '0' OR EXISTS( SELECT 1 FROM maw_del_flg_ctl mam_note_rsn_maw_del_flg_ctl_W WHERE lower(mam_note_rsn_maw_del_flg_ctl_W.tbl_nm) = 'mam_note_rsn'))
;

