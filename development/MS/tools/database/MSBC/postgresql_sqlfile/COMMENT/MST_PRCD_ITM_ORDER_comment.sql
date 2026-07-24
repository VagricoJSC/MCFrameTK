\encoding UTF-8

COMMENT ON VIEW mst_prcd_itm_order IS '先行手配品目オーダ情報 // Long LT item order info.';


COMMENT ON COLUMN mst_prcd_itm_order.itm_ord_no IS '品目オーダＮＯ // #MA.ITM_ORD_NO // Item order No.';


COMMENT ON COLUMN mst_prcd_itm_order.itm_ord_typ IS 'オーダ区分 // #MS.ITM_ORD_TYP // Order type';


COMMENT ON COLUMN mst_prcd_itm_order.ord_gnrt_typ IS 'オーダ生成区分 // #MS.ORD_GNRT_TYP // Order generation type';


COMMENT ON COLUMN mst_prcd_itm_order.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_prcd_itm_order.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_prcd_itm_order.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_prcd_itm_order.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_prcd_itm_order.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN mst_prcd_itm_order.strg_loc_cd IS '格納場所ＣＤ // #MA.LOC_CD // Storage location cd.';


COMMENT ON COLUMN mst_prcd_itm_order.mfg_loc_cd IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN mst_prcd_itm_order.mst_mfg_loc_cd IS 'マスタ製造場所ＣＤ // #MA.LOC_CD // Master mfg. location cd.';


COMMENT ON COLUMN mst_prcd_itm_order.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mst_prcd_itm_order.maker_cd IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN mst_prcd_itm_order.rqst_loc_cd IS '依頼先場所ＣＤ // #MA.LOC_CD // Requested location cd.';


COMMENT ON COLUMN mst_prcd_itm_order.rqst_wg_cd IS '依頼先ワーキンググループＣＤ // #MA.WG_CD // Requested WG cd.';


COMMENT ON COLUMN mst_prcd_itm_order.bom_ptn IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN mst_prcd_itm_order.oper_ptn IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN mst_prcd_itm_order.inst_qty IS '指図予定数量 // #MA.QTY // Order scheduled qty.';


COMMENT ON COLUMN mst_prcd_itm_order.yield_schd_qty IS '出来高予定数量 // #MA.QTY // Output scheduled qty.';


COMMENT ON COLUMN mst_prcd_itm_order.not_inst_qty IS '未指図数量 // #MA.QTY // Unordered qty.';


COMMENT ON COLUMN mst_prcd_itm_order.mfg_inst_unit_typ IS '製造指図単位区分 // #MA.MFG_INST_UNIT_TYP // Mfg. order unit type';


COMMENT ON COLUMN mst_prcd_itm_order.inst_yield_schd_qty IS '出来高予定数量（指図・発注） // #MA.QTY // Output scheduled qty. (Order/PO)';


COMMENT ON COLUMN mst_prcd_itm_order.yield_act_qty IS '出来高実績数量（入荷・出来高） // #MA.QTY // Output result qty. (Receipt/output)';


COMMENT ON COLUMN mst_prcd_itm_order.purc_act_qty IS '仕入実績数量 // #MA.QTY // Purchase result qty.';


COMMENT ON COLUMN mst_prcd_itm_order.insp_act_qty IS '検査実績数量 // #MA.QTY // Inspection result qty.';


COMMENT ON COLUMN mst_prcd_itm_order.nmr_qty IS '歩留分子 // #MA.QTY // Yield numerator';


COMMENT ON COLUMN mst_prcd_itm_order.dnm_qty IS '歩留分母 // #MA.QTY // Yield denominator';


COMMENT ON COLUMN mst_prcd_itm_order.fxd_yield_qty IS '固定歩留数量 // #MA.QTY // Constant yield qty.';


COMMENT ON COLUMN mst_prcd_itm_order.itm_ord_sts_typ IS '品目オーダ状況区分 // #MS.ITM_ORD_STS_TYP // Item order status type';


COMMENT ON COLUMN mst_prcd_itm_order.fix_dt IS '確定日 // #MA.DT // Firm date';


COMMENT ON COLUMN mst_prcd_itm_order.blk_flg IS 'まとめＦＬＧ // #MA.FLG // Aggregation flg.';


COMMENT ON COLUMN mst_prcd_itm_order.po_schd_dt IS '発注予定日 // #MA.DT // Scheduled PO date';


COMMENT ON COLUMN mst_prcd_itm_order.mrp_po_schd_dt IS '発注予定日（ＭＲＰ） // #MA.DT // Scheduled PO date (MRP)';


COMMENT ON COLUMN mst_prcd_itm_order.po_dt IS '発注日 // #MA.DT // PO date';


COMMENT ON COLUMN mst_prcd_itm_order.mrp_purc_lt IS '購入ＬＴ（ＭＲＰ） // #MA.LT // Purchase LT (MRP)';


COMMENT ON COLUMN mst_prcd_itm_order.purc_lt IS '購入ＬＴ // #MA.LT // Purchase LT';


COMMENT ON COLUMN mst_prcd_itm_order.act_purc_lt IS '購入ＬＴ（実績） // #MA.LT // Purchase LT (Result)';


COMMENT ON COLUMN mst_prcd_itm_order.mfg_st_schd_dt IS '製造着手予定日 // #MA.DT // Scheduled mfg. start date';


COMMENT ON COLUMN mst_prcd_itm_order.mrp_mfg_st_schd_dt IS '製造着手予定日（ＭＲＰ） // #MA.DT // Scheduled mfg. start date (MRP)';


COMMENT ON COLUMN mst_prcd_itm_order.inst_mfg_st_schd_dt IS '製造着手予定日（指図） // #MA.DT // Scheduled mfg. start date (Order)';


COMMENT ON COLUMN mst_prcd_itm_order.mfg_st_act_dt IS '製造着手実績日 // #MA.DT // Actual mfg. start date';


COMMENT ON COLUMN mst_prcd_itm_order.mfg_end_schd_dt IS '製造終了予定日 // #MA.DT // Scheduled mfg. end date';


COMMENT ON COLUMN mst_prcd_itm_order.mrp_mfg_end_schd_dt IS '製造終了予定日（ＭＲＰ） // #MA.DT // Scheduled mfg. end date (MRP)';


COMMENT ON COLUMN mst_prcd_itm_order.inst_mfg_end_schd_dt IS '製造終了予定日（指図） // #MA.DT // Scheduled mfg. end date (Order)';


COMMENT ON COLUMN mst_prcd_itm_order.mfg_end_act_dt IS '製造終了実績日 // #MA.DT // Actual mfg. end date';


COMMENT ON COLUMN mst_prcd_itm_order.mrp_mfg_lt IS '製造ＬＴ（ＭＲＰ） // #MA.LT // Mfg. LT (MRP)';


COMMENT ON COLUMN mst_prcd_itm_order.mfg_lt IS '製造ＬＴ // #MA.LT // Mfg. LT';


COMMENT ON COLUMN mst_prcd_itm_order.act_mfg_lt IS '製造ＬＴ（実績） // #MA.LT // Mfg. LT (Result)';


COMMENT ON COLUMN mst_prcd_itm_order.gi_schd_dt IS '出庫予定日 // #MA.DT // Scheduled GI date';


COMMENT ON COLUMN mst_prcd_itm_order.mrp_gi_schd_dt IS '出庫予定日（ＭＲＰ） // #MA.DT // Scheduled GI date (MRP)';


COMMENT ON COLUMN mst_prcd_itm_order.inst_gi_schd_dt IS '出庫予定日（指図） // #MA.DT // Scheduled GI date (Order)';


COMMENT ON COLUMN mst_prcd_itm_order.gi_act_dt IS '出庫実績日 // #MA.DT // Actual GI date';


COMMENT ON COLUMN mst_prcd_itm_order.strg_schd_dt IS '格納完了予定日 // #MA.DT // Scheduled storage completion date';


COMMENT ON COLUMN mst_prcd_itm_order.mrp_strg_schd_dt IS '格納完了予定日（ＭＲＰ） // #MA.DT // Scheduled storage completion date (MRP)';


COMMENT ON COLUMN mst_prcd_itm_order.inst_strg_schd_dt IS '格納完了予定日（指図・発注） // #MA.DT // Scheduled storage completion date (Order/PO)';


COMMENT ON COLUMN mst_prcd_itm_order.strg_act_dt IS '格納完了実績日 // #MA.DT // Actual storage completion date';


COMMENT ON COLUMN mst_prcd_itm_order.xfr_lt IS '移動ＬＴ // #MA.LT // Movement LT';


COMMENT ON COLUMN mst_prcd_itm_order.accpt_schd_dt IS '検収予定日 // #MA.DT // Scheduled acceptance date';


COMMENT ON COLUMN mst_prcd_itm_order.mrp_accpt_schd_dt IS '検収予定日（ＭＲＰ） // #MA.DT // Scheduled acceptance date (MRP)';


COMMENT ON COLUMN mst_prcd_itm_order.inst_accpt_schd_dt IS '検収予定日（発注） // #MA.DT // Scheduled acceptance date (PO)';


COMMENT ON COLUMN mst_prcd_itm_order.accpt_act_dt IS '検収実績日 // #MA.DT // Actual acceptance date';


COMMENT ON COLUMN mst_prcd_itm_order.accpt_insp_lt IS '検収ＬＴ // #MA.LT // Acceptance LT';


COMMENT ON COLUMN mst_prcd_itm_order.insp_st_schd_dt IS '検査着手予定日 // #MA.DT // Scheduled inspection start date';


COMMENT ON COLUMN mst_prcd_itm_order.mrp_insp_st_schd_dt IS '検査着手予定日（ＭＲＰ） // #MA.DT // Scheduled inspection start date (MRP)';


COMMENT ON COLUMN mst_prcd_itm_order.inst_insp_st_schd_dt IS '検査着手予定日（指図・発注） // #MA.DT // Scheduled inspection start date (Order/PO)';


COMMENT ON COLUMN mst_prcd_itm_order.insp_st_act_dt IS '検査着手実績日 // #MA.DT // Actual inspection start date';


COMMENT ON COLUMN mst_prcd_itm_order.insp_end_schd_dt IS '検査終了予定日 // #MA.DT // Scheduled inspection end date';


COMMENT ON COLUMN mst_prcd_itm_order.mrp_insp_end_schd_dt IS '検査終了予定日（ＭＲＰ） // #MA.DT // Scheduled inspection end date (MRP)';


COMMENT ON COLUMN mst_prcd_itm_order.inst_insp_end_schd_dt IS '検査終了予定日（指図・発注） // #MA.DT // Scheduled inspection end date (Order/PO)';


COMMENT ON COLUMN mst_prcd_itm_order.insp_end_act_dt IS '検査終了実績日 // #MA.DT // Actual inspection end date';


COMMENT ON COLUMN mst_prcd_itm_order.insp_lt IS '検査ＬＴ // #MA.LT // Inspection LT';


COMMENT ON COLUMN mst_prcd_itm_order.insp_offst IS '検査オフセット // #MA.OFFST // Inspection offset';


COMMENT ON COLUMN mst_prcd_itm_order.mrp_avl_schd_dt IS '使用可能予定日（ＭＲＰ） // #MA.DT // Available date (MRP)';


COMMENT ON COLUMN mst_prcd_itm_order.avl_schd_dt IS '使用可能予定日 // #MA.DT // Available date';


COMMENT ON COLUMN mst_prcd_itm_order.master_dt IS 'マスタ適用日 // #MA.DT // Master application date';


COMMENT ON COLUMN mst_prcd_itm_order.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_prcd_itm_order.sno_typ1 IS '手配ＮＯ１区分 // #MA.SNO_TYP // SEIBAN No. 1 type';


COMMENT ON COLUMN mst_prcd_itm_order.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_prcd_itm_order.sno_typ2 IS '手配ＮＯ２区分 // #MA.SNO_TYP // SEIBAN No. 2 type';


COMMENT ON COLUMN mst_prcd_itm_order.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_prcd_itm_order.sno_typ3 IS '手配ＮＯ３区分 // #MA.SNO_TYP // SEIBAN No. 3 type';


COMMENT ON COLUMN mst_prcd_itm_order.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_prcd_itm_order.sno_typ4 IS '手配ＮＯ４区分 // #MA.SNO_TYP // SEIBAN No. 4 type';


COMMENT ON COLUMN mst_prcd_itm_order.lmt_dt IS '期限切れ日 // #MA.DT // Expired date';


COMMENT ON COLUMN mst_prcd_itm_order.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_prcd_itm_order.not_fix_flg IS '手配不許可ＦＬＧ // #MA.FLG // Disallow procurement flg.';


COMMENT ON COLUMN mst_prcd_itm_order.ord_fix_pd IS 'オーダ自動確定期間（日） // #MA.ORD_FIX_PD // Order auto-firming period (Date)';


COMMENT ON COLUMN mst_prcd_itm_order.rqmt_no IS '所要ＮＯ // #MA.RQMT_NO // Requirements No.';


COMMENT ON COLUMN mst_prcd_itm_order.inst_po_cnt_rmrks IS '指図・発注連絡備考 // #MS.INST_PO_CNT_RMRKS // Order/PO contact remarks';


COMMENT ON COLUMN mst_prcd_itm_order.sim_mrp_no IS 'シミュレーションＮＯ // #MA.SIM_MRP_NO // Simulation No.';


COMMENT ON COLUMN mst_prcd_itm_order.io_schd_pr_no IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN mst_prcd_itm_order.intr_rmrks IS '内部備考 // #MS.IORD_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_prcd_itm_order.sub_char1 IS '予備１ // #MS.IORD_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_prcd_itm_order.sub_char2 IS '予備２ // #MS.IORD_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_prcd_itm_order.sub_char3 IS '予備３ // #MS.IORD_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_prcd_itm_order.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_prcd_itm_order.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_prcd_itm_order.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_prcd_itm_order.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_prcd_itm_order.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_prcd_itm_order.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_prcd_itm_order.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_prcd_itm_order.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_prcd_itm_order.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_prcd_itm_order.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

