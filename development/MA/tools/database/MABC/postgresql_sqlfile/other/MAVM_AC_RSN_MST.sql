\encoding UTF-8

CREATE OR REPLACE VIEW mavm_ac_rsn_mst(
ac_rsn_cd,
ac_rsn_nm,
ar_typ,
ap_typ,
ac_invalid_flg,
cost_invalid_flg,
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
ac_rsn_nm_lcl1,
ac_rsn_nm_lcl2,
ac_rsn_nm_lcl3,
ac_rsn_nm_lcl4,
ac_rsn_nm_lcl5
)
AS
SELECT
	mavm_ac_rsn_mst_mam_ac_rsn_all_t1.ac_rsn_cd,
	mavm_ac_rsn_mst_mam_ac_rsn_all_t1.ac_rsn_nm,
	mavm_ac_rsn_mst_mam_ac_rsn_all_t1.ar_typ,
	mavm_ac_rsn_mst_mam_ac_rsn_all_t1.ap_typ,
	mavm_ac_rsn_mst_mam_ac_rsn_all_t1.ac_invalid_flg,
	mavm_ac_rsn_mst_mam_ac_rsn_all_t1.cost_invalid_flg,
	mavm_ac_rsn_mst_mam_ac_rsn_all_t1.memo1,
	mavm_ac_rsn_mst_mam_ac_rsn_all_t1.memo2,
	mavm_ac_rsn_mst_mam_ac_rsn_all_t1.memo3,
	mavm_ac_rsn_mst_mam_ac_rsn_all_t1.del_flg,
	mavm_ac_rsn_mst_mam_ac_rsn_all_t1.del_usr_id,
	mavm_ac_rsn_mst_mam_ac_rsn_all_t1.del_usr_nm,
	mavm_ac_rsn_mst_mam_ac_rsn_all_t1.del_ts,
	mavm_ac_rsn_mst_mam_ac_rsn_all_t1.ins_usr_id,
	mavm_ac_rsn_mst_mam_ac_rsn_all_t1.ins_usr_nm,
	mavm_ac_rsn_mst_mam_ac_rsn_all_t1.ins_ts,
	mavm_ac_rsn_mst_mam_ac_rsn_all_t1.ins_func_id,
	mavm_ac_rsn_mst_mam_ac_rsn_all_t1.upd_cntr,
	mavm_ac_rsn_mst_mam_ac_rsn_all_t1.upd_usr_id,
	mavm_ac_rsn_mst_mam_ac_rsn_all_t1.upd_usr_nm,
	mavm_ac_rsn_mst_mam_ac_rsn_all_t1.upd_ts,
	mavm_ac_rsn_mst_mam_ac_rsn_all_t1.upd_func_id,
	mavm_ac_rsn_mst_mam_ac_rsn_all_t1.upd_srv_req_no,
	mavm_ac_rsn_mst_mam_ac_rsn_all_t1.co_cd,
	--会計理由名（ロケール１）
	(SELECT mavm_ac_rsn_mst_mam_ac_rsn_lcl_all_t.ac_rsn_nm
		FROM mam_ac_rsn_lcl_all mavm_ac_rsn_mst_mam_ac_rsn_lcl_all_t
		WHERE 0 = 0
		AND mavm_ac_rsn_mst_mam_ac_rsn_lcl_all_t.ac_rsn_cd = mavm_ac_rsn_mst_mam_ac_rsn_all_t1.ac_rsn_cd
		AND mavm_ac_rsn_mst_mam_ac_rsn_lcl_all_t.co_cd = mavm_ac_rsn_mst_mam_ac_rsn_all_t1.co_cd
		AND mavm_ac_rsn_mst_mam_ac_rsn_lcl_all_t.lcl_cd = 'ja_JP'
	)	ac_rsn_nm_lcl1,
	--会計理由名（ロケール２）
	(SELECT mavm_ac_rsn_mst_mam_ac_rsn_lcl_all_t.ac_rsn_nm
		FROM mam_ac_rsn_lcl_all mavm_ac_rsn_mst_mam_ac_rsn_lcl_all_t
		WHERE 0 = 0
		AND mavm_ac_rsn_mst_mam_ac_rsn_lcl_all_t.ac_rsn_cd = mavm_ac_rsn_mst_mam_ac_rsn_all_t1.ac_rsn_cd
		AND mavm_ac_rsn_mst_mam_ac_rsn_lcl_all_t.co_cd = mavm_ac_rsn_mst_mam_ac_rsn_all_t1.co_cd
		AND mavm_ac_rsn_mst_mam_ac_rsn_lcl_all_t.lcl_cd = 'en_US'
	)	ac_rsn_nm_lcl2,
	--会計理由名（ロケール３）
	(SELECT mavm_ac_rsn_mst_mam_ac_rsn_lcl_all_t.ac_rsn_nm
		FROM mam_ac_rsn_lcl_all mavm_ac_rsn_mst_mam_ac_rsn_lcl_all_t
		WHERE 0 = 0
		AND mavm_ac_rsn_mst_mam_ac_rsn_lcl_all_t.ac_rsn_cd = mavm_ac_rsn_mst_mam_ac_rsn_all_t1.ac_rsn_cd
		AND mavm_ac_rsn_mst_mam_ac_rsn_lcl_all_t.co_cd = mavm_ac_rsn_mst_mam_ac_rsn_all_t1.co_cd
		AND mavm_ac_rsn_mst_mam_ac_rsn_lcl_all_t.lcl_cd = 'TBD3'
	)	ac_rsn_nm_lcl3,
	--会計理由名（ロケール４）
	(SELECT mavm_ac_rsn_mst_mam_ac_rsn_lcl_all_t.ac_rsn_nm
		FROM mam_ac_rsn_lcl_all mavm_ac_rsn_mst_mam_ac_rsn_lcl_all_t
		WHERE 0 = 0
		AND mavm_ac_rsn_mst_mam_ac_rsn_lcl_all_t.ac_rsn_cd = mavm_ac_rsn_mst_mam_ac_rsn_all_t1.ac_rsn_cd
		AND mavm_ac_rsn_mst_mam_ac_rsn_lcl_all_t.co_cd = mavm_ac_rsn_mst_mam_ac_rsn_all_t1.co_cd
		AND mavm_ac_rsn_mst_mam_ac_rsn_lcl_all_t.lcl_cd = 'TBD4'
	)	ac_rsn_nm_lcl4,
	--会計理由名（ロケール５）
	(SELECT mavm_ac_rsn_mst_mam_ac_rsn_lcl_all_t.ac_rsn_nm
		FROM mam_ac_rsn_lcl_all mavm_ac_rsn_mst_mam_ac_rsn_lcl_all_t
		WHERE 0 = 0
		AND mavm_ac_rsn_mst_mam_ac_rsn_lcl_all_t.ac_rsn_cd = mavm_ac_rsn_mst_mam_ac_rsn_all_t1.ac_rsn_cd
		AND mavm_ac_rsn_mst_mam_ac_rsn_lcl_all_t.co_cd = mavm_ac_rsn_mst_mam_ac_rsn_all_t1.co_cd
		AND mavm_ac_rsn_mst_mam_ac_rsn_lcl_all_t.lcl_cd = 'TBD5'
	)	ac_rsn_nm_lcl5
	FROM mam_ac_rsn_all mavm_ac_rsn_mst_mam_ac_rsn_all_t1
	WHERE 0 = 0
		AND	(
	(
		EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_ac_rsn_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_ac_rsn_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_AC_RSN')
			AND	mavm_ac_rsn_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','COM')
			)
		OR
		NOT EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_ac_rsn_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_ac_rsn_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_AC_RSN')
			)
		)
	)
UNION ALL
SELECT
	mavm_ac_rsn_mst_mam_ac_rsn_cmn_t1.ac_rsn_cd,
	mavm_ac_rsn_mst_mam_ac_rsn_cmn_t1.ac_rsn_nm,
	mavm_ac_rsn_mst_mam_ac_rsn_cmn_t1.ar_typ,
	mavm_ac_rsn_mst_mam_ac_rsn_cmn_t1.ap_typ,
	mavm_ac_rsn_mst_mam_ac_rsn_cmn_t1.ac_invalid_flg,
	mavm_ac_rsn_mst_mam_ac_rsn_cmn_t1.cost_invalid_flg,
	mavm_ac_rsn_mst_mam_ac_rsn_cmn_t1.memo1,
	mavm_ac_rsn_mst_mam_ac_rsn_cmn_t1.memo2,
	mavm_ac_rsn_mst_mam_ac_rsn_cmn_t1.memo3,
	mavm_ac_rsn_mst_mam_ac_rsn_cmn_t1.del_flg,
	mavm_ac_rsn_mst_mam_ac_rsn_cmn_t1.del_usr_id,
	mavm_ac_rsn_mst_mam_ac_rsn_cmn_t1.del_usr_nm,
	mavm_ac_rsn_mst_mam_ac_rsn_cmn_t1.del_ts,
	mavm_ac_rsn_mst_mam_ac_rsn_cmn_t1.ins_usr_id,
	mavm_ac_rsn_mst_mam_ac_rsn_cmn_t1.ins_usr_nm,
	mavm_ac_rsn_mst_mam_ac_rsn_cmn_t1.ins_ts,
	mavm_ac_rsn_mst_mam_ac_rsn_cmn_t1.ins_func_id,
	mavm_ac_rsn_mst_mam_ac_rsn_cmn_t1.upd_cntr,
	mavm_ac_rsn_mst_mam_ac_rsn_cmn_t1.upd_usr_id,
	mavm_ac_rsn_mst_mam_ac_rsn_cmn_t1.upd_usr_nm,
	mavm_ac_rsn_mst_mam_ac_rsn_cmn_t1.upd_ts,
	mavm_ac_rsn_mst_mam_ac_rsn_cmn_t1.upd_func_id,
	mavm_ac_rsn_mst_mam_ac_rsn_cmn_t1.upd_srv_req_no,
	mavm_ac_rsn_mst_mam_co_all_t2.co_cd,
	--会計理由名（ロケール１）
	(SELECT mavm_ac_rsn_mst_mam_ac_rsn_lcl_cmn_t.ac_rsn_nm
		FROM mam_ac_rsn_lcl_cmn mavm_ac_rsn_mst_mam_ac_rsn_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_ac_rsn_mst_mam_ac_rsn_lcl_cmn_t.ac_rsn_cd = mavm_ac_rsn_mst_mam_ac_rsn_cmn_t1.ac_rsn_cd
		AND mavm_ac_rsn_mst_mam_ac_rsn_lcl_cmn_t.lcl_cd = 'ja_JP'
	)	ac_rsn_nm_lcl1,
	--会計理由名（ロケール２）
	(SELECT mavm_ac_rsn_mst_mam_ac_rsn_lcl_cmn_t.ac_rsn_nm
		FROM mam_ac_rsn_lcl_cmn mavm_ac_rsn_mst_mam_ac_rsn_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_ac_rsn_mst_mam_ac_rsn_lcl_cmn_t.ac_rsn_cd = mavm_ac_rsn_mst_mam_ac_rsn_cmn_t1.ac_rsn_cd
		AND mavm_ac_rsn_mst_mam_ac_rsn_lcl_cmn_t.lcl_cd = 'en_US'
	)	ac_rsn_nm_lcl2,
	--会計理由名（ロケール３）
	(SELECT mavm_ac_rsn_mst_mam_ac_rsn_lcl_cmn_t.ac_rsn_nm
		FROM mam_ac_rsn_lcl_cmn mavm_ac_rsn_mst_mam_ac_rsn_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_ac_rsn_mst_mam_ac_rsn_lcl_cmn_t.ac_rsn_cd = mavm_ac_rsn_mst_mam_ac_rsn_cmn_t1.ac_rsn_cd
		AND mavm_ac_rsn_mst_mam_ac_rsn_lcl_cmn_t.lcl_cd = 'TBD3'
	)	ac_rsn_nm_lcl3,
	--会計理由名（ロケール４）
	(SELECT mavm_ac_rsn_mst_mam_ac_rsn_lcl_cmn_t.ac_rsn_nm
		FROM mam_ac_rsn_lcl_cmn mavm_ac_rsn_mst_mam_ac_rsn_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_ac_rsn_mst_mam_ac_rsn_lcl_cmn_t.ac_rsn_cd = mavm_ac_rsn_mst_mam_ac_rsn_cmn_t1.ac_rsn_cd
		AND mavm_ac_rsn_mst_mam_ac_rsn_lcl_cmn_t.lcl_cd = 'TBD4'
	)	ac_rsn_nm_lcl4,
	--会計理由名（ロケール５）
	(SELECT mavm_ac_rsn_mst_mam_ac_rsn_lcl_cmn_t.ac_rsn_nm
		FROM mam_ac_rsn_lcl_cmn mavm_ac_rsn_mst_mam_ac_rsn_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_ac_rsn_mst_mam_ac_rsn_lcl_cmn_t.ac_rsn_cd = mavm_ac_rsn_mst_mam_ac_rsn_cmn_t1.ac_rsn_cd
		AND mavm_ac_rsn_mst_mam_ac_rsn_lcl_cmn_t.lcl_cd = 'TBD5'
	)	ac_rsn_nm_lcl5
	FROM mam_ac_rsn_cmn mavm_ac_rsn_mst_mam_ac_rsn_cmn_t1, mam_co_all mavm_ac_rsn_mst_mam_co_all_t2
	WHERE 0 = 0
	AND	EXISTS (
		SELECT	'X'
		FROM	mam_mst_ctl mavm_ac_rsn_mst_mam_mst_ctl_x
		WHERE	0=0
		AND	mavm_ac_rsn_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_AC_RSN')
		AND	mavm_ac_rsn_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM')
	)
;;

