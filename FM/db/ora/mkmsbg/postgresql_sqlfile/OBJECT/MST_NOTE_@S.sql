\encoding UTF-8

CREATE OR REPLACE VIEW mst_note_$s(
	note_mng_no,
	note_no,
	note_typ,
	draw_dt,
	due_dt,
	drawer_nm,
	draw_bank_cd,
	draw_branch_cd,
	endrsr,
	accptr,
	note_rsn_cd,
	note_amt,
	appl_amt,
	not_appl_bal,
	susp_amt,
	adv_amt,
	mat_flg,
	sub_char1,
	sub_char2,
	sub_char3,
	can_flg,
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
	mst_note_$s_mst_note_all_org.note_mng_no,
	mst_note_$s_mst_note_all_org.note_no,
	mst_note_$s_mst_note_all_org.note_typ,
	mst_note_$s_mst_note_all_org.draw_dt,
	mst_note_$s_mst_note_all_org.due_dt,
	mst_note_$s_mst_note_all_org.drawer_nm,
	mst_note_$s_mst_note_all_org.draw_bank_cd,
	mst_note_$s_mst_note_all_org.draw_branch_cd,
	mst_note_$s_mst_note_all_org.endrsr,
	mst_note_$s_mst_note_all_org.accptr,
	mst_note_$s_mst_note_all_org.note_rsn_cd,
	mst_note_$s_mst_note_all_org.note_amt,
	mst_note_$s_mst_note_all_org.appl_amt,
	mst_note_$s_mst_note_all_org.not_appl_bal,
	mst_note_$s_mst_note_all_org.susp_amt,
	mst_note_$s_mst_note_all_org.adv_amt,
	mst_note_$s_mst_note_all_org.mat_flg,
	mst_note_$s_mst_note_all_org.sub_char1,
	mst_note_$s_mst_note_all_org.sub_char2,
	mst_note_$s_mst_note_all_org.sub_char3,
	mst_note_$s_mst_note_all_org.can_flg,
	mst_note_$s_mst_note_all_org.ins_usr_id,
	mst_note_$s_mst_note_all_org.ins_usr_nm,
	mst_note_$s_mst_note_all_org.ins_ts,
	mst_note_$s_mst_note_all_org.ins_func_id,
	mst_note_$s_mst_note_all_org.upd_cntr,
	mst_note_$s_mst_note_all_org.upd_usr_id,
	mst_note_$s_mst_note_all_org.upd_usr_nm,
	mst_note_$s_mst_note_all_org.upd_ts,
	mst_note_$s_mst_note_all_org.upd_func_id,
	mst_note_$s_mst_note_all_org.upd_srv_req_no
FROM
	mst_note_all mst_note_$s_mst_note_all_org
WHERE
	0 = 0
	AND mst_note_$s_mst_note_all_org.co_cd = (SELECT co_cd FROM fct_context mst_note_$s_fct_context WHERE pid = pg_backend_pid())
;

