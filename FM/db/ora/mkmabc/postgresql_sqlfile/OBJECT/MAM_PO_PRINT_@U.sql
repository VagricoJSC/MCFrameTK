\encoding UTF-8

CREATE OR REPLACE VIEW mam_po_print_$u(
	po_print_cd,
	po_print_nm,
	txt_new_off,
	txt_mod_off,
	txt_del_off,
	txt_new_on,
	txt_mod_on,
	txt_del_on,
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
	mam_po_print_$u_mam_po_print_all_org.po_print_cd,
	mam_po_print_$u_mam_po_print_all_org.po_print_nm,
	mam_po_print_$u_mam_po_print_all_org.txt_new_off,
	mam_po_print_$u_mam_po_print_all_org.txt_mod_off,
	mam_po_print_$u_mam_po_print_all_org.txt_del_off,
	mam_po_print_$u_mam_po_print_all_org.txt_new_on,
	mam_po_print_$u_mam_po_print_all_org.txt_mod_on,
	mam_po_print_$u_mam_po_print_all_org.txt_del_on,
	mam_po_print_$u_mam_po_print_all_org.memo1,
	mam_po_print_$u_mam_po_print_all_org.memo2,
	mam_po_print_$u_mam_po_print_all_org.memo3,
	mam_po_print_$u_mam_po_print_all_org.del_flg,
	mam_po_print_$u_mam_po_print_all_org.del_usr_id,
	mam_po_print_$u_mam_po_print_all_org.del_usr_nm,
	mam_po_print_$u_mam_po_print_all_org.del_ts,
	mam_po_print_$u_mam_po_print_all_org.ins_usr_id,
	mam_po_print_$u_mam_po_print_all_org.ins_usr_nm,
	mam_po_print_$u_mam_po_print_all_org.ins_ts,
	mam_po_print_$u_mam_po_print_all_org.ins_func_id,
	mam_po_print_$u_mam_po_print_all_org.upd_cntr,
	mam_po_print_$u_mam_po_print_all_org.upd_usr_id,
	mam_po_print_$u_mam_po_print_all_org.upd_usr_nm,
	mam_po_print_$u_mam_po_print_all_org.upd_ts,
	mam_po_print_$u_mam_po_print_all_org.upd_func_id,
	mam_po_print_$u_mam_po_print_all_org.upd_srv_req_no
FROM
	mam_po_print_all mam_po_print_$u_mam_po_print_all_org
WHERE
	0 = 0
	AND mam_po_print_$u_mam_po_print_all_org.co_cd = fcpa_context$f_get_co_cd()
;

