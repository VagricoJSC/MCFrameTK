\encoding UTF-8

COMMENT ON VIEW mst_ap_d IS '買掛明細 // AP details';


COMMENT ON COLUMN mst_ap_d.ap_d_no IS '買掛明細ＮＯ // #MA.AP_D_NO // AP details No.';


COMMENT ON COLUMN mst_ap_d.po_no IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN mst_ap_d.po_d_no IS '発注明細ＮＯ // #MA.PO_D_NO // PO details No.';


COMMENT ON COLUMN mst_ap_d.purc_act_d_no IS '仕入実績明細ＮＯ // #MA.PURC_ACT_D_NO // Purchase result details No.';


COMMENT ON COLUMN mst_ap_d.purc_act_d_seq IS '仕入実績明細連番 // #MA.SLIP_SEQ // Purchase result details sequence number';


COMMENT ON COLUMN mst_ap_d.purc_act_no IS '仕入実績ＮＯ // #MA.PURC_ACT_NO // Purchase result No.';


COMMENT ON COLUMN mst_ap_d.purc_act_seq IS '仕入実績連番 // #MA.SLIP_SEQ // Purchase result sequence number';


COMMENT ON COLUMN mst_ap_d.purc_act_rev IS '仕入実績改訂番号 // #MA.SLIP_REV // Purchase result rev. number';


COMMENT ON COLUMN mst_ap_d.bp_dlv_slip_no IS '業者納品書ＮＯ // #MA.BP_DLV_SLIP_NO // Vendor delivery note No.';


COMMENT ON COLUMN mst_ap_d.bp_dlv_slip_d_no IS '業者納品書明細ＮＯ // #MA.BP_DLV_SLIP_D_NO // Vendor delivery note details No.';


COMMENT ON COLUMN mst_ap_d.rcpt_iv_no IS '受領インボイスＮＯ // #MA.IV_NO // Purchase invoice No.';


COMMENT ON COLUMN mst_ap_d.rcpt_iv_mng_no IS '受領インボイス管理ＮＯ // #MA.RCPT_IV_MNG_NO // Purchase invoice management No.';


COMMENT ON COLUMN mst_ap_d.ap_typ IS '債務区分 // #MA.AP_TYP // AP type';


COMMENT ON COLUMN mst_ap_d.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_ap_d.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_ap_d.slip_sts_typ IS '伝票状況区分 // #MA.SLIP_STS_TYP // Slip status type';


COMMENT ON COLUMN mst_ap_d.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mst_ap_d.asppl_cd IS '買掛先ＣＤ // #MA.BP_CD // AP supplier cd.';


COMMENT ON COLUMN mst_ap_d.bsppl_cd IS '支払予定管理先ＣＤ // #MA.BP_CD // Scheduled payee cd.';


COMMENT ON COLUMN mst_ap_d.bsppl_dpt_cd IS '支払予定管理先担当部門ＣＤ // #MA.DPT_CD // Cd. of dept. in charge of scheduled payee';


COMMENT ON COLUMN mst_ap_d.ap_dpt_cd IS '債務部門ＣＤ // #MA.DPT_CD // AP dept. cd.';


COMMENT ON COLUMN mst_ap_d.purc_dpt_cd IS '購買部門ＣＤ // #MA.DPT_CD // Purchasing dept. cd.';


COMMENT ON COLUMN mst_ap_d.purc_usr_cd IS '購買担当者ＣＤ // #MA.USR_CD // Purchasing PIC cd.';


COMMENT ON COLUMN mst_ap_d.po_wrk_no IS '仕入時案件ＮＯ // #MA.WRK_NO // Project No. at the time of purchase';


COMMENT ON COLUMN mst_ap_d.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mst_ap_d.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_ap_d.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_ap_d.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_ap_d.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_ap_d.act_dt IS '実績日 // #MA.DT // Actual date';


COMMENT ON COLUMN mst_ap_d.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mst_ap_d.ac_ym IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN mst_ap_d.bsppl_cl_dt IS '支払予定管理先締年月日 // #MA.DT // Scheduled payee closing year, month, and date';


COMMENT ON COLUMN mst_ap_d.bsppl_cl_day IS '支払予定管理先締日 // #MA.CL_DAY // Scheduled payee closing date';


COMMENT ON COLUMN mst_ap_d.pay_crryovr_times IS '支払繰越回数 // #MA.CRRYOVR_TIMES // Payment carry-over count';


COMMENT ON COLUMN mst_ap_d.pay_basis_dt IS '支払起算日 // #MA.DT // Payment base date';


COMMENT ON COLUMN mst_ap_d.pay_schd_dt IS '支払予定日 // #MA.DT // Scheduled payment date';


COMMENT ON COLUMN mst_ap_d.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_ap_d.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_ap_d.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_ap_d.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_ap_d.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mst_ap_d.sundry_itm_flg IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN mst_ap_d.sppl_itm_cd IS '発注先品目ＣＤ // #MA.BP_ITM_CD // Supplier item cd.';


COMMENT ON COLUMN mst_ap_d.sppl_itm_nm IS '発注先品名 // #MA.BP_ITM_NM // Supplier item name';


COMMENT ON COLUMN mst_ap_d.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_ap_d.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_ap_d.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_ap_d.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_ap_d.tax_cd IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN mst_ap_d.interim_flg IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN mst_ap_d.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mst_ap_d.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_ap_d.trd_cur_upri IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN mst_ap_d.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mst_ap_d.trd_cur_tax_amt IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN mst_ap_d.trd_cur_dscnt_amt IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN mst_ap_d.trd_cur_proc_upri IS '取引通貨加工単価 // #MA.MONEY // Subcontracting unit price (Transaction currency)';


COMMENT ON COLUMN mst_ap_d.trd_cur_proc_amt IS '取引通貨加工金額 // #MA.MONEY // Subcontracting amount (Transaction currency)';


COMMENT ON COLUMN mst_ap_d.trd_cur_onr_prov_upri IS '取引通貨有償支給単価 // #MA.MONEY // Chargeable supply unit price (Transaction currency)';


COMMENT ON COLUMN mst_ap_d.trd_cur_onr_prov_amt IS '取引通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Transaction currency)';


COMMENT ON COLUMN mst_ap_d.base_cur_upri IS '基準通貨単価 // #MA.MONEY // Unit price (Base currency)';


COMMENT ON COLUMN mst_ap_d.base_cur_amt IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN mst_ap_d.base_cur_tax_amt IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN mst_ap_d.base_cur_dscnt_amt IS '基準通貨値引額 // #MA.MONEY // Discount amount (Base currency)';


COMMENT ON COLUMN mst_ap_d.base_cur_proc_upri IS '基準通貨加工単価 // #MA.MONEY // Subcontracting unit price (Base currency)';


COMMENT ON COLUMN mst_ap_d.base_cur_proc_amt IS '基準通貨加工金額 // #MA.MONEY // Subcontracting amount (Base currency)';


COMMENT ON COLUMN mst_ap_d.base_cur_onr_prov_upri IS '基準通貨有償支給単価 // #MA.MONEY // Chargeable supply unit price (Base currency)';


COMMENT ON COLUMN mst_ap_d.base_cur_onr_prov_amt IS '基準通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Base currency)';


COMMENT ON COLUMN mst_ap_d.wtax_rate IS '源泉税率 // #MA.WTAX_RATE // Withholding tax rate';


COMMENT ON COLUMN mst_ap_d.wtax_amt IS '源泉税額 // #MA.MONEY // Withholding tax';


COMMENT ON COLUMN mst_ap_d.pay_mtd_typ IS '支払方式区分 // #MS.PAY_MTD_TYP // Payment method type';


COMMENT ON COLUMN mst_ap_d.org_ap_d_no IS '元買掛明細ＮＯ // #MA.AP_D_NO // Original AP details No.';


COMMENT ON COLUMN mst_ap_d.crryovr_ap_d_no IS '繰越先買掛明細ＮＯ // #MA.AP_D_NO // Carry-over destination AP details No.';


COMMENT ON COLUMN mst_ap_d.crryovr_src_ap_d_no IS '繰越元買掛明細ＮＯ // #MA.AP_D_NO // Carry-over source AP details No.';


COMMENT ON COLUMN mst_ap_d.base_purc_ac_dt IS '仕入計上日（基） // #MA.DT // Purchase recording date (Base)';


COMMENT ON COLUMN mst_ap_d.pay_ntc_d_print_rmrks IS '支払通知書明細備考 // #MS.PAY_NTC_D_PRINT_RMRKS // Payment notice details remarks';


COMMENT ON COLUMN mst_ap_d.pay_schd_d_print_rmrks IS '支払予定明細備考 // #MS.PAY_SCHD_D_PRINT_RMRKS // Payment schedule details remarks';


COMMENT ON COLUMN mst_ap_d.intr_rmrks IS '内部備考 // #MS.AP_D_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_ap_d.pay_chk_no IS '支払照合ＮＯ // #MA.PAY_CHK_NO // Payment collation No.';


COMMENT ON COLUMN mst_ap_d.pay_chk_mng_no IS '支払照合管理ＮＯ // #MA.PAY_CHK_MNG_NO // Payment collation management No.';


COMMENT ON COLUMN mst_ap_d.chk_flg IS '照合済ＦＬＧ // #MA.FLG // Collated flg.';


COMMENT ON COLUMN mst_ap_d.crryovr_flg IS '繰越分ＦＬＧ // #MA.FLG // Carry-over flg.';


COMMENT ON COLUMN mst_ap_d.repurc_obli_flg IS '買戻義務ＦＬＧ // #MA.FLG // Repurchase obligation flg.';


COMMENT ON COLUMN mst_ap_d.outsrc_flg IS '外注ＦＬＧ // #MA.FLG // Subcontracting flg.';


COMMENT ON COLUMN mst_ap_d.valid_flg IS '有効ＦＬＧ // #MA.FLG // Valid flg.';


COMMENT ON COLUMN mst_ap_d.sw_flg IS '振替済ＦＬＧ // #MA.FLG // Transferred flg.';


COMMENT ON COLUMN mst_ap_d.sw_src_ap_appl_schd_no IS '振替元買掛消込予定ＮＯ // #MA.AP_APPL_SCHD_NO // Transfer source AP reconciliation schedule No.';


COMMENT ON COLUMN mst_ap_d.sw_src_pay_chk_no IS '振替元支払照合ＮＯ // #MA.PAY_CHK_NO // Transfer source payment collation No.';


COMMENT ON COLUMN mst_ap_d.sw_src_pay_chk_mng_no IS '振替元支払照合管理ＮＯ // #MA.PAY_CHK_MNG_NO // Transfer source payment collation management No.';


COMMENT ON COLUMN mst_ap_d.sw_src_pay_schd_no IS '振替元支払予定ＮＯ // #MA.PAY_SCHD_NO // Transfer source payment schedule No.';


COMMENT ON COLUMN mst_ap_d.sw_src_ap_d_no IS '振替元買掛明細ＮＯ // #MA.AP_D_NO // Transfer source AP details No.';


COMMENT ON COLUMN mst_ap_d.sub_char1 IS '予備１ // #MS.AP_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_ap_d.sub_char2 IS '予備２ // #MS.AP_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_ap_d.sub_char3 IS '予備３ // #MS.AP_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_ap_d.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_ap_d.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_ap_d.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_ap_d.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_ap_d.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_ap_d.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_ap_d.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_ap_d.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_ap_d.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_ap_d.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

