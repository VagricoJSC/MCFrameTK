
COMMENT ON TABLE MGT_IO_ALL IS '原価受払表 // T account';


COMMENT ON COLUMN MGT_IO_ALL.CALC_NO IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN MGT_IO_ALL.CALC_GRP_CD IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN MGT_IO_ALL.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MGT_IO_ALL.YM IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN MGT_IO_ALL.MNG_DPT_CD IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN MGT_IO_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MGT_IO_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MGT_IO_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MGT_IO_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MGT_IO_ALL.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MGT_IO_ALL.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MGT_IO_ALL.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MGT_IO_ALL.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MGT_IO_ALL.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MGT_IO_ALL.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MGT_IO_ALL.ASST_TYP IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN MGT_IO_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MGT_IO_ALL.STD_QTY IS '基準数量 // #MA.QTY // Base qty.';


COMMENT ON COLUMN MGT_IO_ALL.AVE_UPRI IS '総平均単価 // #MA.MONEY // Weighted average unit price';


COMMENT ON COLUMN MGT_IO_ALL.STD_UPRI IS '標準単価 // #MA.MONEY // Standard unit cost';


COMMENT ON COLUMN MGT_IO_ALL.ST_STK_QTY IS '月初在庫数量 // #MA.QTY // Beginning inventory qty.';


COMMENT ON COLUMN MGT_IO_ALL.ST_STK_AMT IS '月初在庫原価 // #MA.MONEY // Beginning inventory cost';


COMMENT ON COLUMN MGT_IO_ALL.MFG_QTY IS '製造数量 // #MA.QTY // Mfg. qty.';


COMMENT ON COLUMN MGT_IO_ALL.MFG_AMT IS '製造原価 // #MA.MONEY // Mfg. cost';


COMMENT ON COLUMN MGT_IO_ALL.PURC_QTY IS '購買数量 // #MA.QTY // Purchase qty.';


COMMENT ON COLUMN MGT_IO_ALL.PURC_AMT IS '購買原価 // #MA.MONEY // Purchase cost';


COMMENT ON COLUMN MGT_IO_ALL.MFG_GR_QTY IS '製造受入数量 // #MA.QTY // Mfg. receipt qty.';


COMMENT ON COLUMN MGT_IO_ALL.MFG_GR_AMT IS '製造受入原価 // #MA.MONEY // Mfg. receipt cost';


COMMENT ON COLUMN MGT_IO_ALL.OTHR_GR_QTY IS '入庫数量 // #MA.QTY // GR qty.';


COMMENT ON COLUMN MGT_IO_ALL.OTHR_GR_AMT IS '入庫原価 // #MA.MONEY // GR cost';


COMMENT ON COLUMN MGT_IO_ALL.ALC_AMT IS '配賦原価 // #MA.MONEY // Allocation cost';


COMMENT ON COLUMN MGT_IO_ALL.INPT_QTY IS '投入数量 // #MA.QTY // Input qty.';


COMMENT ON COLUMN MGT_IO_ALL.INPT_AMT IS '投入原価 // #MA.MONEY // Input cost';


COMMENT ON COLUMN MGT_IO_ALL.PLNT_GI_QTY IS '販売倉入数量 // #MA.QTY // Sales warehousing qty.';


COMMENT ON COLUMN MGT_IO_ALL.PLNT_GI_AMT IS '販売倉入原価 // #MA.MONEY // Sales warehousing cost';


COMMENT ON COLUMN MGT_IO_ALL.OTHR_GI_QTY IS '出庫数量 // #MA.QTY // GI qty.';


COMMENT ON COLUMN MGT_IO_ALL.OTHR_GI_AMT IS '出庫原価 // #MA.MONEY // GI cost';


COMMENT ON COLUMN MGT_IO_ALL.PROV_QTY IS '有償支給数量 // #MA.QTY // Chargeable supply qty.';


COMMENT ON COLUMN MGT_IO_ALL.PROV_AMT IS '有償支給原価 // #MA.MONEY // Chargeable supply cost';


COMMENT ON COLUMN MGT_IO_ALL.SLS_QTY IS '売上数量 // #MA.QTY // Sales qty.';


COMMENT ON COLUMN MGT_IO_ALL.SLS_AMT IS '売上原価 // #MA.MONEY // Cost of goods sold';


COMMENT ON COLUMN MGT_IO_ALL.END_STK_QTY IS '月末在庫数量 // #MA.QTY // Ending inventory qty.';


COMMENT ON COLUMN MGT_IO_ALL.END_STK_AMT IS '月末在庫原価 // #MA.MONEY // Ending inventory cost';


COMMENT ON COLUMN MGT_IO_ALL.DIFF_QTY IS '数量差 // #MA.QTY // Quantity difference';


COMMENT ON COLUMN MGT_IO_ALL.DIFF_AMT IS '金額差 // #MA.MONEY // Amount variance';


COMMENT ON COLUMN MGT_IO_ALL.XPNS_INPT_QTY IS '経費投入数量 // #MA.QTY // Expenses input qty.';


COMMENT ON COLUMN MGT_IO_ALL.XPNS_INPT_AMT IS '経費投入原価 // #MA.MONEY // Expenses input costs';


COMMENT ON COLUMN MGT_IO_ALL.YM_SUB IS '年月サブ // #MA.YM // Year month sub';


COMMENT ON COLUMN MGT_IO_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MGT_IO_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MGT_IO_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MGT_IO_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MGT_IO_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MGT_IO_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MGT_IO_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MGT_IO_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MGT_IO_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MGT_IO_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

