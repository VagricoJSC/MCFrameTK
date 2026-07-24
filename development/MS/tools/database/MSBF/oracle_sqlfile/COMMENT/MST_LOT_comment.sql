
COMMENT ON TABLE MST_LOT IS 'ロット管理情報 // Lot management info.';


COMMENT ON COLUMN MST_LOT.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_LOT.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_LOT.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_LOT.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_LOT.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_LOT.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_LOT.SCHD_FLG IS '予定ＦＬＧ // #MA.FLG // Schedule flg.';


COMMENT ON COLUMN MST_LOT.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MST_LOT.FIRST_GR_DT IS '最古入庫日 // #MA.DT // Oldest GR date';


COMMENT ON COLUMN MST_LOT.BASE_GR_DT IS '基準入庫日 // #MA.DT // Standard GR date';


COMMENT ON COLUMN MST_LOT.UNREG_LMT_FLG IS '期限未設定ＦＬＧ // #MA.FLG // Without expiration flg.';


COMMENT ON COLUMN MST_LOT.VLD_DT IS '有効期限 // #MA.DT // Expiration date';


COMMENT ON COLUMN MST_LOT.LMT_DT IS '使用期限 // #MA.DT // Usage expiration date';


COMMENT ON COLUMN MST_LOT.LOT_MNG_TYP IS 'ロット管理区分 // #MA.LOT_MNG_TYP // Lot management type';


COMMENT ON COLUMN MST_LOT.SUBLOT_MNG_TYP IS 'サブロット管理区分 // #MA.SUBLOT_MNG_TYP // Sublot management type';


COMMENT ON COLUMN MST_LOT.BP_LOT_NO IS '業者ロットＮＯ // #MA.BP_LOT_NO // Vendor lot No.';


COMMENT ON COLUMN MST_LOT.STK_INSP_TYP IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN MST_LOT.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MST_LOT.MFG_APRV_STS_TYP IS '製造承認状況区分 // #MS.MFG_APRV_STS_TYP // Mfg. approval status type';


COMMENT ON COLUMN MST_LOT.INSP_APRV_STS_TYP IS '検査承認状況区分 // #MS.INSP_APRV_STS_TYP // Inspection approval status type';


COMMENT ON COLUMN MST_LOT.PLNT_APRV_STS_TYP IS '工場出荷承認状況区分 // #MS.PLNT_APRV_STS_TYP // Factory release approval status type';


COMMENT ON COLUMN MST_LOT.MRKT_JUDG_STS_TYP IS '市場出荷判定状況区分 // #MS.MRKT_JUDG_STS_TYP // Market release decision status type';


COMMENT ON COLUMN MST_LOT.FIRST_GR_DT_SAVE_FLG IS '最古日保存ＦＬＧ // #MA.FLG // Oldest date saving flg.';


COMMENT ON COLUMN MST_LOT.ACT_CONT_FCTR IS '実際有効成分係数 // #MA.ACT_CONT_FCTR // Actual active ingredient coefficient';


COMMENT ON COLUMN MST_LOT.LMT_DT_FRM_TYP IS '期限起算日区分 // #MA.LMT_DT_FRM_TYP // Expiration base date type';


COMMENT ON COLUMN MST_LOT.LMT_DT_FRM IS '起算日 // #MA.DT // Base date';


COMMENT ON COLUMN MST_LOT.LOT_SEQ IS 'ロットシーケンス // #MA.LOT_SEQ // Lot sequence';


COMMENT ON COLUMN MST_LOT.NO_DEL_FLG IS '削除不可ＦＬＧ // #MA.FLG // Undeletable flg.';


COMMENT ON COLUMN MST_LOT.LOT_RMRKS IS 'ロット備考 // #MS.LOT_RMRKS // Lot remarks';


COMMENT ON COLUMN MST_LOT.LOT_SUB_CHAR1 IS 'ロット予備（文字列）１ // #MS.LOT_SUB_CHAR1 // Lot spare (String) 1';


COMMENT ON COLUMN MST_LOT.LOT_SUB_CHAR2 IS 'ロット予備（文字列）２ // #MS.LOT_SUB_CHAR2 // Lot spare (String) 2';


COMMENT ON COLUMN MST_LOT.LOT_SUB_CHAR3 IS 'ロット予備（文字列）３ // #MS.LOT_SUB_CHAR3 // Lot spare (String) 3';


COMMENT ON COLUMN MST_LOT.LOT_SUB_CHAR4 IS 'ロット予備（文字列）４ // #MS.LOT_SUB_CHAR4 // Lot spare (String) 4';


COMMENT ON COLUMN MST_LOT.LOT_SUB_CHAR5 IS 'ロット予備（文字列）５ // #MS.LOT_SUB_CHAR5 // Lot spare (String) 5';


COMMENT ON COLUMN MST_LOT.LOT_SUB_NUM1 IS 'ロット予備（数値）１ // #MS.LOT_SUB_NUM1 // Lot spare (Numerical value) 1';


COMMENT ON COLUMN MST_LOT.LOT_SUB_NUM2 IS 'ロット予備（数値）２ // #MS.LOT_SUB_NUM2 // Lot spare (Numerical value) 2';


COMMENT ON COLUMN MST_LOT.LOT_SUB_NUM3 IS 'ロット予備（数値）３ // #MS.LOT_SUB_NUM3 // Lot spare (Numerical value) 3';


COMMENT ON COLUMN MST_LOT.LOT_SUB_NUM4 IS 'ロット予備（数値）４ // #MS.LOT_SUB_NUM4 // Lot spare (Numerical value) 4';


COMMENT ON COLUMN MST_LOT.LOT_SUB_NUM5 IS 'ロット予備（数値）５ // #MS.LOT_SUB_NUM5 // Lot spare (Numerical value) 5';


COMMENT ON COLUMN MST_LOT.LOT_SUB_DT1 IS 'ロット予備（日付）１ // #MA.DT // Lot spare (Date) 1';


COMMENT ON COLUMN MST_LOT.LOT_SUB_DT2 IS 'ロット予備（日付）２ // #MA.DT // Lot spare (Date) 2';


COMMENT ON COLUMN MST_LOT.LOT_SUB_DT3 IS 'ロット予備（日付）３ // #MA.DT // Lot spare (Date) 3';


COMMENT ON COLUMN MST_LOT.LOT_SUB_DT4 IS 'ロット予備（日付）４ // #MA.DT // Lot spare (Date) 4';


COMMENT ON COLUMN MST_LOT.LOT_SUB_DT5 IS 'ロット予備（日付）５ // #MA.DT // Lot spare (Date) 5';


COMMENT ON COLUMN MST_LOT.LOT_SUB_FLG1 IS 'ロット予備（ＦＬＧ）１ // #MA.FLG // Lot spare (flg.) 1';


COMMENT ON COLUMN MST_LOT.LOT_SUB_FLG2 IS 'ロット予備（ＦＬＧ）２ // #MA.FLG // Lot spare (flg.) 2';


COMMENT ON COLUMN MST_LOT.LOT_SUB_FLG3 IS 'ロット予備（ＦＬＧ）３ // #MA.FLG // Lot spare (flg.) 3';


COMMENT ON COLUMN MST_LOT.LOT_SUB_FLG4 IS 'ロット予備（ＦＬＧ）４ // #MA.FLG // Lot spare (flg.) 4';


COMMENT ON COLUMN MST_LOT.LOT_SUB_FLG5 IS 'ロット予備（ＦＬＧ）５ // #MA.FLG // Lot spare (flg.) 5';


COMMENT ON COLUMN MST_LOT.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_LOT.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_LOT.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_LOT.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_LOT.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_LOT.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_LOT.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_LOT.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_LOT.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_LOT.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

