
COMMENT ON TABLE MST_SLS_ACT_IO_ALL IS '売上実績受払 // Sales result GR/GI';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.SLS_ACT_IO_NO IS '売上実績受払ＮＯ // #MA.SLS_ACT_IO_NO // Sales result GR/GI No.';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.SLS_ACT_IO_SEQ IS '売上実績受払連番 // #MA.SLIP_SEQ // Sales result GR/GI sequence number';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.SLS_ACT_D_NO IS '売上実績明細ＮＯ // #MA.SLS_ACT_D_NO // Sales result details No.';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.SLS_ACT_D_SEQ IS '売上実績明細連番 // #MA.SLIP_SEQ // Sales result details sequence number';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.SHIP_ACT_D_NO IS '出荷実績明細ＮＯ // #MA.SHIP_ACT_D_NO // Shipping result details No.';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.IV_SHIP_ACT_D_NO IS 'インボイス出荷実績明細ＮＯ // #MA.IV_SHIP_ACT_D_NO // Shipping invoice result details No.';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.ARR_ACT_NO IS '入荷実績ＮＯ // #MA.ARR_ACT_NO // Receipt result No.';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.PURC_ACT_IO_NO IS '仕入実績受払ＮＯ // #MA.PURC_ACT_IO_NO // Purchase result GR/GI No.';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.STR_LN_CD IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.PACK_UNIT_CD IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.PACK_UNIT_QTY IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.TRD_CUR_UPRI IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.TRD_CUR_DSCNT_AMT IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.TRD_CUR_TAX_AMT IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.BASE_CUR_UPRI IS '基準通貨単価 // #MA.MONEY // Unit price (Base currency)';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.BASE_CUR_AMT IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.BASE_CUR_DSCNT_AMT IS '基準通貨値引額 // #MA.MONEY // Discount amount (Base currency)';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.BASE_CUR_TAX_AMT IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.PTAX_CUR_UPRI IS '納税通貨単価 // #MA.MONEY // Unit price (Tax currency)';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.PTAX_CUR_AMT IS '納税通貨金額 // #MA.MONEY // Amount (Tax currency)';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.PTAX_CUR_DSCNT_AMT IS '納税通貨値引額 // #MA.MONEY // Discount amount (Tax currency)';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.PTAX_CUR_TAX_AMT IS '納税通貨税額 // #MA.MONEY // Tax amount (Tax currency)';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.SYNC_FLG IS '同時計上ＦＬＧ // #MA.FLG // Simultaneous recording flg.';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.SUB_CHAR1 IS '予備１ // #MS.SLS_ACT_IO_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.SUB_CHAR2 IS '予備２ // #MS.SLS_ACT_IO_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.SUB_CHAR3 IS '予備３ // #MS.SLS_ACT_IO_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_SLS_ACT_IO_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

