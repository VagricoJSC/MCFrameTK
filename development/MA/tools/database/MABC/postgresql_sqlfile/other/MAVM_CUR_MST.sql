\encoding UTF-8

CREATE OR REPLACE VIEW mavm_cur_mst(
cur_cd,
cur_nm,
amt_dec_place,
upri_dec_place,
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
cur_nm_lcl1,
cur_nm_lcl2,
cur_nm_lcl3,
cur_nm_lcl4,
cur_nm_lcl5
)
AS
SELECT
	mavm_cur_mst_mam_cur_all_t1.cur_cd,
	mavm_cur_mst_mam_cur_all_t1.cur_nm,
	mavm_cur_mst_mam_cur_all_t1.amt_dec_place,
	mavm_cur_mst_mam_cur_all_t1.upri_dec_place,
	mavm_cur_mst_mam_cur_all_t1.memo1,
	mavm_cur_mst_mam_cur_all_t1.memo2,
	mavm_cur_mst_mam_cur_all_t1.memo3,
	mavm_cur_mst_mam_cur_all_t1.del_flg,
	mavm_cur_mst_mam_cur_all_t1.del_usr_id,
	mavm_cur_mst_mam_cur_all_t1.del_usr_nm,
	mavm_cur_mst_mam_cur_all_t1.del_ts,
	mavm_cur_mst_mam_cur_all_t1.ins_usr_id,
	mavm_cur_mst_mam_cur_all_t1.ins_usr_nm,
	mavm_cur_mst_mam_cur_all_t1.ins_ts,
	mavm_cur_mst_mam_cur_all_t1.ins_func_id,
	mavm_cur_mst_mam_cur_all_t1.upd_cntr,
	mavm_cur_mst_mam_cur_all_t1.upd_usr_id,
	mavm_cur_mst_mam_cur_all_t1.upd_usr_nm,
	mavm_cur_mst_mam_cur_all_t1.upd_ts,
	mavm_cur_mst_mam_cur_all_t1.upd_func_id,
	mavm_cur_mst_mam_cur_all_t1.upd_srv_req_no,
	mavm_cur_mst_mam_cur_all_t1.co_cd,
	--通貨名（ロケール１）
	(SELECT mavm_cur_mst_mam_cur_lcl_all_t.cur_nm
		FROM mam_cur_lcl_all mavm_cur_mst_mam_cur_lcl_all_t
		WHERE 0 = 0
		AND mavm_cur_mst_mam_cur_lcl_all_t.cur_cd = mavm_cur_mst_mam_cur_all_t1.cur_cd
		AND mavm_cur_mst_mam_cur_lcl_all_t.co_cd = mavm_cur_mst_mam_cur_all_t1.co_cd
		AND mavm_cur_mst_mam_cur_lcl_all_t.lcl_cd = 'ja_JP'
	)	cur_nm_lcl1,
	--通貨名（ロケール２）
	(SELECT mavm_cur_mst_mam_cur_lcl_all_t.cur_nm
		FROM mam_cur_lcl_all mavm_cur_mst_mam_cur_lcl_all_t
		WHERE 0 = 0
		AND mavm_cur_mst_mam_cur_lcl_all_t.cur_cd = mavm_cur_mst_mam_cur_all_t1.cur_cd
		AND mavm_cur_mst_mam_cur_lcl_all_t.co_cd = mavm_cur_mst_mam_cur_all_t1.co_cd
		AND mavm_cur_mst_mam_cur_lcl_all_t.lcl_cd = 'en_US'
	)	cur_nm_lcl2,
	--通貨名（ロケール３）
	(SELECT mavm_cur_mst_mam_cur_lcl_all_t.cur_nm
		FROM mam_cur_lcl_all mavm_cur_mst_mam_cur_lcl_all_t
		WHERE 0 = 0
		AND mavm_cur_mst_mam_cur_lcl_all_t.cur_cd = mavm_cur_mst_mam_cur_all_t1.cur_cd
		AND mavm_cur_mst_mam_cur_lcl_all_t.co_cd = mavm_cur_mst_mam_cur_all_t1.co_cd
		AND mavm_cur_mst_mam_cur_lcl_all_t.lcl_cd = 'TBD3'
	)	cur_nm_lcl3,
	--通貨名（ロケール４）
	(SELECT mavm_cur_mst_mam_cur_lcl_all_t.cur_nm
		FROM mam_cur_lcl_all mavm_cur_mst_mam_cur_lcl_all_t
		WHERE 0 = 0
		AND mavm_cur_mst_mam_cur_lcl_all_t.cur_cd = mavm_cur_mst_mam_cur_all_t1.cur_cd
		AND mavm_cur_mst_mam_cur_lcl_all_t.co_cd = mavm_cur_mst_mam_cur_all_t1.co_cd
		AND mavm_cur_mst_mam_cur_lcl_all_t.lcl_cd = 'TBD4'
	)	cur_nm_lcl4,
	--通貨名（ロケール５）
	(SELECT mavm_cur_mst_mam_cur_lcl_all_t.cur_nm
		FROM mam_cur_lcl_all mavm_cur_mst_mam_cur_lcl_all_t
		WHERE 0 = 0
		AND mavm_cur_mst_mam_cur_lcl_all_t.cur_cd = mavm_cur_mst_mam_cur_all_t1.cur_cd
		AND mavm_cur_mst_mam_cur_lcl_all_t.co_cd = mavm_cur_mst_mam_cur_all_t1.co_cd
		AND mavm_cur_mst_mam_cur_lcl_all_t.lcl_cd = 'TBD5'
	)	cur_nm_lcl5
	FROM mam_cur_all mavm_cur_mst_mam_cur_all_t1
	WHERE 0 = 0
		AND	(
	(
		EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_cur_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_cur_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_CUR')
			AND	mavm_cur_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','COM')
			)
		OR
		NOT EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_cur_mst_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_cur_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_CUR')
			)
		)
	)
UNION ALL
SELECT
	mavm_cur_mst_mam_cur_cmn_t1.cur_cd,
	mavm_cur_mst_mam_cur_cmn_t1.cur_nm,
	mavm_cur_mst_mam_cur_cmn_t1.amt_dec_place,
	mavm_cur_mst_mam_cur_cmn_t1.upri_dec_place,
	mavm_cur_mst_mam_cur_cmn_t1.memo1,
	mavm_cur_mst_mam_cur_cmn_t1.memo2,
	mavm_cur_mst_mam_cur_cmn_t1.memo3,
	mavm_cur_mst_mam_cur_cmn_t1.del_flg,
	mavm_cur_mst_mam_cur_cmn_t1.del_usr_id,
	mavm_cur_mst_mam_cur_cmn_t1.del_usr_nm,
	mavm_cur_mst_mam_cur_cmn_t1.del_ts,
	mavm_cur_mst_mam_cur_cmn_t1.ins_usr_id,
	mavm_cur_mst_mam_cur_cmn_t1.ins_usr_nm,
	mavm_cur_mst_mam_cur_cmn_t1.ins_ts,
	mavm_cur_mst_mam_cur_cmn_t1.ins_func_id,
	mavm_cur_mst_mam_cur_cmn_t1.upd_cntr,
	mavm_cur_mst_mam_cur_cmn_t1.upd_usr_id,
	mavm_cur_mst_mam_cur_cmn_t1.upd_usr_nm,
	mavm_cur_mst_mam_cur_cmn_t1.upd_ts,
	mavm_cur_mst_mam_cur_cmn_t1.upd_func_id,
	mavm_cur_mst_mam_cur_cmn_t1.upd_srv_req_no,
	mavm_cur_mst_mam_co_all_t2.co_cd,
	--通貨名（ロケール１）
	(SELECT mavm_cur_mst_mam_cur_lcl_cmn_t.cur_nm
		FROM mam_cur_lcl_cmn mavm_cur_mst_mam_cur_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_cur_mst_mam_cur_lcl_cmn_t.cur_cd = mavm_cur_mst_mam_cur_cmn_t1.cur_cd
		AND mavm_cur_mst_mam_cur_lcl_cmn_t.lcl_cd = 'ja_JP'
	)	cur_nm_lcl1,
	--通貨名（ロケール２）
	(SELECT mavm_cur_mst_mam_cur_lcl_cmn_t.cur_nm
		FROM mam_cur_lcl_cmn mavm_cur_mst_mam_cur_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_cur_mst_mam_cur_lcl_cmn_t.cur_cd = mavm_cur_mst_mam_cur_cmn_t1.cur_cd
		AND mavm_cur_mst_mam_cur_lcl_cmn_t.lcl_cd = 'en_US'
	)	cur_nm_lcl2,
	--通貨名（ロケール３）
	(SELECT mavm_cur_mst_mam_cur_lcl_cmn_t.cur_nm
		FROM mam_cur_lcl_cmn mavm_cur_mst_mam_cur_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_cur_mst_mam_cur_lcl_cmn_t.cur_cd = mavm_cur_mst_mam_cur_cmn_t1.cur_cd
		AND mavm_cur_mst_mam_cur_lcl_cmn_t.lcl_cd = 'TBD3'
	)	cur_nm_lcl3,
	--通貨名（ロケール４）
	(SELECT mavm_cur_mst_mam_cur_lcl_cmn_t.cur_nm
		FROM mam_cur_lcl_cmn mavm_cur_mst_mam_cur_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_cur_mst_mam_cur_lcl_cmn_t.cur_cd = mavm_cur_mst_mam_cur_cmn_t1.cur_cd
		AND mavm_cur_mst_mam_cur_lcl_cmn_t.lcl_cd = 'TBD4'
	)	cur_nm_lcl4,
	--通貨名（ロケール５）
	(SELECT mavm_cur_mst_mam_cur_lcl_cmn_t.cur_nm
		FROM mam_cur_lcl_cmn mavm_cur_mst_mam_cur_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_cur_mst_mam_cur_lcl_cmn_t.cur_cd = mavm_cur_mst_mam_cur_cmn_t1.cur_cd
		AND mavm_cur_mst_mam_cur_lcl_cmn_t.lcl_cd = 'TBD5'
	)	cur_nm_lcl5
	FROM mam_cur_cmn mavm_cur_mst_mam_cur_cmn_t1, mam_co_all mavm_cur_mst_mam_co_all_t2
	WHERE 0 = 0
	AND	EXISTS (
		SELECT	'X'
		FROM	mam_mst_ctl mavm_cur_mst_mam_mst_ctl_x
		WHERE	0=0
		AND	mavm_cur_mst_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_CUR')
		AND	mavm_cur_mst_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM')
	)
;;

