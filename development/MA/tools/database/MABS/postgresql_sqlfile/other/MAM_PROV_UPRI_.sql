\encoding UTF-8

CREATE OR REPLACE VIEW mam_prov_upri_(
itm_cd,
itm_sub1,
itm_sub2,
itm_sub3,
prsppl_cd,
cur_cd,
wg_cd,
st_dt,
end_dt,
prov_typ,
upri,
upri_bf,
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
	mam_prov_upri__mam_prov_upri_all_org.itm_cd,
	mam_prov_upri__mam_prov_upri_all_org.itm_sub1,
	mam_prov_upri__mam_prov_upri_all_org.itm_sub2,
	mam_prov_upri__mam_prov_upri_all_org.itm_sub3,
	mam_prov_upri__mam_prov_upri_all_org.prsppl_cd,
	mam_prov_upri__mam_prov_upri_all_org.cur_cd,
	mam_prov_upri__mam_prov_upri_all_org.wg_cd,
	mam_prov_upri__mam_prov_upri_all_org.st_dt,
	mam_prov_upri__mam_prov_upri_all_org.end_dt,
	mam_prov_upri__mam_prov_upri_all_org.prov_typ,
	mam_prov_upri__mam_prov_upri_all_org.upri,
	mam_prov_upri__mam_prov_upri_all_org.upri_bf,
	mam_prov_upri__mam_prov_upri_all_org.sub_upri1,
	mam_prov_upri__mam_prov_upri_all_org.sub_upri2,
	mam_prov_upri__mam_prov_upri_all_org.sub_upri3,
	mam_prov_upri__mam_prov_upri_all_org.memo1,
	mam_prov_upri__mam_prov_upri_all_org.memo2,
	mam_prov_upri__mam_prov_upri_all_org.memo3,
	mam_prov_upri__mam_prov_upri_all_org.del_flg,
	mam_prov_upri__mam_prov_upri_all_org.del_usr_id,
	mam_prov_upri__mam_prov_upri_all_org.del_usr_nm,
	mam_prov_upri__mam_prov_upri_all_org.del_ts,
	mam_prov_upri__mam_prov_upri_all_org.ins_usr_id,
	mam_prov_upri__mam_prov_upri_all_org.ins_usr_nm,
	mam_prov_upri__mam_prov_upri_all_org.ins_ts,
	mam_prov_upri__mam_prov_upri_all_org.ins_func_id,
	mam_prov_upri__mam_prov_upri_all_org.upd_cntr,
	mam_prov_upri__mam_prov_upri_all_org.upd_usr_id,
	mam_prov_upri__mam_prov_upri_all_org.upd_usr_nm,
	mam_prov_upri__mam_prov_upri_all_org.upd_ts,
	mam_prov_upri__mam_prov_upri_all_org.upd_func_id,
	mam_prov_upri__mam_prov_upri_all_org.upd_srv_req_no
FROM 
	mam_prov_upri_all mam_prov_upri__mam_prov_upri_all_org
WHERE 
	0 = 0
	AND mam_prov_upri__mam_prov_upri_all_org.co_cd = fcpa_context$f_get_co_cd()
;;

