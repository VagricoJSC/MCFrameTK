\encoding UTF-8

COMMENT ON VIEW mavm_loc_mst IS '場所マスタビュー // Location master view';


COMMENT ON COLUMN mavm_loc_mst.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mavm_loc_mst.loc_nm IS '場所名 // #MA.LOC_NM // Location name';


COMMENT ON COLUMN mavm_loc_mst.asst_dpt_cd IS '資産管理部門ＣＤ // #MA.DPT_CD // Asset management dept. cd.';


COMMENT ON COLUMN mavm_loc_mst.sls_dpt_cd IS '売上部門ＣＤ // #MA.DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN mavm_loc_mst.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mavm_loc_mst.site_cd IS '工場・物流倉庫ＣＤ // #MA.SITE_CD // Factory/Distribution warehouse cd.';


COMMENT ON COLUMN mavm_loc_mst.lg_grp_cd IS '物流グループＣＤ // #MA.LG_GRP_CD // Distribution group cd.';


COMMENT ON COLUMN mavm_loc_mst.lg_def_flg IS '物流標準場所ＦＬＧ // #MA.FLG // Distribution standard location flg.';


COMMENT ON COLUMN mavm_loc_mst.loc_grp_cd IS '製造場所グループＣＤ // #MA.LOC_GRP_CD // Mfg. location group cd.';


COMMENT ON COLUMN mavm_loc_mst.alloc_grp_cd IS '総量引当場所グループＣＤ // #MA.ALLOC_GRP_CD // Gross allocation location group cd.';


COMMENT ON COLUMN mavm_loc_mst.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mavm_loc_mst.maker_cd IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN mavm_loc_mst.pre_outsrc_act_flg IS '外注実績先行ＦＬＧ // #MA.FLG // Subcontracting result prior flg.';


COMMENT ON COLUMN mavm_loc_mst.ddlv_prov_insp_flg IS '直送支給検査ＦＬＧ // #MA.FLG // Direct-delivery supply inspection flg.';


COMMENT ON COLUMN mavm_loc_mst.cal_cd IS 'カレンダＣＤ // #MA.CAL_CD // Calendar cd.';


COMMENT ON COLUMN mavm_loc_mst.loc_mng_typ IS '管轄区分 // #MA.LOC_MNG_TYP // Controlling site type';


COMMENT ON COLUMN mavm_loc_mst.prnt_lcl_cd IS '帳票出力ロケールＣＤ // #MA.LCL_CD // Report output locale cd.';


COMMENT ON COLUMN mavm_loc_mst.cntry_cd IS '国ＣＤ // #MA.CNTRY_CD // Country cd.';


COMMENT ON COLUMN mavm_loc_mst.num_id IS '発番ＩＤ // #MA.NUM_ID // Numbering ID';


COMMENT ON COLUMN mavm_loc_mst.stktk_tgt_flg IS '棚卸対象ＦＬＧ // #MA.FLG // For inventory count flg.';


COMMENT ON COLUMN mavm_loc_mst.stktk_tor_disp_flg IS '理論在庫初期表示ＦＬＧ // #MA.FLG // Logical inventory initial display flg.';


COMMENT ON COLUMN mavm_loc_mst.stktk_tor_ex_zero_flg IS '理論在庫数０除外ＦＬＧ // #MA.FLG // Logical inventory qty. 0 exclusion flg.';


COMMENT ON COLUMN mavm_loc_mst.stktk_act_ex_zero_flg IS '実棚差異数０除外ＦＬＧ // #MA.FLG // Inventory variance qty. 0 excluded flg.';


COMMENT ON COLUMN mavm_loc_mst.stktk_amt_flg IS '棚卸金額出力ＦＬＧ // #MA.FLG // Inventory count amount output flg.';


COMMENT ON COLUMN mavm_loc_mst.str_ln_tgt_flg IS '棚・ライン対象ＦＬＧ // #MA.FLG // For rack/line flg.';


COMMENT ON COLUMN mavm_loc_mst.alloc_lmt_flg IS '引当限定ＦＬＧ // #MA.FLG // Allocation limited flg.';


COMMENT ON COLUMN mavm_loc_mst.gi_pack_xfer_flg IS '出庫時荷姿振替ＦＬＧ // #MA.FLG // SKU transfer at GI flg.';


COMMENT ON COLUMN mavm_loc_mst.gi_vmi_flg IS '出庫時ＶＭＩ計上ＦＬＧ // #MA.FLG // VMI recording at GI flg.';


COMMENT ON COLUMN mavm_loc_mst.rsrc_cd1 IS '資源ＣＤ１ // #MA.RSRC_CD // Resource cd. 1';


COMMENT ON COLUMN mavm_loc_mst.rsrc_cd2 IS '資源ＣＤ２ // #MA.RSRC_CD // Resource cd. 2';


COMMENT ON COLUMN mavm_loc_mst.ext_sys_loc_typ IS '外部システム場所区分 // #MA.EXT_SYS_LOC_TYP // External system location type';


COMMENT ON COLUMN mavm_loc_mst.loc_alc_grp IS '場所配賦グループ // #MA.LOC_ALC_GRP // Location allocation group';


COMMENT ON COLUMN mavm_loc_mst.addr_flg IS '住所設定ＦＬＧ // #MA.FLG // Address setting flg.';


COMMENT ON COLUMN mavm_loc_mst.zip_cd IS '郵便番号 // #MA.ZIP_CD // Zip code';


COMMENT ON COLUMN mavm_loc_mst.addr1 IS '住所１ // #MA.ADDR1 // Address 1';


COMMENT ON COLUMN mavm_loc_mst.addr2 IS '住所２ // #MA.ADDR2 // Address 2';


COMMENT ON COLUMN mavm_loc_mst.addr3 IS '住所３ // #MA.ADDR3 // Address 3';


COMMENT ON COLUMN mavm_loc_mst.addr4 IS '住所４ // #MA.ADDR4 // Address 4';


COMMENT ON COLUMN mavm_loc_mst.tel IS 'ＴＥＬ // #MA.TEL // TEL';


COMMENT ON COLUMN mavm_loc_mst.fax IS 'ＦＡＸ // #MA.TEL // FAX';


COMMENT ON COLUMN mavm_loc_mst.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mavm_loc_mst.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mavm_loc_mst.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mavm_loc_mst.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mavm_loc_mst.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mavm_loc_mst.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mavm_loc_mst.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mavm_loc_mst.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mavm_loc_mst.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mavm_loc_mst.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mavm_loc_mst.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mavm_loc_mst.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mavm_loc_mst.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mavm_loc_mst.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mavm_loc_mst.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mavm_loc_mst.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mavm_loc_mst.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mavm_loc_mst.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mavm_loc_mst.loc_nm_lcl1 IS '場所名（ロケール１） // #MA.LOC_NM // Location name (Locale 1)';


COMMENT ON COLUMN mavm_loc_mst.loc_nm_lcl2 IS '場所名（ロケール２） // #MA.LOC_NM // Location name (Locale 2)';


COMMENT ON COLUMN mavm_loc_mst.loc_nm_lcl3 IS '場所名（ロケール３） // #MA.LOC_NM // Location name (Locale 3)';


COMMENT ON COLUMN mavm_loc_mst.loc_nm_lcl4 IS '場所名（ロケール４） // #MA.LOC_NM // Location name (Locale 4)';


COMMENT ON COLUMN mavm_loc_mst.loc_nm_lcl5 IS '場所名（ロケール５） // #MA.LOC_NM // Location name (Locale 5)';

