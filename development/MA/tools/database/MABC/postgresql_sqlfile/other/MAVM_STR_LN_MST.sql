\encoding UTF-8

CREATE OR REPLACE VIEW mavm_str_ln_mst(
loc_cd,
str_ln_cd,
str_ln_nm,
ln_flg,
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
str_ln_nm_lcl1,
str_ln_nm_lcl2,
str_ln_nm_lcl3,
str_ln_nm_lcl4,
str_ln_nm_lcl5
)
AS
SELECT
	mavm_str_ln_mst_mam_str_ln_all_t1.loc_cd,
	mavm_str_ln_mst_mam_str_ln_all_t1.str_ln_cd,
	mavm_str_ln_mst_mam_str_ln_all_t1.str_ln_nm,
	mavm_str_ln_mst_mam_str_ln_all_t1.ln_flg,
	mavm_str_ln_mst_mam_str_ln_all_t1.memo1,
	mavm_str_ln_mst_mam_str_ln_all_t1.memo2,
	mavm_str_ln_mst_mam_str_ln_all_t1.memo3,
	mavm_str_ln_mst_mam_str_ln_all_t1.del_flg,
	mavm_str_ln_mst_mam_str_ln_all_t1.del_usr_id,
	mavm_str_ln_mst_mam_str_ln_all_t1.del_usr_nm,
	mavm_str_ln_mst_mam_str_ln_all_t1.del_ts,
	mavm_str_ln_mst_mam_str_ln_all_t1.ins_usr_id,
	mavm_str_ln_mst_mam_str_ln_all_t1.ins_usr_nm,
	mavm_str_ln_mst_mam_str_ln_all_t1.ins_ts,
	mavm_str_ln_mst_mam_str_ln_all_t1.ins_func_id,
	mavm_str_ln_mst_mam_str_ln_all_t1.upd_cntr,
	mavm_str_ln_mst_mam_str_ln_all_t1.upd_usr_id,
	mavm_str_ln_mst_mam_str_ln_all_t1.upd_usr_nm,
	mavm_str_ln_mst_mam_str_ln_all_t1.upd_ts,
	mavm_str_ln_mst_mam_str_ln_all_t1.upd_func_id,
	mavm_str_ln_mst_mam_str_ln_all_t1.upd_srv_req_no,
	mavm_str_ln_mst_mam_str_ln_all_t1.co_cd,
	--棚・ライン名（ロケール１）
	(SELECT mavm_str_ln_mst_mam_str_ln_lcl_all_t.str_ln_nm
		FROM mam_str_ln_lcl_all mavm_str_ln_mst_mam_str_ln_lcl_all_t
		WHERE 0 = 0
		AND mavm_str_ln_mst_mam_str_ln_lcl_all_t.loc_cd = mavm_str_ln_mst_mam_str_ln_all_t1.loc_cd
		AND mavm_str_ln_mst_mam_str_ln_lcl_all_t.str_ln_cd = mavm_str_ln_mst_mam_str_ln_all_t1.str_ln_cd
		AND mavm_str_ln_mst_mam_str_ln_lcl_all_t.co_cd = mavm_str_ln_mst_mam_str_ln_all_t1.co_cd
		AND mavm_str_ln_mst_mam_str_ln_lcl_all_t.lcl_cd = 'ja_JP'
	)	str_ln_nm_lcl1,
	--棚・ライン名（ロケール２）
	(SELECT mavm_str_ln_mst_mam_str_ln_lcl_all_t.str_ln_nm
		FROM mam_str_ln_lcl_all mavm_str_ln_mst_mam_str_ln_lcl_all_t
		WHERE 0 = 0
		AND mavm_str_ln_mst_mam_str_ln_lcl_all_t.loc_cd = mavm_str_ln_mst_mam_str_ln_all_t1.loc_cd
		AND mavm_str_ln_mst_mam_str_ln_lcl_all_t.str_ln_cd = mavm_str_ln_mst_mam_str_ln_all_t1.str_ln_cd
		AND mavm_str_ln_mst_mam_str_ln_lcl_all_t.co_cd = mavm_str_ln_mst_mam_str_ln_all_t1.co_cd
		AND mavm_str_ln_mst_mam_str_ln_lcl_all_t.lcl_cd = 'en_US'
	)	str_ln_nm_lcl2,
	--棚・ライン名（ロケール３）
	(SELECT mavm_str_ln_mst_mam_str_ln_lcl_all_t.str_ln_nm
		FROM mam_str_ln_lcl_all mavm_str_ln_mst_mam_str_ln_lcl_all_t
		WHERE 0 = 0
		AND mavm_str_ln_mst_mam_str_ln_lcl_all_t.loc_cd = mavm_str_ln_mst_mam_str_ln_all_t1.loc_cd
		AND mavm_str_ln_mst_mam_str_ln_lcl_all_t.str_ln_cd = mavm_str_ln_mst_mam_str_ln_all_t1.str_ln_cd
		AND mavm_str_ln_mst_mam_str_ln_lcl_all_t.co_cd = mavm_str_ln_mst_mam_str_ln_all_t1.co_cd
		AND mavm_str_ln_mst_mam_str_ln_lcl_all_t.lcl_cd = 'TBD3'
	)	str_ln_nm_lcl3,
	--棚・ライン名（ロケール４）
	(SELECT mavm_str_ln_mst_mam_str_ln_lcl_all_t.str_ln_nm
		FROM mam_str_ln_lcl_all mavm_str_ln_mst_mam_str_ln_lcl_all_t
		WHERE 0 = 0
		AND mavm_str_ln_mst_mam_str_ln_lcl_all_t.loc_cd = mavm_str_ln_mst_mam_str_ln_all_t1.loc_cd
		AND mavm_str_ln_mst_mam_str_ln_lcl_all_t.str_ln_cd = mavm_str_ln_mst_mam_str_ln_all_t1.str_ln_cd
		AND mavm_str_ln_mst_mam_str_ln_lcl_all_t.co_cd = mavm_str_ln_mst_mam_str_ln_all_t1.co_cd
		AND mavm_str_ln_mst_mam_str_ln_lcl_all_t.lcl_cd = 'TBD4'
	)	str_ln_nm_lcl4,
	--棚・ライン名（ロケール５）
	(SELECT mavm_str_ln_mst_mam_str_ln_lcl_all_t.str_ln_nm
		FROM mam_str_ln_lcl_all mavm_str_ln_mst_mam_str_ln_lcl_all_t
		WHERE 0 = 0
		AND mavm_str_ln_mst_mam_str_ln_lcl_all_t.loc_cd = mavm_str_ln_mst_mam_str_ln_all_t1.loc_cd
		AND mavm_str_ln_mst_mam_str_ln_lcl_all_t.str_ln_cd = mavm_str_ln_mst_mam_str_ln_all_t1.str_ln_cd
		AND mavm_str_ln_mst_mam_str_ln_lcl_all_t.co_cd = mavm_str_ln_mst_mam_str_ln_all_t1.co_cd
		AND mavm_str_ln_mst_mam_str_ln_lcl_all_t.lcl_cd = 'TBD5'
	)	str_ln_nm_lcl5
	FROM mam_str_ln_all mavm_str_ln_mst_mam_str_ln_all_t1
	WHERE 0 = 0
		AND	(
	(
		EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_str_ln_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_str_ln_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_STR_LN')
			AND	mavm_str_ln_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','COM')
			)
		OR
		NOT EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_str_ln_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_str_ln_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_STR_LN')
			)
		)
	)
UNION ALL
SELECT
	mavm_str_ln_mst_mam_str_ln_cmn_t1.loc_cd,
	mavm_str_ln_mst_mam_str_ln_cmn_t1.str_ln_cd,
	mavm_str_ln_mst_mam_str_ln_cmn_t1.str_ln_nm,
	mavm_str_ln_mst_mam_str_ln_cmn_t1.ln_flg,
	mavm_str_ln_mst_mam_str_ln_cmn_t1.memo1,
	mavm_str_ln_mst_mam_str_ln_cmn_t1.memo2,
	mavm_str_ln_mst_mam_str_ln_cmn_t1.memo3,
	mavm_str_ln_mst_mam_str_ln_cmn_t1.del_flg,
	mavm_str_ln_mst_mam_str_ln_cmn_t1.del_usr_id,
	mavm_str_ln_mst_mam_str_ln_cmn_t1.del_usr_nm,
	mavm_str_ln_mst_mam_str_ln_cmn_t1.del_ts,
	mavm_str_ln_mst_mam_str_ln_cmn_t1.ins_usr_id,
	mavm_str_ln_mst_mam_str_ln_cmn_t1.ins_usr_nm,
	mavm_str_ln_mst_mam_str_ln_cmn_t1.ins_ts,
	mavm_str_ln_mst_mam_str_ln_cmn_t1.ins_func_id,
	mavm_str_ln_mst_mam_str_ln_cmn_t1.upd_cntr,
	mavm_str_ln_mst_mam_str_ln_cmn_t1.upd_usr_id,
	mavm_str_ln_mst_mam_str_ln_cmn_t1.upd_usr_nm,
	mavm_str_ln_mst_mam_str_ln_cmn_t1.upd_ts,
	mavm_str_ln_mst_mam_str_ln_cmn_t1.upd_func_id,
	mavm_str_ln_mst_mam_str_ln_cmn_t1.upd_srv_req_no,
	mavm_str_ln_mst_mam_co_all_t2.co_cd,
	--棚・ライン名（ロケール１）
	(SELECT mavm_str_ln_mst_mam_str_ln_lcl_cmn_t.str_ln_nm
		FROM mam_str_ln_lcl_cmn mavm_str_ln_mst_mam_str_ln_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_str_ln_mst_mam_str_ln_lcl_cmn_t.loc_cd = mavm_str_ln_mst_mam_str_ln_cmn_t1.loc_cd
		AND mavm_str_ln_mst_mam_str_ln_lcl_cmn_t.str_ln_cd = mavm_str_ln_mst_mam_str_ln_cmn_t1.str_ln_cd
		AND mavm_str_ln_mst_mam_str_ln_lcl_cmn_t.lcl_cd = 'ja_JP'
	)	str_ln_nm_lcl1,
	--棚・ライン名（ロケール２）
	(SELECT mavm_str_ln_mst_mam_str_ln_lcl_cmn_t.str_ln_nm
		FROM mam_str_ln_lcl_cmn mavm_str_ln_mst_mam_str_ln_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_str_ln_mst_mam_str_ln_lcl_cmn_t.loc_cd = mavm_str_ln_mst_mam_str_ln_cmn_t1.loc_cd
		AND mavm_str_ln_mst_mam_str_ln_lcl_cmn_t.str_ln_cd = mavm_str_ln_mst_mam_str_ln_cmn_t1.str_ln_cd
		AND mavm_str_ln_mst_mam_str_ln_lcl_cmn_t.lcl_cd = 'en_US'
	)	str_ln_nm_lcl2,
	--棚・ライン名（ロケール３）
	(SELECT mavm_str_ln_mst_mam_str_ln_lcl_cmn_t.str_ln_nm
		FROM mam_str_ln_lcl_cmn mavm_str_ln_mst_mam_str_ln_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_str_ln_mst_mam_str_ln_lcl_cmn_t.loc_cd = mavm_str_ln_mst_mam_str_ln_cmn_t1.loc_cd
		AND mavm_str_ln_mst_mam_str_ln_lcl_cmn_t.str_ln_cd = mavm_str_ln_mst_mam_str_ln_cmn_t1.str_ln_cd
		AND mavm_str_ln_mst_mam_str_ln_lcl_cmn_t.lcl_cd = 'TBD3'
	)	str_ln_nm_lcl3,
	--棚・ライン名（ロケール４）
	(SELECT mavm_str_ln_mst_mam_str_ln_lcl_cmn_t.str_ln_nm
		FROM mam_str_ln_lcl_cmn mavm_str_ln_mst_mam_str_ln_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_str_ln_mst_mam_str_ln_lcl_cmn_t.loc_cd = mavm_str_ln_mst_mam_str_ln_cmn_t1.loc_cd
		AND mavm_str_ln_mst_mam_str_ln_lcl_cmn_t.str_ln_cd = mavm_str_ln_mst_mam_str_ln_cmn_t1.str_ln_cd
		AND mavm_str_ln_mst_mam_str_ln_lcl_cmn_t.lcl_cd = 'TBD4'
	)	str_ln_nm_lcl4,
	--棚・ライン名（ロケール５）
	(SELECT mavm_str_ln_mst_mam_str_ln_lcl_cmn_t.str_ln_nm
		FROM mam_str_ln_lcl_cmn mavm_str_ln_mst_mam_str_ln_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_str_ln_mst_mam_str_ln_lcl_cmn_t.loc_cd = mavm_str_ln_mst_mam_str_ln_cmn_t1.loc_cd
		AND mavm_str_ln_mst_mam_str_ln_lcl_cmn_t.str_ln_cd = mavm_str_ln_mst_mam_str_ln_cmn_t1.str_ln_cd
		AND mavm_str_ln_mst_mam_str_ln_lcl_cmn_t.lcl_cd = 'TBD5'
	)	str_ln_nm_lcl5
	FROM mam_str_ln_cmn mavm_str_ln_mst_mam_str_ln_cmn_t1, mam_co_all mavm_str_ln_mst_mam_co_all_t2
	WHERE 0 = 0
	AND	EXISTS (
		SELECT	'X'
		FROM	mam_mst_ctl mavm_str_ln_mst_mam_mst_ctl_x
		WHERE	0=0
		AND	mavm_str_ln_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_STR_LN')
		AND	mavm_str_ln_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM')
	)
;;

