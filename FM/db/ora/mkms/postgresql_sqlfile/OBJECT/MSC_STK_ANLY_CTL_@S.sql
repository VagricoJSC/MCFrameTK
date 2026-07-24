\encoding UTF-8

CREATE OR REPLACE VIEW msc_stk_anly_ctl_$s(
	io_act_typ,
	ctl_tgt_typ,
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
	upd_srv_req_no
	)
AS
SELECT
	msc_stk_anly_ctl_$s_msc_stk_anly_ctl_all_org.io_act_typ,
	msc_stk_anly_ctl_$s_msc_stk_anly_ctl_all_org.ctl_tgt_typ,
	msc_stk_anly_ctl_$s_msc_stk_anly_ctl_all_org.memo1,
	msc_stk_anly_ctl_$s_msc_stk_anly_ctl_all_org.memo2,
	msc_stk_anly_ctl_$s_msc_stk_anly_ctl_all_org.memo3,
	msc_stk_anly_ctl_$s_msc_stk_anly_ctl_all_org.ins_usr_id,
	msc_stk_anly_ctl_$s_msc_stk_anly_ctl_all_org.ins_usr_nm,
	msc_stk_anly_ctl_$s_msc_stk_anly_ctl_all_org.ins_ts,
	msc_stk_anly_ctl_$s_msc_stk_anly_ctl_all_org.ins_func_id,
	msc_stk_anly_ctl_$s_msc_stk_anly_ctl_all_org.upd_cntr,
	msc_stk_anly_ctl_$s_msc_stk_anly_ctl_all_org.upd_usr_id,
	msc_stk_anly_ctl_$s_msc_stk_anly_ctl_all_org.upd_usr_nm,
	msc_stk_anly_ctl_$s_msc_stk_anly_ctl_all_org.upd_ts,
	msc_stk_anly_ctl_$s_msc_stk_anly_ctl_all_org.upd_func_id,
	msc_stk_anly_ctl_$s_msc_stk_anly_ctl_all_org.upd_srv_req_no
FROM
	msc_stk_anly_ctl_all msc_stk_anly_ctl_$s_msc_stk_anly_ctl_all_org
WHERE
	0 = 0
	AND msc_stk_anly_ctl_$s_msc_stk_anly_ctl_all_org.co_cd = (SELECT co_cd FROM fct_context msc_stk_anly_ctl_$s_fct_context WHERE pid = pg_backend_pid())
;

