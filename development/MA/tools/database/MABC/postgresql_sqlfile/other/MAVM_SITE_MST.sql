\encoding UTF-8

CREATE OR REPLACE VIEW mavm_site_mst(
site_cd,
site_nm,
arr_flg,
zip_cd,
addr1,
addr2,
addr3,
addr4,
tel,
fax,
def_loc_grp_cd,
def_alloc_grp_cd,
def_lg_grp_cd,
def_cal_cd,
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
upd_srv_req_no,
co_cd,
site_nm_lcl1,
site_nm_lcl2,
site_nm_lcl3,
site_nm_lcl4,
site_nm_lcl5
)
AS
SELECT
	mavm_site_mst_mam_site_all_t1.site_cd,
	mavm_site_mst_mam_site_all_t1.site_nm,
	mavm_site_mst_mam_site_all_t1.arr_flg,
	mavm_site_mst_mam_site_all_t1.zip_cd,
	mavm_site_mst_mam_site_all_t1.addr1,
	mavm_site_mst_mam_site_all_t1.addr2,
	mavm_site_mst_mam_site_all_t1.addr3,
	mavm_site_mst_mam_site_all_t1.addr4,
	mavm_site_mst_mam_site_all_t1.tel,
	mavm_site_mst_mam_site_all_t1.fax,
	mavm_site_mst_mam_site_all_t1.def_loc_grp_cd,
	mavm_site_mst_mam_site_all_t1.def_alloc_grp_cd,
	mavm_site_mst_mam_site_all_t1.def_lg_grp_cd,
	mavm_site_mst_mam_site_all_t1.def_cal_cd,
	mavm_site_mst_mam_site_all_t1.memo1,
	mavm_site_mst_mam_site_all_t1.memo2,
	mavm_site_mst_mam_site_all_t1.memo3,
	mavm_site_mst_mam_site_all_t1.del_flg,
	mavm_site_mst_mam_site_all_t1.del_usr_id,
	mavm_site_mst_mam_site_all_t1.del_usr_nm,
	mavm_site_mst_mam_site_all_t1.del_ts,
	mavm_site_mst_mam_site_all_t1.ins_usr_id,
	mavm_site_mst_mam_site_all_t1.ins_usr_nm,
	mavm_site_mst_mam_site_all_t1.ins_ts,
	mavm_site_mst_mam_site_all_t1.ins_func_id,
	mavm_site_mst_mam_site_all_t1.upd_cntr,
	mavm_site_mst_mam_site_all_t1.upd_usr_id,
	mavm_site_mst_mam_site_all_t1.upd_usr_nm,
	mavm_site_mst_mam_site_all_t1.upd_ts,
	mavm_site_mst_mam_site_all_t1.upd_func_id,
	mavm_site_mst_mam_site_all_t1.upd_srv_req_no,
	mavm_site_mst_mam_site_all_t1.co_cd,
	--工場・物流倉庫名（ロケール１）
	(SELECT mavm_site_mst_mam_site_lcl_all_t.site_nm
		FROM mam_site_lcl_all mavm_site_mst_mam_site_lcl_all_t
		WHERE 0 = 0
		AND mavm_site_mst_mam_site_lcl_all_t.site_cd = mavm_site_mst_mam_site_all_t1.site_cd
		AND mavm_site_mst_mam_site_lcl_all_t.co_cd = mavm_site_mst_mam_site_all_t1.co_cd
		AND mavm_site_mst_mam_site_lcl_all_t.lcl_cd = 'ja_JP'
	)	site_nm_lcl1,
	--工場・物流倉庫名（ロケール２）
	(SELECT mavm_site_mst_mam_site_lcl_all_t.site_nm
		FROM mam_site_lcl_all mavm_site_mst_mam_site_lcl_all_t
		WHERE 0 = 0
		AND mavm_site_mst_mam_site_lcl_all_t.site_cd = mavm_site_mst_mam_site_all_t1.site_cd
		AND mavm_site_mst_mam_site_lcl_all_t.co_cd = mavm_site_mst_mam_site_all_t1.co_cd
		AND mavm_site_mst_mam_site_lcl_all_t.lcl_cd = 'en_US'
	)	site_nm_lcl2,
	--工場・物流倉庫名（ロケール３）
	(SELECT mavm_site_mst_mam_site_lcl_all_t.site_nm
		FROM mam_site_lcl_all mavm_site_mst_mam_site_lcl_all_t
		WHERE 0 = 0
		AND mavm_site_mst_mam_site_lcl_all_t.site_cd = mavm_site_mst_mam_site_all_t1.site_cd
		AND mavm_site_mst_mam_site_lcl_all_t.co_cd = mavm_site_mst_mam_site_all_t1.co_cd
		AND mavm_site_mst_mam_site_lcl_all_t.lcl_cd = 'TBD3'
	)	site_nm_lcl3,
	--工場・物流倉庫名（ロケール４）
	(SELECT mavm_site_mst_mam_site_lcl_all_t.site_nm
		FROM mam_site_lcl_all mavm_site_mst_mam_site_lcl_all_t
		WHERE 0 = 0
		AND mavm_site_mst_mam_site_lcl_all_t.site_cd = mavm_site_mst_mam_site_all_t1.site_cd
		AND mavm_site_mst_mam_site_lcl_all_t.co_cd = mavm_site_mst_mam_site_all_t1.co_cd
		AND mavm_site_mst_mam_site_lcl_all_t.lcl_cd = 'TBD4'
	)	site_nm_lcl4,
	--工場・物流倉庫名（ロケール５）
	(SELECT mavm_site_mst_mam_site_lcl_all_t.site_nm
		FROM mam_site_lcl_all mavm_site_mst_mam_site_lcl_all_t
		WHERE 0 = 0
		AND mavm_site_mst_mam_site_lcl_all_t.site_cd = mavm_site_mst_mam_site_all_t1.site_cd
		AND mavm_site_mst_mam_site_lcl_all_t.co_cd = mavm_site_mst_mam_site_all_t1.co_cd
		AND mavm_site_mst_mam_site_lcl_all_t.lcl_cd = 'TBD5'
	)	site_nm_lcl5
	FROM mam_site_all mavm_site_mst_mam_site_all_t1
	WHERE 0 = 0
		AND	(
	(
		EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_site_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_site_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_SITE')
			AND	mavm_site_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','COM')
			)
		OR
		NOT EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_site_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_site_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_SITE')
			)
		)
	)
UNION ALL
SELECT
	mavm_site_mst_mam_site_cmn_t1.site_cd,
	mavm_site_mst_mam_site_cmn_t1.site_nm,
	mavm_site_mst_mam_site_cmn_t1.arr_flg,
	mavm_site_mst_mam_site_cmn_t1.zip_cd,
	mavm_site_mst_mam_site_cmn_t1.addr1,
	mavm_site_mst_mam_site_cmn_t1.addr2,
	mavm_site_mst_mam_site_cmn_t1.addr3,
	mavm_site_mst_mam_site_cmn_t1.addr4,
	mavm_site_mst_mam_site_cmn_t1.tel,
	mavm_site_mst_mam_site_cmn_t1.fax,
	mavm_site_mst_mam_site_cmn_t1.def_loc_grp_cd,
	mavm_site_mst_mam_site_cmn_t1.def_alloc_grp_cd,
	mavm_site_mst_mam_site_cmn_t1.def_lg_grp_cd,
	mavm_site_mst_mam_site_cmn_t1.def_cal_cd,
	mavm_site_mst_mam_site_cmn_t1.memo1,
	mavm_site_mst_mam_site_cmn_t1.memo2,
	mavm_site_mst_mam_site_cmn_t1.memo3,
	mavm_site_mst_mam_site_cmn_t1.del_flg,
	mavm_site_mst_mam_site_cmn_t1.del_usr_id,
	mavm_site_mst_mam_site_cmn_t1.del_usr_nm,
	mavm_site_mst_mam_site_cmn_t1.del_ts,
	mavm_site_mst_mam_site_cmn_t1.ins_usr_id,
	mavm_site_mst_mam_site_cmn_t1.ins_usr_nm,
	mavm_site_mst_mam_site_cmn_t1.ins_ts,
	mavm_site_mst_mam_site_cmn_t1.ins_func_id,
	mavm_site_mst_mam_site_cmn_t1.upd_cntr,
	mavm_site_mst_mam_site_cmn_t1.upd_usr_id,
	mavm_site_mst_mam_site_cmn_t1.upd_usr_nm,
	mavm_site_mst_mam_site_cmn_t1.upd_ts,
	mavm_site_mst_mam_site_cmn_t1.upd_func_id,
	mavm_site_mst_mam_site_cmn_t1.upd_srv_req_no,
	fcpa_const$get_const_val('MAC_STR','NULL_VAL') co_cd,
	--工場・物流倉庫名（ロケール１）
	(SELECT mavm_site_mst_mam_site_lcl_cmn_t.site_nm
		FROM mam_site_lcl_cmn mavm_site_mst_mam_site_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_site_mst_mam_site_lcl_cmn_t.site_cd = mavm_site_mst_mam_site_cmn_t1.site_cd
		AND mavm_site_mst_mam_site_lcl_cmn_t.lcl_cd = 'ja_JP'
	)	site_nm_lcl1,
	--工場・物流倉庫名（ロケール２）
	(SELECT mavm_site_mst_mam_site_lcl_cmn_t.site_nm
		FROM mam_site_lcl_cmn mavm_site_mst_mam_site_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_site_mst_mam_site_lcl_cmn_t.site_cd = mavm_site_mst_mam_site_cmn_t1.site_cd
		AND mavm_site_mst_mam_site_lcl_cmn_t.lcl_cd = 'en_US'
	)	site_nm_lcl2,
	--工場・物流倉庫名（ロケール３）
	(SELECT mavm_site_mst_mam_site_lcl_cmn_t.site_nm
		FROM mam_site_lcl_cmn mavm_site_mst_mam_site_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_site_mst_mam_site_lcl_cmn_t.site_cd = mavm_site_mst_mam_site_cmn_t1.site_cd
		AND mavm_site_mst_mam_site_lcl_cmn_t.lcl_cd = 'TBD3'
	)	site_nm_lcl3,
	--工場・物流倉庫名（ロケール４）
	(SELECT mavm_site_mst_mam_site_lcl_cmn_t.site_nm
		FROM mam_site_lcl_cmn mavm_site_mst_mam_site_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_site_mst_mam_site_lcl_cmn_t.site_cd = mavm_site_mst_mam_site_cmn_t1.site_cd
		AND mavm_site_mst_mam_site_lcl_cmn_t.lcl_cd = 'TBD4'
	)	site_nm_lcl4,
	--工場・物流倉庫名（ロケール５）
	(SELECT mavm_site_mst_mam_site_lcl_cmn_t.site_nm
		FROM mam_site_lcl_cmn mavm_site_mst_mam_site_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_site_mst_mam_site_lcl_cmn_t.site_cd = mavm_site_mst_mam_site_cmn_t1.site_cd
		AND mavm_site_mst_mam_site_lcl_cmn_t.lcl_cd = 'TBD5'
	)	site_nm_lcl5
	FROM mam_site_cmn mavm_site_mst_mam_site_cmn_t1
	WHERE 0 = 0
	AND	EXISTS (
		SELECT	'X'
		FROM	mam_mst_ctl mavm_site_mst_mam_mst_ctl_x
		WHERE	0=0
		AND	mavm_site_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_SITE')
		AND	mavm_site_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM')
	)
;;

