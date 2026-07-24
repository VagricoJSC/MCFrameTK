
COMMENT ON TABLE MST_PURC_ACT_IO IS '仕入実績受払 // Purchase result GR/GI';


COMMENT ON COLUMN MST_PURC_ACT_IO.PURC_ACT_IO_NO IS '仕入実績受払ＮＯ // #MA.PURC_ACT_IO_NO // Purchase result GR/GI No.';


COMMENT ON COLUMN MST_PURC_ACT_IO.PURC_ACT_IO_SEQ IS '仕入実績受払連番 // #MA.SLIP_SEQ // Purchase result GR/GI sequence number';


COMMENT ON COLUMN MST_PURC_ACT_IO.PURC_ACT_D_NO IS '仕入実績明細ＮＯ // #MA.PURC_ACT_D_NO // Purchase result details No.';


COMMENT ON COLUMN MST_PURC_ACT_IO.PURC_ACT_D_SEQ IS '仕入実績明細連番 // #MA.SLIP_SEQ // Purchase result details sequence number';


COMMENT ON COLUMN MST_PURC_ACT_IO.ARR_ACT_NO IS '入荷実績ＮＯ // #MA.ARR_ACT_NO // Receipt result No.';


COMMENT ON COLUMN MST_PURC_ACT_IO.PURC_RET_ACT_IO_NO IS '仕入返品実績受払ＮＯ // #MA.PURC_RET_ACT_IO_NO // Purchase return result GR/GI No.';


COMMENT ON COLUMN MST_PURC_ACT_IO.INSP_ACT_D_NO IS '検査実績明細ＮＯ // #MA.INSP_ACT_D_NO // Inspection result details No.';


COMMENT ON COLUMN MST_PURC_ACT_IO.INSP_JUDG_D_NO IS '検査判定明細ＮＯ // #MA.INSP_JUDG_D_NO // Inspection decision details No.';


COMMENT ON COLUMN MST_PURC_ACT_IO.INSP_ACT_NO IS '検査実績ＮＯ // #MA.INSP_ACT_NO // Inspection result No.';


COMMENT ON COLUMN MST_PURC_ACT_IO.IN_TO_LOC_WG_CD IS '納入場所ＷＧ ＣＤ // #MA.WG_CD // Delivery location WG cd.';


COMMENT ON COLUMN MST_PURC_ACT_IO.IN_TO_LOC_CD IS '納入場所ＣＤ // #MA.LOC_CD // Delivery location cd.';


COMMENT ON COLUMN MST_PURC_ACT_IO.STR_LN_CD IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN MST_PURC_ACT_IO.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MST_PURC_ACT_IO.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_PURC_ACT_IO.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_PURC_ACT_IO.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_PURC_ACT_IO.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MST_PURC_ACT_IO.STK_INSP_TYP IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN MST_PURC_ACT_IO.STK_ID_TYP IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN MST_PURC_ACT_IO.BP_LOT_NO IS '業者ロットＮＯ // #MA.BP_LOT_NO // Vendor lot No.';


COMMENT ON COLUMN MST_PURC_ACT_IO.BP_DLV_SLIP_NO IS '業者納品書ＮＯ // #MA.BP_DLV_SLIP_NO // Vendor delivery note No.';


COMMENT ON COLUMN MST_PURC_ACT_IO.BP_DLV_SLIP_D_NO IS '業者納品書明細ＮＯ // #MA.BP_DLV_SLIP_D_NO // Vendor delivery note details No.';


COMMENT ON COLUMN MST_PURC_ACT_IO.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_PURC_ACT_IO.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_PURC_ACT_IO.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_PURC_ACT_IO.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_PURC_ACT_IO.PACK_UNIT_CD IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN MST_PURC_ACT_IO.PACK_UNIT_QTY IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN MST_PURC_ACT_IO.SO_QTY IS '引落数量 // #MA.QTY // Deducted qty.';


COMMENT ON COLUMN MST_PURC_ACT_IO.GI_WG_CD IS '仕入出庫場所ＷＧ ＣＤ // #MA.WG_CD // Purchase GI location WG cd.';


COMMENT ON COLUMN MST_PURC_ACT_IO.GI_LOC_CD IS '仕入出庫場所ＣＤ // #MA.LOC_CD // Purchase GI location cd.';


COMMENT ON COLUMN MST_PURC_ACT_IO.GI_STR_LN_CD IS '仕入出庫棚・ラインＣＤ // #MA.STR_LN_CD // Purchase GI rack/line cd.';


COMMENT ON COLUMN MST_PURC_ACT_IO.GI_UNIT_CD IS '仕入出庫単位ＣＤ // #MA.UNIT_CD // Purchase GI unit cd.';


COMMENT ON COLUMN MST_PURC_ACT_IO.TRD_CUR_UPRI IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN MST_PURC_ACT_IO.TRD_CUR_PROC_UPRI IS '取引通貨加工単価 // #MA.MONEY // Subcontracting unit price (Transaction currency)';


COMMENT ON COLUMN MST_PURC_ACT_IO.TRD_CUR_ONR_PROV_UPRI IS '取引通貨有償支給単価 // #MA.MONEY // Chargeable supply unit price (Transaction currency)';


COMMENT ON COLUMN MST_PURC_ACT_IO.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MST_PURC_ACT_IO.TRD_CUR_PROC_AMT IS '取引通貨加工金額 // #MA.MONEY // Subcontracting amount (Transaction currency)';


COMMENT ON COLUMN MST_PURC_ACT_IO.TRD_CUR_ONR_PROV_AMT IS '取引通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Transaction currency)';


COMMENT ON COLUMN MST_PURC_ACT_IO.TRD_CUR_TAX_AMT IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN MST_PURC_ACT_IO.TRD_CUR_DSCNT_AMT IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN MST_PURC_ACT_IO.BASE_CUR_UPRI IS '基準通貨単価 // #MA.MONEY // Unit price (Base currency)';


COMMENT ON COLUMN MST_PURC_ACT_IO.BASE_CUR_PROC_UPRI IS '基準通貨加工単価 // #MA.MONEY // Subcontracting unit price (Base currency)';


COMMENT ON COLUMN MST_PURC_ACT_IO.BASE_CUR_ONR_PROV_UPRI IS '基準通貨有償支給単価 // #MA.MONEY // Chargeable supply unit price (Base currency)';


COMMENT ON COLUMN MST_PURC_ACT_IO.BASE_CUR_DSCNT_AMT IS '基準通貨値引額 // #MA.MONEY // Discount amount (Base currency)';


COMMENT ON COLUMN MST_PURC_ACT_IO.BASE_CUR_AMT IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN MST_PURC_ACT_IO.BASE_CUR_PROC_AMT IS '基準通貨加工金額 // #MA.MONEY // Subcontracting amount (Base currency)';


COMMENT ON COLUMN MST_PURC_ACT_IO.BASE_CUR_ONR_PROV_AMT IS '基準通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Base currency)';


COMMENT ON COLUMN MST_PURC_ACT_IO.BASE_CUR_TAX_AMT IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN MST_PURC_ACT_IO.PTAX_CUR_UPRI IS '納税通貨単価 // #MA.MONEY // Unit price (Tax currency)';


COMMENT ON COLUMN MST_PURC_ACT_IO.PTAX_CUR_PROC_UPRI IS '納税通貨加工単価 // #MA.MONEY // Subcontracting unit price (Tax currency)';


COMMENT ON COLUMN MST_PURC_ACT_IO.PTAX_CUR_ONR_PROV_UPRI IS '納税通貨有償支給単価 // #MA.MONEY // Chargeable supply unit price (Tax currency)';


COMMENT ON COLUMN MST_PURC_ACT_IO.PTAX_CUR_DSCNT_AMT IS '納税通貨値引額 // #MA.MONEY // Discount amount (Tax currency)';


COMMENT ON COLUMN MST_PURC_ACT_IO.PTAX_CUR_AMT IS '納税通貨金額 // #MA.MONEY // Amount (Tax currency)';


COMMENT ON COLUMN MST_PURC_ACT_IO.PTAX_CUR_PROC_AMT IS '納税通貨加工金額 // #MA.MONEY // Subcontracting amount (Tax currency)';


COMMENT ON COLUMN MST_PURC_ACT_IO.PTAX_CUR_ONR_PROV_AMT IS '納税通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Tax currency)';


COMMENT ON COLUMN MST_PURC_ACT_IO.PTAX_CUR_TAX_AMT IS '納税通貨税額 // #MA.MONEY // Tax amount (Tax currency)';


COMMENT ON COLUMN MST_PURC_ACT_IO.WTAX_AMT IS '源泉税額 // #MA.MONEY // Withholding tax';


COMMENT ON COLUMN MST_PURC_ACT_IO.SUB_CHAR1 IS '予備１ // #MS.PURC_ACT_IO_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_PURC_ACT_IO.SUB_CHAR2 IS '予備２ // #MS.PURC_ACT_IO_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_PURC_ACT_IO.SUB_CHAR3 IS '予備３ // #MS.PURC_ACT_IO_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_PURC_ACT_IO.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_PURC_ACT_IO.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_PURC_ACT_IO.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_PURC_ACT_IO.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_PURC_ACT_IO.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_PURC_ACT_IO.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_PURC_ACT_IO.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_PURC_ACT_IO.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_PURC_ACT_IO.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_PURC_ACT_IO.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

