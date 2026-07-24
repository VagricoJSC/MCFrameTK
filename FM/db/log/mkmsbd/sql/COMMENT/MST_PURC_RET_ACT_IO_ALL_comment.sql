
COMMENT ON TABLE MST_PURC_RET_ACT_IO_ALL IS '仕入返品実績受払 // Purchase return result GR/GI';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.PURC_RET_ACT_IO_NO IS '仕入返品実績受払ＮＯ // #MA.PURC_RET_ACT_IO_NO // Purchase return result GR/GI No.';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.PURC_RET_ACT_NO IS '仕入返品実績ＮＯ // #MA.PURC_RET_ACT_NO // Purchase return result No.';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.PURC_RET_ACT_D_NO IS '仕入返品実績明細ＮＯ // #MA.PURC_RET_ACT_D_NO // Purchase return result details No.';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.PURC_RET_ACT_REV IS '仕入返品実績改訂番号 // #MA.SLIP_REV // Purchase return result rev. number';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.PURC_RET_LOC_WG_CD IS '仕入返品元場所ＷＧ ＣＤ // #MA.WG_CD // Purchase return-from location WG cd.';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.PURC_RET_LOC_CD IS '仕入返品元場所ＣＤ // #MA.LOC_CD // Purchase return-from location cd.';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.STR_LN_CD IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.BP_LOT_NO IS '業者ロットＮＯ // #MA.BP_LOT_NO // Vendor lot No.';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.STK_ID_TYP IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.STK_INSP_TYP IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.STK_ARRV_BP_CD IS '在庫着荷先 // #MA.BP_CD // Inventory arriving point';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.IN_XFR_TYP IS '積送品区分 // #MS.IN_XFR_TYP // In-transit type';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.PACK_UNIT_CD IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.PACK_UNIT_QTY IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.PURC_CONT_QTY IS '仕入有効成分 // #MA.PURC_CONT_QTY // Purchase active ingredient';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.REF_ARR_ACT_NO IS '参照入荷実績ＮＯ // #MA.ARR_ACT_NO // Reference receipt result No.';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.REF_ARR_ACT_REV IS '参照入荷実績改訂番号 // #MA.SLIP_REV // Reference receipt result rev. number';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.REF_PURC_ACT_IO_NO IS '参照仕入実績受払ＮＯ // #MA.PURC_ACT_IO_NO // Reference purchase result GR/GI No.';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.REF_PURC_ACT_IO_SEQ IS '参照仕入実績受払連番 // #MA.SLIP_SEQ // Reference purchase result GR/GI sequence number';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.PURC_RET_SCHD_IO_NO IS '仕入返品予定受払ＮＯ // #MA.PURC_RET_SCHD_IO_NO // Purchase return schedule GR/GI No.';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.SLS_ACT_IO_NO IS '売上実績受払ＮＯ // #MA.SLS_ACT_IO_NO // Sales result GR/GI No.';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.CAN_FLG IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.SUB_CHAR1 IS '予備項目１ // #MS.PURC_RET_ACT_IO_SUB_CHAR1 // Spare column 1';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.SUB_CHAR2 IS '予備項目２ // #MS.PURC_RET_ACT_IO_SUB_CHAR2 // Spare column 2';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.SUB_CHAR3 IS '予備項目３ // #MS.PURC_RET_ACT_IO_SUB_CHAR3 // Spare column 3';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_PURC_RET_ACT_IO_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

