\encoding UTF-8

CREATE OR REPLACE VIEW mavm_usr_mst2(
usr_cd,
usr_nm,
usr_alt_nm1,
usr_alt_nm2,
usr_alt_nm3,
usr_alt_nm4,
full_da_flg,
email1,
email2,
email3,
tel1,
tel2,
tel3,
th_image,
usr_com_typ,
usr_com,
wk_cost_cd,
usr_info1,
usr_info2,
usr_info3,
usr_info4,
usr_info5,
usr_info6,
usr_info7,
usr_info8,
usr_info9,
usr_info10,
usr_info11,
usr_info12,
usr_info13,
usr_info14,
usr_info15,
usr_info16,
usr_info17,
usr_info18,
usr_info19,
usr_info20,
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
usr_nm_lcl1,
usr_nm_lcl2,
usr_nm_lcl3,
usr_nm_lcl4,
usr_nm_lcl5,
usr_alt_nm1_lcl1,
usr_alt_nm1_lcl2,
usr_alt_nm1_lcl3,
usr_alt_nm1_lcl4,
usr_alt_nm1_lcl5,
usr_alt_nm2_lcl1,
usr_alt_nm2_lcl2,
usr_alt_nm2_lcl3,
usr_alt_nm2_lcl4,
usr_alt_nm2_lcl5,
usr_alt_nm3_lcl1,
usr_alt_nm3_lcl2,
usr_alt_nm3_lcl3,
usr_alt_nm3_lcl4,
usr_alt_nm3_lcl5,
usr_alt_nm4_lcl1,
usr_alt_nm4_lcl2,
usr_alt_nm4_lcl3,
usr_alt_nm4_lcl4,
usr_alt_nm4_lcl5
)
AS
SELECT
	mavm_usr_mst2_mam_usr_all_t1.usr_cd,
	mavm_usr_mst2_mam_usr_all_t1.usr_nm,
	mavm_usr_mst2_mam_usr_all_t1.usr_alt_nm1,
	mavm_usr_mst2_mam_usr_all_t1.usr_alt_nm2,
	mavm_usr_mst2_mam_usr_all_t1.usr_alt_nm3,
	mavm_usr_mst2_mam_usr_all_t1.usr_alt_nm4,
	mavm_usr_mst2_mam_usr_all_t1.full_da_flg,
	mavm_usr_mst2_mam_usr_all_t1.email1,
	mavm_usr_mst2_mam_usr_all_t1.email2,
	mavm_usr_mst2_mam_usr_all_t1.email3,
	mavm_usr_mst2_mam_usr_all_t1.tel1,
	mavm_usr_mst2_mam_usr_all_t1.tel2,
	mavm_usr_mst2_mam_usr_all_t1.tel3,
	mavm_usr_mst2_mam_usr_all_t1.th_image,
	mavm_usr_mst2_mam_usr_all_t1.usr_com_typ,
	mavm_usr_mst2_mam_usr_all_t1.usr_com,
	mavm_usr_mst2_mam_usr_all_t1.wk_cost_cd,
	mavm_usr_mst2_mam_usr_all_t1.usr_info1,
	mavm_usr_mst2_mam_usr_all_t1.usr_info2,
	mavm_usr_mst2_mam_usr_all_t1.usr_info3,
	mavm_usr_mst2_mam_usr_all_t1.usr_info4,
	mavm_usr_mst2_mam_usr_all_t1.usr_info5,
	mavm_usr_mst2_mam_usr_all_t1.usr_info6,
	mavm_usr_mst2_mam_usr_all_t1.usr_info7,
	mavm_usr_mst2_mam_usr_all_t1.usr_info8,
	mavm_usr_mst2_mam_usr_all_t1.usr_info9,
	mavm_usr_mst2_mam_usr_all_t1.usr_info10,
	mavm_usr_mst2_mam_usr_all_t1.usr_info11,
	mavm_usr_mst2_mam_usr_all_t1.usr_info12,
	mavm_usr_mst2_mam_usr_all_t1.usr_info13,
	mavm_usr_mst2_mam_usr_all_t1.usr_info14,
	mavm_usr_mst2_mam_usr_all_t1.usr_info15,
	mavm_usr_mst2_mam_usr_all_t1.usr_info16,
	mavm_usr_mst2_mam_usr_all_t1.usr_info17,
	mavm_usr_mst2_mam_usr_all_t1.usr_info18,
	mavm_usr_mst2_mam_usr_all_t1.usr_info19,
	mavm_usr_mst2_mam_usr_all_t1.usr_info20,
	mavm_usr_mst2_mam_usr_all_t1.memo1,
	mavm_usr_mst2_mam_usr_all_t1.memo2,
	mavm_usr_mst2_mam_usr_all_t1.memo3,
	mavm_usr_mst2_mam_usr_all_t1.del_flg,
	mavm_usr_mst2_mam_usr_all_t1.del_usr_id,
	mavm_usr_mst2_mam_usr_all_t1.del_usr_nm,
	mavm_usr_mst2_mam_usr_all_t1.del_ts,
	mavm_usr_mst2_mam_usr_all_t1.ins_usr_id,
	mavm_usr_mst2_mam_usr_all_t1.ins_usr_nm,
	mavm_usr_mst2_mam_usr_all_t1.ins_ts,
	mavm_usr_mst2_mam_usr_all_t1.ins_func_id,
	mavm_usr_mst2_mam_usr_all_t1.upd_cntr,
	mavm_usr_mst2_mam_usr_all_t1.upd_usr_id,
	mavm_usr_mst2_mam_usr_all_t1.upd_usr_nm,
	mavm_usr_mst2_mam_usr_all_t1.upd_ts,
	mavm_usr_mst2_mam_usr_all_t1.upd_func_id,
	mavm_usr_mst2_mam_usr_all_t1.upd_srv_req_no,
	mavm_usr_mst2_mam_usr_all_t1.co_cd,
	--担当者名（ロケール１）
	(SELECT mavm_usr_mst2_mam_usr_lcl_all_t.usr_nm
		FROM mam_usr_lcl_all mavm_usr_mst2_mam_usr_lcl_all_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_all_t.usr_cd = mavm_usr_mst2_mam_usr_all_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.co_cd = mavm_usr_mst2_mam_usr_all_t1.co_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.lcl_cd = 'ja_JP'
	)	usr_nm_lcl1,
	--担当者名（ロケール２）
	(SELECT mavm_usr_mst2_mam_usr_lcl_all_t.usr_nm
		FROM mam_usr_lcl_all mavm_usr_mst2_mam_usr_lcl_all_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_all_t.usr_cd = mavm_usr_mst2_mam_usr_all_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.co_cd = mavm_usr_mst2_mam_usr_all_t1.co_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.lcl_cd = 'en_US'
	)	usr_nm_lcl2,
	--担当者名（ロケール３）
	(SELECT mavm_usr_mst2_mam_usr_lcl_all_t.usr_nm
		FROM mam_usr_lcl_all mavm_usr_mst2_mam_usr_lcl_all_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_all_t.usr_cd = mavm_usr_mst2_mam_usr_all_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.co_cd = mavm_usr_mst2_mam_usr_all_t1.co_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.lcl_cd = 'TBD3'
	)	usr_nm_lcl3,
	--担当者名（ロケール４）
	(SELECT mavm_usr_mst2_mam_usr_lcl_all_t.usr_nm
		FROM mam_usr_lcl_all mavm_usr_mst2_mam_usr_lcl_all_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_all_t.usr_cd = mavm_usr_mst2_mam_usr_all_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.co_cd = mavm_usr_mst2_mam_usr_all_t1.co_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.lcl_cd = 'TBD4'
	)	usr_nm_lcl4,
	--担当者名（ロケール５）
	(SELECT mavm_usr_mst2_mam_usr_lcl_all_t.usr_nm
		FROM mam_usr_lcl_all mavm_usr_mst2_mam_usr_lcl_all_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_all_t.usr_cd = mavm_usr_mst2_mam_usr_all_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.co_cd = mavm_usr_mst2_mam_usr_all_t1.co_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.lcl_cd = 'TBD5'
	)	usr_nm_lcl5,
	--担当者別名１（ロケール１）
	(SELECT mavm_usr_mst2_mam_usr_lcl_all_t.usr_alt_nm1
		FROM mam_usr_lcl_all mavm_usr_mst2_mam_usr_lcl_all_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_all_t.usr_cd = mavm_usr_mst2_mam_usr_all_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.co_cd = mavm_usr_mst2_mam_usr_all_t1.co_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.lcl_cd = 'ja_JP'
	)	usr_alt_nm1_lcl1,
	--担当者別名１（ロケール２）
	(SELECT mavm_usr_mst2_mam_usr_lcl_all_t.usr_alt_nm1
		FROM mam_usr_lcl_all mavm_usr_mst2_mam_usr_lcl_all_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_all_t.usr_cd = mavm_usr_mst2_mam_usr_all_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.co_cd = mavm_usr_mst2_mam_usr_all_t1.co_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.lcl_cd = 'en_US'
	)	usr_alt_nm1_lcl2,
	--担当者別名１（ロケール３）
	(SELECT mavm_usr_mst2_mam_usr_lcl_all_t.usr_alt_nm1
		FROM mam_usr_lcl_all mavm_usr_mst2_mam_usr_lcl_all_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_all_t.usr_cd = mavm_usr_mst2_mam_usr_all_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.co_cd = mavm_usr_mst2_mam_usr_all_t1.co_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.lcl_cd = 'TBD3'
	)	usr_alt_nm1_lcl3,
	--担当者別名１（ロケール４）
	(SELECT mavm_usr_mst2_mam_usr_lcl_all_t.usr_alt_nm1
		FROM mam_usr_lcl_all mavm_usr_mst2_mam_usr_lcl_all_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_all_t.usr_cd = mavm_usr_mst2_mam_usr_all_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.co_cd = mavm_usr_mst2_mam_usr_all_t1.co_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.lcl_cd = 'TBD4'
	)	usr_alt_nm1_lcl4,
	--担当者別名１（ロケール５）
	(SELECT mavm_usr_mst2_mam_usr_lcl_all_t.usr_alt_nm1
		FROM mam_usr_lcl_all mavm_usr_mst2_mam_usr_lcl_all_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_all_t.usr_cd = mavm_usr_mst2_mam_usr_all_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.co_cd = mavm_usr_mst2_mam_usr_all_t1.co_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.lcl_cd = 'TBD5'
	)	usr_alt_nm1_lcl5,
	--担当者別名２（ロケール１）
	(SELECT mavm_usr_mst2_mam_usr_lcl_all_t.usr_alt_nm2
		FROM mam_usr_lcl_all mavm_usr_mst2_mam_usr_lcl_all_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_all_t.usr_cd = mavm_usr_mst2_mam_usr_all_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.co_cd = mavm_usr_mst2_mam_usr_all_t1.co_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.lcl_cd = 'ja_JP'
	)	usr_alt_nm2_lcl1,
	--担当者別名２（ロケール２）
	(SELECT mavm_usr_mst2_mam_usr_lcl_all_t.usr_alt_nm2
		FROM mam_usr_lcl_all mavm_usr_mst2_mam_usr_lcl_all_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_all_t.usr_cd = mavm_usr_mst2_mam_usr_all_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.co_cd = mavm_usr_mst2_mam_usr_all_t1.co_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.lcl_cd = 'en_US'
	)	usr_alt_nm2_lcl2,
	--担当者別名２（ロケール３）
	(SELECT mavm_usr_mst2_mam_usr_lcl_all_t.usr_alt_nm2
		FROM mam_usr_lcl_all mavm_usr_mst2_mam_usr_lcl_all_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_all_t.usr_cd = mavm_usr_mst2_mam_usr_all_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.co_cd = mavm_usr_mst2_mam_usr_all_t1.co_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.lcl_cd = 'TBD3'
	)	usr_alt_nm2_lcl3,
	--担当者別名２（ロケール４）
	(SELECT mavm_usr_mst2_mam_usr_lcl_all_t.usr_alt_nm2
		FROM mam_usr_lcl_all mavm_usr_mst2_mam_usr_lcl_all_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_all_t.usr_cd = mavm_usr_mst2_mam_usr_all_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.co_cd = mavm_usr_mst2_mam_usr_all_t1.co_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.lcl_cd = 'TBD4'
	)	usr_alt_nm2_lcl4,
	--担当者別名２（ロケール５）
	(SELECT mavm_usr_mst2_mam_usr_lcl_all_t.usr_alt_nm2
		FROM mam_usr_lcl_all mavm_usr_mst2_mam_usr_lcl_all_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_all_t.usr_cd = mavm_usr_mst2_mam_usr_all_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.co_cd = mavm_usr_mst2_mam_usr_all_t1.co_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.lcl_cd = 'TBD5'
	)	usr_alt_nm2_lcl5,
	--担当者別名３（ロケール１）
	(SELECT mavm_usr_mst2_mam_usr_lcl_all_t.usr_alt_nm3
		FROM mam_usr_lcl_all mavm_usr_mst2_mam_usr_lcl_all_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_all_t.usr_cd = mavm_usr_mst2_mam_usr_all_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.co_cd = mavm_usr_mst2_mam_usr_all_t1.co_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.lcl_cd = 'ja_JP'
	)	usr_alt_nm3_lcl1,
	--担当者別名３（ロケール２）
	(SELECT mavm_usr_mst2_mam_usr_lcl_all_t.usr_alt_nm3
		FROM mam_usr_lcl_all mavm_usr_mst2_mam_usr_lcl_all_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_all_t.usr_cd = mavm_usr_mst2_mam_usr_all_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.co_cd = mavm_usr_mst2_mam_usr_all_t1.co_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.lcl_cd = 'en_US'
	)	usr_alt_nm3_lcl2,
	--担当者別名３（ロケール３）
	(SELECT mavm_usr_mst2_mam_usr_lcl_all_t.usr_alt_nm3
		FROM mam_usr_lcl_all mavm_usr_mst2_mam_usr_lcl_all_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_all_t.usr_cd = mavm_usr_mst2_mam_usr_all_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.co_cd = mavm_usr_mst2_mam_usr_all_t1.co_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.lcl_cd = 'TBD3'
	)	usr_alt_nm3_lcl3,
	--担当者別名３（ロケール４）
	(SELECT mavm_usr_mst2_mam_usr_lcl_all_t.usr_alt_nm3
		FROM mam_usr_lcl_all mavm_usr_mst2_mam_usr_lcl_all_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_all_t.usr_cd = mavm_usr_mst2_mam_usr_all_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.co_cd = mavm_usr_mst2_mam_usr_all_t1.co_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.lcl_cd = 'TBD4'
	)	usr_alt_nm3_lcl4,
	--担当者別名３（ロケール５）
	(SELECT mavm_usr_mst2_mam_usr_lcl_all_t.usr_alt_nm3
		FROM mam_usr_lcl_all mavm_usr_mst2_mam_usr_lcl_all_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_all_t.usr_cd = mavm_usr_mst2_mam_usr_all_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.co_cd = mavm_usr_mst2_mam_usr_all_t1.co_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.lcl_cd = 'TBD5'
	)	usr_alt_nm3_lcl5,
	--担当者別名４（ロケール１）
	(SELECT mavm_usr_mst2_mam_usr_lcl_all_t.usr_alt_nm4
		FROM mam_usr_lcl_all mavm_usr_mst2_mam_usr_lcl_all_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_all_t.usr_cd = mavm_usr_mst2_mam_usr_all_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.co_cd = mavm_usr_mst2_mam_usr_all_t1.co_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.lcl_cd = 'ja_JP'
	)	usr_alt_nm4_lcl1,
	--担当者別名４（ロケール２）
	(SELECT mavm_usr_mst2_mam_usr_lcl_all_t.usr_alt_nm4
		FROM mam_usr_lcl_all mavm_usr_mst2_mam_usr_lcl_all_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_all_t.usr_cd = mavm_usr_mst2_mam_usr_all_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.co_cd = mavm_usr_mst2_mam_usr_all_t1.co_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.lcl_cd = 'en_US'
	)	usr_alt_nm4_lcl2,
	--担当者別名４（ロケール３）
	(SELECT mavm_usr_mst2_mam_usr_lcl_all_t.usr_alt_nm4
		FROM mam_usr_lcl_all mavm_usr_mst2_mam_usr_lcl_all_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_all_t.usr_cd = mavm_usr_mst2_mam_usr_all_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.co_cd = mavm_usr_mst2_mam_usr_all_t1.co_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.lcl_cd = 'TBD3'
	)	usr_alt_nm4_lcl3,
	--担当者別名４（ロケール４）
	(SELECT mavm_usr_mst2_mam_usr_lcl_all_t.usr_alt_nm4
		FROM mam_usr_lcl_all mavm_usr_mst2_mam_usr_lcl_all_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_all_t.usr_cd = mavm_usr_mst2_mam_usr_all_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.co_cd = mavm_usr_mst2_mam_usr_all_t1.co_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.lcl_cd = 'TBD4'
	)	usr_alt_nm4_lcl4,
	--担当者別名４（ロケール５）
	(SELECT mavm_usr_mst2_mam_usr_lcl_all_t.usr_alt_nm4
		FROM mam_usr_lcl_all mavm_usr_mst2_mam_usr_lcl_all_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_all_t.usr_cd = mavm_usr_mst2_mam_usr_all_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.co_cd = mavm_usr_mst2_mam_usr_all_t1.co_cd
		AND mavm_usr_mst2_mam_usr_lcl_all_t.lcl_cd = 'TBD5'
	)	usr_alt_nm4_lcl5
	FROM mam_usr_all mavm_usr_mst2_mam_usr_all_t1
	WHERE 0 = 0
		AND	(
	(
		EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_usr_mst2_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_usr_mst2_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_USR')
			AND	mavm_usr_mst2_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','COM')
			)
		OR
		NOT EXISTS (
			SELECT	'X'
			FROM	mam_mst_ctl mavm_usr_mst2_mam_mst_ctl_x
			WHERE	0=0
			AND	mavm_usr_mst2_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_USR')
			)
		)
	)
UNION ALL
SELECT
	mavm_usr_mst2_mam_usr_cmn_t1.usr_cd,
	mavm_usr_mst2_mam_usr_cmn_t1.usr_nm,
	mavm_usr_mst2_mam_usr_cmn_t1.usr_alt_nm1,
	mavm_usr_mst2_mam_usr_cmn_t1.usr_alt_nm2,
	mavm_usr_mst2_mam_usr_cmn_t1.usr_alt_nm3,
	mavm_usr_mst2_mam_usr_cmn_t1.usr_alt_nm4,
	mavm_usr_mst2_mam_usr_cmn_t1.full_da_flg,
	mavm_usr_mst2_mam_usr_cmn_t1.email1,
	mavm_usr_mst2_mam_usr_cmn_t1.email2,
	mavm_usr_mst2_mam_usr_cmn_t1.email3,
	mavm_usr_mst2_mam_usr_cmn_t1.tel1,
	mavm_usr_mst2_mam_usr_cmn_t1.tel2,
	mavm_usr_mst2_mam_usr_cmn_t1.tel3,
	mavm_usr_mst2_mam_usr_cmn_t1.th_image,
	mavm_usr_mst2_mam_usr_cmn_t1.usr_com_typ,
	mavm_usr_mst2_mam_usr_cmn_t1.usr_com,
	mavm_usr_mst2_mam_usr_cmn_t1.wk_cost_cd,
	mavm_usr_mst2_mam_usr_cmn_t1.usr_info1,
	mavm_usr_mst2_mam_usr_cmn_t1.usr_info2,
	mavm_usr_mst2_mam_usr_cmn_t1.usr_info3,
	mavm_usr_mst2_mam_usr_cmn_t1.usr_info4,
	mavm_usr_mst2_mam_usr_cmn_t1.usr_info5,
	mavm_usr_mst2_mam_usr_cmn_t1.usr_info6,
	mavm_usr_mst2_mam_usr_cmn_t1.usr_info7,
	mavm_usr_mst2_mam_usr_cmn_t1.usr_info8,
	mavm_usr_mst2_mam_usr_cmn_t1.usr_info9,
	mavm_usr_mst2_mam_usr_cmn_t1.usr_info10,
	mavm_usr_mst2_mam_usr_cmn_t1.usr_info11,
	mavm_usr_mst2_mam_usr_cmn_t1.usr_info12,
	mavm_usr_mst2_mam_usr_cmn_t1.usr_info13,
	mavm_usr_mst2_mam_usr_cmn_t1.usr_info14,
	mavm_usr_mst2_mam_usr_cmn_t1.usr_info15,
	mavm_usr_mst2_mam_usr_cmn_t1.usr_info16,
	mavm_usr_mst2_mam_usr_cmn_t1.usr_info17,
	mavm_usr_mst2_mam_usr_cmn_t1.usr_info18,
	mavm_usr_mst2_mam_usr_cmn_t1.usr_info19,
	mavm_usr_mst2_mam_usr_cmn_t1.usr_info20,
	mavm_usr_mst2_mam_usr_cmn_t1.memo1,
	mavm_usr_mst2_mam_usr_cmn_t1.memo2,
	mavm_usr_mst2_mam_usr_cmn_t1.memo3,
	mavm_usr_mst2_mam_usr_cmn_t1.del_flg,
	mavm_usr_mst2_mam_usr_cmn_t1.del_usr_id,
	mavm_usr_mst2_mam_usr_cmn_t1.del_usr_nm,
	mavm_usr_mst2_mam_usr_cmn_t1.del_ts,
	mavm_usr_mst2_mam_usr_cmn_t1.ins_usr_id,
	mavm_usr_mst2_mam_usr_cmn_t1.ins_usr_nm,
	mavm_usr_mst2_mam_usr_cmn_t1.ins_ts,
	mavm_usr_mst2_mam_usr_cmn_t1.ins_func_id,
	mavm_usr_mst2_mam_usr_cmn_t1.upd_cntr,
	mavm_usr_mst2_mam_usr_cmn_t1.upd_usr_id,
	mavm_usr_mst2_mam_usr_cmn_t1.upd_usr_nm,
	mavm_usr_mst2_mam_usr_cmn_t1.upd_ts,
	mavm_usr_mst2_mam_usr_cmn_t1.upd_func_id,
	mavm_usr_mst2_mam_usr_cmn_t1.upd_srv_req_no,
	mavm_usr_mst2_mam_co_all_t2.co_cd,
	--担当者名（ロケール１）
	(SELECT mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_nm
		FROM mam_usr_lcl_cmn mavm_usr_mst2_mam_usr_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_cd = mavm_usr_mst2_mam_usr_cmn_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.lcl_cd = 'ja_JP'
	)	usr_nm_lcl1,
	--担当者名（ロケール２）
	(SELECT mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_nm
		FROM mam_usr_lcl_cmn mavm_usr_mst2_mam_usr_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_cd = mavm_usr_mst2_mam_usr_cmn_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.lcl_cd = 'en_US'
	)	usr_nm_lcl2,
	--担当者名（ロケール３）
	(SELECT mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_nm
		FROM mam_usr_lcl_cmn mavm_usr_mst2_mam_usr_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_cd = mavm_usr_mst2_mam_usr_cmn_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.lcl_cd = 'TBD3'
	)	usr_nm_lcl3,
	--担当者名（ロケール４）
	(SELECT mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_nm
		FROM mam_usr_lcl_cmn mavm_usr_mst2_mam_usr_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_cd = mavm_usr_mst2_mam_usr_cmn_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.lcl_cd = 'TBD4'
	)	usr_nm_lcl4,
	--担当者名（ロケール５）
	(SELECT mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_nm
		FROM mam_usr_lcl_cmn mavm_usr_mst2_mam_usr_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_cd = mavm_usr_mst2_mam_usr_cmn_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.lcl_cd = 'TBD5'
	)	usr_nm_lcl5,
	--担当者別名１（ロケール１）
	(SELECT mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_alt_nm1
		FROM mam_usr_lcl_cmn mavm_usr_mst2_mam_usr_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_cd = mavm_usr_mst2_mam_usr_cmn_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.lcl_cd = 'ja_JP'
	)	usr_alt_nm1_lcl1,
	--担当者別名１（ロケール２）
	(SELECT mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_alt_nm1
		FROM mam_usr_lcl_cmn mavm_usr_mst2_mam_usr_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_cd = mavm_usr_mst2_mam_usr_cmn_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.lcl_cd = 'en_US'
	)	usr_alt_nm1_lcl2,
	--担当者別名１（ロケール３）
	(SELECT mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_alt_nm1
		FROM mam_usr_lcl_cmn mavm_usr_mst2_mam_usr_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_cd = mavm_usr_mst2_mam_usr_cmn_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.lcl_cd = 'TBD3'
	)	usr_alt_nm1_lcl3,
	--担当者別名１（ロケール４）
	(SELECT mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_alt_nm1
		FROM mam_usr_lcl_cmn mavm_usr_mst2_mam_usr_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_cd = mavm_usr_mst2_mam_usr_cmn_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.lcl_cd = 'TBD4'
	)	usr_alt_nm1_lcl4,
	--担当者別名１（ロケール５）
	(SELECT mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_alt_nm1
		FROM mam_usr_lcl_cmn mavm_usr_mst2_mam_usr_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_cd = mavm_usr_mst2_mam_usr_cmn_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.lcl_cd = 'TBD5'
	)	usr_alt_nm1_lcl5,
	--担当者別名２（ロケール１）
	(SELECT mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_alt_nm2
		FROM mam_usr_lcl_cmn mavm_usr_mst2_mam_usr_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_cd = mavm_usr_mst2_mam_usr_cmn_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.lcl_cd = 'ja_JP'
	)	usr_alt_nm2_lcl1,
	--担当者別名２（ロケール２）
	(SELECT mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_alt_nm2
		FROM mam_usr_lcl_cmn mavm_usr_mst2_mam_usr_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_cd = mavm_usr_mst2_mam_usr_cmn_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.lcl_cd = 'en_US'
	)	usr_alt_nm2_lcl2,
	--担当者別名２（ロケール３）
	(SELECT mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_alt_nm2
		FROM mam_usr_lcl_cmn mavm_usr_mst2_mam_usr_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_cd = mavm_usr_mst2_mam_usr_cmn_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.lcl_cd = 'TBD3'
	)	usr_alt_nm2_lcl3,
	--担当者別名２（ロケール４）
	(SELECT mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_alt_nm2
		FROM mam_usr_lcl_cmn mavm_usr_mst2_mam_usr_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_cd = mavm_usr_mst2_mam_usr_cmn_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.lcl_cd = 'TBD4'
	)	usr_alt_nm2_lcl4,
	--担当者別名２（ロケール５）
	(SELECT mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_alt_nm2
		FROM mam_usr_lcl_cmn mavm_usr_mst2_mam_usr_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_cd = mavm_usr_mst2_mam_usr_cmn_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.lcl_cd = 'TBD5'
	)	usr_alt_nm2_lcl5,
	--担当者別名３（ロケール１）
	(SELECT mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_alt_nm3
		FROM mam_usr_lcl_cmn mavm_usr_mst2_mam_usr_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_cd = mavm_usr_mst2_mam_usr_cmn_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.lcl_cd = 'ja_JP'
	)	usr_alt_nm3_lcl1,
	--担当者別名３（ロケール２）
	(SELECT mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_alt_nm3
		FROM mam_usr_lcl_cmn mavm_usr_mst2_mam_usr_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_cd = mavm_usr_mst2_mam_usr_cmn_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.lcl_cd = 'en_US'
	)	usr_alt_nm3_lcl2,
	--担当者別名３（ロケール３）
	(SELECT mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_alt_nm3
		FROM mam_usr_lcl_cmn mavm_usr_mst2_mam_usr_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_cd = mavm_usr_mst2_mam_usr_cmn_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.lcl_cd = 'TBD3'
	)	usr_alt_nm3_lcl3,
	--担当者別名３（ロケール４）
	(SELECT mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_alt_nm3
		FROM mam_usr_lcl_cmn mavm_usr_mst2_mam_usr_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_cd = mavm_usr_mst2_mam_usr_cmn_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.lcl_cd = 'TBD4'
	)	usr_alt_nm3_lcl4,
	--担当者別名３（ロケール５）
	(SELECT mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_alt_nm3
		FROM mam_usr_lcl_cmn mavm_usr_mst2_mam_usr_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_cd = mavm_usr_mst2_mam_usr_cmn_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.lcl_cd = 'TBD5'
	)	usr_alt_nm3_lcl5,
	--担当者別名４（ロケール１）
	(SELECT mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_alt_nm4
		FROM mam_usr_lcl_cmn mavm_usr_mst2_mam_usr_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_cd = mavm_usr_mst2_mam_usr_cmn_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.lcl_cd = 'ja_JP'
	)	usr_alt_nm4_lcl1,
	--担当者別名４（ロケール２）
	(SELECT mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_alt_nm4
		FROM mam_usr_lcl_cmn mavm_usr_mst2_mam_usr_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_cd = mavm_usr_mst2_mam_usr_cmn_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.lcl_cd = 'en_US'
	)	usr_alt_nm4_lcl2,
	--担当者別名４（ロケール３）
	(SELECT mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_alt_nm4
		FROM mam_usr_lcl_cmn mavm_usr_mst2_mam_usr_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_cd = mavm_usr_mst2_mam_usr_cmn_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.lcl_cd = 'TBD3'
	)	usr_alt_nm4_lcl3,
	--担当者別名４（ロケール４）
	(SELECT mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_alt_nm4
		FROM mam_usr_lcl_cmn mavm_usr_mst2_mam_usr_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_cd = mavm_usr_mst2_mam_usr_cmn_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.lcl_cd = 'TBD4'
	)	usr_alt_nm4_lcl4,
	--担当者別名４（ロケール５）
	(SELECT mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_alt_nm4
		FROM mam_usr_lcl_cmn mavm_usr_mst2_mam_usr_lcl_cmn_t
		WHERE 0 = 0
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.usr_cd = mavm_usr_mst2_mam_usr_cmn_t1.usr_cd
		AND mavm_usr_mst2_mam_usr_lcl_cmn_t.lcl_cd = 'TBD5'
	)	usr_alt_nm4_lcl5
	FROM mam_usr_cmn mavm_usr_mst2_mam_usr_cmn_t1, mam_co_all mavm_usr_mst2_mam_co_all_t2
	WHERE 0 = 0
	AND	EXISTS (
		SELECT	'X'
		FROM	mam_mst_ctl mavm_usr_mst2_mam_mst_ctl_x
		WHERE	0=0
		AND	mavm_usr_mst2_mam_mst_ctl_x.mst_nm = fcpa_const$get_const_val('MAC_MST_NM','MAM_USR')
		AND	mavm_usr_mst2_mam_mst_ctl_x.mst_set_typ = fcpa_const$get_const_val('MAC_MST_SET_TYP','ALL_COM')
	)
;;

