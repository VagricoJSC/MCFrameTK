package mcframe.serverMSBF.MSBFL5200;

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
 * ブロック"LotTrace_Srch01_RsltGr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class LotTrace_Srch01_RsltGrR_MC_A extends MCConstRow {

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	/**
	 * Inventory transfer result No. 在庫振替実績ＮＯ.<p>
	 *
	 */
	public static final String $stk_xfr_act_no = "stk_xfr_act_no";
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public static final String $mfg_act_no = "mfg_act_no";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Transaction pattern type name 取引パタン区分名.<p>
	 *
	 */
	public static final String $trd_ptn_typ_nm = "trd_ptn_typ_nm";
	/**
	 * GR/GI type 受払区分.<p>
	 *
	 */
	public static final String $io_act_typ = "io_act_typ";
	/**
	 * GR/GI type name 受払区分名.<p>
	 *
	 */
	public static final String $io_act_typ_nm = "io_act_typ_nm";
	/**
	 * Slip No. 伝票ＮＯ.<p>
	 *
	 */
	public static final String $slip_no = "slip_no";
	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public static final String $io_schd_typ = "io_schd_typ";
	/**
	 * GR/GI schedule type name 受払予定区分名.<p>
	 *
	 */
	public static final String $io_schd_typ_nm = "io_schd_typ_nm";
	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public static final String $io_schd_sts_typ = "io_schd_sts_typ";
	/**
	 * GR/GI schedule status type 受払予定状況区分名.<p>
	 *
	 */
	public static final String $io_schd_sts_typ_nm = "io_schd_sts_typ_nm";
	/**
	 * GR/GI schedule slip No. 受払予定伝票ＮＯ.<p>
	 *
	 */
	public static final String $slip_schd_no = "slip_schd_no";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
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
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
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
	 * GR qty. 入庫数.<p>
	 *
	 */
	public static final String $base_gr_qty = "base_gr_qty";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_dec_place = "base_dec_place";
	/**
	 * Scheduled date 予定日.<p>
	 *
	 */
	public static final String $schd_dt = "schd_dt";
	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public static final String $act_dt = "act_dt";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public static final String $mfg_loc_nm = "mfg_loc_nm";
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public static final String $strg_loc_cd = "strg_loc_cd";
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public static final String $strg_loc_nm = "strg_loc_nm";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 * Schedule/Result type 予定実績区分.<p>
	 *
	 */
	public static final String $schd_act_typ = "schd_act_typ";
	/**
	 * Schedule/result type name 予定実績区分名.<p>
	 *
	 */
	public static final String $schd_act_typ_nm = "schd_act_typ_nm";
	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ = "mfg_inst_unit_typ";
	/**
	 * Mfg. order unit type name 製造指図単位区分名.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ_nm = "mfg_inst_unit_typ_nm";
	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public static final String $lot_rmrks = "lot_rmrks";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Entry user 登録ユーザ.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Entry function 登録機能.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public static final String $ins_func_nm = "ins_func_nm";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	/**
	 * Update user 更新ユーザ.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update function 更新機能.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public static final String $upd_func_nm = "upd_func_nm";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";


	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta stk_xfr_act_no_META = createCommonMeta($stk_xfr_act_no, mcframe.commonMA.meta.MA_META.STK_XFR_ACT_NO);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta trd_ptn_typ_nm_META = createCommonMeta($trd_ptn_typ_nm, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP_NM);
	public static final MCMeta io_act_typ_META = createCommonMeta($io_act_typ, mcframe.commonMS.meta.MS_META.IO_ACT_TYP);
	public static final MCMeta io_act_typ_nm_META = createCommonMeta($io_act_typ_nm, mcframe.commonMS.meta.MS_META.IO_ACT_TYP_NM);
	public static final MCMeta slip_no_META = createCommonMeta($slip_no, mcframe.commonMA.meta.MA_META.SLIP_NO);
	public static final MCMeta io_schd_typ_META = createCommonMeta($io_schd_typ, mcframe.commonMS.meta.MS_META.IO_SCHD_TYP);
	public static final MCMeta io_schd_typ_nm_META = createCommonMeta($io_schd_typ_nm, mcframe.commonMS.meta.MS_META.IO_SCHD_TYP_NM);
	public static final MCMeta io_schd_sts_typ_META = createCommonMeta($io_schd_sts_typ, mcframe.commonMS.meta.MS_META.IO_SCHD_STS_TYP);
	public static final MCMeta io_schd_sts_typ_nm_META = createCommonMeta($io_schd_sts_typ_nm, mcframe.commonMS.meta.MS_META.IO_SCHD_STS_TYP_NM);
	public static final MCMeta slip_schd_no_META = createCommonMeta($slip_schd_no, mcframe.commonMA.meta.MA_META.SLIP_SCHD_NO);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta base_gr_qty_META = createCommonMeta($base_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_dec_place_META = createCommonMeta($base_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta schd_dt_META = createCommonMeta($schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta act_dt_META = createCommonMeta($act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta strg_loc_nm_META = createCommonMeta($strg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta schd_act_typ_META = createCommonMeta($schd_act_typ, mcframe.commonMS.meta.MS_META.SCHD_ACT_TYP);
	public static final MCMeta schd_act_typ_nm_META = createCommonMeta($schd_act_typ_nm, mcframe.commonMS.meta.MS_META.SCHD_ACT_TYP_NM);
	public static final MCMeta mfg_inst_unit_typ_META = createCommonMeta($mfg_inst_unit_typ, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta mfg_inst_unit_typ_nm_META = createCommonMeta($mfg_inst_unit_typ_nm, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP_NM);
	public static final MCMeta lot_rmrks_META = createCommonMeta($lot_rmrks, mcframe.commonMS.meta.MS_META.LOT_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.LOT_TRACE_GR_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.LOT_TRACE_GR_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.LOT_TRACE_GR_SUB_CHAR3);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);

	protected static final ConstMetaList<LotTrace_Srch01_RsltGrR> constMetas = new ConstMetaList<LotTrace_Srch01_RsltGrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_mfg_inst_no_META,
			stk_xfr_act_no_META,
			mfg_act_no_META,
			trd_ptn_typ_META,
			trd_ptn_typ_nm_META,
			io_act_typ_META,
			io_act_typ_nm_META,
			slip_no_META,
			io_schd_typ_META,
			io_schd_typ_nm_META,
			io_schd_sts_typ_META,
			io_schd_sts_typ_nm_META,
			slip_schd_no_META,
			itm_cd_META,
			itm_nm_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			lot_no_META,
			sublot_no_META,
			ver_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			base_gr_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_dec_place_META,
			schd_dt_META,
			act_dt_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			strg_loc_cd_META,
			strg_loc_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			schd_act_typ_META,
			schd_act_typ_nm_META,
			mfg_inst_unit_typ_META,
			mfg_inst_unit_typ_nm_META,
			lot_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_ts_META,
			ins_func_id_META,
			ins_func_nm_META,
			upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_ts_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_srv_req_no_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$trd_ptn_typ, "MAC_TRD_PTN_TYP"},	// trd_ptn_typ
				{$io_act_typ, "MSC_IO_ACT_TYP"},	// io_act_typ
				{$io_schd_typ, "MSC_IO_SCHD_TYP"},	// io_schd_typ
				{$io_schd_sts_typ, "MSC_IO_SCHD_STS_TYP"},	// io_schd_sts_typ
				{$schd_act_typ, "MSC_SCHD_ACT_TYP"},	// schd_act_typ
				{$mfg_inst_unit_typ, "MAC_MFG_INST_UNIT_TYP"}	// mfg_inst_unit_typ
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
	protected LotTrace_Srch01_RsltGrR_MC_A(ConstMetaList<? extends LotTrace_Srch01_RsltGrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LotTrace_Srch01_RsltGrR clone() {
		return (LotTrace_Srch01_RsltGrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LotTrace_Srch01_RsltGrR createInstance() {
		return (LotTrace_Srch01_RsltGrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LotTrace_Srch01_RsltGrR getValues(String... names) {
		return (LotTrace_Srch01_RsltGrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 0, $itm_mfg_inst_no);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 0, $itm_mfg_inst_no, value);
	}


	/**
	 * Inventory transfer result No. 在庫振替実績ＮＯ.<p>
	 *
	 */
	public String stk_xfr_act_no() {
		return getConstString(offset + 1, $stk_xfr_act_no);
	}

	/**
	 * Inventory transfer result No. 在庫振替実績ＮＯ.<p>
	 *
	 */
	public void stk_xfr_act_no(String value) {
		setConstString(offset + 1, $stk_xfr_act_no, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 2, $mfg_act_no);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 2, $mfg_act_no, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 3, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 3, $trd_ptn_typ, value);
	}


	/**
	 * Transaction pattern type name 取引パタン区分名.<p>
	 *
	 */
	public String trd_ptn_typ_nm() {
		return getConstString(offset + 4, $trd_ptn_typ_nm);
	}

	/**
	 * Transaction pattern type name 取引パタン区分名.<p>
	 *
	 */
	public void trd_ptn_typ_nm(String value) {
		setConstString(offset + 4, $trd_ptn_typ_nm, value);
	}


	/**
	 * GR/GI type 受払区分.<p>
	 *
	 */
	public String io_act_typ() {
		return getConstString(offset + 5, $io_act_typ);
	}

	/**
	 * GR/GI type 受払区分.<p>
	 *
	 */
	public void io_act_typ(String value) {
		setConstString(offset + 5, $io_act_typ, value);
	}


	/**
	 * GR/GI type name 受払区分名.<p>
	 *
	 */
	public String io_act_typ_nm() {
		return getConstString(offset + 6, $io_act_typ_nm);
	}

	/**
	 * GR/GI type name 受払区分名.<p>
	 *
	 */
	public void io_act_typ_nm(String value) {
		setConstString(offset + 6, $io_act_typ_nm, value);
	}


	/**
	 * Slip No. 伝票ＮＯ.<p>
	 *
	 */
	public String slip_no() {
		return getConstString(offset + 7, $slip_no);
	}

	/**
	 * Slip No. 伝票ＮＯ.<p>
	 *
	 */
	public void slip_no(String value) {
		setConstString(offset + 7, $slip_no, value);
	}


	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public String io_schd_typ() {
		return getConstString(offset + 8, $io_schd_typ);
	}

	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public void io_schd_typ(String value) {
		setConstString(offset + 8, $io_schd_typ, value);
	}


	/**
	 * GR/GI schedule type name 受払予定区分名.<p>
	 *
	 */
	public String io_schd_typ_nm() {
		return getConstString(offset + 9, $io_schd_typ_nm);
	}

	/**
	 * GR/GI schedule type name 受払予定区分名.<p>
	 *
	 */
	public void io_schd_typ_nm(String value) {
		setConstString(offset + 9, $io_schd_typ_nm, value);
	}


	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public String io_schd_sts_typ() {
		return getConstString(offset + 10, $io_schd_sts_typ);
	}

	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public void io_schd_sts_typ(String value) {
		setConstString(offset + 10, $io_schd_sts_typ, value);
	}


	/**
	 * GR/GI schedule status type 受払予定状況区分名.<p>
	 *
	 */
	public String io_schd_sts_typ_nm() {
		return getConstString(offset + 11, $io_schd_sts_typ_nm);
	}

	/**
	 * GR/GI schedule status type 受払予定状況区分名.<p>
	 *
	 */
	public void io_schd_sts_typ_nm(String value) {
		setConstString(offset + 11, $io_schd_sts_typ_nm, value);
	}


	/**
	 * GR/GI schedule slip No. 受払予定伝票ＮＯ.<p>
	 *
	 */
	public String slip_schd_no() {
		return getConstString(offset + 12, $slip_schd_no);
	}

	/**
	 * GR/GI schedule slip No. 受払予定伝票ＮＯ.<p>
	 *
	 */
	public void slip_schd_no(String value) {
		setConstString(offset + 12, $slip_schd_no, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 13, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 13, $itm_cd, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 14, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 14, $itm_nm, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 15, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 15, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 16, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 16, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 17, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 17, $itm_sub3, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 18, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 18, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 19, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 19, $sublot_no, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 20, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 20, $ver_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 21, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 21, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 22, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 22, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 23, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 23, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 24, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 24, $sno4, value);
	}


	/**
	 * GR qty. 入庫数.<p>
	 *
	 */
	public MCNumber base_gr_qty() {
		return getConstNumber(offset + 25, $base_gr_qty);
	}

	/**
	 * GR qty. 入庫数.<p>
	 *
	 */
	public void base_gr_qty(MCNumber value) {
		setConstNumber(offset + 25, $base_gr_qty, value);
	}

	/**
	 * GR qty. 入庫数.<p>
	 *
	 */
	public void base_gr_qty(int value) {
		setConstNumber(offset + 25, $base_gr_qty, value);
	}

	/**
	 * GR qty. 入庫数.<p>
	 *
	 */
	public void base_gr_qty(long value) {
		setConstNumber(offset + 25, $base_gr_qty, value);
	}

	/**
	 * GR qty. 入庫数.<p>
	 *
	 */
	public void base_gr_qty(float value) {
		setConstNumber(offset + 25, $base_gr_qty, value);
	}

	/**
	 * GR qty. 入庫数.<p>
	 *
	 */
	public void base_gr_qty(double value) {
		setConstNumber(offset + 25, $base_gr_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 26, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 26, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 27, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 27, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_dec_place() {
		return getConstNumber(offset + 28, $base_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(MCNumber value) {
		setConstNumber(offset + 28, $base_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(int value) {
		setConstNumber(offset + 28, $base_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(long value) {
		setConstNumber(offset + 28, $base_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(float value) {
		setConstNumber(offset + 28, $base_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(double value) {
		setConstNumber(offset + 28, $base_dec_place, value);
	}


	/**
	 * Scheduled date 予定日.<p>
	 *
	 */
	public MCDate schd_dt() {
		return getConstDate(offset + 29, $schd_dt);
	}

	/**
	 * Scheduled date 予定日.<p>
	 *
	 */
	public void schd_dt(MCDate value) {
		setConstDate(offset + 29, $schd_dt, value);
	}


	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public MCDate act_dt() {
		return getConstDate(offset + 30, $act_dt);
	}

	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public void act_dt(MCDate value) {
		setConstDate(offset + 30, $act_dt, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 31, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 31, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 32, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 32, $mfg_loc_nm, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 33, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 33, $strg_loc_cd, value);
	}


	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public String strg_loc_nm() {
		return getConstString(offset + 34, $strg_loc_nm);
	}

	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public void strg_loc_nm(String value) {
		setConstString(offset + 34, $strg_loc_nm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 35, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 35, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 36, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 36, $sppl_nm, value);
	}


	/**
	 * Schedule/Result type 予定実績区分.<p>
	 *
	 */
	public String schd_act_typ() {
		return getConstString(offset + 37, $schd_act_typ);
	}

	/**
	 * Schedule/Result type 予定実績区分.<p>
	 *
	 */
	public void schd_act_typ(String value) {
		setConstString(offset + 37, $schd_act_typ, value);
	}


	/**
	 * Schedule/result type name 予定実績区分名.<p>
	 *
	 */
	public String schd_act_typ_nm() {
		return getConstString(offset + 38, $schd_act_typ_nm);
	}

	/**
	 * Schedule/result type name 予定実績区分名.<p>
	 *
	 */
	public void schd_act_typ_nm(String value) {
		setConstString(offset + 38, $schd_act_typ_nm, value);
	}


	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public String mfg_inst_unit_typ() {
		return getConstString(offset + 39, $mfg_inst_unit_typ);
	}

	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public void mfg_inst_unit_typ(String value) {
		setConstString(offset + 39, $mfg_inst_unit_typ, value);
	}


	/**
	 * Mfg. order unit type name 製造指図単位区分名.<p>
	 *
	 */
	public String mfg_inst_unit_typ_nm() {
		return getConstString(offset + 40, $mfg_inst_unit_typ_nm);
	}

	/**
	 * Mfg. order unit type name 製造指図単位区分名.<p>
	 *
	 */
	public void mfg_inst_unit_typ_nm(String value) {
		setConstString(offset + 40, $mfg_inst_unit_typ_nm, value);
	}


	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public String lot_rmrks() {
		return getConstString(offset + 41, $lot_rmrks);
	}

	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public void lot_rmrks(String value) {
		setConstString(offset + 41, $lot_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 42, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 42, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 43, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 43, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 44, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 44, $sub_char3, value);
	}


	/**
	 * Entry user 登録ユーザ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 45, $ins_usr_id);
	}

	/**
	 * Entry user 登録ユーザ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 45, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 46, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 46, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 47, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 47, $ins_ts, value);
	}


	/**
	 * Entry function 登録機能.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 48, $ins_func_id);
	}

	/**
	 * Entry function 登録機能.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 48, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 49, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 49, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 50, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 50, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 50, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 50, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 50, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 50, $upd_cntr, value);
	}


	/**
	 * Update user 更新ユーザ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 51, $upd_usr_id);
	}

	/**
	 * Update user 更新ユーザ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 51, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 52, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 52, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 53, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 53, $upd_ts, value);
	}


	/**
	 * Update function 更新機能.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 54, $upd_func_id);
	}

	/**
	 * Update function 更新機能.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 54, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 55, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 55, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 56, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 56, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($stk_xfr_act_no.equalsIgnoreCase(name)) {
			return stk_xfr_act_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($trd_ptn_typ_nm.equalsIgnoreCase(name)) {
			return trd_ptn_typ_nm();
		}
		if ($io_act_typ.equalsIgnoreCase(name)) {
			return io_act_typ();
		}
		if ($io_act_typ_nm.equalsIgnoreCase(name)) {
			return io_act_typ_nm();
		}
		if ($slip_no.equalsIgnoreCase(name)) {
			return slip_no();
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			return io_schd_typ();
		}
		if ($io_schd_typ_nm.equalsIgnoreCase(name)) {
			return io_schd_typ_nm();
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			return io_schd_sts_typ();
		}
		if ($io_schd_sts_typ_nm.equalsIgnoreCase(name)) {
			return io_schd_sts_typ_nm();
		}
		if ($slip_schd_no.equalsIgnoreCase(name)) {
			return slip_schd_no();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($schd_act_typ.equalsIgnoreCase(name)) {
			return schd_act_typ();
		}
		if ($schd_act_typ_nm.equalsIgnoreCase(name)) {
			return schd_act_typ_nm();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($mfg_inst_unit_typ_nm.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ_nm();
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			return lot_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($base_gr_qty.equalsIgnoreCase(name)) {
			return base_gr_qty();
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			return base_dec_place();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($schd_dt.equalsIgnoreCase(name)) {
			return schd_dt();
		}
		if ($act_dt.equalsIgnoreCase(name)) {
			return act_dt();
		}
		return super.getDate(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}

	public String getStringNE(String name) {
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($stk_xfr_act_no.equalsIgnoreCase(name)) {
			return stk_xfr_act_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($trd_ptn_typ_nm.equalsIgnoreCase(name)) {
			return trd_ptn_typ_nm();
		}
		if ($io_act_typ.equalsIgnoreCase(name)) {
			return io_act_typ();
		}
		if ($io_act_typ_nm.equalsIgnoreCase(name)) {
			return io_act_typ_nm();
		}
		if ($slip_no.equalsIgnoreCase(name)) {
			return slip_no();
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			return io_schd_typ();
		}
		if ($io_schd_typ_nm.equalsIgnoreCase(name)) {
			return io_schd_typ_nm();
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			return io_schd_sts_typ();
		}
		if ($io_schd_sts_typ_nm.equalsIgnoreCase(name)) {
			return io_schd_sts_typ_nm();
		}
		if ($slip_schd_no.equalsIgnoreCase(name)) {
			return slip_schd_no();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($schd_act_typ.equalsIgnoreCase(name)) {
			return schd_act_typ();
		}
		if ($schd_act_typ_nm.equalsIgnoreCase(name)) {
			return schd_act_typ_nm();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($mfg_inst_unit_typ_nm.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ_nm();
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			return lot_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($base_gr_qty.equalsIgnoreCase(name)) {
			return base_gr_qty();
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			return base_dec_place();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($schd_dt.equalsIgnoreCase(name)) {
			return schd_dt();
		}
		if ($act_dt.equalsIgnoreCase(name)) {
			return act_dt();
		}
		return super.getDateNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}

	public void setString(String name, String value) {
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($stk_xfr_act_no.equalsIgnoreCase(name)) {
			stk_xfr_act_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($trd_ptn_typ_nm.equalsIgnoreCase(name)) {
			trd_ptn_typ_nm(value);
			return;
		}
		if ($io_act_typ.equalsIgnoreCase(name)) {
			io_act_typ(value);
			return;
		}
		if ($io_act_typ_nm.equalsIgnoreCase(name)) {
			io_act_typ_nm(value);
			return;
		}
		if ($slip_no.equalsIgnoreCase(name)) {
			slip_no(value);
			return;
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			io_schd_typ(value);
			return;
		}
		if ($io_schd_typ_nm.equalsIgnoreCase(name)) {
			io_schd_typ_nm(value);
			return;
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			io_schd_sts_typ(value);
			return;
		}
		if ($io_schd_sts_typ_nm.equalsIgnoreCase(name)) {
			io_schd_sts_typ_nm(value);
			return;
		}
		if ($slip_schd_no.equalsIgnoreCase(name)) {
			slip_schd_no(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($schd_act_typ.equalsIgnoreCase(name)) {
			schd_act_typ(value);
			return;
		}
		if ($schd_act_typ_nm.equalsIgnoreCase(name)) {
			schd_act_typ_nm(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($mfg_inst_unit_typ_nm.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ_nm(value);
			return;
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			lot_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($base_gr_qty.equalsIgnoreCase(name)) {
			base_gr_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($base_gr_qty.equalsIgnoreCase(name)) {
			base_gr_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($base_gr_qty.equalsIgnoreCase(name)) {
			base_gr_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($base_gr_qty.equalsIgnoreCase(name)) {
			base_gr_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($base_gr_qty.equalsIgnoreCase(name)) {
			base_gr_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($schd_dt.equalsIgnoreCase(name)) {
			schd_dt(value);
			return;
		}
		if ($act_dt.equalsIgnoreCase(name)) {
			act_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($stk_xfr_act_no.equalsIgnoreCase(name)) {
			stk_xfr_act_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($trd_ptn_typ_nm.equalsIgnoreCase(name)) {
			trd_ptn_typ_nm(value);
			return;
		}
		if ($io_act_typ.equalsIgnoreCase(name)) {
			io_act_typ(value);
			return;
		}
		if ($io_act_typ_nm.equalsIgnoreCase(name)) {
			io_act_typ_nm(value);
			return;
		}
		if ($slip_no.equalsIgnoreCase(name)) {
			slip_no(value);
			return;
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			io_schd_typ(value);
			return;
		}
		if ($io_schd_typ_nm.equalsIgnoreCase(name)) {
			io_schd_typ_nm(value);
			return;
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			io_schd_sts_typ(value);
			return;
		}
		if ($io_schd_sts_typ_nm.equalsIgnoreCase(name)) {
			io_schd_sts_typ_nm(value);
			return;
		}
		if ($slip_schd_no.equalsIgnoreCase(name)) {
			slip_schd_no(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($schd_act_typ.equalsIgnoreCase(name)) {
			schd_act_typ(value);
			return;
		}
		if ($schd_act_typ_nm.equalsIgnoreCase(name)) {
			schd_act_typ_nm(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($mfg_inst_unit_typ_nm.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ_nm(value);
			return;
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			lot_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($base_gr_qty.equalsIgnoreCase(name)) {
			base_gr_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($base_gr_qty.equalsIgnoreCase(name)) {
			base_gr_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($base_gr_qty.equalsIgnoreCase(name)) {
			base_gr_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($base_gr_qty.equalsIgnoreCase(name)) {
			base_gr_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($base_gr_qty.equalsIgnoreCase(name)) {
			base_gr_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($schd_dt.equalsIgnoreCase(name)) {
			schd_dt(value);
			return;
		}
		if ($act_dt.equalsIgnoreCase(name)) {
			act_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}



}

