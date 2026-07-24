\encoding UTF-8

CREATE OR REPLACE VIEW mam_report_file_nm_$u(
	biz_typ,
	rpt_nm_elm_typ1,
	rpt_nm_elm_typ2,
	rpt_nm_elm_typ3,
	rpt_nm_elm_typ4,
	rpt_nm_elm_typ5,
	rpt_nm_elm_typ6,
	rpt_nm_elm_typ7,
	rpt_nm_elm_typ8,
	rpt_nm_elm_typ9,
	rpt_nm_elm_typ10,
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
	mam_report_file_nm_$u_mam_report_file_nm_all_org.biz_typ,
	mam_report_file_nm_$u_mam_report_file_nm_all_org.rpt_nm_elm_typ1,
	mam_report_file_nm_$u_mam_report_file_nm_all_org.rpt_nm_elm_typ2,
	mam_report_file_nm_$u_mam_report_file_nm_all_org.rpt_nm_elm_typ3,
	mam_report_file_nm_$u_mam_report_file_nm_all_org.rpt_nm_elm_typ4,
	mam_report_file_nm_$u_mam_report_file_nm_all_org.rpt_nm_elm_typ5,
	mam_report_file_nm_$u_mam_report_file_nm_all_org.rpt_nm_elm_typ6,
	mam_report_file_nm_$u_mam_report_file_nm_all_org.rpt_nm_elm_typ7,
	mam_report_file_nm_$u_mam_report_file_nm_all_org.rpt_nm_elm_typ8,
	mam_report_file_nm_$u_mam_report_file_nm_all_org.rpt_nm_elm_typ9,
	mam_report_file_nm_$u_mam_report_file_nm_all_org.rpt_nm_elm_typ10,
	mam_report_file_nm_$u_mam_report_file_nm_all_org.memo1,
	mam_report_file_nm_$u_mam_report_file_nm_all_org.memo2,
	mam_report_file_nm_$u_mam_report_file_nm_all_org.memo3,
	mam_report_file_nm_$u_mam_report_file_nm_all_org.del_flg,
	mam_report_file_nm_$u_mam_report_file_nm_all_org.del_usr_id,
	mam_report_file_nm_$u_mam_report_file_nm_all_org.del_usr_nm,
	mam_report_file_nm_$u_mam_report_file_nm_all_org.del_ts,
	mam_report_file_nm_$u_mam_report_file_nm_all_org.ins_usr_id,
	mam_report_file_nm_$u_mam_report_file_nm_all_org.ins_usr_nm,
	mam_report_file_nm_$u_mam_report_file_nm_all_org.ins_ts,
	mam_report_file_nm_$u_mam_report_file_nm_all_org.ins_func_id,
	mam_report_file_nm_$u_mam_report_file_nm_all_org.upd_cntr,
	mam_report_file_nm_$u_mam_report_file_nm_all_org.upd_usr_id,
	mam_report_file_nm_$u_mam_report_file_nm_all_org.upd_usr_nm,
	mam_report_file_nm_$u_mam_report_file_nm_all_org.upd_ts,
	mam_report_file_nm_$u_mam_report_file_nm_all_org.upd_func_id,
	mam_report_file_nm_$u_mam_report_file_nm_all_org.upd_srv_req_no
FROM
	mam_report_file_nm_all mam_report_file_nm_$u_mam_report_file_nm_all_org
WHERE
	0 = 0
	AND mam_report_file_nm_$u_mam_report_file_nm_all_org.co_cd = fcpa_context$f_get_co_cd()
;

