package mcframe.serverMSBC.MSBCL6000;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"MfgInstReg_Chk02_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgInstReg_Chk02_HdrR_MC_A extends MCConstRow {

	/**
	 * Mfg. order data update type 製造指図データ更新区分.<p>
	 *
	 */
	public static final String $mfg_inst_data_crud_typ = "mfg_inst_data_crud_typ";
	/**
	 * Item mfg. order data update type 品目製造指図データ更新区分.<p>
	 *
	 */
	public static final String $itm_mfg_inst_data_crud_typ = "itm_mfg_inst_data_crud_typ";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";
	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public static final String $mfg_mtd_typ = "mfg_mtd_typ";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	/**
	 * Initial mfg. order No. 初回製造指図ＮＯ.<p>
	 *
	 */
	public static final String $frst_mfg_inst_no = "frst_mfg_inst_no";
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ = "mfg_inst_unit_typ";
	/**
	 * Unplanned order 計画外指図.<p>
	 *
	 */
	public static final String $unschd_inst_flg = "unschd_inst_flg";
	/**
	 * Unordered qty. 未指図数量.<p>
	 *
	 */
	public static final String $base_unit_not_inst_qty = "base_unit_not_inst_qty";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_wg_cd = "mfg_loc_wg_cd";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_site_cd = "mfg_loc_site_cd";
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public static final String $po_schd_src_typ = "po_schd_src_typ";
	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public static final String $po_schd_src_no = "po_schd_src_no";
	/**
	 * PO schedule data update type 発注予定データ更新区分.<p>
	 *
	 */
	public static final String $po_schd_data_crud_typ = "po_schd_data_crud_typ";
	/**
	 * Lot No. before update 更新前ロットＮＯ.<p>
	 *
	 */
	public static final String $old_lot_no = "old_lot_no";
	/**
	 * Sublot No. before update 更新前サブロットＮＯ.<p>
	 *
	 */
	public static final String $old_sublot_no = "old_sublot_no";
	/**
	 * Mfg. status type before update 更新前製造状況区分.<p>
	 *
	 */
	public static final String $old_mfg_sts_typ = "old_mfg_sts_typ";
	/**
	 * Mfg. approval status type before update 更新前製造承認状況区分.<p>
	 *
	 */
	public static final String $old_mfg_aprv_sts_typ = "old_mfg_aprv_sts_typ";
	/**
	 * For approval before update 更新前承認対象.<p>
	 *
	 */
	public static final String $old_aprv_flg = "old_aprv_flg";
	/**
	 * Approval role cd. before update 更新前承認役割ＣＤ.<p>
	 *
	 */
	public static final String $old_mfg_aprv_role_cd = "old_mfg_aprv_role_cd";
	/**
	 * Order date before update 更新前指図日.<p>
	 *
	 */
	public static final String $old_inst_dt = "old_inst_dt";
	/**
	 * BOM pattern before update 更新前構成パタン.<p>
	 *
	 */
	public static final String $old_bom_ptn = "old_bom_ptn";
	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public static final String $itm_ord_upd_cntr = "itm_ord_upd_cntr";
	/**
	 * Item mfg. order update counter 品目製造指図更新カウンタ.<p>
	 *
	 */
	public static final String $itm_mfg_inst_upd_cntr = "itm_mfg_inst_upd_cntr";
	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public static final String $mfg_inst_upd_cntr = "mfg_inst_upd_cntr";
	/**
	 * Allow ordered movement cancellation 移動指図済取消可.<p>
	 *
	 */
	public static final String $xfr_inst_del_enable_flg = "xfr_inst_del_enable_flg";
	/**
	 * Bulk execution flg. 一括実行ＦＬＧ.<p>
	 *
	 */
	public static final String $lst_reg_flg = "lst_reg_flg";
	/**
	 * Check for update counter flg. 更新カウンタチェックＦＬＧ.<p>
	 *
	 */
	public static final String $upd_cntr_chk_flg = "upd_cntr_chk_flg";
	/**
	 * Non-initial mfg. order cancellation 初回製造指図以外の取消.<p>
	 *
	 */
	public static final String $not_frst_inst_can_flg = "not_frst_inst_can_flg";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";


	public static final MCMeta mfg_inst_data_crud_typ_META = createCommonMeta($mfg_inst_data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta itm_mfg_inst_data_crud_typ_META = createCommonMeta($itm_mfg_inst_data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta mfg_mtd_typ_META = createCommonMeta($mfg_mtd_typ, mcframe.commonMS.meta.MS_META.MFG_MTD_TYP);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta frst_mfg_inst_no_META = createCommonMeta($frst_mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta mfg_inst_unit_typ_META = createCommonMeta($mfg_inst_unit_typ, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta unschd_inst_flg_META = createCommonMeta($unschd_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_not_inst_qty_META = createCommonMeta($base_unit_not_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mfg_loc_wg_cd_META = createCommonMeta($mfg_loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta mfg_loc_site_cd_META = createCommonMeta($mfg_loc_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta po_schd_src_typ_META = createCommonMeta($po_schd_src_typ, mcframe.commonMS.meta.MS_META.PO_SCHD_SRC_TYP);
	public static final MCMeta po_schd_src_no_META = createCommonMeta($po_schd_src_no, mcframe.commonMA.meta.MA_META.PO_SCHD_SRC_NO);
	public static final MCMeta po_schd_data_crud_typ_META = createCommonMeta($po_schd_data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta old_lot_no_META = createCommonMeta($old_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta old_sublot_no_META = createCommonMeta($old_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta old_mfg_sts_typ_META = createCommonMeta($old_mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta old_mfg_aprv_sts_typ_META = createCommonMeta($old_mfg_aprv_sts_typ, mcframe.commonMS.meta.MS_META.MFG_APRV_STS_TYP);
	public static final MCMeta old_aprv_flg_META = createCommonMeta($old_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_mfg_aprv_role_cd_META = createCommonMeta($old_mfg_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta old_inst_dt_META = createCommonMeta($old_inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta old_bom_ptn_META = createCommonMeta($old_bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta itm_ord_upd_cntr_META = createCommonMeta($itm_ord_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta itm_mfg_inst_upd_cntr_META = createCommonMeta($itm_mfg_inst_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta mfg_inst_upd_cntr_META = createCommonMeta($mfg_inst_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta xfr_inst_del_enable_flg_META = createCommonMeta($xfr_inst_del_enable_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lst_reg_flg_META = createCommonMeta($lst_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta upd_cntr_chk_flg_META = createCommonMeta($upd_cntr_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_frst_inst_can_flg_META = createCommonMeta($not_frst_inst_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);

	protected static final ConstMetaList<MfgInstReg_Chk02_HdrR> constMetas = new ConstMetaList<MfgInstReg_Chk02_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			mfg_inst_data_crud_typ_META,
			itm_mfg_inst_data_crud_typ_META,
			peg_no_META,
			err_flg_META,
			rtn_sts_typ_META,
			mfg_mtd_typ_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			bom_ptn_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			mfg_inst_no_META,
			itm_mfg_inst_no_META,
			frst_mfg_inst_no_META,
			itm_ord_no_META,
			mfg_inst_unit_typ_META,
			unschd_inst_flg_META,
			base_unit_not_inst_qty_META,
			mfg_loc_wg_cd_META,
			mfg_loc_site_cd_META,
			po_d_no_META,
			po_schd_src_typ_META,
			po_schd_src_no_META,
			po_schd_data_crud_typ_META,
			old_lot_no_META,
			old_sublot_no_META,
			old_mfg_sts_typ_META,
			old_mfg_aprv_sts_typ_META,
			old_aprv_flg_META,
			old_mfg_aprv_role_cd_META,
			old_inst_dt_META,
			old_bom_ptn_META,
			itm_ord_upd_cntr_META,
			itm_mfg_inst_upd_cntr_META,
			mfg_inst_upd_cntr_META,
			xfr_inst_del_enable_flg_META,
			lst_reg_flg_META,
			upd_cntr_chk_flg_META,
			not_frst_inst_can_flg_META,
			mfg_loc_cd_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
			}
		))
	);

	/**
	 * クラスに定義されている固定カラム名を配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラム名の配列
	 */
	public static String[] colnames() {
		return constMetas.toNameArray();
	}

	/**
	 * クラスに定義されている固定カラムメタを配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラムメタの配列
	 */
	public static MCMeta[] colmetas() {
		return constMetas.toMetaArray();
	}

	/**
	 * 実際のカラム位置を知るためオフセットです。
	 */
	private static final int offset = constMetas.offset();

	/**
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

	/**
	 * コンストラクタです。
	 */
	protected MfgInstReg_Chk02_HdrR_MC_A(ConstMetaList<? extends MfgInstReg_Chk02_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstReg_Chk02_HdrR clone() {
		return (MfgInstReg_Chk02_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstReg_Chk02_HdrR createInstance() {
		return (MfgInstReg_Chk02_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstReg_Chk02_HdrR getValues(String... names) {
		return (MfgInstReg_Chk02_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Mfg. order data update type 製造指図データ更新区分.<p>
	 *
	 */
	public String mfg_inst_data_crud_typ() {
		return getConstString(offset + 0, $mfg_inst_data_crud_typ);
	}

	/**
	 * Mfg. order data update type 製造指図データ更新区分.<p>
	 *
	 */
	public void mfg_inst_data_crud_typ(String value) {
		setConstString(offset + 0, $mfg_inst_data_crud_typ, value);
	}


	/**
	 * Item mfg. order data update type 品目製造指図データ更新区分.<p>
	 *
	 */
	public String itm_mfg_inst_data_crud_typ() {
		return getConstString(offset + 1, $itm_mfg_inst_data_crud_typ);
	}

	/**
	 * Item mfg. order data update type 品目製造指図データ更新区分.<p>
	 *
	 */
	public void itm_mfg_inst_data_crud_typ(String value) {
		setConstString(offset + 1, $itm_mfg_inst_data_crud_typ, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 2, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 2, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 2, $peg_no, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 3, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 3, $err_flg, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 4, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 4, $rtn_sts_typ, value);
	}


	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public String mfg_mtd_typ() {
		return getConstString(offset + 5, $mfg_mtd_typ);
	}

	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public void mfg_mtd_typ(String value) {
		setConstString(offset + 5, $mfg_mtd_typ, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 6, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 6, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 7, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 7, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 8, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 8, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 9, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 9, $itm_sub3, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 10, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 10, $bom_ptn, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 11, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 11, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 12, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 12, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 13, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 13, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 14, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 14, $sno4, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 15, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 15, $mfg_inst_no, value);
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 16, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 16, $itm_mfg_inst_no, value);
	}


	/**
	 * Initial mfg. order No. 初回製造指図ＮＯ.<p>
	 *
	 */
	public String frst_mfg_inst_no() {
		return getConstString(offset + 17, $frst_mfg_inst_no);
	}

	/**
	 * Initial mfg. order No. 初回製造指図ＮＯ.<p>
	 *
	 */
	public void frst_mfg_inst_no(String value) {
		setConstString(offset + 17, $frst_mfg_inst_no, value);
	}


	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 18, $itm_ord_no);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 18, $itm_ord_no, value);
	}


	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public String mfg_inst_unit_typ() {
		return getConstString(offset + 19, $mfg_inst_unit_typ);
	}

	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public void mfg_inst_unit_typ(String value) {
		setConstString(offset + 19, $mfg_inst_unit_typ, value);
	}


	/**
	 * Unplanned order 計画外指図.<p>
	 *
	 */
	public boolean unschd_inst_flg() {
		return getConstBoolean(offset + 20, $unschd_inst_flg);
	}

	/**
	 * Unplanned order 計画外指図.<p>
	 *
	 */
	public void unschd_inst_flg(boolean value) {
		setConstBoolean(offset + 20, $unschd_inst_flg, value);
	}


	/**
	 * Unordered qty. 未指図数量.<p>
	 *
	 */
	public MCNumber base_unit_not_inst_qty() {
		return getConstNumber(offset + 21, $base_unit_not_inst_qty);
	}

	/**
	 * Unordered qty. 未指図数量.<p>
	 *
	 */
	public void base_unit_not_inst_qty(MCNumber value) {
		setConstNumber(offset + 21, $base_unit_not_inst_qty, value);
	}

	/**
	 * Unordered qty. 未指図数量.<p>
	 *
	 */
	public void base_unit_not_inst_qty(int value) {
		setConstNumber(offset + 21, $base_unit_not_inst_qty, value);
	}

	/**
	 * Unordered qty. 未指図数量.<p>
	 *
	 */
	public void base_unit_not_inst_qty(long value) {
		setConstNumber(offset + 21, $base_unit_not_inst_qty, value);
	}

	/**
	 * Unordered qty. 未指図数量.<p>
	 *
	 */
	public void base_unit_not_inst_qty(float value) {
		setConstNumber(offset + 21, $base_unit_not_inst_qty, value);
	}

	/**
	 * Unordered qty. 未指図数量.<p>
	 *
	 */
	public void base_unit_not_inst_qty(double value) {
		setConstNumber(offset + 21, $base_unit_not_inst_qty, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String mfg_loc_wg_cd() {
		return getConstString(offset + 22, $mfg_loc_wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void mfg_loc_wg_cd(String value) {
		setConstString(offset + 22, $mfg_loc_wg_cd, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String mfg_loc_site_cd() {
		return getConstString(offset + 23, $mfg_loc_site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void mfg_loc_site_cd(String value) {
		setConstString(offset + 23, $mfg_loc_site_cd, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 24, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 24, $po_d_no, value);
	}


	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public String po_schd_src_typ() {
		return getConstString(offset + 25, $po_schd_src_typ);
	}

	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public void po_schd_src_typ(String value) {
		setConstString(offset + 25, $po_schd_src_typ, value);
	}


	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public String po_schd_src_no() {
		return getConstString(offset + 26, $po_schd_src_no);
	}

	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public void po_schd_src_no(String value) {
		setConstString(offset + 26, $po_schd_src_no, value);
	}


	/**
	 * PO schedule data update type 発注予定データ更新区分.<p>
	 *
	 */
	public String po_schd_data_crud_typ() {
		return getConstString(offset + 27, $po_schd_data_crud_typ);
	}

	/**
	 * PO schedule data update type 発注予定データ更新区分.<p>
	 *
	 */
	public void po_schd_data_crud_typ(String value) {
		setConstString(offset + 27, $po_schd_data_crud_typ, value);
	}


	/**
	 * Lot No. before update 更新前ロットＮＯ.<p>
	 *
	 */
	public String old_lot_no() {
		return getConstString(offset + 28, $old_lot_no);
	}

	/**
	 * Lot No. before update 更新前ロットＮＯ.<p>
	 *
	 */
	public void old_lot_no(String value) {
		setConstString(offset + 28, $old_lot_no, value);
	}


	/**
	 * Sublot No. before update 更新前サブロットＮＯ.<p>
	 *
	 */
	public String old_sublot_no() {
		return getConstString(offset + 29, $old_sublot_no);
	}

	/**
	 * Sublot No. before update 更新前サブロットＮＯ.<p>
	 *
	 */
	public void old_sublot_no(String value) {
		setConstString(offset + 29, $old_sublot_no, value);
	}


	/**
	 * Mfg. status type before update 更新前製造状況区分.<p>
	 *
	 */
	public String old_mfg_sts_typ() {
		return getConstString(offset + 30, $old_mfg_sts_typ);
	}

	/**
	 * Mfg. status type before update 更新前製造状況区分.<p>
	 *
	 */
	public void old_mfg_sts_typ(String value) {
		setConstString(offset + 30, $old_mfg_sts_typ, value);
	}


	/**
	 * Mfg. approval status type before update 更新前製造承認状況区分.<p>
	 *
	 */
	public String old_mfg_aprv_sts_typ() {
		return getConstString(offset + 31, $old_mfg_aprv_sts_typ);
	}

	/**
	 * Mfg. approval status type before update 更新前製造承認状況区分.<p>
	 *
	 */
	public void old_mfg_aprv_sts_typ(String value) {
		setConstString(offset + 31, $old_mfg_aprv_sts_typ, value);
	}


	/**
	 * For approval before update 更新前承認対象.<p>
	 *
	 */
	public boolean old_aprv_flg() {
		return getConstBoolean(offset + 32, $old_aprv_flg);
	}

	/**
	 * For approval before update 更新前承認対象.<p>
	 *
	 */
	public void old_aprv_flg(boolean value) {
		setConstBoolean(offset + 32, $old_aprv_flg, value);
	}


	/**
	 * Approval role cd. before update 更新前承認役割ＣＤ.<p>
	 *
	 */
	public String old_mfg_aprv_role_cd() {
		return getConstString(offset + 33, $old_mfg_aprv_role_cd);
	}

	/**
	 * Approval role cd. before update 更新前承認役割ＣＤ.<p>
	 *
	 */
	public void old_mfg_aprv_role_cd(String value) {
		setConstString(offset + 33, $old_mfg_aprv_role_cd, value);
	}


	/**
	 * Order date before update 更新前指図日.<p>
	 *
	 */
	public MCDate old_inst_dt() {
		return getConstDate(offset + 34, $old_inst_dt);
	}

	/**
	 * Order date before update 更新前指図日.<p>
	 *
	 */
	public void old_inst_dt(MCDate value) {
		setConstDate(offset + 34, $old_inst_dt, value);
	}


	/**
	 * BOM pattern before update 更新前構成パタン.<p>
	 *
	 */
	public String old_bom_ptn() {
		return getConstString(offset + 35, $old_bom_ptn);
	}

	/**
	 * BOM pattern before update 更新前構成パタン.<p>
	 *
	 */
	public void old_bom_ptn(String value) {
		setConstString(offset + 35, $old_bom_ptn, value);
	}


	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public MCNumber itm_ord_upd_cntr() {
		return getConstNumber(offset + 36, $itm_ord_upd_cntr);
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public void itm_ord_upd_cntr(MCNumber value) {
		setConstNumber(offset + 36, $itm_ord_upd_cntr, value);
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public void itm_ord_upd_cntr(int value) {
		setConstNumber(offset + 36, $itm_ord_upd_cntr, value);
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public void itm_ord_upd_cntr(long value) {
		setConstNumber(offset + 36, $itm_ord_upd_cntr, value);
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public void itm_ord_upd_cntr(float value) {
		setConstNumber(offset + 36, $itm_ord_upd_cntr, value);
	}

	/**
	 * Item order update counter 品目オーダ更新カウンタ.<p>
	 *
	 */
	public void itm_ord_upd_cntr(double value) {
		setConstNumber(offset + 36, $itm_ord_upd_cntr, value);
	}


	/**
	 * Item mfg. order update counter 品目製造指図更新カウンタ.<p>
	 *
	 */
	public MCNumber itm_mfg_inst_upd_cntr() {
		return getConstNumber(offset + 37, $itm_mfg_inst_upd_cntr);
	}

	/**
	 * Item mfg. order update counter 品目製造指図更新カウンタ.<p>
	 *
	 */
	public void itm_mfg_inst_upd_cntr(MCNumber value) {
		setConstNumber(offset + 37, $itm_mfg_inst_upd_cntr, value);
	}

	/**
	 * Item mfg. order update counter 品目製造指図更新カウンタ.<p>
	 *
	 */
	public void itm_mfg_inst_upd_cntr(int value) {
		setConstNumber(offset + 37, $itm_mfg_inst_upd_cntr, value);
	}

	/**
	 * Item mfg. order update counter 品目製造指図更新カウンタ.<p>
	 *
	 */
	public void itm_mfg_inst_upd_cntr(long value) {
		setConstNumber(offset + 37, $itm_mfg_inst_upd_cntr, value);
	}

	/**
	 * Item mfg. order update counter 品目製造指図更新カウンタ.<p>
	 *
	 */
	public void itm_mfg_inst_upd_cntr(float value) {
		setConstNumber(offset + 37, $itm_mfg_inst_upd_cntr, value);
	}

	/**
	 * Item mfg. order update counter 品目製造指図更新カウンタ.<p>
	 *
	 */
	public void itm_mfg_inst_upd_cntr(double value) {
		setConstNumber(offset + 37, $itm_mfg_inst_upd_cntr, value);
	}


	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public MCNumber mfg_inst_upd_cntr() {
		return getConstNumber(offset + 38, $mfg_inst_upd_cntr);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(MCNumber value) {
		setConstNumber(offset + 38, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(int value) {
		setConstNumber(offset + 38, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(long value) {
		setConstNumber(offset + 38, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(float value) {
		setConstNumber(offset + 38, $mfg_inst_upd_cntr, value);
	}

	/**
	 * Mfg. order update counter 製造指図更新カウンタ.<p>
	 *
	 */
	public void mfg_inst_upd_cntr(double value) {
		setConstNumber(offset + 38, $mfg_inst_upd_cntr, value);
	}


	/**
	 * Allow ordered movement cancellation 移動指図済取消可.<p>
	 *
	 */
	public boolean xfr_inst_del_enable_flg() {
		return getConstBoolean(offset + 39, $xfr_inst_del_enable_flg);
	}

	/**
	 * Allow ordered movement cancellation 移動指図済取消可.<p>
	 *
	 */
	public void xfr_inst_del_enable_flg(boolean value) {
		setConstBoolean(offset + 39, $xfr_inst_del_enable_flg, value);
	}


	/**
	 * Bulk execution flg. 一括実行ＦＬＧ.<p>
	 *
	 */
	public boolean lst_reg_flg() {
		return getConstBoolean(offset + 40, $lst_reg_flg);
	}

	/**
	 * Bulk execution flg. 一括実行ＦＬＧ.<p>
	 *
	 */
	public void lst_reg_flg(boolean value) {
		setConstBoolean(offset + 40, $lst_reg_flg, value);
	}


	/**
	 * Check for update counter flg. 更新カウンタチェックＦＬＧ.<p>
	 *
	 */
	public boolean upd_cntr_chk_flg() {
		return getConstBoolean(offset + 41, $upd_cntr_chk_flg);
	}

	/**
	 * Check for update counter flg. 更新カウンタチェックＦＬＧ.<p>
	 *
	 */
	public void upd_cntr_chk_flg(boolean value) {
		setConstBoolean(offset + 41, $upd_cntr_chk_flg, value);
	}


	/**
	 * Non-initial mfg. order cancellation 初回製造指図以外の取消.<p>
	 *
	 */
	public boolean not_frst_inst_can_flg() {
		return getConstBoolean(offset + 42, $not_frst_inst_can_flg);
	}

	/**
	 * Non-initial mfg. order cancellation 初回製造指図以外の取消.<p>
	 *
	 */
	public void not_frst_inst_can_flg(boolean value) {
		setConstBoolean(offset + 42, $not_frst_inst_can_flg, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 43, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 43, $mfg_loc_cd, value);
	}


	public String getString(String name) {
		if ($mfg_inst_data_crud_typ.equalsIgnoreCase(name)) {
			return mfg_inst_data_crud_typ();
		}
		if ($itm_mfg_inst_data_crud_typ.equalsIgnoreCase(name)) {
			return itm_mfg_inst_data_crud_typ();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($frst_mfg_inst_no.equalsIgnoreCase(name)) {
			return frst_mfg_inst_no();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			return mfg_loc_wg_cd();
		}
		if ($mfg_loc_site_cd.equalsIgnoreCase(name)) {
			return mfg_loc_site_cd();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($po_schd_src_typ.equalsIgnoreCase(name)) {
			return po_schd_src_typ();
		}
		if ($po_schd_src_no.equalsIgnoreCase(name)) {
			return po_schd_src_no();
		}
		if ($po_schd_data_crud_typ.equalsIgnoreCase(name)) {
			return po_schd_data_crud_typ();
		}
		if ($old_lot_no.equalsIgnoreCase(name)) {
			return old_lot_no();
		}
		if ($old_sublot_no.equalsIgnoreCase(name)) {
			return old_sublot_no();
		}
		if ($old_mfg_sts_typ.equalsIgnoreCase(name)) {
			return old_mfg_sts_typ();
		}
		if ($old_mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return old_mfg_aprv_sts_typ();
		}
		if ($old_mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			return old_mfg_aprv_role_cd();
		}
		if ($old_bom_ptn.equalsIgnoreCase(name)) {
			return old_bom_ptn();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($base_unit_not_inst_qty.equalsIgnoreCase(name)) {
			return base_unit_not_inst_qty();
		}
		if ($itm_ord_upd_cntr.equalsIgnoreCase(name)) {
			return itm_ord_upd_cntr();
		}
		if ($itm_mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			return itm_mfg_inst_upd_cntr();
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			return mfg_inst_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($old_inst_dt.equalsIgnoreCase(name)) {
			return old_inst_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($unschd_inst_flg.equalsIgnoreCase(name)) {
			return unschd_inst_flg();
		}
		if ($old_aprv_flg.equalsIgnoreCase(name)) {
			return old_aprv_flg();
		}
		if ($xfr_inst_del_enable_flg.equalsIgnoreCase(name)) {
			return xfr_inst_del_enable_flg();
		}
		if ($lst_reg_flg.equalsIgnoreCase(name)) {
			return lst_reg_flg();
		}
		if ($upd_cntr_chk_flg.equalsIgnoreCase(name)) {
			return upd_cntr_chk_flg();
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			return not_frst_inst_can_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($mfg_inst_data_crud_typ.equalsIgnoreCase(name)) {
			return mfg_inst_data_crud_typ();
		}
		if ($itm_mfg_inst_data_crud_typ.equalsIgnoreCase(name)) {
			return itm_mfg_inst_data_crud_typ();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($frst_mfg_inst_no.equalsIgnoreCase(name)) {
			return frst_mfg_inst_no();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			return mfg_loc_wg_cd();
		}
		if ($mfg_loc_site_cd.equalsIgnoreCase(name)) {
			return mfg_loc_site_cd();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($po_schd_src_typ.equalsIgnoreCase(name)) {
			return po_schd_src_typ();
		}
		if ($po_schd_src_no.equalsIgnoreCase(name)) {
			return po_schd_src_no();
		}
		if ($po_schd_data_crud_typ.equalsIgnoreCase(name)) {
			return po_schd_data_crud_typ();
		}
		if ($old_lot_no.equalsIgnoreCase(name)) {
			return old_lot_no();
		}
		if ($old_sublot_no.equalsIgnoreCase(name)) {
			return old_sublot_no();
		}
		if ($old_mfg_sts_typ.equalsIgnoreCase(name)) {
			return old_mfg_sts_typ();
		}
		if ($old_mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return old_mfg_aprv_sts_typ();
		}
		if ($old_mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			return old_mfg_aprv_role_cd();
		}
		if ($old_bom_ptn.equalsIgnoreCase(name)) {
			return old_bom_ptn();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($base_unit_not_inst_qty.equalsIgnoreCase(name)) {
			return base_unit_not_inst_qty();
		}
		if ($itm_ord_upd_cntr.equalsIgnoreCase(name)) {
			return itm_ord_upd_cntr();
		}
		if ($itm_mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			return itm_mfg_inst_upd_cntr();
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			return mfg_inst_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($old_inst_dt.equalsIgnoreCase(name)) {
			return old_inst_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($unschd_inst_flg.equalsIgnoreCase(name)) {
			return unschd_inst_flg();
		}
		if ($old_aprv_flg.equalsIgnoreCase(name)) {
			return old_aprv_flg();
		}
		if ($xfr_inst_del_enable_flg.equalsIgnoreCase(name)) {
			return xfr_inst_del_enable_flg();
		}
		if ($lst_reg_flg.equalsIgnoreCase(name)) {
			return lst_reg_flg();
		}
		if ($upd_cntr_chk_flg.equalsIgnoreCase(name)) {
			return upd_cntr_chk_flg();
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			return not_frst_inst_can_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($mfg_inst_data_crud_typ.equalsIgnoreCase(name)) {
			mfg_inst_data_crud_typ(value);
			return;
		}
		if ($itm_mfg_inst_data_crud_typ.equalsIgnoreCase(name)) {
			itm_mfg_inst_data_crud_typ(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($frst_mfg_inst_no.equalsIgnoreCase(name)) {
			frst_mfg_inst_no(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			mfg_loc_wg_cd(value);
			return;
		}
		if ($mfg_loc_site_cd.equalsIgnoreCase(name)) {
			mfg_loc_site_cd(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($po_schd_src_typ.equalsIgnoreCase(name)) {
			po_schd_src_typ(value);
			return;
		}
		if ($po_schd_src_no.equalsIgnoreCase(name)) {
			po_schd_src_no(value);
			return;
		}
		if ($po_schd_data_crud_typ.equalsIgnoreCase(name)) {
			po_schd_data_crud_typ(value);
			return;
		}
		if ($old_lot_no.equalsIgnoreCase(name)) {
			old_lot_no(value);
			return;
		}
		if ($old_sublot_no.equalsIgnoreCase(name)) {
			old_sublot_no(value);
			return;
		}
		if ($old_mfg_sts_typ.equalsIgnoreCase(name)) {
			old_mfg_sts_typ(value);
			return;
		}
		if ($old_mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			old_mfg_aprv_sts_typ(value);
			return;
		}
		if ($old_mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			old_mfg_aprv_role_cd(value);
			return;
		}
		if ($old_bom_ptn.equalsIgnoreCase(name)) {
			old_bom_ptn(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_not_inst_qty.equalsIgnoreCase(name)) {
			base_unit_not_inst_qty(value);
			return;
		}
		if ($itm_ord_upd_cntr.equalsIgnoreCase(name)) {
			itm_ord_upd_cntr(value);
			return;
		}
		if ($itm_mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			itm_mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_not_inst_qty.equalsIgnoreCase(name)) {
			base_unit_not_inst_qty(value);
			return;
		}
		if ($itm_ord_upd_cntr.equalsIgnoreCase(name)) {
			itm_ord_upd_cntr(value);
			return;
		}
		if ($itm_mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			itm_mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_not_inst_qty.equalsIgnoreCase(name)) {
			base_unit_not_inst_qty(value);
			return;
		}
		if ($itm_ord_upd_cntr.equalsIgnoreCase(name)) {
			itm_ord_upd_cntr(value);
			return;
		}
		if ($itm_mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			itm_mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_not_inst_qty.equalsIgnoreCase(name)) {
			base_unit_not_inst_qty(value);
			return;
		}
		if ($itm_ord_upd_cntr.equalsIgnoreCase(name)) {
			itm_ord_upd_cntr(value);
			return;
		}
		if ($itm_mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			itm_mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_not_inst_qty.equalsIgnoreCase(name)) {
			base_unit_not_inst_qty(value);
			return;
		}
		if ($itm_ord_upd_cntr.equalsIgnoreCase(name)) {
			itm_ord_upd_cntr(value);
			return;
		}
		if ($itm_mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			itm_mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($old_inst_dt.equalsIgnoreCase(name)) {
			old_inst_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($unschd_inst_flg.equalsIgnoreCase(name)) {
			unschd_inst_flg(value);
			return;
		}
		if ($old_aprv_flg.equalsIgnoreCase(name)) {
			old_aprv_flg(value);
			return;
		}
		if ($xfr_inst_del_enable_flg.equalsIgnoreCase(name)) {
			xfr_inst_del_enable_flg(value);
			return;
		}
		if ($lst_reg_flg.equalsIgnoreCase(name)) {
			lst_reg_flg(value);
			return;
		}
		if ($upd_cntr_chk_flg.equalsIgnoreCase(name)) {
			upd_cntr_chk_flg(value);
			return;
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			not_frst_inst_can_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mfg_inst_data_crud_typ.equalsIgnoreCase(name)) {
			mfg_inst_data_crud_typ(value);
			return;
		}
		if ($itm_mfg_inst_data_crud_typ.equalsIgnoreCase(name)) {
			itm_mfg_inst_data_crud_typ(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($frst_mfg_inst_no.equalsIgnoreCase(name)) {
			frst_mfg_inst_no(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			mfg_loc_wg_cd(value);
			return;
		}
		if ($mfg_loc_site_cd.equalsIgnoreCase(name)) {
			mfg_loc_site_cd(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($po_schd_src_typ.equalsIgnoreCase(name)) {
			po_schd_src_typ(value);
			return;
		}
		if ($po_schd_src_no.equalsIgnoreCase(name)) {
			po_schd_src_no(value);
			return;
		}
		if ($po_schd_data_crud_typ.equalsIgnoreCase(name)) {
			po_schd_data_crud_typ(value);
			return;
		}
		if ($old_lot_no.equalsIgnoreCase(name)) {
			old_lot_no(value);
			return;
		}
		if ($old_sublot_no.equalsIgnoreCase(name)) {
			old_sublot_no(value);
			return;
		}
		if ($old_mfg_sts_typ.equalsIgnoreCase(name)) {
			old_mfg_sts_typ(value);
			return;
		}
		if ($old_mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			old_mfg_aprv_sts_typ(value);
			return;
		}
		if ($old_mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			old_mfg_aprv_role_cd(value);
			return;
		}
		if ($old_bom_ptn.equalsIgnoreCase(name)) {
			old_bom_ptn(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_not_inst_qty.equalsIgnoreCase(name)) {
			base_unit_not_inst_qty(value);
			return;
		}
		if ($itm_ord_upd_cntr.equalsIgnoreCase(name)) {
			itm_ord_upd_cntr(value);
			return;
		}
		if ($itm_mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			itm_mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_not_inst_qty.equalsIgnoreCase(name)) {
			base_unit_not_inst_qty(value);
			return;
		}
		if ($itm_ord_upd_cntr.equalsIgnoreCase(name)) {
			itm_ord_upd_cntr(value);
			return;
		}
		if ($itm_mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			itm_mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_not_inst_qty.equalsIgnoreCase(name)) {
			base_unit_not_inst_qty(value);
			return;
		}
		if ($itm_ord_upd_cntr.equalsIgnoreCase(name)) {
			itm_ord_upd_cntr(value);
			return;
		}
		if ($itm_mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			itm_mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_not_inst_qty.equalsIgnoreCase(name)) {
			base_unit_not_inst_qty(value);
			return;
		}
		if ($itm_ord_upd_cntr.equalsIgnoreCase(name)) {
			itm_ord_upd_cntr(value);
			return;
		}
		if ($itm_mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			itm_mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($base_unit_not_inst_qty.equalsIgnoreCase(name)) {
			base_unit_not_inst_qty(value);
			return;
		}
		if ($itm_ord_upd_cntr.equalsIgnoreCase(name)) {
			itm_ord_upd_cntr(value);
			return;
		}
		if ($itm_mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			itm_mfg_inst_upd_cntr(value);
			return;
		}
		if ($mfg_inst_upd_cntr.equalsIgnoreCase(name)) {
			mfg_inst_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($old_inst_dt.equalsIgnoreCase(name)) {
			old_inst_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($unschd_inst_flg.equalsIgnoreCase(name)) {
			unschd_inst_flg(value);
			return;
		}
		if ($old_aprv_flg.equalsIgnoreCase(name)) {
			old_aprv_flg(value);
			return;
		}
		if ($xfr_inst_del_enable_flg.equalsIgnoreCase(name)) {
			xfr_inst_del_enable_flg(value);
			return;
		}
		if ($lst_reg_flg.equalsIgnoreCase(name)) {
			lst_reg_flg(value);
			return;
		}
		if ($upd_cntr_chk_flg.equalsIgnoreCase(name)) {
			upd_cntr_chk_flg(value);
			return;
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			not_frst_inst_can_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

