\encoding UTF-8

CREATE OR REPLACE VIEW msvt_pay_schd_cl_br(
batch_data_no,
bsppl_cd,
bsppl_dpt_cd,
bsppl_dpt_nm,
trd_cur_cd,
wrk_no,
bsppl_cl_dt,
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
	msvt_pay_schd_cl_br_mst_pay_schd_cl_br_t1.batch_data_no,
	msvt_pay_schd_cl_br_mst_pay_schd_cl_br_t1.bsppl_cd,
	msvt_pay_schd_cl_br_mst_pay_schd_cl_br_t1.bsppl_dpt_cd,
	msvt_pay_schd_cl_br_mam_dpt_m1.dpt_nm AS bsppl_dpt_nm,
	msvt_pay_schd_cl_br_mst_pay_schd_cl_br_t1.trd_cur_cd,
	msvt_pay_schd_cl_br_mst_pay_schd_cl_br_t1.wrk_no,
	msvt_pay_schd_cl_br_mst_pay_schd_cl_br_t1.bsppl_cl_dt,
	msvt_pay_schd_cl_br_mst_pay_schd_cl_br_t1.exe_sts_typ,
	msvt_pay_schd_cl_br_mst_pay_schd_cl_br_t1.batch_log_no,
	msvt_pay_schd_cl_br_mst_pay_schd_cl_br_t1.log_sub_key1,
	msvt_pay_schd_cl_br_mst_pay_schd_cl_br_t1.log_sub_key2,
	msvt_pay_schd_cl_br_mst_pay_schd_cl_br_t1.ins_usr_id,
	msvt_pay_schd_cl_br_mst_pay_schd_cl_br_t1.ins_usr_nm,
	msvt_pay_schd_cl_br_mst_pay_schd_cl_br_t1.ins_ts,
	msvt_pay_schd_cl_br_mst_pay_schd_cl_br_t1.ins_func_id,
	msvt_pay_schd_cl_br_mst_pay_schd_cl_br_t1.upd_cntr,
	msvt_pay_schd_cl_br_mst_pay_schd_cl_br_t1.upd_usr_id,
	msvt_pay_schd_cl_br_mst_pay_schd_cl_br_t1.upd_usr_nm,
	msvt_pay_schd_cl_br_mst_pay_schd_cl_br_t1.upd_ts,
	msvt_pay_schd_cl_br_mst_pay_schd_cl_br_t1.upd_func_id,
	msvt_pay_schd_cl_br_mst_pay_schd_cl_br_t1.upd_srv_req_no
FROM
	mst_pay_schd_cl_br msvt_pay_schd_cl_br_mst_pay_schd_cl_br_t1
	LEFT OUTER JOIN mam_dpt msvt_pay_schd_cl_br_mam_dpt_m1 ON (msvt_pay_schd_cl_br_mst_pay_schd_cl_br_t1.bsppl_dpt_cd = msvt_pay_schd_cl_br_mam_dpt_m1.dpt_cd AND msvt_pay_schd_cl_br_mst_pay_schd_cl_br_t1.bsppl_cl_dt BETWEEN msvt_pay_schd_cl_br_mam_dpt_m1.st_dt AND msvt_pay_schd_cl_br_mam_dpt_m1.end_dt)
WHERE 
	0=0
;;

