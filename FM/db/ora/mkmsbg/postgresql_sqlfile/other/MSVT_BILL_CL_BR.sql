\encoding UTF-8

CREATE OR REPLACE VIEW msvt_bill_cl_br(
batch_data_no,
bcst_cd,
bill_dpt_cd,
bill_dpt_nm,
iv_no,
trd_cur_cd,
wrk_no,
bill_cl_dt,
exe_sts_typ,
batch_log_no,
log_sub_key1,
log_sub_key2,
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
	msvt_bill_cl_br_mst_bill_cl_br_t1.batch_data_no,
	msvt_bill_cl_br_mst_bill_cl_br_t1.bcst_cd,
	msvt_bill_cl_br_mst_bill_cl_br_t1.bill_dpt_cd,
	msvt_bill_cl_br_mam_dpt_m1.dpt_nm AS bill_dpt_nm,
	msvt_bill_cl_br_mst_bill_cl_br_t1.iv_no,
	msvt_bill_cl_br_mst_bill_cl_br_t1.trd_cur_cd,
	msvt_bill_cl_br_mst_bill_cl_br_t1.wrk_no,
	msvt_bill_cl_br_mst_bill_cl_br_t1.bill_cl_dt,
	msvt_bill_cl_br_mst_bill_cl_br_t1.exe_sts_typ,
	msvt_bill_cl_br_mst_bill_cl_br_t1.batch_log_no,
	msvt_bill_cl_br_mst_bill_cl_br_t1.log_sub_key1,
	msvt_bill_cl_br_mst_bill_cl_br_t1.log_sub_key2,
	msvt_bill_cl_br_mst_bill_cl_br_t1.ins_usr_id,
	msvt_bill_cl_br_mst_bill_cl_br_t1.ins_usr_nm,
	msvt_bill_cl_br_mst_bill_cl_br_t1.ins_ts,
	msvt_bill_cl_br_mst_bill_cl_br_t1.ins_func_id,
	msvt_bill_cl_br_mst_bill_cl_br_t1.upd_cntr,
	msvt_bill_cl_br_mst_bill_cl_br_t1.upd_usr_id,
	msvt_bill_cl_br_mst_bill_cl_br_t1.upd_usr_nm,
	msvt_bill_cl_br_mst_bill_cl_br_t1.upd_ts,
	msvt_bill_cl_br_mst_bill_cl_br_t1.upd_func_id,
	msvt_bill_cl_br_mst_bill_cl_br_t1.upd_srv_req_no
FROM
	mst_bill_cl_br msvt_bill_cl_br_mst_bill_cl_br_t1
	LEFT OUTER JOIN mam_dpt msvt_bill_cl_br_mam_dpt_m1 ON (msvt_bill_cl_br_mst_bill_cl_br_t1.bill_dpt_cd = msvt_bill_cl_br_mam_dpt_m1.dpt_cd AND msvt_bill_cl_br_mst_bill_cl_br_t1.bill_cl_dt BETWEEN msvt_bill_cl_br_mam_dpt_m1.st_dt AND msvt_bill_cl_br_mam_dpt_m1.end_dt)
WHERE
	0=0
;;

