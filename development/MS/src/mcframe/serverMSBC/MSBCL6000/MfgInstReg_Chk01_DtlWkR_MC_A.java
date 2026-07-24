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
 * ブロック"MfgInstReg_Chk01_DtlWk"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgInstReg_Chk01_DtlWkR_MC_A extends MCConstRow {

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public static final String $oper_peg_no = "oper_peg_no";
	/**
	 * Man-hour pegging No. 工数紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public static final String $wk_cost_cd = "wk_cost_cd";
	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public static final String $wk_cost = "wk_cost";
	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public static final String $fxd_wk_cost = "fxd_wk_cost";
	/**
	 * Master man-hour (Qty.-dependent) マスタ工数（数量依存）.<p>
	 *
	 */
	public static final String $mst_wk_cost = "mst_wk_cost";
	/**
	 * Master man-hour (Constant) マスタ工数（固定）.<p>
	 *
	 */
	public static final String $mst_fxd_wk_cost = "mst_fxd_wk_cost";
	/**
	 * Work element unit number of decimal places 工数管理単位小数部有効桁数.<p>
	 *
	 */
	public static final String $wk_cost_dec_place = "wk_cost_dec_place";
	/**
	 * Auto-calculate man-hour 自動工数計算.<p>
	 *
	 */
	public static final String $wk_cost_calc_flg = "wk_cost_calc_flg";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
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
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	/**
	 * Man-hour schedule No. 工数予定ＮＯ.<p>
	 *
	 */
	public static final String $wk_schd_no = "wk_schd_no";
	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public static final String $mfg_sts_typ = "mfg_sts_typ";
	/**
	 * Mfg. status type before update 更新前製造状況区分.<p>
	 *
	 */
	public static final String $old_mfg_sts_typ = "old_mfg_sts_typ";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Update display order only 表示順のみ更新.<p>
	 *
	 */
	public static final String $disp_seq_upd_flg = "disp_seq_upd_flg";
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
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public static final String $oper_ptn = "oper_ptn";
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public static final String $oper_seq = "oper_seq";
	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public static final String $inst_abort_flg = "inst_abort_flg";
	/**
	 * Cancel remaining order before update 更新前指図打切.<p>
	 *
	 */
	public static final String $old_inst_abort_flg = "old_inst_abort_flg";
	/**
	 * Non-initial mfg. order cancellation 初回製造指図以外の取消.<p>
	 *
	 */
	public static final String $not_frst_inst_can_flg = "not_frst_inst_can_flg";


	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_peg_no_META = createCommonMeta($oper_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wk_cost_cd_META = createCommonMeta($wk_cost_cd, mcframe.commonMA.meta.MA_META.WK_COST_CD);
	public static final MCMeta wk_cost_META = createCommonMeta($wk_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);
	public static final MCMeta fxd_wk_cost_META = createCommonMeta($fxd_wk_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);
	public static final MCMeta mst_wk_cost_META = createCommonMeta($mst_wk_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);
	public static final MCMeta mst_fxd_wk_cost_META = createCommonMeta($mst_fxd_wk_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);
	public static final MCMeta wk_cost_dec_place_META = createCommonMeta($wk_cost_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta wk_cost_calc_flg_META = createCommonMeta($wk_cost_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.WK_SCHD_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.WK_SCHD_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.WK_SCHD_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.WK_SCHD_SUB_CHAR3);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta wk_schd_no_META = createCommonMeta($wk_schd_no, mcframe.commonMA.meta.MA_META.WK_SCHD_NO);
	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta old_mfg_sts_typ_META = createCommonMeta($old_mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta disp_seq_upd_flg_META = createCommonMeta($disp_seq_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta inst_abort_flg_META = createCommonMeta($inst_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_inst_abort_flg_META = createCommonMeta($old_inst_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_frst_inst_can_flg_META = createCommonMeta($not_frst_inst_can_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<MfgInstReg_Chk01_DtlWkR> constMetas = new ConstMetaList<MfgInstReg_Chk01_DtlWkR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_crud_typ_META,
			hdr_peg_no_META,
			oper_peg_no_META,
			peg_no_META,
			err_flg_META,
			wk_cost_cd_META,
			wk_cost_META,
			fxd_wk_cost_META,
			mst_wk_cost_META,
			mst_fxd_wk_cost_META,
			wk_cost_dec_place_META,
			wk_cost_calc_flg_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			itm_mfg_inst_no_META,
			mfg_inst_no_META,
			oper_inst_no_META,
			wk_schd_no_META,
			mfg_sts_typ_META,
			old_mfg_sts_typ_META,
			disp_seq_META,
			disp_seq_upd_flg_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			mfg_loc_cd_META,
			oper_ptn_META,
			oper_cd_META,
			oper_seq_META,
			inst_abort_flg_META,
			old_inst_abort_flg_META,
			not_frst_inst_can_flg_META
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
				{$hdr_peg_no, "E"},	// hdr_peg_no
				{$oper_peg_no, "E"},	// oper_peg_no
				{$peg_no, "E"},	// peg_no
				{$wk_cost_cd, "E"},	// wk_cost_cd
				{$wk_cost, "E"},	// wk_cost
				{$fxd_wk_cost, "E"},	// fxd_wk_cost
				{$disp_seq, "E"}	// disp_seq
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
				{$peg_no, "E"}	// peg_no
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
				{$wk_cost_cd, "MA.MAUAL0010.WkCost"}	// wk_cost_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$wk_cost_cd, "wk_cost_dec_place"}	// wk_cost_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$wk_cost_cd, "dec_place"}	// wk_cost_cd
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
	protected MfgInstReg_Chk01_DtlWkR_MC_A(ConstMetaList<? extends MfgInstReg_Chk01_DtlWkR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstReg_Chk01_DtlWkR clone() {
		return (MfgInstReg_Chk01_DtlWkR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstReg_Chk01_DtlWkR createInstance() {
		return (MfgInstReg_Chk01_DtlWkR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstReg_Chk01_DtlWkR getValues(String... names) {
		return (MfgInstReg_Chk01_DtlWkR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 0, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 0, $data_crud_typ, value);
	}


	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 1, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 1, $hdr_peg_no, value);
	}


	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public MCNumber oper_peg_no() {
		return getConstNumber(offset + 2, $oper_peg_no);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(MCNumber value) {
		setConstNumber(offset + 2, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(int value) {
		setConstNumber(offset + 2, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(long value) {
		setConstNumber(offset + 2, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(float value) {
		setConstNumber(offset + 2, $oper_peg_no, value);
	}

	/**
	 * Operation pegging No. 工程紐付けＮＯ.<p>
	 *
	 */
	public void oper_peg_no(double value) {
		setConstNumber(offset + 2, $oper_peg_no, value);
	}


	/**
	 * Man-hour pegging No. 工数紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 3, $peg_no);
	}

	/**
	 * Man-hour pegging No. 工数紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 3, $peg_no, value);
	}

	/**
	 * Man-hour pegging No. 工数紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 3, $peg_no, value);
	}

	/**
	 * Man-hour pegging No. 工数紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 3, $peg_no, value);
	}

	/**
	 * Man-hour pegging No. 工数紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 3, $peg_no, value);
	}

	/**
	 * Man-hour pegging No. 工数紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 3, $peg_no, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 4, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 4, $err_flg, value);
	}


	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public String wk_cost_cd() {
		return getConstString(offset + 5, $wk_cost_cd);
	}

	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public void wk_cost_cd(String value) {
		setConstString(offset + 5, $wk_cost_cd, value);
	}


	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public MCNumber wk_cost() {
		return getConstNumber(offset + 6, $wk_cost);
	}

	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public void wk_cost(MCNumber value) {
		setConstNumber(offset + 6, $wk_cost, value);
	}

	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public void wk_cost(int value) {
		setConstNumber(offset + 6, $wk_cost, value);
	}

	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public void wk_cost(long value) {
		setConstNumber(offset + 6, $wk_cost, value);
	}

	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public void wk_cost(float value) {
		setConstNumber(offset + 6, $wk_cost, value);
	}

	/**
	 * Schedule man-hour (Qty.-dependent) 予定工数（数量依存）.<p>
	 *
	 */
	public void wk_cost(double value) {
		setConstNumber(offset + 6, $wk_cost, value);
	}


	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public MCNumber fxd_wk_cost() {
		return getConstNumber(offset + 7, $fxd_wk_cost);
	}

	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public void fxd_wk_cost(MCNumber value) {
		setConstNumber(offset + 7, $fxd_wk_cost, value);
	}

	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public void fxd_wk_cost(int value) {
		setConstNumber(offset + 7, $fxd_wk_cost, value);
	}

	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public void fxd_wk_cost(long value) {
		setConstNumber(offset + 7, $fxd_wk_cost, value);
	}

	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public void fxd_wk_cost(float value) {
		setConstNumber(offset + 7, $fxd_wk_cost, value);
	}

	/**
	 * Schedule man-hour (Constant) 予定工数（固定）.<p>
	 *
	 */
	public void fxd_wk_cost(double value) {
		setConstNumber(offset + 7, $fxd_wk_cost, value);
	}


	/**
	 * Master man-hour (Qty.-dependent) マスタ工数（数量依存）.<p>
	 *
	 */
	public MCNumber mst_wk_cost() {
		return getConstNumber(offset + 8, $mst_wk_cost);
	}

	/**
	 * Master man-hour (Qty.-dependent) マスタ工数（数量依存）.<p>
	 *
	 */
	public void mst_wk_cost(MCNumber value) {
		setConstNumber(offset + 8, $mst_wk_cost, value);
	}

	/**
	 * Master man-hour (Qty.-dependent) マスタ工数（数量依存）.<p>
	 *
	 */
	public void mst_wk_cost(int value) {
		setConstNumber(offset + 8, $mst_wk_cost, value);
	}

	/**
	 * Master man-hour (Qty.-dependent) マスタ工数（数量依存）.<p>
	 *
	 */
	public void mst_wk_cost(long value) {
		setConstNumber(offset + 8, $mst_wk_cost, value);
	}

	/**
	 * Master man-hour (Qty.-dependent) マスタ工数（数量依存）.<p>
	 *
	 */
	public void mst_wk_cost(float value) {
		setConstNumber(offset + 8, $mst_wk_cost, value);
	}

	/**
	 * Master man-hour (Qty.-dependent) マスタ工数（数量依存）.<p>
	 *
	 */
	public void mst_wk_cost(double value) {
		setConstNumber(offset + 8, $mst_wk_cost, value);
	}


	/**
	 * Master man-hour (Constant) マスタ工数（固定）.<p>
	 *
	 */
	public MCNumber mst_fxd_wk_cost() {
		return getConstNumber(offset + 9, $mst_fxd_wk_cost);
	}

	/**
	 * Master man-hour (Constant) マスタ工数（固定）.<p>
	 *
	 */
	public void mst_fxd_wk_cost(MCNumber value) {
		setConstNumber(offset + 9, $mst_fxd_wk_cost, value);
	}

	/**
	 * Master man-hour (Constant) マスタ工数（固定）.<p>
	 *
	 */
	public void mst_fxd_wk_cost(int value) {
		setConstNumber(offset + 9, $mst_fxd_wk_cost, value);
	}

	/**
	 * Master man-hour (Constant) マスタ工数（固定）.<p>
	 *
	 */
	public void mst_fxd_wk_cost(long value) {
		setConstNumber(offset + 9, $mst_fxd_wk_cost, value);
	}

	/**
	 * Master man-hour (Constant) マスタ工数（固定）.<p>
	 *
	 */
	public void mst_fxd_wk_cost(float value) {
		setConstNumber(offset + 9, $mst_fxd_wk_cost, value);
	}

	/**
	 * Master man-hour (Constant) マスタ工数（固定）.<p>
	 *
	 */
	public void mst_fxd_wk_cost(double value) {
		setConstNumber(offset + 9, $mst_fxd_wk_cost, value);
	}


	/**
	 * Work element unit number of decimal places 工数管理単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber wk_cost_dec_place() {
		return getConstNumber(offset + 10, $wk_cost_dec_place);
	}

	/**
	 * Work element unit number of decimal places 工数管理単位小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_dec_place(MCNumber value) {
		setConstNumber(offset + 10, $wk_cost_dec_place, value);
	}

	/**
	 * Work element unit number of decimal places 工数管理単位小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_dec_place(int value) {
		setConstNumber(offset + 10, $wk_cost_dec_place, value);
	}

	/**
	 * Work element unit number of decimal places 工数管理単位小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_dec_place(long value) {
		setConstNumber(offset + 10, $wk_cost_dec_place, value);
	}

	/**
	 * Work element unit number of decimal places 工数管理単位小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_dec_place(float value) {
		setConstNumber(offset + 10, $wk_cost_dec_place, value);
	}

	/**
	 * Work element unit number of decimal places 工数管理単位小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_dec_place(double value) {
		setConstNumber(offset + 10, $wk_cost_dec_place, value);
	}


	/**
	 * Auto-calculate man-hour 自動工数計算.<p>
	 *
	 */
	public boolean wk_cost_calc_flg() {
		return getConstBoolean(offset + 11, $wk_cost_calc_flg);
	}

	/**
	 * Auto-calculate man-hour 自動工数計算.<p>
	 *
	 */
	public void wk_cost_calc_flg(boolean value) {
		setConstBoolean(offset + 11, $wk_cost_calc_flg, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 12, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 12, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 13, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 13, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 14, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 14, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 15, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 15, $sub_char3, value);
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
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 17, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 17, $mfg_inst_no, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 18, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 18, $oper_inst_no, value);
	}


	/**
	 * Man-hour schedule No. 工数予定ＮＯ.<p>
	 *
	 */
	public String wk_schd_no() {
		return getConstString(offset + 19, $wk_schd_no);
	}

	/**
	 * Man-hour schedule No. 工数予定ＮＯ.<p>
	 *
	 */
	public void wk_schd_no(String value) {
		setConstString(offset + 19, $wk_schd_no, value);
	}


	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public String mfg_sts_typ() {
		return getConstString(offset + 20, $mfg_sts_typ);
	}

	/**
	 * Mfg. status type 製造状況区分.<p>
	 *
	 */
	public void mfg_sts_typ(String value) {
		setConstString(offset + 20, $mfg_sts_typ, value);
	}


	/**
	 * Mfg. status type before update 更新前製造状況区分.<p>
	 *
	 */
	public String old_mfg_sts_typ() {
		return getConstString(offset + 21, $old_mfg_sts_typ);
	}

	/**
	 * Mfg. status type before update 更新前製造状況区分.<p>
	 *
	 */
	public void old_mfg_sts_typ(String value) {
		setConstString(offset + 21, $old_mfg_sts_typ, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 22, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 22, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 22, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 22, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 22, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 22, $disp_seq, value);
	}


	/**
	 * Update display order only 表示順のみ更新.<p>
	 *
	 */
	public boolean disp_seq_upd_flg() {
		return getConstBoolean(offset + 23, $disp_seq_upd_flg);
	}

	/**
	 * Update display order only 表示順のみ更新.<p>
	 *
	 */
	public void disp_seq_upd_flg(boolean value) {
		setConstBoolean(offset + 23, $disp_seq_upd_flg, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 24, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 24, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 25, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 25, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 26, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 26, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 27, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 27, $itm_sub3, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 28, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 28, $mfg_loc_cd, value);
	}


	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 29, $oper_ptn);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 29, $oper_ptn, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 30, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 30, $oper_cd, value);
	}


	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 31, $oper_seq);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 31, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 31, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 31, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 31, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 31, $oper_seq, value);
	}


	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public boolean inst_abort_flg() {
		return getConstBoolean(offset + 32, $inst_abort_flg);
	}

	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public void inst_abort_flg(boolean value) {
		setConstBoolean(offset + 32, $inst_abort_flg, value);
	}


	/**
	 * Cancel remaining order before update 更新前指図打切.<p>
	 *
	 */
	public boolean old_inst_abort_flg() {
		return getConstBoolean(offset + 33, $old_inst_abort_flg);
	}

	/**
	 * Cancel remaining order before update 更新前指図打切.<p>
	 *
	 */
	public void old_inst_abort_flg(boolean value) {
		setConstBoolean(offset + 33, $old_inst_abort_flg, value);
	}


	/**
	 * Non-initial mfg. order cancellation 初回製造指図以外の取消.<p>
	 *
	 */
	public boolean not_frst_inst_can_flg() {
		return getConstBoolean(offset + 34, $not_frst_inst_can_flg);
	}

	/**
	 * Non-initial mfg. order cancellation 初回製造指図以外の取消.<p>
	 *
	 */
	public void not_frst_inst_can_flg(boolean value) {
		setConstBoolean(offset + 34, $not_frst_inst_can_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			return wk_schd_no();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($old_mfg_sts_typ.equalsIgnoreCase(name)) {
			return old_mfg_sts_typ();
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			return oper_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			return wk_cost();
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			return fxd_wk_cost();
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			return mst_wk_cost();
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			return mst_fxd_wk_cost();
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			return wk_cost_dec_place();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_flg();
		}
		if ($disp_seq_upd_flg.equalsIgnoreCase(name)) {
			return disp_seq_upd_flg();
		}
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			return inst_abort_flg();
		}
		if ($old_inst_abort_flg.equalsIgnoreCase(name)) {
			return old_inst_abort_flg();
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			return not_frst_inst_can_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			return wk_schd_no();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($old_mfg_sts_typ.equalsIgnoreCase(name)) {
			return old_mfg_sts_typ();
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			return oper_peg_no();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			return wk_cost();
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			return fxd_wk_cost();
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			return mst_wk_cost();
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			return mst_fxd_wk_cost();
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			return wk_cost_dec_place();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_flg();
		}
		if ($disp_seq_upd_flg.equalsIgnoreCase(name)) {
			return disp_seq_upd_flg();
		}
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			return inst_abort_flg();
		}
		if ($old_inst_abort_flg.equalsIgnoreCase(name)) {
			return old_inst_abort_flg();
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			return not_frst_inst_can_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			wk_schd_no(value);
			return;
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($old_mfg_sts_typ.equalsIgnoreCase(name)) {
			old_mfg_sts_typ(value);
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			mst_wk_cost(value);
			return;
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			mst_fxd_wk_cost(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			mst_wk_cost(value);
			return;
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			mst_fxd_wk_cost(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			mst_wk_cost(value);
			return;
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			mst_fxd_wk_cost(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			mst_wk_cost(value);
			return;
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			mst_fxd_wk_cost(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			mst_wk_cost(value);
			return;
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			mst_fxd_wk_cost(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_flg(value);
			return;
		}
		if ($disp_seq_upd_flg.equalsIgnoreCase(name)) {
			disp_seq_upd_flg(value);
			return;
		}
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			inst_abort_flg(value);
			return;
		}
		if ($old_inst_abort_flg.equalsIgnoreCase(name)) {
			old_inst_abort_flg(value);
			return;
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			not_frst_inst_can_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			wk_schd_no(value);
			return;
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($old_mfg_sts_typ.equalsIgnoreCase(name)) {
			old_mfg_sts_typ(value);
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			mst_wk_cost(value);
			return;
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			mst_fxd_wk_cost(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			mst_wk_cost(value);
			return;
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			mst_fxd_wk_cost(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			mst_wk_cost(value);
			return;
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			mst_fxd_wk_cost(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			mst_wk_cost(value);
			return;
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			mst_fxd_wk_cost(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($oper_peg_no.equalsIgnoreCase(name)) {
			oper_peg_no(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($mst_wk_cost.equalsIgnoreCase(name)) {
			mst_wk_cost(value);
			return;
		}
		if ($mst_fxd_wk_cost.equalsIgnoreCase(name)) {
			mst_fxd_wk_cost(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_flg(value);
			return;
		}
		if ($disp_seq_upd_flg.equalsIgnoreCase(name)) {
			disp_seq_upd_flg(value);
			return;
		}
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			inst_abort_flg(value);
			return;
		}
		if ($old_inst_abort_flg.equalsIgnoreCase(name)) {
			old_inst_abort_flg(value);
			return;
		}
		if ($not_frst_inst_can_flg.equalsIgnoreCase(name)) {
			not_frst_inst_can_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

