
COMMENT ON TABLE MAM_LOC IS '場所マスタ // Location master';


COMMENT ON COLUMN MAM_LOC.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MAM_LOC.LOC_NM IS '場所名 // #MA.LOC_NM // Location name';


COMMENT ON COLUMN MAM_LOC.BASE_LOC_NM IS '場所名（ベース） // #MA.LOC_NM // Location name(Base)';


COMMENT ON COLUMN MAM_LOC.ASST_DPT_CD IS '資産管理部門ＣＤ // #MA.DPT_CD // Asset management dept. cd.';


COMMENT ON COLUMN MAM_LOC.SLS_DPT_CD IS '売上部門ＣＤ // #MA.DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN MAM_LOC.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MAM_LOC.SITE_CD IS '工場・物流倉庫ＣＤ // #MA.SITE_CD // Factory/Distribution warehouse cd.';


COMMENT ON COLUMN MAM_LOC.LG_GRP_CD IS '物流グループＣＤ // #MA.LG_GRP_CD // Distribution group cd.';


COMMENT ON COLUMN MAM_LOC.LG_DEF_FLG IS '物流標準場所ＦＬＧ // #MA.FLG // Distribution standard location flg.';


COMMENT ON COLUMN MAM_LOC.LOC_GRP_CD IS '製造場所グループＣＤ // #MA.LOC_GRP_CD // Mfg. location group cd.';


COMMENT ON COLUMN MAM_LOC.ALLOC_GRP_CD IS '総量引当場所グループＣＤ // #MA.ALLOC_GRP_CD // Gross allocation location group cd.';


COMMENT ON COLUMN MAM_LOC.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MAM_LOC.MAKER_CD IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN MAM_LOC.PRE_OUTSRC_ACT_FLG IS '外注実績先行ＦＬＧ // #MA.FLG // Subcontracting result prior flg.';


COMMENT ON COLUMN MAM_LOC.DDLV_PROV_INSP_FLG IS '直送支給検査ＦＬＧ // #MA.FLG // Direct-delivery supply inspection flg.';


COMMENT ON COLUMN MAM_LOC.CAL_CD IS 'カレンダＣＤ // #MA.CAL_CD // Calendar cd.';


COMMENT ON COLUMN MAM_LOC.LOC_MNG_TYP IS '管轄区分 // #MA.LOC_MNG_TYP // Controlling site type';


COMMENT ON COLUMN MAM_LOC.PRNT_LCL_CD IS '帳票出力ロケールＣＤ // #MA.LCL_CD // Report output locale cd.';


COMMENT ON COLUMN MAM_LOC.CNTRY_CD IS '国ＣＤ // #MA.CNTRY_CD // Country cd.';


COMMENT ON COLUMN MAM_LOC.NUM_ID IS '発番ＩＤ // #MA.NUM_ID // Numbering ID';


COMMENT ON COLUMN MAM_LOC.STKTK_TGT_FLG IS '棚卸対象ＦＬＧ // #MA.FLG // For inventory count flg.';


COMMENT ON COLUMN MAM_LOC.STKTK_TOR_DISP_FLG IS '理論在庫初期表示ＦＬＧ // #MA.FLG // Logical inventory initial display flg.';


COMMENT ON COLUMN MAM_LOC.STKTK_TOR_EX_ZERO_FLG IS '理論在庫数０除外ＦＬＧ // #MA.FLG // Logical inventory qty. 0 exclusion flg.';


COMMENT ON COLUMN MAM_LOC.STKTK_ACT_EX_ZERO_FLG IS '実棚差異数０除外ＦＬＧ // #MA.FLG // Inventory variance qty. 0 excluded flg.';


COMMENT ON COLUMN MAM_LOC.STKTK_AMT_FLG IS '棚卸金額出力ＦＬＧ // #MA.FLG // Inventory count amount output flg.';


COMMENT ON COLUMN MAM_LOC.STR_LN_TGT_FLG IS '棚・ライン対象ＦＬＧ // #MA.FLG // For rack/line flg.';


COMMENT ON COLUMN MAM_LOC.ALLOC_LMT_FLG IS '引当限定ＦＬＧ // #MA.FLG // Allocation limited flg.';


COMMENT ON COLUMN MAM_LOC.GI_PACK_XFER_FLG IS '出庫時荷姿振替ＦＬＧ // #MA.FLG // SKU transfer at GI flg.';


COMMENT ON COLUMN MAM_LOC.GI_VMI_FLG IS '出庫時ＶＭＩ計上ＦＬＧ // #MA.FLG // VMI recording at GI flg.';


COMMENT ON COLUMN MAM_LOC.RSRC_CD1 IS '資源ＣＤ１ // #MA.RSRC_CD // Resource cd. 1';


COMMENT ON COLUMN MAM_LOC.RSRC_CD2 IS '資源ＣＤ２ // #MA.RSRC_CD // Resource cd. 2';


COMMENT ON COLUMN MAM_LOC.EXT_SYS_LOC_TYP IS '外部システム場所区分 // #MA.EXT_SYS_LOC_TYP // External system location type';


COMMENT ON COLUMN MAM_LOC.LOC_ALC_GRP IS '場所配賦グループ // #MA.LOC_ALC_GRP // Location allocation group';


COMMENT ON COLUMN MAM_LOC.ADDR_FLG IS '住所設定ＦＬＧ // #MA.FLG // Address setting flg.';


COMMENT ON COLUMN MAM_LOC.ZIP_CD IS '郵便番号 // #MA.ZIP_CD // Zip code';


COMMENT ON COLUMN MAM_LOC.BASE_ZIP_CD IS '郵便番号（ベース） // #MA.ZIP_CD // Zip code(Base)';


COMMENT ON COLUMN MAM_LOC.ADDR1 IS '住所１ // #MA.ADDR1 // Address 1';


COMMENT ON COLUMN MAM_LOC.BASE_ADDR1 IS '住所１（ベース） // #MA.ADDR1 // Address 1(Base)';


COMMENT ON COLUMN MAM_LOC.ADDR2 IS '住所２ // #MA.ADDR2 // Address 2';


COMMENT ON COLUMN MAM_LOC.BASE_ADDR2 IS '住所２（ベース） // #MA.ADDR2 // Address 2(Base)';


COMMENT ON COLUMN MAM_LOC.ADDR3 IS '住所３ // #MA.ADDR3 // Address 3';


COMMENT ON COLUMN MAM_LOC.BASE_ADDR3 IS '住所３（ベース） // #MA.ADDR3 // Address 3(Base)';


COMMENT ON COLUMN MAM_LOC.ADDR4 IS '住所４ // #MA.ADDR4 // Address 4';


COMMENT ON COLUMN MAM_LOC.BASE_ADDR4 IS '住所４（ベース） // #MA.ADDR4 // Address 4(Base)';


COMMENT ON COLUMN MAM_LOC.TEL IS 'ＴＥＬ // #MA.TEL // TEL';


COMMENT ON COLUMN MAM_LOC.BASE_TEL IS 'ＴＥＬ（ベース） // #MA.TEL // TEL(Base)';


COMMENT ON COLUMN MAM_LOC.FAX IS 'ＦＡＸ // #MA.TEL // FAX';


COMMENT ON COLUMN MAM_LOC.BASE_FAX IS 'ＦＡＸ（ベース） // #MA.TEL // FAX(Base)';


COMMENT ON COLUMN MAM_LOC.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAM_LOC.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAM_LOC.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAM_LOC.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN MAM_LOC.DEL_USR_ID IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN MAM_LOC.DEL_USR_NM IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN MAM_LOC.DEL_TS IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN MAM_LOC.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAM_LOC.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAM_LOC.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAM_LOC.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAM_LOC.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAM_LOC.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAM_LOC.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAM_LOC.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAM_LOC.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAM_LOC.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

