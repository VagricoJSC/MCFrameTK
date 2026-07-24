\encoding UTF-8

CREATE OR REPLACE VIEW mst_ar_exc_gain_loss(
	rcv_act_d_no,
	rcv_act_d_seq,
	ar_xrate_rev_his_no,
	ref_ar_xrate_rev_his_no,
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
	mst_ar_exc_gain_loss_mst_ar_exc_gain_loss_all_org.rcv_act_d_no,
	mst_ar_exc_gain_loss_mst_ar_exc_gain_loss_all_org.rcv_act_d_seq,
	mst_ar_exc_gain_loss_mst_ar_exc_gain_loss_all_org.ar_xrate_rev_his_no,
	mst_ar_exc_gain_loss_mst_ar_exc_gain_loss_all_org.ref_ar_xrate_rev_his_no,
	mst_ar_exc_gain_loss_mst_ar_exc_gain_loss_all_org.exc_gain_loss,
	mst_ar_exc_gain_loss_mst_ar_exc_gain_loss_all_org.sub_char1,
	mst_ar_exc_gain_loss_mst_ar_exc_gain_loss_all_org.sub_char2,
	mst_ar_exc_gain_loss_mst_ar_exc_gain_loss_all_org.sub_char3,
	mst_ar_exc_gain_loss_mst_ar_exc_gain_loss_all_org.ins_usr_id,
	mst_ar_exc_gain_loss_mst_ar_exc_gain_loss_all_org.ins_usr_nm,
	mst_ar_exc_gain_loss_mst_ar_exc_gain_loss_all_org.ins_ts,
	mst_ar_exc_gain_loss_mst_ar_exc_gain_loss_all_org.ins_func_id,
	mst_ar_exc_gain_loss_mst_ar_exc_gain_loss_all_org.upd_cntr,
	mst_ar_exc_gain_loss_mst_ar_exc_gain_loss_all_org.upd_usr_id,
	mst_ar_exc_gain_loss_mst_ar_exc_gain_loss_all_org.upd_usr_nm,
	mst_ar_exc_gain_loss_mst_ar_exc_gain_loss_all_org.upd_ts,
	mst_ar_exc_gain_loss_mst_ar_exc_gain_loss_all_org.upd_func_id,
	mst_ar_exc_gain_loss_mst_ar_exc_gain_loss_all_org.upd_srv_req_no
FROM
	mst_ar_exc_gain_loss_all mst_ar_exc_gain_loss_mst_ar_exc_gain_loss_all_org
WHERE
	0 = 0
	AND mst_ar_exc_gain_loss_mst_ar_exc_gain_loss_all_org.co_cd = (SELECT co_cd FROM fct_context mst_ar_exc_gain_loss_fct_context WHERE pid = pg_backend_pid())
;

