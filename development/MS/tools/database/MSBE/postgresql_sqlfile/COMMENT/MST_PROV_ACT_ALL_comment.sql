\encoding UTF-8

COMMENT ON TABLE mst_prov_act_all IS '支給実績 // Supply result';


COMMENT ON COLUMN mst_prov_act_all.prov_act_no IS '支給実績ＮＯ // #MA.PROV_ACT_NO // Supply result No.';


COMMENT ON COLUMN mst_prov_act_all.prov_act_seq IS '支給実績連番 // #MA.SLIP_SEQ // Supply result sequence number';


COMMENT ON COLUMN mst_prov_act_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_prov_act_all.prov_act_rev IS '支給実績改訂番号 // #MA.SLIP_REV // Supply result rev. number';


COMMENT ON COLUMN mst_prov_act_all.slip_sts_typ IS '伝票状況区分 // #MA.SLIP_STS_TYP // Slip status type';


COMMENT ON COLUMN mst_prov_act_all.prov_schd_no IS '支給予定ＮＯ // #MA.PROV_SCHD_NO // Supply schedule No.';


COMMENT ON COLUMN mst_prov_act_all.prov_src_act_typ IS '支給元実績区分 // #MS.PROV_SRC_ACT_TYP // Supply-from result type';


COMMENT ON COLUMN mst_prov_act_all.prov_src_act_no IS '支給元実績ＮＯ // #MA.PROV_SRC_ACT_NO // Supply-from result No.';


COMMENT ON COLUMN mst_prov_act_all.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_prov_act_all.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_prov_act_all.xfr_rsn_cd IS '移送理由ＣＤ // #MA.BIZ_RSN_CD // Transport reason cd.';


COMMENT ON COLUMN mst_prov_act_all.stk_mng_typ IS '在庫管理区分 // #MA.STK_MNG_TYP // Inventory management type';


COMMENT ON COLUMN mst_prov_act_all.sno1_mng_typ IS '手配ＮＯ１管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 1 management type';


COMMENT ON COLUMN mst_prov_act_all.sno2_mng_typ IS '手配ＮＯ２管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 2 management type';


COMMENT ON COLUMN mst_prov_act_all.sno3_mng_typ IS '手配ＮＯ３管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 3 management type';


COMMENT ON COLUMN mst_prov_act_all.sno4_mng_typ IS '手配ＮＯ４管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 4 management type';


COMMENT ON COLUMN mst_prov_act_all.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_prov_act_all.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_prov_act_all.pack_unit_cd IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN mst_prov_act_all.pack_unit_qty IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN mst_prov_act_all.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_prov_act_all.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_prov_act_all.accpt_dt IS '検収日 // #MA.DT // Acceptance date';


COMMENT ON COLUMN mst_prov_act_all.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mst_prov_act_all.ac_ym IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN mst_prov_act_all.dlv_slip_no IS '納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No.';


COMMENT ON COLUMN mst_prov_act_all.dlv_slip_d_no IS '納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN mst_prov_act_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_prov_act_all.prsppl_cd IS '支給先ＣＤ // #MA.BP_CD // Subcontractor cd.';


COMMENT ON COLUMN mst_prov_act_all.ap_dpt_cd IS '債務部門ＣＤ // #MA.DPT_CD // AP dept. cd.';


COMMENT ON COLUMN mst_prov_act_all.prov_typ IS '支給区分 // #MA.PROV_TYP // Supply type';


COMMENT ON COLUMN mst_prov_act_all.prov_basis_typ IS '支給計上区分 // #MA.PROV_BASIS_TYP // Supply recording type';


COMMENT ON COLUMN mst_prov_act_all.xrate_cd IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN mst_prov_act_all.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mst_prov_act_all.ptax_xrate IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN mst_prov_act_all.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_prov_act_all.base_cur_cd IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN mst_prov_act_all.ptax_cur_cd IS '納税通貨ＣＤ // #MA.CUR_CD // Taxpaying currency cd.';


COMMENT ON COLUMN mst_prov_act_all.tax_cd IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN mst_prov_act_all.trd_cur_upri IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN mst_prov_act_all.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mst_prov_act_all.trd_cur_tax_amt IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN mst_prov_act_all.base_cur_upri IS '基準通貨単価 // #MA.MONEY // Unit price (Base currency)';


COMMENT ON COLUMN mst_prov_act_all.base_cur_amt IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN mst_prov_act_all.base_cur_tax_amt IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN mst_prov_act_all.ptax_cur_upri IS '納税通貨単価 // #MA.MONEY // Unit price (Tax currency)';


COMMENT ON COLUMN mst_prov_act_all.ptax_cur_amt IS '納税通貨金額 // #MA.MONEY // Amount (Tax currency)';


COMMENT ON COLUMN mst_prov_act_all.ptax_cur_tax_amt IS '納税通貨税額 // #MA.MONEY // Tax amount (Tax currency)';


COMMENT ON COLUMN mst_prov_act_all.wtax_rate IS '源泉税率 // #MA.WTAX_RATE // Withholding tax rate';


COMMENT ON COLUMN mst_prov_act_all.wtax_amt IS '源泉税額 // #MA.MONEY // Withholding tax';


COMMENT ON COLUMN mst_prov_act_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_prov_act_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_prov_act_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_prov_act_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_prov_act_all.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mst_prov_act_all.str_ln_cd IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN mst_prov_act_all.stk_arrv_bp_cd IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN mst_prov_act_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_prov_act_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_prov_act_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_prov_act_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_prov_act_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_prov_act_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_prov_act_all.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_prov_act_all.quality_typ IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN mst_prov_act_all.stk_insp_typ IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN mst_prov_act_all.stk_id_typ IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN mst_prov_act_all.stk_bp_cd IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN mst_prov_act_all.upd_flg IS '更新ＦＬＧ // #MA.FLG // Update flg.';


COMMENT ON COLUMN mst_prov_act_all.intr_rmrks IS '内部備考 // #MS.PROV_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_prov_act_all.trd_d_rmrks IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN mst_prov_act_all.sub_char1 IS '予備１ // #MS.PROV_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_prov_act_all.sub_char2 IS '予備２ // #MS.PROV_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_prov_act_all.sub_char3 IS '予備３ // #MS.PROV_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_prov_act_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_prov_act_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_prov_act_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_prov_act_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_prov_act_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_prov_act_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_prov_act_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_prov_act_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_prov_act_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_prov_act_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mst_prov_act_all.base_ac_dt IS '支給計上日（基） // #MA.DT // Supply recording date (Base)';

