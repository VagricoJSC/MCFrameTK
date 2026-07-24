\encoding UTF-8

COMMENT ON TABLE mbt_ac_io_all IS '会計受払情報 // Accounting GR/GI info.';


COMMENT ON COLUMN mbt_ac_io_all.data_no IS 'データＮＯ // #MA.IT_DAT_NO // Data No.';


COMMENT ON COLUMN mbt_ac_io_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mbt_ac_io_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mbt_ac_io_all.ac_ym IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN mbt_ac_io_all.slip_no IS '伝票ＮＯ // #MA.SLIP_NO // Slip No.';


COMMENT ON COLUMN mbt_ac_io_all.slip_seq_no IS '伝票連番 // #MA.SLIP_SEQ // Slip sequence number';


COMMENT ON COLUMN mbt_ac_io_all.slip_rev_no IS '伝票改訂番号 // #MA.SLIP_REV // Slip rev. number';


COMMENT ON COLUMN mbt_ac_io_all.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mbt_ac_io_all.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mbt_ac_io_all.un_fix_flg IS '金額未確定ＦＬＧ // #MA.FLG // Amount unfirm flg.';


COMMENT ON COLUMN mbt_ac_io_all.temp_ap_flg IS '暫定買掛ＦＬＧ // #MA.FLG // Temporary AP flg.';


COMMENT ON COLUMN mbt_ac_io_all.purc_typ IS '購買区分 // #MA.PURC_TYP // Purchase type';


COMMENT ON COLUMN mbt_ac_io_all.ac_slip_typ IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN mbt_ac_io_all.ac_rsn_cd IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN mbt_ac_io_all.purc_dpt_cd IS '購買部門ＣＤ // #MA.AC_DPT_CD // Purchasing dept. cd.';


COMMENT ON COLUMN mbt_ac_io_all.ap_dpt_cd IS '債務部門ＣＤ // #MA.AC_DPT_CD // AP dept. cd.';


COMMENT ON COLUMN mbt_ac_io_all.sls_dpt_cd IS '売上部門ＣＤ // #MA.AC_DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN mbt_ac_io_all.ar_dpt_cd IS '債権部門ＣＤ // #MA.AC_DPT_CD // AR dept. cd.';


COMMENT ON COLUMN mbt_ac_io_all.gi_dpt_cd IS '出庫部門ＣＤ // #MA.AC_DPT_CD // GI dept. cd.';


COMMENT ON COLUMN mbt_ac_io_all.gr_dpt_cd IS '入庫部門ＣＤ // #MA.AC_DPT_CD // GR dept. cd.';


COMMENT ON COLUMN mbt_ac_io_all.bd_dpt_cd IS '負担部門ＣＤ // #MA.AC_DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN mbt_ac_io_all.sub_dpt_cd1 IS '予備部門ＣＤ１ // #MA.AC_DPT_CD // Spare dept. cd. 1';


COMMENT ON COLUMN mbt_ac_io_all.sub_dpt_cd2 IS '予備部門ＣＤ２ // #MA.AC_DPT_CD // Spare dept. cd. 2';


COMMENT ON COLUMN mbt_ac_io_all.sub_dpt_cd3 IS '予備部門ＣＤ３ // #MA.AC_DPT_CD // Spare dept. cd. 3';


COMMENT ON COLUMN mbt_ac_io_all.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mbt_ac_io_all.str_ln_cd IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN mbt_ac_io_all.usr_cd IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN mbt_ac_io_all.ac_itm_grp_cd IS '会計品目分類ＣＤ // #MA.AC_ITM_GRP_CD // Accounting item classification cd.';


COMMENT ON COLUMN mbt_ac_io_all.itm_jnl_cd IS '品目仕訳ＣＤ // #MA.ITM_JNL_CD // Item journal cd.';


COMMENT ON COLUMN mbt_ac_io_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mbt_ac_io_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mbt_ac_io_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mbt_ac_io_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mbt_ac_io_all.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mbt_ac_io_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mbt_ac_io_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mbt_ac_io_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mbt_ac_io_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mbt_ac_io_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mbt_ac_io_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mbt_ac_io_all.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mbt_ac_io_all.quality_typ IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN mbt_ac_io_all.asst_typ IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN mbt_ac_io_all.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mbt_ac_io_all.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mbt_ac_io_all.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mbt_ac_io_all.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mbt_ac_io_all.base_cur_cd IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN mbt_ac_io_all.base_cur_amt IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN mbt_ac_io_all.base_cur_tax_amt IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN mbt_ac_io_all.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mbt_ac_io_all.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mbt_ac_io_all.trd_cur_tax_amt IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN mbt_ac_io_all.ptax_cur_cd IS '納税通貨ＣＤ // #MA.CUR_CD // Taxpaying currency cd.';


COMMENT ON COLUMN mbt_ac_io_all.ptax_cur_amt IS '納税通貨金額 // #MA.MONEY // Amount (Tax currency)';


COMMENT ON COLUMN mbt_ac_io_all.ptax_cur_tax_amt IS '納税通貨税額 // #MA.MONEY // Tax amount (Tax currency)';


COMMENT ON COLUMN mbt_ac_io_all.tax_cd IS '税ＣＤ // #MA.AC_TAX_CD // Tax cd.';


COMMENT ON COLUMN mbt_ac_io_all.foreign_flg IS '国外取引ＦＬＧ // #MA.FLG // Foreign transaction flg.';


COMMENT ON COLUMN mbt_ac_io_all.xrate_cd IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN mbt_ac_io_all.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mbt_ac_io_all.ptax_xrate_cd IS '納税為替レートＣＤ // #MA.XRATE_CD // Taxpaying exchange rate cd.';


COMMENT ON COLUMN mbt_ac_io_all.ptax_xrate IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN mbt_ac_io_all.repurc_obli_flg IS '買戻義務ＦＬＧ // #MA.FLG // Repurchase obligation flg.';


COMMENT ON COLUMN mbt_ac_io_all.trd_cur_proc_amt IS '取引通貨加工金額 // #MA.MONEY // Subcontracting amount (Transaction currency)';


COMMENT ON COLUMN mbt_ac_io_all.trd_cur_onr_prov_amt IS '取引通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Transaction currency)';


COMMENT ON COLUMN mbt_ac_io_all.base_cur_proc_amt IS '基準通貨加工金額 // #MA.MONEY // Subcontracting amount (Base currency)';


COMMENT ON COLUMN mbt_ac_io_all.base_cur_onr_prov_amt IS '基準通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Base currency)';


COMMENT ON COLUMN mbt_ac_io_all.ptax_cur_proc_amt IS '納税通貨加工金額 // #MA.MONEY // Subcontracting amount (Tax currency)';


COMMENT ON COLUMN mbt_ac_io_all.ptax_cur_onr_prov_amt IS '納税通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Tax currency)';


COMMENT ON COLUMN mbt_ac_io_all.slo_no IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN mbt_ac_io_all.po_no IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN mbt_ac_io_all.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mbt_ac_io_all.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mbt_ac_io_all.acst_cd IS '売掛先ＣＤ // #MA.BP_CD // AR customer cd.';


COMMENT ON COLUMN mbt_ac_io_all.cst_cd IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN mbt_ac_io_all.asppl_cd IS '買掛先ＣＤ // #MA.BP_CD // AP supplier cd.';


COMMENT ON COLUMN mbt_ac_io_all.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mbt_ac_io_all.spot_flg IS '都度精算ＦＬＧ // #MA.FLG // Settlement per transaction flg.';


COMMENT ON COLUMN mbt_ac_io_all.sttl_schd_dt IS '決済予定日 // #MA.DT // Scheduled settlement date';


COMMENT ON COLUMN mbt_ac_io_all.sttl_cd IS '決済方法ＣＤ // #MA.STTL_CD // Settlement method cd.';


COMMENT ON COLUMN mbt_ac_io_all.cst_itm_cd IS '得意先品目ＣＤ // #MA.BP_ITM_CD // Customer item cd.';


COMMENT ON COLUMN mbt_ac_io_all.cst_itm_nm IS '得意先品名 // #MA.BP_ITM_NM // Customer item name';


COMMENT ON COLUMN mbt_ac_io_all.sppl_itm_cd IS '発注先品目ＣＤ // #MA.BP_ITM_CD // Supplier item cd.';


COMMENT ON COLUMN mbt_ac_io_all.sppl_itm_nm IS '発注先品名 // #MA.BP_ITM_NM // Supplier item name';


COMMENT ON COLUMN mbt_ac_io_all.area_cd IS '地域ＣＤ // #MA.AREA_CD // Region cd.';


COMMENT ON COLUMN mbt_ac_io_all.cntry_cd IS '国ＣＤ // #MA.CNTRY_CD // Country cd.';


COMMENT ON COLUMN mbt_ac_io_all.trd_grp IS '振替グループ // #MA.TRD_GRP // Transfer group';


COMMENT ON COLUMN mbt_ac_io_all.trd_ac_itm_grp_cd IS '振替先会計品目分類ＣＤ // #MA.AC_ITM_GRP_CD // Transfer accounting item classification cd.';


COMMENT ON COLUMN mbt_ac_io_all.trd_itm_jnl_cd IS '振替先品目仕訳ＣＤ // #MA.ITM_JNL_CD // Transfer Item journal cd.';


COMMENT ON COLUMN mbt_ac_io_all.trd_itm_cd IS '振替先品目ＣＤ // #MA.ITM_CD // Transfer Item cd.';


COMMENT ON COLUMN mbt_ac_io_all.trd_itm_sub1 IS '振替先枝番１ // #MA.ITM_SUB1 // Transfer branch No. 1';


COMMENT ON COLUMN mbt_ac_io_all.trd_itm_sub2 IS '振替先枝番２ // #MA.ITM_SUB2 // Transfer branch No. 2';


COMMENT ON COLUMN mbt_ac_io_all.trd_itm_sub3 IS '振替先枝番３ // #MA.ITM_SUB3 // Transfer branch No. 3';


COMMENT ON COLUMN mbt_ac_io_all.trd_itm_nm IS '振替先品名 // #MA.ITM_NM // Transfer item name';


COMMENT ON COLUMN mbt_ac_io_all.trd_lot_no IS '振替先ロットＮＯ // #MA.LOT_NO // Transfer lot No.';


COMMENT ON COLUMN mbt_ac_io_all.trd_sublot_no IS '振替先サブロットＮＯ // #MA.SUBLOT_NO // Transfer sublot No.';


COMMENT ON COLUMN mbt_ac_io_all.trd_sno1 IS '振替先手配ＮＯ１ // #MA.SNO1 // Transfer SEIBAN No. 1';


COMMENT ON COLUMN mbt_ac_io_all.trd_sno2 IS '振替先手配ＮＯ２ // #MA.SNO2 // Transfer SEIBAN No. 2';


COMMENT ON COLUMN mbt_ac_io_all.trd_sno3 IS '振替先手配ＮＯ３ // #MA.SNO3 // Transfer SEIBAN No. 3';


COMMENT ON COLUMN mbt_ac_io_all.trd_sno4 IS '振替先手配ＮＯ４ // #MA.SNO4 // Transfer SEIBAN No. 4';


COMMENT ON COLUMN mbt_ac_io_all.jnl_key1 IS '仕訳キー項目１ // #MA.JNL_KEY1 // Journal key column 1';


COMMENT ON COLUMN mbt_ac_io_all.jnl_key2 IS '仕訳キー項目２ // #MA.JNL_KEY2 // Journal key column 2';


COMMENT ON COLUMN mbt_ac_io_all.jnl_key3 IS '仕訳キー項目３ // #MA.JNL_KEY3 // Journal key column 3';


COMMENT ON COLUMN mbt_ac_io_all.jnl_key4 IS '仕訳キー項目４ // #MA.JNL_KEY4 // Journal key column 4';


COMMENT ON COLUMN mbt_ac_io_all.jnl_key5 IS '仕訳キー項目５ // #MA.JNL_KEY5 // Journal key column 5';


COMMENT ON COLUMN mbt_ac_io_all.jnl_key6 IS '仕訳キー項目６ // #MA.JNL_KEY6 // Journal key column 6';


COMMENT ON COLUMN mbt_ac_io_all.jnl_key7 IS '仕訳キー項目７ // #MA.JNL_KEY7 // Journal key column 7';


COMMENT ON COLUMN mbt_ac_io_all.jnl_key8 IS '仕訳キー項目８ // #MA.JNL_KEY8 // Journal key column 8';


COMMENT ON COLUMN mbt_ac_io_all.jnl_key9 IS '仕訳キー項目９ // #MA.JNL_KEY9 // Journal key column 9';


COMMENT ON COLUMN mbt_ac_io_all.jnl_key10 IS '仕訳キー項目１０ // #MA.JNL_KEY10 // Journal key column 10';


COMMENT ON COLUMN mbt_ac_io_all.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mbt_ac_io_all.trd_d_rmrks IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN mbt_ac_io_all.sub_char1 IS '予備ＣＨＡＲ項目１ // #MA.SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN mbt_ac_io_all.sub_char2 IS '予備ＣＨＡＲ項目２ // #MA.SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN mbt_ac_io_all.sub_char3 IS '予備ＣＨＡＲ項目３ // #MA.SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN mbt_ac_io_all.sub_char4 IS '予備ＣＨＡＲ項目４ // #MA.SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN mbt_ac_io_all.sub_char5 IS '予備ＣＨＡＲ項目５ // #MA.SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN mbt_ac_io_all.sub_char6 IS '予備ＣＨＡＲ項目６ // #MA.SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN mbt_ac_io_all.sub_char7 IS '予備ＣＨＡＲ項目７ // #MA.SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN mbt_ac_io_all.sub_char8 IS '予備ＣＨＡＲ項目８ // #MA.SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN mbt_ac_io_all.sub_char9 IS '予備ＣＨＡＲ項目９ // #MA.SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN mbt_ac_io_all.sub_char10 IS '予備ＣＨＡＲ項目１０ // #MA.SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN mbt_ac_io_all.sub_num1 IS '予備ＮＵＭ項目１ // #MA.SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN mbt_ac_io_all.sub_num2 IS '予備ＮＵＭ項目２ // #MA.SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN mbt_ac_io_all.sub_num3 IS '予備ＮＵＭ項目３ // #MA.SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN mbt_ac_io_all.sub_dt1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN mbt_ac_io_all.sub_dt2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN mbt_ac_io_all.sub_dt3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN mbt_ac_io_all.inpt_ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mbt_ac_io_all.inpt_upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mbt_ac_io_all.jnl_fin_cnt IS '仕訳実行回数 // #MA.JNL_FIN_CNT // Number of journalizing';


COMMENT ON COLUMN mbt_ac_io_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mbt_ac_io_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mbt_ac_io_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mbt_ac_io_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mbt_ac_io_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mbt_ac_io_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mbt_ac_io_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mbt_ac_io_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mbt_ac_io_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mbt_ac_io_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

