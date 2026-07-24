\encoding UTF-8

CREATE OR REPLACE VIEW mavm_alc_ac_mst(
alc_ac_cd,
alc_ac_nm,
alc_ptn_cd,
expns_cd,
alc_ac_grp_cd1,
alc_ac_grp_cd2,
alc_ac_grp_cd3,
co_alc_ac_cd,
not_itm_alc_ac_flg,
not_alc_rate_ac_flg,
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
alc_ac_nm_lcl1,
alc_ac_nm_lcl2,
alc_ac_nm_lcl3,
alc_ac_nm_lcl4,
alc_ac_nm_lcl5
)
AS
SELECT
	mavm_alc_ac_mst_mam_alc_ac_all_t1.alc_ac_cd,
	mavm_alc_ac_mst_mam_alc_ac_all_t1.alc_ac_nm,
	mavm_alc_ac_mst_mam_alc_ac_all_t1.alc_ptn_cd,
	mavm_alc_ac_mst_mam_alc_ac_all_t1.expns_cd,
	mavm_alc_ac_mst_mam_alc_ac_all_t1.alc_ac_grp_cd1,
	mavm_alc_ac_mst_mam_alc_ac_all_t1.alc_ac_grp_cd2,
	mavm_alc_ac_mst_mam_alc_ac_all_t1.alc_ac_grp_cd3,
	mavm_alc_ac_mst_mam_alc_ac_all_t1.co_alc_ac_cd,
	mavm_alc_ac_mst_mam_alc_ac_all_t1.not_itm_alc_ac_flg,
	mavm_alc_ac_mst_mam_alc_ac_all_t1.not_alc_rate_ac_flg,
	mavm_alc_ac_mst_mam_alc_ac_all_t1.memo1,
	mavm_alc_ac_mst_mam_alc_ac_all_t1.memo2,
	mavm_alc_ac_mst_mam_alc_ac_all_t1.memo3,
	mavm_alc_ac_mst_mam_alc_ac_all_t1.del_flg,
	mavm_alc_ac_mst_mam_alc_ac_all_t1.del_usr_id,
	mavm_alc_ac_mst_mam_alc_ac_all_t1.del_usr_nm,
	mavm_alc_ac_mst_mam_alc_ac_all_t1.del_ts,
	mavm_alc_ac_mst_mam_alc_ac_all_t1.ins_usr_id,
	mavm_alc_ac_mst_mam_alc_ac_all_t1.ins_usr_nm,
	mavm_alc_ac_mst_mam_alc_ac_all_t1.ins_ts,
	mavm_alc_ac_mst_mam_alc_ac_all_t1.ins_func_id,
	mavm_alc_ac_mst_mam_alc_ac_all_t1.upd_cntr,
	mavm_alc_ac_mst_mam_alc_ac_all_t1.upd_usr_id,
	mavm_alc_ac_mst_mam_alc_ac_all_t1.upd_usr_nm,
	mavm_alc_ac_mst_mam_alc_ac_all_t1.upd_ts,
	mavm_alc_ac_mst_mam_alc_ac_all_t1.upd_func_id,
	mavm_alc_ac_mst_mam_alc_ac_all_t1.upd_srv_req_no,
	mavm_alc_ac_mst_mam_alc_ac_all_t1.co_cd,
	--配賦科目名（ロケール１）
	(SELECT mavm_alc_ac_mst_mam_alc_ac_lcl_all_t.alc_ac_nm
		FROM mam_alc_ac_lcl_all mavm_alc_ac_mst_mam_alc_ac_lcl_all_t
		WHERE 0 = 0
		AND mavm_alc_ac_mst_mam_alc_ac_lcl_all_t.alc_ac_cd = mavm_alc_ac_mst_mam_alc_ac_all_t1.alc_ac_cd
		AND mavm_alc_ac_mst_mam_alc_ac_lcl_all_t.co_cd = mavm_alc_ac_mst_mam_alc_ac_all_t1.co_cd
		AND mavm_alc_ac_mst_mam_alc_ac_lcl_all_t.lcl_cd = 'ja_JP'
	)	alc_ac_nm_lcl1,
	--配賦科目名（ロケール２）
	(SELECT mavm_alc_ac_mst_mam_alc_ac_lcl_all_t.alc_ac_nm
		FROM mam_alc_ac_lcl_all mavm_alc_ac_mst_mam_alc_ac_lcl_all_t
		WHERE 0 = 0
		AND mavm_alc_ac_mst_mam_alc_ac_lcl_all_t.alc_ac_cd = mavm_alc_ac_mst_mam_alc_ac_all_t1.alc_ac_cd
		AND mavm_alc_ac_mst_mam_alc_ac_lcl_all_t.co_cd = mavm_alc_ac_mst_mam_alc_ac_all_t1.co_cd
		AND mavm_alc_ac_mst_mam_alc_ac_lcl_all_t.lcl_cd = 'en_US'
	)	alc_ac_nm_lcl2,
	--配賦科目名（ロケール３）
	(SELECT mavm_alc_ac_mst_mam_alc_ac_lcl_all_t.alc_ac_nm
		FROM mam_alc_ac_lcl_all mavm_alc_ac_mst_mam_alc_ac_lcl_all_t
		WHERE 0 = 0
		AND mavm_alc_ac_mst_mam_alc_ac_lcl_all_t.alc_ac_cd = mavm_alc_ac_mst_mam_alc_ac_all_t1.alc_ac_cd
		AND mavm_alc_ac_mst_mam_alc_ac_lcl_all_t.co_cd = mavm_alc_ac_mst_mam_alc_ac_all_t1.co_cd
		AND mavm_alc_ac_mst_mam_alc_ac_lcl_all_t.lcl_cd = 'TBD3'
	)	alc_ac_nm_lcl3,
	--配賦科目名（ロケール４）
	(SELECT mavm_alc_ac_mst_mam_alc_ac_lcl_all_t.alc_ac_nm
		FROM mam_alc_ac_lcl_all mavm_alc_ac_mst_mam_alc_ac_lcl_all_t
		WHERE 0 = 0
		AND mavm_alc_ac_mst_mam_alc_ac_lcl_all_t.alc_ac_cd = mavm_alc_ac_mst_mam_alc_ac_all_t1.alc_ac_cd
		AND mavm_alc_ac_mst_mam_alc_ac_lcl_all_t.co_cd = mavm_alc_ac_mst_mam_alc_ac_all_t1.co_cd
		AND mavm_alc_ac_mst_mam_alc_ac_lcl_all_t.lcl_cd = 'TBD4'
	)	alc_ac_nm_lcl4,
	--配賦科目名（ロケール５）
	(SELECT mavm_alc_ac_mst_mam_alc_ac_lcl_all_t.alc_ac_nm
		FROM mam_alc_ac_lcl_all mavm_alc_ac_mst_mam_alc_ac_lcl_all_t
		WHERE 0 = 0
		AND mavm_alc_ac_mst_mam_alc_ac_lcl_all_t.alc_ac_cd = mavm_alc_ac_mst_mam_alc_ac_all_t1.alc_ac_cd
		AND mavm_alc_ac_mst_mam_alc_ac_lcl_all_t.co_cd = mavm_alc_ac_mst_mam_alc_ac_all_t1.co_cd
		AND mavm_alc_ac_mst_mam_alc_ac_lcl_all_t.lcl_cd = 'TBD5'
	)	alc_ac_nm_lcl5
	FROM mam_alc_ac_all mavm_alc_ac_mst_mam_alc_ac_all_t1
	WHERE 0 = 0
	AND	(
	(
		EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_alc_ac_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_alc_ac_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM', 'MAM_ALC_AC')
			AND	mavm_alc_ac_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP', 'COM')
		)
		OR
		NOT EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_alc_ac_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_alc_ac_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM', 'MAM_ALC_AC')
			)
		)
	)
UNION ALL
SELECT
	mavm_alc_ac_mst_mam_alc_ac_cmn_t1.alc_ac_cd,
	mavm_alc_ac_mst_mam_alc_ac_cmn_t1.alc_ac_nm,
	mavm_alc_ac_mst_mam_alc_ac_cmn_t1.alc_ptn_cd,
	mavm_alc_ac_mst_mam_alc_ac_cmn_t1.expns_cd,
	mavm_alc_ac_mst_mam_alc_ac_cmn_t1.alc_ac_grp_cd1,
	mavm_alc_ac_mst_mam_alc_ac_cmn_t1.alc_ac_grp_cd2,
	mavm_alc_ac_mst_mam_alc_ac_cmn_t1.alc_ac_grp_cd3,
	mavm_alc_ac_mst_mam_alc_ac_cmn_t1.co_alc_ac_cd,
	mavm_alc_ac_mst_mam_alc_ac_cmn_t1.not_itm_alc_ac_flg,
	mavm_alc_ac_mst_mam_alc_ac_cmn_t1.not_alc_rate_ac_flg,
	mavm_alc_ac_mst_mam_alc_ac_cmn_t1.memo1,
	mavm_alc_ac_mst_mam_alc_ac_cmn_t1.memo2,
	mavm_alc_ac_mst_mam_alc_ac_cmn_t1.memo3,
	mavm_alc_ac_mst_mam_alc_ac_cmn_t1.del_flg,
	mavm_alc_ac_mst_mam_alc_ac_cmn_t1.del_usr_id,
	mavm_alc_ac_mst_mam_alc_ac_cmn_t1.del_usr_nm,
	mavm_alc_ac_mst_mam_alc_ac_cmn_t1.del_ts,
	mavm_alc_ac_mst_mam_alc_ac_cmn_t1.ins_usr_id,
	mavm_alc_ac_mst_mam_alc_ac_cmn_t1.ins_usr_nm,
	mavm_alc_ac_mst_mam_alc_ac_cmn_t1.ins_ts,
	mavm_alc_ac_mst_mam_alc_ac_cmn_t1.ins_func_id,
	mavm_alc_ac_mst_mam_alc_ac_cmn_t1.upd_cntr,
	mavm_alc_ac_mst_mam_alc_ac_cmn_t1.upd_usr_id,
	mavm_alc_ac_mst_mam_alc_ac_cmn_t1.upd_usr_nm,
	mavm_alc_ac_mst_mam_alc_ac_cmn_t1.upd_ts,
	mavm_alc_ac_mst_mam_alc_ac_cmn_t1.upd_func_id,
	mavm_alc_ac_mst_mam_alc_ac_cmn_t1.upd_srv_req_no,
	mavm_alc_ac_mst_mam_co_all_t2.co_cd,
	--配賦科目名（ロケール１）
	(SELECT mavm_alc_ac_mst_mam_alc_ac_lcl_cmn_t.alc_ac_nm
		FROM mam_alc_ac_lcl_cmn mavm_alc_ac_mst_mam_alc_ac_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_alc_ac_mst_mam_alc_ac_lcl_cmn_t.alc_ac_cd = mavm_alc_ac_mst_mam_alc_ac_cmn_t1.alc_ac_cd
		AND mavm_alc_ac_mst_mam_alc_ac_lcl_cmn_t.lcl_cd = 'ja_JP'
	)	alc_ac_nm_lcl1,
	--配賦科目名（ロケール２）
	(SELECT mavm_alc_ac_mst_mam_alc_ac_lcl_cmn_t.alc_ac_nm
		FROM mam_alc_ac_lcl_cmn mavm_alc_ac_mst_mam_alc_ac_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_alc_ac_mst_mam_alc_ac_lcl_cmn_t.alc_ac_cd = mavm_alc_ac_mst_mam_alc_ac_cmn_t1.alc_ac_cd
		AND mavm_alc_ac_mst_mam_alc_ac_lcl_cmn_t.lcl_cd = 'en_US'
	)	alc_ac_nm_lcl2,
	--配賦科目名（ロケール３）
	(SELECT mavm_alc_ac_mst_mam_alc_ac_lcl_cmn_t.alc_ac_nm
		FROM mam_alc_ac_lcl_cmn mavm_alc_ac_mst_mam_alc_ac_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_alc_ac_mst_mam_alc_ac_lcl_cmn_t.alc_ac_cd = mavm_alc_ac_mst_mam_alc_ac_cmn_t1.alc_ac_cd
		AND mavm_alc_ac_mst_mam_alc_ac_lcl_cmn_t.lcl_cd = 'TBD3'
	)	alc_ac_nm_lcl3,
	--配賦科目名（ロケール４）
	(SELECT mavm_alc_ac_mst_mam_alc_ac_lcl_cmn_t.alc_ac_nm
		FROM mam_alc_ac_lcl_cmn mavm_alc_ac_mst_mam_alc_ac_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_alc_ac_mst_mam_alc_ac_lcl_cmn_t.alc_ac_cd = mavm_alc_ac_mst_mam_alc_ac_cmn_t1.alc_ac_cd
		AND mavm_alc_ac_mst_mam_alc_ac_lcl_cmn_t.lcl_cd = 'TBD4'
	)	alc_ac_nm_lcl4,
	--配賦科目名（ロケール５）
	(SELECT mavm_alc_ac_mst_mam_alc_ac_lcl_cmn_t.alc_ac_nm
		FROM mam_alc_ac_lcl_cmn mavm_alc_ac_mst_mam_alc_ac_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_alc_ac_mst_mam_alc_ac_lcl_cmn_t.alc_ac_cd = mavm_alc_ac_mst_mam_alc_ac_cmn_t1.alc_ac_cd
		AND mavm_alc_ac_mst_mam_alc_ac_lcl_cmn_t.lcl_cd = 'TBD5'
	)	alc_ac_nm_lcl5
	FROM mam_alc_ac_cmn mavm_alc_ac_mst_mam_alc_ac_cmn_t1, mam_co_all mavm_alc_ac_mst_mam_co_all_t2
	WHERE 0 = 0
	AND	EXISTS (
		SELECT	'X'
		FROM	mam_mst_ctl mavm_alc_ac_mst_mam_mst_ctl_x
		WHERE	0=0
		AND	mavm_alc_ac_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM', 'MAM_ALC_AC')
		AND	mavm_alc_ac_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP', 'ALL_COM')
	)
;;

