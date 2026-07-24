\encoding UTF-8

COMMENT ON TABLE mst_purc_act_io_all IS '仕入実績受払 // Purchase result GR/GI';


COMMENT ON COLUMN mst_purc_act_io_all.purc_act_io_no IS '仕入実績受払ＮＯ // #MA.PURC_ACT_IO_NO // Purchase result GR/GI No.';


COMMENT ON COLUMN mst_purc_act_io_all.purc_act_io_seq IS '仕入実績受払連番 // #MA.SLIP_SEQ // Purchase result GR/GI sequence number';


COMMENT ON COLUMN mst_purc_act_io_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_purc_act_io_all.purc_act_d_no IS '仕入実績明細ＮＯ // #MA.PURC_ACT_D_NO // Purchase result details No.';


COMMENT ON COLUMN mst_purc_act_io_all.purc_act_d_seq IS '仕入実績明細連番 // #MA.SLIP_SEQ // Purchase result details sequence number';


COMMENT ON COLUMN mst_purc_act_io_all.arr_act_no IS '入荷実績ＮＯ // #MA.ARR_ACT_NO // Receipt result No.';


COMMENT ON COLUMN mst_purc_act_io_all.purc_ret_act_io_no IS '仕入返品実績受払ＮＯ // #MA.PURC_RET_ACT_IO_NO // Purchase return result GR/GI No.';


COMMENT ON COLUMN mst_purc_act_io_all.insp_act_d_no IS '検査実績明細ＮＯ // #MA.INSP_ACT_D_NO // Inspection result details No.';


COMMENT ON COLUMN mst_purc_act_io_all.insp_judg_d_no IS '検査判定明細ＮＯ // #MA.INSP_JUDG_D_NO // Inspection decision details No.';


COMMENT ON COLUMN mst_purc_act_io_all.insp_act_no IS '検査実績ＮＯ // #MA.INSP_ACT_NO // Inspection result No.';


COMMENT ON COLUMN mst_purc_act_io_all.in_to_loc_wg_cd IS '納入場所ＷＧ ＣＤ // #MA.WG_CD // Delivery location WG cd.';


COMMENT ON COLUMN mst_purc_act_io_all.in_to_loc_cd IS '納入場所ＣＤ // #MA.LOC_CD // Delivery location cd.';


COMMENT ON COLUMN mst_purc_act_io_all.str_ln_cd IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN mst_purc_act_io_all.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN mst_purc_act_io_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_purc_act_io_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_purc_act_io_all.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_purc_act_io_all.quality_typ IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN mst_purc_act_io_all.stk_insp_typ IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN mst_purc_act_io_all.stk_id_typ IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN mst_purc_act_io_all.bp_lot_no IS '業者ロットＮＯ // #MA.BP_LOT_NO // Vendor lot No.';


COMMENT ON COLUMN mst_purc_act_io_all.bp_dlv_slip_no IS '業者納品書ＮＯ // #MA.BP_DLV_SLIP_NO // Vendor delivery note No.';


COMMENT ON COLUMN mst_purc_act_io_all.bp_dlv_slip_d_no IS '業者納品書明細ＮＯ // #MA.BP_DLV_SLIP_D_NO // Vendor delivery note details No.';


COMMENT ON COLUMN mst_purc_act_io_all.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_purc_act_io_all.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_purc_act_io_all.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_purc_act_io_all.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_purc_act_io_all.pack_unit_cd IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN mst_purc_act_io_all.pack_unit_qty IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN mst_purc_act_io_all.so_qty IS '引落数量 // #MA.QTY // Deducted qty.';


COMMENT ON COLUMN mst_purc_act_io_all.gi_wg_cd IS '仕入出庫場所ＷＧ ＣＤ // #MA.WG_CD // Purchase GI location WG cd.';


COMMENT ON COLUMN mst_purc_act_io_all.gi_loc_cd IS '仕入出庫場所ＣＤ // #MA.LOC_CD // Purchase GI location cd.';


COMMENT ON COLUMN mst_purc_act_io_all.gi_str_ln_cd IS '仕入出庫棚・ラインＣＤ // #MA.STR_LN_CD // Purchase GI rack/line cd.';


COMMENT ON COLUMN mst_purc_act_io_all.gi_unit_cd IS '仕入出庫単位ＣＤ // #MA.UNIT_CD // Purchase GI unit cd.';


COMMENT ON COLUMN mst_purc_act_io_all.trd_cur_upri IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN mst_purc_act_io_all.trd_cur_proc_upri IS '取引通貨加工単価 // #MA.MONEY // Subcontracting unit price (Transaction currency)';


COMMENT ON COLUMN mst_purc_act_io_all.trd_cur_onr_prov_upri IS '取引通貨有償支給単価 // #MA.MONEY // Chargeable supply unit price (Transaction currency)';


COMMENT ON COLUMN mst_purc_act_io_all.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mst_purc_act_io_all.trd_cur_proc_amt IS '取引通貨加工金額 // #MA.MONEY // Subcontracting amount (Transaction currency)';


COMMENT ON COLUMN mst_purc_act_io_all.trd_cur_onr_prov_amt IS '取引通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Transaction currency)';


COMMENT ON COLUMN mst_purc_act_io_all.trd_cur_tax_amt IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN mst_purc_act_io_all.trd_cur_dscnt_amt IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN mst_purc_act_io_all.base_cur_upri IS '基準通貨単価 // #MA.MONEY // Unit price (Base currency)';


COMMENT ON COLUMN mst_purc_act_io_all.base_cur_proc_upri IS '基準通貨加工単価 // #MA.MONEY // Subcontracting unit price (Base currency)';


COMMENT ON COLUMN mst_purc_act_io_all.base_cur_onr_prov_upri IS '基準通貨有償支給単価 // #MA.MONEY // Chargeable supply unit price (Base currency)';


COMMENT ON COLUMN mst_purc_act_io_all.base_cur_dscnt_amt IS '基準通貨値引額 // #MA.MONEY // Discount amount (Base currency)';


COMMENT ON COLUMN mst_purc_act_io_all.base_cur_amt IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN mst_purc_act_io_all.base_cur_proc_amt IS '基準通貨加工金額 // #MA.MONEY // Subcontracting amount (Base currency)';


COMMENT ON COLUMN mst_purc_act_io_all.base_cur_onr_prov_amt IS '基準通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Base currency)';


COMMENT ON COLUMN mst_purc_act_io_all.base_cur_tax_amt IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN mst_purc_act_io_all.ptax_cur_upri IS '納税通貨単価 // #MA.MONEY // Unit price (Tax currency)';


COMMENT ON COLUMN mst_purc_act_io_all.ptax_cur_proc_upri IS '納税通貨加工単価 // #MA.MONEY // Subcontracting unit price (Tax currency)';


COMMENT ON COLUMN mst_purc_act_io_all.ptax_cur_onr_prov_upri IS '納税通貨有償支給単価 // #MA.MONEY // Chargeable supply unit price (Tax currency)';


COMMENT ON COLUMN mst_purc_act_io_all.ptax_cur_dscnt_amt IS '納税通貨値引額 // #MA.MONEY // Discount amount (Tax currency)';


COMMENT ON COLUMN mst_purc_act_io_all.ptax_cur_amt IS '納税通貨金額 // #MA.MONEY // Amount (Tax currency)';


COMMENT ON COLUMN mst_purc_act_io_all.ptax_cur_proc_amt IS '納税通貨加工金額 // #MA.MONEY // Subcontracting amount (Tax currency)';


COMMENT ON COLUMN mst_purc_act_io_all.ptax_cur_onr_prov_amt IS '納税通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Tax currency)';


COMMENT ON COLUMN mst_purc_act_io_all.ptax_cur_tax_amt IS '納税通貨税額 // #MA.MONEY // Tax amount (Tax currency)';


COMMENT ON COLUMN mst_purc_act_io_all.wtax_amt IS '源泉税額 // #MA.MONEY // Withholding tax';


COMMENT ON COLUMN mst_purc_act_io_all.sub_char1 IS '予備１ // #MS.PURC_ACT_IO_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_purc_act_io_all.sub_char2 IS '予備２ // #MS.PURC_ACT_IO_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_purc_act_io_all.sub_char3 IS '予備３ // #MS.PURC_ACT_IO_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_purc_act_io_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_purc_act_io_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_purc_act_io_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_purc_act_io_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_purc_act_io_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_purc_act_io_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_purc_act_io_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_purc_act_io_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_purc_act_io_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_purc_act_io_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

