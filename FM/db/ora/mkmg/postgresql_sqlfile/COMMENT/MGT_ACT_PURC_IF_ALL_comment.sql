\encoding UTF-8

COMMENT ON TABLE mgt_act_purc_if_all IS '購買実績ＩＦ // Purchase result IF';


COMMENT ON COLUMN mgt_act_purc_if_all.data_lno IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN mgt_act_purc_if_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mgt_act_purc_if_all.calc_ctg_cd IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN mgt_act_purc_if_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_act_purc_if_all.ym IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN mgt_act_purc_if_all.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mgt_act_purc_if_all.mng_dpt_cd IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN mgt_act_purc_if_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgt_act_purc_if_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgt_act_purc_if_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgt_act_purc_if_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgt_act_purc_if_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mgt_act_purc_if_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mgt_act_purc_if_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mgt_act_purc_if_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mgt_act_purc_if_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mgt_act_purc_if_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mgt_act_purc_if_all.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mgt_act_purc_if_all.po_no IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN mgt_act_purc_if_all.slo_no IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN mgt_act_purc_if_all.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mgt_act_purc_if_all.alc_dpt_cd IS '配賦部門ＣＤ // #MA.COST_DPT_CD // Allocation dept. cd.';


COMMENT ON COLUMN mgt_act_purc_if_all.ac_slip_typ IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN mgt_act_purc_if_all.ac_rsn_cd IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN mgt_act_purc_if_all.asst_typ IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN mgt_act_purc_if_all.qty IS '数量 // #MA.QTY // Quantity';


COMMENT ON COLUMN mgt_act_purc_if_all.amt IS '金額 // #MA.MONEY // Amount';


COMMENT ON COLUMN mgt_act_purc_if_all.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mgt_act_purc_if_all.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mgt_act_purc_if_all.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mgt_act_purc_if_all.expns_cd IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN mgt_act_purc_if_all.alc_loc_cd IS '配賦場所ＣＤ // #MA.LOC_CD // Allocation location cd.';


COMMENT ON COLUMN mgt_act_purc_if_all.alc_oper_cd IS '配賦工程ＣＤ // #MA.OPER_CD // Allocation operation cd.';


COMMENT ON COLUMN mgt_act_purc_if_all.alc_ctg_cd IS '配賦品群ＣＤ // #MA.COST_CTG_CD // Allocation item category cd.';


COMMENT ON COLUMN mgt_act_purc_if_all.alc_val1 IS '配賦基準値１ // #MA.ALC_VAL1 // Allocation value 1';


COMMENT ON COLUMN mgt_act_purc_if_all.alc_val2 IS '配賦基準値２ // #MA.ALC_VAL2 // Allocation value 2';


COMMENT ON COLUMN mgt_act_purc_if_all.alc_val3 IS '配賦基準値３ // #MA.ALC_VAL3 // Allocation value 3';


COMMENT ON COLUMN mgt_act_purc_if_all.alc_val4 IS '配賦基準値４ // #MA.ALC_VAL4 // Allocation value 4';


COMMENT ON COLUMN mgt_act_purc_if_all.alc_val5 IS '配賦基準値５ // #MA.ALC_VAL5 // Allocation value 5';


COMMENT ON COLUMN mgt_act_purc_if_all.no_pln_flg IS '計画対象外ＦＬＧ // #MA.FLG // Not to plan flg.';


COMMENT ON COLUMN mgt_act_purc_if_all.no_itm_info_flg IS '品目情報対象外ＦＬＧ // #MA.FLG // Not for item info. flg.';


COMMENT ON COLUMN mgt_act_purc_if_all.no_eval_flg IS '評価単価対象外ＦＬＧ // #MA.FLG // Not for evaluation unit price flg.';


COMMENT ON COLUMN mgt_act_purc_if_all.slip_no IS '伝票ＮＯ // #MA.SLIP_NO // Slip No.';


COMMENT ON COLUMN mgt_act_purc_if_all.slip_seq_no IS '伝票連番 // #MA.SLIP_SEQ // Slip sequence number';


COMMENT ON COLUMN mgt_act_purc_if_all.rmrks IS '備考 // #MG.ACT_PURC_IF_RMRKS // Remarks';


COMMENT ON COLUMN mgt_act_purc_if_all.sub_char1 IS '予備１ // #MG.ACT_PURC_IF_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mgt_act_purc_if_all.sub_char2 IS '予備２ // #MG.ACT_PURC_IF_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mgt_act_purc_if_all.sub_char3 IS '予備３ // #MG.ACT_PURC_IF_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mgt_act_purc_if_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_act_purc_if_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_act_purc_if_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_act_purc_if_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_act_purc_if_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_act_purc_if_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_act_purc_if_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_act_purc_if_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_act_purc_if_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_act_purc_if_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

