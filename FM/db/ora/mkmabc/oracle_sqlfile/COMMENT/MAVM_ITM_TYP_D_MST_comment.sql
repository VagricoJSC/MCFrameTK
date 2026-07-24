
COMMENT ON TABLE MAVM_ITM_TYP_D_MST IS '品目区分詳細マスタビュー // Item type details master view';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.ITM_TYP IS '品目区分 // #MA.ITM_TYP // Item type';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.ITM_TYP_D_CD IS '品目区分詳細ＣＤ // #MA.ITM_TYP_D_CD // Item type details cd.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.ITM_TYP_D_NM IS '品目区分詳細名 // #MA.ITM_TYP_D_NM // Item type details name';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SLS_FLG IS '販売ＦＬＧ // #MA.FLG // Sales flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_MFG_FLG IS '製造ＦＬＧ // #MA.FLG // Mfg. flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_PURC_FLG IS '購買ＦＬＧ // #MA.FLG // Purchasing flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_INSP_FLG IS '検査ＦＬＧ // #MA.FLG // Inspection flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_ITM_JNL_CD IS '品目仕訳ＣＤ // #MA.ITM_JNL_CD // Item journal cd.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_AC_ITM_GRP_CD IS '会計品目分類ＣＤ // #MA.AC_ITM_GRP_CD // Accounting item classification cd.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_MINUS_STK_FLG IS 'マイナス在庫許可ＦＬＧ // #MA.FLG // Allow negative inventory flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_NOT_NEW_LOT_FLG IS '新規ロット入力不可ＦＬＧ // #MA.FLG // Do not allow new lot input flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_GI_ALLOC_FLG IS '出庫引当確認ＦＬＧ // #MA.FLG // GI allocation check flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_PACK_ALLOC_FLG IS '荷姿引当ＦＬＧ // #MA.FLG // SKU allocation flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_BP_LOT_FLG IS '業者ロットＮＯ必須ＦＬＧ // #MA.FLG // Vendor Lot No. required flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_COMP_SPEC_TYP IS '構成・仕様管理区分 // #MA.COMP_SPEC_TYP // Configuration/specification management type';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_COMP_REV_AT_SLO_FLG IS '受注時構成改訂許可ＦＬＧ // #MA.FLG // Allow sales order configuration rev. flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_COMP_CORE_ITM_FLG IS '構成主品目ＦＬＧ // #MA.FLG // Configuration main item flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SKIP_CHK_SHIP_FLG IS '出荷時構成チェック不要ＦＬＧ // #MA.FLG // Component check not required at shipping flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_ITM_SPEC_GRP_CD IS '品目仕様分類ＣＤ // #MA.ITM_SPEC_GRP_CD // Item specification classification cd.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SLS_UPRI_GRP_CD IS '販売単価分類ＣＤ // #MA.SLS_UPRI_GRP_CD // Sales unit price classification cd.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SLO_PROC_FLG IS '受注手配品ＦＬＧ // #MA.FLG // Sales order procurement item flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SLO_PROC_TYP IS '受注手配区分 // #MA.SLO_PROC_TYP // Sales order procurement type';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SHIP_INST_TYP IS '出荷指図区分 // #MA.SHIP_INST_TYP // Shipping order type';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SHIP_LOT_BACK_STOP_FLG IS '出荷ロット逆転禁止ＦＬＧ // #MA.FLG // Shipping lot reverse prohibit flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_ITM_SHIP_GRP_CD IS '品目出荷グループＣＤ // #MA.ITM_SHIP_GRP_CD // Item shipping group cd.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SHIP_VALID_GRP_CD IS '出荷有効期限グループＣＤ // #MA.SHIP_VALID_GRP_CD // Shipping expiration date group cd.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_ARR_SKIP_FLG IS '入荷不要ＦＬＧ // #MA.FLG // Not receipt flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SHIP_TERM_CD IS '出荷条件ＣＤ // #MA.SHIP_TERM_CD // Shipping conditions cd.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_STK_LST_FLG IS '現品票出力対象ＦＬＧ // #MA.FLG // For identification tag output flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_MFG_INST_UNIT_TYP IS '製造指図単位区分 // #MA.MFG_INST_UNIT_TYP // Mfg. order unit type';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SLS_UPRI_CNG_FLG IS '販売単価変更許可ＦＬＧ // #MA.FLG // Allow sales unit price change flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_PURC_UPRI_CNG_FLG IS '購買単価変更許可ＦＬＧ // #MA.FLG // Allow purchasing unit price change flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_PROV_UPRI_CNG_FLG IS '支給単価変更許可ＦＬＧ // #MA.FLG // Allow supply unit price change flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_MRP_PROC_TYP IS 'ＭＲＰ処理区分 // #MA.MRP_PROC_TYP // MRP process type';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_RQMT_TYP IS '所要区分 // #MA.RQMT_TYP // Requirements type';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_PROD_PLN_TYP IS '生産計画立案区分 // #MA.PROD_PLN_TYP // Production planning type';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_DMND_DATE_DIV_MONS IS '需要日ばらし月数 // #MA.MONS // Number of months for demand disaggregation by day';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_ALLOC_MARGIN_DAYS IS '引当余裕日数 // #MA.DAYS // Allocation extra days';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_MRP_ALLOC_MARGIN_DAYS IS 'ＭＲＰ引当余裕日数 // #MA.DAYS // MRP allocation extra days';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_MRP_OPN_XFR_DAYS IS 'ＭＲＰ未確定移送依頼考慮日数 // #MA.DAYS // Days to consider unfirm transport request in MRP';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_INPT_ITM_ADD_FLG IS '投入品追加許可ＦＬＧ // #MA.FLG // Allow input item addition flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_INPT_ITM_DEL_FLG IS '投入品削除許可ＦＬＧ // #MA.FLG // Allow input item deletion flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SCH_FLG IS 'スケジューラＦＬＧ // #MA.FLG // Scheduler flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_LOT_MNG_TYP IS 'ロット管理区分 // #MA.LOT_MNG_TYP // Lot management type';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_LOT_NO_TYP IS 'ロットＮＯ発番区分 // #MA.LOT_NO_TYP // Lot No. numbering type';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_LOT_NO_PTN_CD IS 'ロットＮＯ発番パタンＣＤ // #MA.NUM_PTN_CD // Lot No. numbering pattern cd.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SUBLOT_MNG_TYP IS 'サブロット管理区分 // #MA.SUBLOT_MNG_TYP // Sublot management type';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SUBLOT_NO_TYP IS 'サブロットＮＯ発番区分 // #MA.LOT_NO_TYP // Sublot No. numbering type';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SUBLOT_NO_PTN_CD IS 'サブロットＮＯ発番パタンＣＤ // #MA.NUM_PTN_CD // Sublot No. numbering pattern cd.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SNO1_MNG_TYP IS '手配ＮＯ１管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 1 management type';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SLO_SNO1_FLG IS '受注手配ＮＯ１必須ＦＬＧ // #MA.FLG // Sales order SEIBAN No. 1 required flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_RQMT_SNO1_FLG IS '所要手配ＮＯ１必須ＦＬＧ // #MA.FLG // Requirements SEIBAN No. 1 required flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SNO1_NUM_TYP IS '手配ＮＯ１発番区分 // #MA.SNO_NUM_TYP // SEIBAN No. 1 numbering type';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SNO1_PTN_CD IS '手配ＮＯ１発番パタンＣＤ // #MA.NUM_PTN_CD // SEIBAN No. 1 numbering pattern cd.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SNO2_MNG_TYP IS '手配ＮＯ２管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 2 management type';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SLO_SNO2_FLG IS '受注手配ＮＯ２必須ＦＬＧ // #MA.FLG // Sales order SEIBAN No. 2 required flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_RQMT_SNO2_FLG IS '所要手配ＮＯ２必須ＦＬＧ // #MA.FLG // Requirements SEIBAN No. 2 required flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SNO2_NUM_TYP IS '手配ＮＯ２発番区分 // #MA.SNO_NUM_TYP // SEIBAN No. 2 numbering type';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SNO2_PTN_CD IS '手配ＮＯ２発番パタンＣＤ // #MA.NUM_PTN_CD // SEIBAN No. 2 numbering pattern cd.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SNO3_MNG_TYP IS '手配ＮＯ３管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 3 management type';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SLO_SNO3_FLG IS '受注手配ＮＯ３必須ＦＬＧ // #MA.FLG // Sales order SEIBAN No. 3 required flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_RQMT_SNO3_FLG IS '所要手配ＮＯ３必須ＦＬＧ // #MA.FLG // Requirements SEIBAN No. 3 required flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SNO3_NUM_TYP IS '手配ＮＯ３発番区分 // #MA.SNO_NUM_TYP // SEIBAN No. 3 numbering type';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SNO3_PTN_CD IS '手配ＮＯ３発番パタンＣＤ // #MA.NUM_PTN_CD // SEIBAN No. 3 numbering pattern cd.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SNO4_MNG_TYP IS '手配ＮＯ４管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 4 management type';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SLO_SNO4_FLG IS '受注手配ＮＯ４必須ＦＬＧ // #MA.FLG // Sales order SEIBAN No. 4 required flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_RQMT_SNO4_FLG IS '所要手配ＮＯ４必須ＦＬＧ // #MA.FLG // Requirements SEIBAN No. 4 required flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SNO4_NUM_TYP IS '手配ＮＯ４発番区分 // #MA.SNO_NUM_TYP // SEIBAN No. 4 numbering type';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SNO4_PTN_CD IS '手配ＮＯ４発番パタンＣＤ // #MA.NUM_PTN_CD // SEIBAN No. 4 numbering pattern cd.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_LMT_CTL_FLG IS '期限管理対象ＦＬＧ // #MA.FLG // For expiration management flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_LMT_CTL_CATEG IS '期限管理種別 // #MA.LMT_CTL_CATEG // Expiration management type';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_VER_FLG IS '版管理対象ＦＬＧ // #MA.FLG // For version control flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_INSP_BIND_TYP IS '検査実施単位区分 // #MA.INSP_BIND_TYP // Inspection implementation unit type';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_MRKT_JUDG_FLG IS '市場出荷判定対象ＦＬＧ // #MA.FLG // For market release decision flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_MRKT_JUDG_ROLE_CD IS '市場出荷判定承認役割ＣＤ // #MA.APRV_ROLE_CD // Market release decision approval role cd.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_MRKT_JUDG_UPD_ROLE_CD IS '市場出荷判定更新役割ＣＤ // #MA.APRV_ROLE_CD // Market release decision update role cd.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_PLNT_APRV_FLG IS '工場出荷承認対象ＦＬＧ // #MA.FLG // For factory release approval flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_PLNT_APRV_ROLE_CD IS '工場出荷承認役割ＣＤ // #MA.APRV_ROLE_CD // Factory release approval role cd.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_INSP_APRV_FLG IS '検査承認対象ＦＬＧ // #MA.FLG // For inspection approval flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_INSP_APRV_ROLE_CD IS '検査承認役割ＣＤ // #MA.APRV_ROLE_CD // Inspection approval role cd.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_MFG_APRV_FLG IS '製造承認対象ＦＬＧ // #MA.FLG // For mfg. approval flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_MFG_APRV_ROLE_CD IS '製造承認役割ＣＤ // #MA.APRV_ROLE_CD // Mfg. approval role cd.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SNO_TYP1 IS '手配ＮＯ１区分 // #MA.SNO_TYP // SEIBAN No. 1 type';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SNO_TYP2 IS '手配ＮＯ２区分 // #MA.SNO_TYP // SEIBAN No. 2 type';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SNO_TYP3 IS '手配ＮＯ３区分 // #MA.SNO_TYP // SEIBAN No. 3 type';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SNO_TYP4 IS '手配ＮＯ４区分 // #MA.SNO_TYP // SEIBAN No. 4 type';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_INST_LOT_FIX_FLG IS '指図時ロット指定ＦＬＧ // #MA.FLG // Lot specification at order flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_LOT_MIX_FLG IS 'ロット混在ＦＬＧ // #MA.FLG // Lot mixed flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_SUBLOT_MIX_FLG IS 'サブロット混在ＦＬＧ // #MA.FLG // Sublot mixed flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_ALLOC_CTL_TYP IS '引当制御区分 // #MA.ALLOC_CTL_TYP // Allocation control type';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_INPT_CTL_TYP IS '投入制御区分 // #MA.INPT_CTL_TYP // Input control type';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_BKF_TYP IS 'バックフラッシュ区分 // #MA.BKF_TYP // Backflush type';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_MAIN_ITM_FLG IS '引継対象子品目ＦＬＧ // #MA.FLG // Copy-from child item flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_BYPROD_FLG IS '副産品ＦＬＧ // #MA.FLG // By-product flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_NOT_COST_BOM_FLG IS '原価対象外ＦＬＧ（ＢＯＭ） // #MA.FLG // Not costing flg. (BOM)';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEF_CALC_PTN_CD IS '計算パタンＣＤ // #MA.CALC_PTN_CD // Calculation pattern cd.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEL_USR_ID IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEL_USR_NM IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.DEL_TS IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.ITM_TYP_D_NM_LCL1 IS '品目区分詳細名（ロケール１） // #MA.ITM_TYP_D_NM // Item type details name (Locale1)';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.ITM_TYP_D_NM_LCL2 IS '品目区分詳細名（ロケール２） // #MA.ITM_TYP_D_NM // Item type details name (Locale2)';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.ITM_TYP_D_NM_LCL3 IS '品目区分詳細名（ロケール３） // #MA.ITM_TYP_D_NM // Item type details name (Locale3)';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.ITM_TYP_D_NM_LCL4 IS '品目区分詳細名（ロケール４） // #MA.ITM_TYP_D_NM // Item type details name (Locale4)';


COMMENT ON COLUMN MAVM_ITM_TYP_D_MST.ITM_TYP_D_NM_LCL5 IS '品目区分詳細名（ロケール５） // #MA.ITM_TYP_D_NM // Item type details name (Locale5)';

