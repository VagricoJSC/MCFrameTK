\encoding UTF-8

CREATE OR REPLACE VIEW mam_note_rsn_lcl_$s(
	note_rsn_cd,
	note_rsn_nm,
	memo1,
	memo2,
	memo3,
	ins_usr_id,
	ins_usr_nm,
	ins_ts,
	ins_func_id,
	upd_cntr,
	upd_usr_id,
	upd_usr_nm,
	upd_ts,
	upd_func_id,
	upd_srv_req_no,
	lcl_cd
	)
AS
SELECT
	mam_note_rsn_lcl_$s_mam_note_rsn_lcl_all_org.note_rsn_cd,
	mam_note_rsn_lcl_$s_mam_note_rsn_lcl_all_org.note_rsn_nm,
	mam_note_rsn_lcl_$s_mam_note_rsn_lcl_all_org.memo1,
	mam_note_rsn_lcl_$s_mam_note_rsn_lcl_all_org.memo2,
	mam_note_rsn_lcl_$s_mam_note_rsn_lcl_all_org.memo3,
	mam_note_rsn_lcl_$s_mam_note_rsn_lcl_all_org.ins_usr_id,
	mam_note_rsn_lcl_$s_mam_note_rsn_lcl_all_org.ins_usr_nm,
	mam_note_rsn_lcl_$s_mam_note_rsn_lcl_all_org.ins_ts,
	mam_note_rsn_lcl_$s_mam_note_rsn_lcl_all_org.ins_func_id,
	mam_note_rsn_lcl_$s_mam_note_rsn_lcl_all_org.upd_cntr,
	mam_note_rsn_lcl_$s_mam_note_rsn_lcl_all_org.upd_usr_id,
	mam_note_rsn_lcl_$s_mam_note_rsn_lcl_all_org.upd_usr_nm,
	mam_note_rsn_lcl_$s_mam_note_rsn_lcl_all_org.upd_ts,
	mam_note_rsn_lcl_$s_mam_note_rsn_lcl_all_org.upd_func_id,
	mam_note_rsn_lcl_$s_mam_note_rsn_lcl_all_org.upd_srv_req_no,
	mam_note_rsn_lcl_$s_mam_note_rsn_lcl_all_org.lcl_cd
FROM
	mam_note_rsn_lcl_all mam_note_rsn_lcl_$s_mam_note_rsn_lcl_all_org
WHERE
	0 = 0
	AND mam_note_rsn_lcl_$s_mam_note_rsn_lcl_all_org.co_cd = (SELECT co_cd FROM fct_context mam_note_rsn_lcl_$s_fct_context WHERE pid = pg_backend_pid())
;

