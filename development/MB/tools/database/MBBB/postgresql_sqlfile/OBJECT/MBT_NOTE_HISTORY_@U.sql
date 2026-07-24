\encoding UTF-8

CREATE OR REPLACE VIEW mbt_note_history_$u(
	proc_no,
	ac_ym,
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
	mbt_note_history_$u_mbt_note_history_all_org.proc_no,
	mbt_note_history_$u_mbt_note_history_all_org.ac_ym,
	mbt_note_history_$u_mbt_note_history_all_org.ins_usr_id,
	mbt_note_history_$u_mbt_note_history_all_org.ins_usr_nm,
	mbt_note_history_$u_mbt_note_history_all_org.ins_ts,
	mbt_note_history_$u_mbt_note_history_all_org.ins_func_id,
	mbt_note_history_$u_mbt_note_history_all_org.upd_cntr,
	mbt_note_history_$u_mbt_note_history_all_org.upd_usr_id,
	mbt_note_history_$u_mbt_note_history_all_org.upd_usr_nm,
	mbt_note_history_$u_mbt_note_history_all_org.upd_ts,
	mbt_note_history_$u_mbt_note_history_all_org.upd_func_id,
	mbt_note_history_$u_mbt_note_history_all_org.upd_srv_req_no
FROM
	mbt_note_history_all mbt_note_history_$u_mbt_note_history_all_org
WHERE
	0 = 0
	AND mbt_note_history_$u_mbt_note_history_all_org.co_cd = fcpa_context$f_get_co_cd()
;

