
COMMENT ON TABLE MST_AP_D_ALL IS '買掛明細 // AP details';


COMMENT ON COLUMN MST_AP_D_ALL.AP_D_NO IS '買掛明細ＮＯ // #MA.AP_D_NO // AP details No.';


COMMENT ON COLUMN MST_AP_D_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_AP_D_ALL.PO_NO IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN MST_AP_D_ALL.PO_D_NO IS '発注明細ＮＯ // #MA.PO_D_NO // PO details No.';


COMMENT ON COLUMN MST_AP_D_ALL.PURC_ACT_D_NO IS '仕入実績明細ＮＯ // #MA.PURC_ACT_D_NO // Purchase result details No.';


COMMENT ON COLUMN MST_AP_D_ALL.PURC_ACT_D_SEQ IS '仕入実績明細連番 // #MA.SLIP_SEQ // Purchase result details sequence number';


COMMENT ON COLUMN MST_AP_D_ALL.PURC_ACT_NO IS '仕入実績ＮＯ // #MA.PURC_ACT_NO // Purchase result No.';


COMMENT ON COLUMN MST_AP_D_ALL.PURC_ACT_SEQ IS '仕入実績連番 // #MA.SLIP_SEQ // Purchase result sequence number';


COMMENT ON COLUMN MST_AP_D_ALL.PURC_ACT_REV IS '仕入実績改訂番号 // #MA.SLIP_REV // Purchase result rev. number';


COMMENT ON COLUMN MST_AP_D_ALL.BP_DLV_SLIP_NO IS '業者納品書ＮＯ // #MA.BP_DLV_SLIP_NO // Vendor delivery note No.';


COMMENT ON COLUMN MST_AP_D_ALL.BP_DLV_SLIP_D_NO IS '業者納品書明細ＮＯ // #MA.BP_DLV_SLIP_D_NO // Vendor delivery note details No.';


COMMENT ON COLUMN MST_AP_D_ALL.RCPT_IV_NO IS '受領インボイスＮＯ // #MA.IV_NO // Purchase invoice No.';


COMMENT ON COLUMN MST_AP_D_ALL.RCPT_IV_MNG_NO IS '受領インボイス管理ＮＯ // #MA.RCPT_IV_MNG_NO // Purchase invoice management No.';


COMMENT ON COLUMN MST_AP_D_ALL.AP_TYP IS '債務区分 // #MA.AP_TYP // AP type';


COMMENT ON COLUMN MST_AP_D_ALL.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_AP_D_ALL.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MST_AP_D_ALL.SLIP_STS_TYP IS '伝票状況区分 // #MA.SLIP_STS_TYP // Slip status type';


COMMENT ON COLUMN MST_AP_D_ALL.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MST_AP_D_ALL.ASPPL_CD IS '買掛先ＣＤ // #MA.BP_CD // AP supplier cd.';


COMMENT ON COLUMN MST_AP_D_ALL.BSPPL_CD IS '支払予定管理先ＣＤ // #MA.BP_CD // Scheduled payee cd.';


COMMENT ON COLUMN MST_AP_D_ALL.BSPPL_DPT_CD IS '支払予定管理先担当部門ＣＤ // #MA.DPT_CD // Cd. of dept. in charge of scheduled payee';


COMMENT ON COLUMN MST_AP_D_ALL.AP_DPT_CD IS '債務部門ＣＤ // #MA.DPT_CD // AP dept. cd.';


COMMENT ON COLUMN MST_AP_D_ALL.PURC_DPT_CD IS '購買部門ＣＤ // #MA.DPT_CD // Purchasing dept. cd.';


COMMENT ON COLUMN MST_AP_D_ALL.PURC_USR_CD IS '購買担当者ＣＤ // #MA.USR_CD // Purchasing PIC cd.';


COMMENT ON COLUMN MST_AP_D_ALL.PO_WRK_NO IS '仕入時案件ＮＯ // #MA.WRK_NO // Project No. at the time of purchase';


COMMENT ON COLUMN MST_AP_D_ALL.WRK_NO IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN MST_AP_D_ALL.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_AP_D_ALL.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_AP_D_ALL.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_AP_D_ALL.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_AP_D_ALL.ACT_DT IS '実績日 // #MA.DT // Actual date';


COMMENT ON COLUMN MST_AP_D_ALL.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MST_AP_D_ALL.AC_YM IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN MST_AP_D_ALL.BSPPL_CL_DT IS '支払予定管理先締年月日 // #MA.DT // Scheduled payee closing year, month, and date';


COMMENT ON COLUMN MST_AP_D_ALL.BSPPL_CL_DAY IS '支払予定管理先締日 // #MA.CL_DAY // Scheduled payee closing date';


COMMENT ON COLUMN MST_AP_D_ALL.PAY_CRRYOVR_TIMES IS '支払繰越回数 // #MA.CRRYOVR_TIMES // Payment carry-over count';


COMMENT ON COLUMN MST_AP_D_ALL.PAY_BASIS_DT IS '支払起算日 // #MA.DT // Payment base date';


COMMENT ON COLUMN MST_AP_D_ALL.PAY_SCHD_DT IS '支払予定日 // #MA.DT // Scheduled payment date';


COMMENT ON COLUMN MST_AP_D_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_AP_D_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_AP_D_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_AP_D_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_AP_D_ALL.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MST_AP_D_ALL.SUNDRY_ITM_FLG IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN MST_AP_D_ALL.SPPL_ITM_CD IS '発注先品目ＣＤ // #MA.BP_ITM_CD // Supplier item cd.';


COMMENT ON COLUMN MST_AP_D_ALL.SPPL_ITM_NM IS '発注先品名 // #MA.BP_ITM_NM // Supplier item name';


COMMENT ON COLUMN MST_AP_D_ALL.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_AP_D_ALL.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_AP_D_ALL.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_AP_D_ALL.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_AP_D_ALL.TAX_CD IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN MST_AP_D_ALL.INTERIM_FLG IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN MST_AP_D_ALL.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MST_AP_D_ALL.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_AP_D_ALL.TRD_CUR_UPRI IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN MST_AP_D_ALL.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MST_AP_D_ALL.TRD_CUR_TAX_AMT IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN MST_AP_D_ALL.TRD_CUR_DSCNT_AMT IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN MST_AP_D_ALL.TRD_CUR_PROC_UPRI IS '取引通貨加工単価 // #MA.MONEY // Subcontracting unit price (Transaction currency)';


COMMENT ON COLUMN MST_AP_D_ALL.TRD_CUR_PROC_AMT IS '取引通貨加工金額 // #MA.MONEY // Subcontracting amount (Transaction currency)';


COMMENT ON COLUMN MST_AP_D_ALL.TRD_CUR_ONR_PROV_UPRI IS '取引通貨有償支給単価 // #MA.MONEY // Chargeable supply unit price (Transaction currency)';


COMMENT ON COLUMN MST_AP_D_ALL.TRD_CUR_ONR_PROV_AMT IS '取引通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Transaction currency)';


COMMENT ON COLUMN MST_AP_D_ALL.BASE_CUR_UPRI IS '基準通貨単価 // #MA.MONEY // Unit price (Base currency)';


COMMENT ON COLUMN MST_AP_D_ALL.BASE_CUR_AMT IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN MST_AP_D_ALL.BASE_CUR_TAX_AMT IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN MST_AP_D_ALL.BASE_CUR_DSCNT_AMT IS '基準通貨値引額 // #MA.MONEY // Discount amount (Base currency)';


COMMENT ON COLUMN MST_AP_D_ALL.BASE_CUR_PROC_UPRI IS '基準通貨加工単価 // #MA.MONEY // Subcontracting unit price (Base currency)';


COMMENT ON COLUMN MST_AP_D_ALL.BASE_CUR_PROC_AMT IS '基準通貨加工金額 // #MA.MONEY // Subcontracting amount (Base currency)';


COMMENT ON COLUMN MST_AP_D_ALL.BASE_CUR_ONR_PROV_UPRI IS '基準通貨有償支給単価 // #MA.MONEY // Chargeable supply unit price (Base currency)';


COMMENT ON COLUMN MST_AP_D_ALL.BASE_CUR_ONR_PROV_AMT IS '基準通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Base currency)';


COMMENT ON COLUMN MST_AP_D_ALL.WTAX_RATE IS '源泉税率 // #MA.WTAX_RATE // Withholding tax rate';


COMMENT ON COLUMN MST_AP_D_ALL.WTAX_AMT IS '源泉税額 // #MA.MONEY // Withholding tax';


COMMENT ON COLUMN MST_AP_D_ALL.PAY_MTD_TYP IS '支払方式区分 // #MS.PAY_MTD_TYP // Payment method type';


COMMENT ON COLUMN MST_AP_D_ALL.ORG_AP_D_NO IS '元買掛明細ＮＯ // #MA.AP_D_NO // Original AP details No.';


COMMENT ON COLUMN MST_AP_D_ALL.CRRYOVR_AP_D_NO IS '繰越先買掛明細ＮＯ // #MA.AP_D_NO // Carry-over destination AP details No.';


COMMENT ON COLUMN MST_AP_D_ALL.CRRYOVR_SRC_AP_D_NO IS '繰越元買掛明細ＮＯ // #MA.AP_D_NO // Carry-over source AP details No.';


COMMENT ON COLUMN MST_AP_D_ALL.BASE_PURC_AC_DT IS '仕入計上日（基） // #MA.DT // Purchase recording date (Base)';


COMMENT ON COLUMN MST_AP_D_ALL.PAY_NTC_D_PRINT_RMRKS IS '支払通知書明細備考 // #MS.PAY_NTC_D_PRINT_RMRKS // Payment notice details remarks';


COMMENT ON COLUMN MST_AP_D_ALL.PAY_SCHD_D_PRINT_RMRKS IS '支払予定明細備考 // #MS.PAY_SCHD_D_PRINT_RMRKS // Payment schedule details remarks';


COMMENT ON COLUMN MST_AP_D_ALL.INTR_RMRKS IS '内部備考 // #MS.AP_D_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_AP_D_ALL.PAY_CHK_NO IS '支払照合ＮＯ // #MA.PAY_CHK_NO // Payment collation No.';


COMMENT ON COLUMN MST_AP_D_ALL.PAY_CHK_MNG_NO IS '支払照合管理ＮＯ // #MA.PAY_CHK_MNG_NO // Payment collation management No.';


COMMENT ON COLUMN MST_AP_D_ALL.CHK_FLG IS '照合済ＦＬＧ // #MA.FLG // Collated flg.';


COMMENT ON COLUMN MST_AP_D_ALL.CRRYOVR_FLG IS '繰越分ＦＬＧ // #MA.FLG // Carry-over flg.';


COMMENT ON COLUMN MST_AP_D_ALL.REPURC_OBLI_FLG IS '買戻義務ＦＬＧ // #MA.FLG // Repurchase obligation flg.';


COMMENT ON COLUMN MST_AP_D_ALL.OUTSRC_FLG IS '外注ＦＬＧ // #MA.FLG // Subcontracting flg.';


COMMENT ON COLUMN MST_AP_D_ALL.VALID_FLG IS '有効ＦＬＧ // #MA.FLG // Valid flg.';


COMMENT ON COLUMN MST_AP_D_ALL.SW_FLG IS '振替済ＦＬＧ // #MA.FLG // Transferred flg.';


COMMENT ON COLUMN MST_AP_D_ALL.SW_SRC_AP_APPL_SCHD_NO IS '振替元買掛消込予定ＮＯ // #MA.AP_APPL_SCHD_NO // Transfer source AP reconciliation schedule No.';


COMMENT ON COLUMN MST_AP_D_ALL.SW_SRC_PAY_CHK_NO IS '振替元支払照合ＮＯ // #MA.PAY_CHK_NO // Transfer source payment collation No.';


COMMENT ON COLUMN MST_AP_D_ALL.SW_SRC_PAY_CHK_MNG_NO IS '振替元支払照合管理ＮＯ // #MA.PAY_CHK_MNG_NO // Transfer source payment collation management No.';


COMMENT ON COLUMN MST_AP_D_ALL.SW_SRC_PAY_SCHD_NO IS '振替元支払予定ＮＯ // #MA.PAY_SCHD_NO // Transfer source payment schedule No.';


COMMENT ON COLUMN MST_AP_D_ALL.SW_SRC_AP_D_NO IS '振替元買掛明細ＮＯ // #MA.AP_D_NO // Transfer source AP details No.';


COMMENT ON COLUMN MST_AP_D_ALL.SUB_CHAR1 IS '予備１ // #MS.AP_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_AP_D_ALL.SUB_CHAR2 IS '予備２ // #MS.AP_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_AP_D_ALL.SUB_CHAR3 IS '予備３ // #MS.AP_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_AP_D_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_AP_D_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_AP_D_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_AP_D_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_AP_D_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_AP_D_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_AP_D_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_AP_D_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_AP_D_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_AP_D_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

