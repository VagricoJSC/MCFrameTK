\encoding UTF-8

CREATE OR REPLACE VIEW mst_loss_act(
	loss_act_no,
	inpt_act_no,
	loss_rsn_cd,
	base_unit_qty,
	cont_qty,
	fxd_loss_flg,
	intr_rmrks,
	trd_rmrks,
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
	mst_loss_act_mst_loss_act_all_org.loss_act_no,
	mst_loss_act_mst_loss_act_all_org.inpt_act_no,
	mst_loss_act_mst_loss_act_all_org.loss_rsn_cd,
	mst_loss_act_mst_loss_act_all_org.base_unit_qty,
	mst_loss_act_mst_loss_act_all_org.cont_qty,
	mst_loss_act_mst_loss_act_all_org.fxd_loss_flg,
	mst_loss_act_mst_loss_act_all_org.intr_rmrks,
	mst_loss_act_mst_loss_act_all_org.trd_rmrks,
	mst_loss_act_mst_loss_act_all_org.sub_char1,
	mst_loss_act_mst_loss_act_all_org.sub_char2,
	mst_loss_act_mst_loss_act_all_org.sub_char3,
	mst_loss_act_mst_loss_act_all_org.ins_usr_id,
	mst_loss_act_mst_loss_act_all_org.ins_usr_nm,
	mst_loss_act_mst_loss_act_all_org.ins_ts,
	mst_loss_act_mst_loss_act_all_org.ins_func_id,
	mst_loss_act_mst_loss_act_all_org.upd_cntr,
	mst_loss_act_mst_loss_act_all_org.upd_usr_id,
	mst_loss_act_mst_loss_act_all_org.upd_usr_nm,
	mst_loss_act_mst_loss_act_all_org.upd_ts,
	mst_loss_act_mst_loss_act_all_org.upd_func_id,
	mst_loss_act_mst_loss_act_all_org.upd_srv_req_no
FROM
	mst_loss_act_all mst_loss_act_mst_loss_act_all_org
WHERE
	0 = 0
	AND mst_loss_act_mst_loss_act_all_org.co_cd = (SELECT co_cd FROM fct_context mst_loss_act_fct_context WHERE pid = pg_backend_pid())
;

