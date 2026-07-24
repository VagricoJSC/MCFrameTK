\encoding UTF-8

COMMENT ON TABLE mgt_io_all IS '原価受払表 // T account';


COMMENT ON COLUMN mgt_io_all.calc_no IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN mgt_io_all.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mgt_io_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_io_all.ym IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN mgt_io_all.mng_dpt_cd IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN mgt_io_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgt_io_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgt_io_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgt_io_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgt_io_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mgt_io_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mgt_io_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mgt_io_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mgt_io_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mgt_io_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mgt_io_all.asst_typ IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN mgt_io_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mgt_io_all.std_qty IS '基準数量 // #MA.QTY // Base qty.';


COMMENT ON COLUMN mgt_io_all.ave_upri IS '総平均単価 // #MA.MONEY // Weighted average unit price';


COMMENT ON COLUMN mgt_io_all.std_upri IS '標準単価 // #MA.MONEY // Standard unit cost';


COMMENT ON COLUMN mgt_io_all.st_stk_qty IS '月初在庫数量 // #MA.QTY // Beginning inventory qty.';


COMMENT ON COLUMN mgt_io_all.st_stk_amt IS '月初在庫原価 // #MA.MONEY // Beginning inventory cost';


COMMENT ON COLUMN mgt_io_all.mfg_qty IS '製造数量 // #MA.QTY // Mfg. qty.';


COMMENT ON COLUMN mgt_io_all.mfg_amt IS '製造原価 // #MA.MONEY // Mfg. cost';


COMMENT ON COLUMN mgt_io_all.purc_qty IS '購買数量 // #MA.QTY // Purchase qty.';


COMMENT ON COLUMN mgt_io_all.purc_amt IS '購買原価 // #MA.MONEY // Purchase cost';


COMMENT ON COLUMN mgt_io_all.mfg_gr_qty IS '製造受入数量 // #MA.QTY // Mfg. receipt qty.';


COMMENT ON COLUMN mgt_io_all.mfg_gr_amt IS '製造受入原価 // #MA.MONEY // Mfg. receipt cost';


COMMENT ON COLUMN mgt_io_all.othr_gr_qty IS '入庫数量 // #MA.QTY // GR qty.';


COMMENT ON COLUMN mgt_io_all.othr_gr_amt IS '入庫原価 // #MA.MONEY // GR cost';


COMMENT ON COLUMN mgt_io_all.alc_amt IS '配賦原価 // #MA.MONEY // Allocation cost';


COMMENT ON COLUMN mgt_io_all.inpt_qty IS '投入数量 // #MA.QTY // Input qty.';


COMMENT ON COLUMN mgt_io_all.inpt_amt IS '投入原価 // #MA.MONEY // Input cost';


COMMENT ON COLUMN mgt_io_all.plnt_gi_qty IS '販売倉入数量 // #MA.QTY // Sales warehousing qty.';


COMMENT ON COLUMN mgt_io_all.plnt_gi_amt IS '販売倉入原価 // #MA.MONEY // Sales warehousing cost';


COMMENT ON COLUMN mgt_io_all.othr_gi_qty IS '出庫数量 // #MA.QTY // GI qty.';


COMMENT ON COLUMN mgt_io_all.othr_gi_amt IS '出庫原価 // #MA.MONEY // GI cost';


COMMENT ON COLUMN mgt_io_all.prov_qty IS '有償支給数量 // #MA.QTY // Chargeable supply qty.';


COMMENT ON COLUMN mgt_io_all.prov_amt IS '有償支給原価 // #MA.MONEY // Chargeable supply cost';


COMMENT ON COLUMN mgt_io_all.sls_qty IS '売上数量 // #MA.QTY // Sales qty.';


COMMENT ON COLUMN mgt_io_all.sls_amt IS '売上原価 // #MA.MONEY // Cost of goods sold';


COMMENT ON COLUMN mgt_io_all.end_stk_qty IS '月末在庫数量 // #MA.QTY // Ending inventory qty.';


COMMENT ON COLUMN mgt_io_all.end_stk_amt IS '月末在庫原価 // #MA.MONEY // Ending inventory cost';


COMMENT ON COLUMN mgt_io_all.diff_qty IS '数量差 // #MA.QTY // Quantity difference';


COMMENT ON COLUMN mgt_io_all.diff_amt IS '金額差 // #MA.MONEY // Amount variance';


COMMENT ON COLUMN mgt_io_all.xpns_inpt_qty IS '経費投入数量 // #MA.QTY // Expenses input qty.';


COMMENT ON COLUMN mgt_io_all.xpns_inpt_amt IS '経費投入原価 // #MA.MONEY // Expenses input costs';


COMMENT ON COLUMN mgt_io_all.ym_sub IS '年月サブ // #MA.YM // Year month sub';


COMMENT ON COLUMN mgt_io_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_io_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_io_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_io_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_io_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_io_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_io_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_io_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_io_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_io_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

