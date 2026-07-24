\encoding UTF-8

CREATE OR REPLACE VIEW mst_ap_exc_gain_loss_$s(
	pay_act_d_no,
	pay_act_d_seq,
	ap_xrate_rev_his_no,
	ref_ap_xrate_rev_his_no,
	exc_gain_loss,
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
	mst_ap_exc_gain_loss_$s_mst_ap_exc_gain_loss_all_org.pay_act_d_no,
	mst_ap_exc_gain_loss_$s_mst_ap_exc_gain_loss_all_org.pay_act_d_seq,
	mst_ap_exc_gain_loss_$s_mst_ap_exc_gain_loss_all_org.ap_xrate_rev_his_no,
	mst_ap_exc_gain_loss_$s_mst_ap_exc_gain_loss_all_org.ref_ap_xrate_rev_his_no,
	mst_ap_exc_gain_loss_$s_mst_ap_exc_gain_loss_all_org.exc_gain_loss,
	mst_ap_exc_gain_loss_$s_mst_ap_exc_gain_loss_all_org.sub_char1,
	mst_ap_exc_gain_loss_$s_mst_ap_exc_gain_loss_all_org.sub_char2,
	mst_ap_exc_gain_loss_$s_mst_ap_exc_gain_loss_all_org.sub_char3,
	mst_ap_exc_gain_loss_$s_mst_ap_exc_gain_loss_all_org.ins_usr_id,
	mst_ap_exc_gain_loss_$s_mst_ap_exc_gain_loss_all_org.ins_usr_nm,
	mst_ap_exc_gain_loss_$s_mst_ap_exc_gain_loss_all_org.ins_ts,
	mst_ap_exc_gain_loss_$s_mst_ap_exc_gain_loss_all_org.ins_func_id,
	mst_ap_exc_gain_loss_$s_mst_ap_exc_gain_loss_all_org.upd_cntr,
	mst_ap_exc_gain_loss_$s_mst_ap_exc_gain_loss_all_org.upd_usr_id,
	mst_ap_exc_gain_loss_$s_mst_ap_exc_gain_loss_all_org.upd_usr_nm,
	mst_ap_exc_gain_loss_$s_mst_ap_exc_gain_loss_all_org.upd_ts,
	mst_ap_exc_gain_loss_$s_mst_ap_exc_gain_loss_all_org.upd_func_id,
	mst_ap_exc_gain_loss_$s_mst_ap_exc_gain_loss_all_org.upd_srv_req_no
FROM
	mst_ap_exc_gain_loss_all mst_ap_exc_gain_loss_$s_mst_ap_exc_gain_loss_all_org
WHERE
	0 = 0
	AND mst_ap_exc_gain_loss_$s_mst_ap_exc_gain_loss_all_org.co_cd = (SELECT co_cd FROM fct_context mst_ap_exc_gain_loss_$s_fct_context WHERE pid = pg_backend_pid())
;

