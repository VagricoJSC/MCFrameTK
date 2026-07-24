\encoding UTF-8

CREATE OR REPLACE VIEW mam_stdcost_(
itm_cd,
itm_sub1,
itm_sub2,
itm_sub3,
term,
wg_cd,
std_qty,
std_upri,
sub_upri1,
sub_upri2,
sub_upri3,
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
	mam_stdcost__mam_stdcost_all_org.itm_cd,
	mam_stdcost__mam_stdcost_all_org.itm_sub1,
	mam_stdcost__mam_stdcost_all_org.itm_sub2,
	mam_stdcost__mam_stdcost_all_org.itm_sub3,
	mam_stdcost__mam_stdcost_all_org.term,
	mam_stdcost__mam_stdcost_all_org.wg_cd,
	mam_stdcost__mam_stdcost_all_org.std_qty,
	mam_stdcost__mam_stdcost_all_org.std_upri,
	mam_stdcost__mam_stdcost_all_org.sub_upri1,
	mam_stdcost__mam_stdcost_all_org.sub_upri2,
	mam_stdcost__mam_stdcost_all_org.sub_upri3,
	mam_stdcost__mam_stdcost_all_org.memo1,
	mam_stdcost__mam_stdcost_all_org.memo2,
	mam_stdcost__mam_stdcost_all_org.memo3,
	mam_stdcost__mam_stdcost_all_org.del_flg,
	mam_stdcost__mam_stdcost_all_org.del_usr_id,
	mam_stdcost__mam_stdcost_all_org.del_usr_nm,
	mam_stdcost__mam_stdcost_all_org.del_ts,
	mam_stdcost__mam_stdcost_all_org.ins_usr_id,
	mam_stdcost__mam_stdcost_all_org.ins_usr_nm,
	mam_stdcost__mam_stdcost_all_org.ins_ts,
	mam_stdcost__mam_stdcost_all_org.ins_func_id,
	mam_stdcost__mam_stdcost_all_org.upd_cntr,
	mam_stdcost__mam_stdcost_all_org.upd_usr_id,
	mam_stdcost__mam_stdcost_all_org.upd_usr_nm,
	mam_stdcost__mam_stdcost_all_org.upd_ts,
	mam_stdcost__mam_stdcost_all_org.upd_func_id,
	mam_stdcost__mam_stdcost_all_org.upd_srv_req_no
FROM 
	mam_stdcost_all mam_stdcost__mam_stdcost_all_org
WHERE 
	0 = 0
	AND mam_stdcost__mam_stdcost_all_org.co_cd = fcpa_context$f_get_co_cd()
;;

