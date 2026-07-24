\encoding UTF-8

COMMENT ON VIEW mam_co_parm IS '原価会社パラメータマスタ // Cost company parameter master';


COMMENT ON COLUMN mam_co_parm.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mam_co_parm.std_rnd_typ IS '標準端数処理区分 // #MA.RND_TYP // Rounding type (Standard)';


COMMENT ON COLUMN mam_co_parm.std_dec_place IS '標準小数部有効桁数 // #MA.DEC_PLACE // Standard number of decimal places';


COMMENT ON COLUMN mam_co_parm.amt_rnd_typ IS '金額端数処理区分 // #MA.RND_TYP // Rounding type (Amount)';


COMMENT ON COLUMN mam_co_parm.amt_dec_place IS '金額小数部有効桁数 // #MA.DEC_PLACE // Amount number of decimal places';


COMMENT ON COLUMN mam_co_parm.ave_rnd_typ IS '単価端数処理区分 // #MA.RND_TYP // Rounding type (Unit price)';


COMMENT ON COLUMN mam_co_parm.ave_dec_place IS '単価小数部有効桁数 // #MA.DEC_PLACE // Unit price number of decimal places';


COMMENT ON COLUMN mam_co_parm.adj_typ IS '端数調整区分 // #MA.ADJ_TYP // Fraction adjustment type';


COMMENT ON COLUMN mam_co_parm.mrgn_expns_cd IS '調整費目ＣＤ // #MA.EXPNS_CD // Adjustment cost element cd.';


COMMENT ON COLUMN mam_co_parm.purc_expns_cd IS '購買費目ＣＤ // #MA.EXPNS_CD // Purchase cost element item cd.';


COMMENT ON COLUMN mam_co_parm.out_expns_cd IS '外注費目ＣＤ // #MA.EXPNS_CD // Subcontract cost element cd.';


COMMENT ON COLUMN mam_co_parm.inpt_expns_cd IS '投入費目ＣＤ // #MA.EXPNS_CD // Input cost element cd.';


COMMENT ON COLUMN mam_co_parm.ss_expns_cd IS '自給費目ＣＤ // #MA.EXPNS_CD // Self supply cost element cd.';


COMMENT ON COLUMN mam_co_parm.prov_expns_cd IS '有償差額費目ＣＤ // #MA.EXPNS_CD // Cost element cd. for gain or loss of chargeable item';


COMMENT ON COLUMN mam_co_parm.pre_alc_max_lvl IS '一次配賦最大配賦階層 // #MA.PRE_ALC_MAX_LVL // Departmental alloc. max. allocation hierarchy';


COMMENT ON COLUMN mam_co_parm.pre_alc_max_rec IS '一次配賦最大レコード数 // #MA.PRE_ALC_MAX_REC // Departmental alloc. max. number of records';


COMMENT ON COLUMN mam_co_parm.diff_use_typ IS '差異使用区分 // #MA.DIFF_USE_TYP // Variance use type';


COMMENT ON COLUMN mam_co_parm.def_calc_ctg_cd IS 'デフォルト計算カテゴリＣＤ // #MA.CALC_CTG_CD // Default calculation category cd.';


COMMENT ON COLUMN mam_co_parm.fix_dpt_cd IS '固定管理部門ＣＤ // #MA.COST_DPT_CD // Constant management dept. cd.';


COMMENT ON COLUMN mam_co_parm.lot_use_typ IS 'ロットＮＯ生販使用区分 // #MA.PS_USE_TYP // Lot No. use type for production/sales';


COMMENT ON COLUMN mam_co_parm.sublot_use_typ IS 'サブロットＮＯ生販使用区分 // #MA.PS_USE_TYP // Sublot No. use type for production/sales';


COMMENT ON COLUMN mam_co_parm.sno1_use_typ IS '手配ＮＯ１生販使用区分 // #MA.PS_USE_TYP // SEIBAN No. 1 production/sales use type';


COMMENT ON COLUMN mam_co_parm.sno2_use_typ IS '手配ＮＯ２生販使用区分 // #MA.PS_USE_TYP // SEIBAN No. 2 production/sales use type';


COMMENT ON COLUMN mam_co_parm.sno3_use_typ IS '手配ＮＯ３生販使用区分 // #MA.PS_USE_TYP // SEIBAN No. 3 production/sales use type';


COMMENT ON COLUMN mam_co_parm.sno4_use_typ IS '手配ＮＯ４生販使用区分 // #MA.PS_USE_TYP // SEIBAN No. 4 production/sales use type';


COMMENT ON COLUMN mam_co_parm.trd_ratio_flg IS '振替比率設定時に標準単価を使用する // #MA.FLG // Use standard unit cost at transfer ratio setting';


COMMENT ON COLUMN mam_co_parm.stop_slip_flg IS '取り消した伝票を取り込む // #MA.FLG // Take in canceled slip';


COMMENT ON COLUMN mam_co_parm.non_prod_flg IS '生産データを取り込まない // #MA.FLG // Do not import production data';


COMMENT ON COLUMN mam_co_parm.oper_sum_flg IS '工程ＣＤを工程実績ＮＯとして取り込む // #MA.FLG // Import operation cd. as operation result No.';


COMMENT ON COLUMN mam_co_parm.non_sls_flg IS '販売データを取り込まない // #MA.FLG // Do not import sales data';


COMMENT ON COLUMN mam_co_parm.asst_flg IS '販売資産を生産資産として取り込む // #MA.FLG // Import sales asset as production asset';


COMMENT ON COLUMN mam_co_parm.stk_bp_flg IS '出荷先の在庫を考慮する // #MA.FLG // Include receiving point inventory';


COMMENT ON COLUMN mam_co_parm.non_transit_flg IS '未着品仕入データを取り込まない // #MA.FLG // Do not import purchase data of items in transit';


COMMENT ON COLUMN mam_co_parm.wg_non_mov_flg IS 'ワーキンググループ滞留使用ＦＬＧ // #MA.FLG // WG with non-moving flg.';


COMMENT ON COLUMN mam_co_parm.lot_non_mov_flg IS 'ロットＮＯ滞留使用ＦＬＧ // #MA.FLG // Lot No. with non-moving flg.';


COMMENT ON COLUMN mam_co_parm.sublot_non_mov_flg IS 'サブロットＮＯ滞留使用ＦＬＧ // #MA.FLG // Sublot No. with non-moving flg.';


COMMENT ON COLUMN mam_co_parm.sno1_non_mov_flg IS '手配ＮＯ１滞留使用ＦＬＧ // #MA.FLG // SEIBAN No. 1 with non-moving flg.';


COMMENT ON COLUMN mam_co_parm.sno2_non_mov_flg IS '手配ＮＯ２滞留使用ＦＬＧ // #MA.FLG // SEIBAN No. 2 with non-moving flg.';


COMMENT ON COLUMN mam_co_parm.sno3_non_mov_flg IS '手配ＮＯ３滞留使用ＦＬＧ // #MA.FLG // SEIBAN No. 3 with non-moving flg.';


COMMENT ON COLUMN mam_co_parm.sno4_non_mov_flg IS '手配ＮＯ４滞留使用ＦＬＧ // #MA.FLG // SEIBAN No. 4 with non-moving flg.';


COMMENT ON COLUMN mam_co_parm.tmp_dpt_cd IS '振替用部門ＣＤ // #MA.COST_DPT_CD // Transfer dept. cd.';


COMMENT ON COLUMN mam_co_parm.act_trd_calc_ctg_cd IS '実績振替計算カテゴリＣＤ // #MA.CALC_CTG_CD // Result transfer calculation category cd.';


COMMENT ON COLUMN mam_co_parm.chk_mst_flg IS 'マスタの存在チェックを行う // #MA.FLG // Check existence of master';


COMMENT ON COLUMN mam_co_parm.stktk_sum_flg IS '棚卸を集約しない // #MA.FLG // Do not consolidate the inventory count';


COMMENT ON COLUMN mam_co_parm.oth_ccn_sum_flg IS '他勘定を集約しない // #MA.FLG // Do not consolidate other accounting data';


COMMENT ON COLUMN mam_co_parm.amt_disp_digit IS '金額小数部表示桁 // #MA.DISP_DIGIT // Display digits (Amount decimal places)';


COMMENT ON COLUMN mam_co_parm.unit_disp_digit IS '単価小数部表示桁 // #MA.DISP_DIGIT // Display digits (Unit price decimal places)';


COMMENT ON COLUMN mam_co_parm.std_disp_digit IS '標準小数部表示桁 // #MA.DISP_DIGIT // Display digits (Standard decimal places)';


COMMENT ON COLUMN mam_co_parm.rate_disp_digit IS '比率小数部表示桁 // #MA.DISP_DIGIT // Display digits (Ratio decimal places)';


COMMENT ON COLUMN mam_co_parm.excel_pln_flg IS '計画データをＥＸＣＥＬで入出力する // #MA.FLG // Input/output planning data in Excel';


COMMENT ON COLUMN mam_co_parm.excel_act_flg IS '実績データをＥＸＣＥＬで入出力する // #MA.FLG // Input/output result data in Excel';


COMMENT ON COLUMN mam_co_parm.excel_alc_flg IS '配賦データをＥＸＣＥＬで入出力する // #MA.FLG // Input/output allocation data in Excel';


COMMENT ON COLUMN mam_co_parm.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_co_parm.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_co_parm.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_co_parm.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_co_parm.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_co_parm.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_co_parm.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_co_parm.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_co_parm.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_co_parm.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_co_parm.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_co_parm.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_co_parm.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

