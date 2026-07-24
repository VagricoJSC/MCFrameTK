package mcframe.serverMSBC.MSBCL6050;

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
 * ブロック"MfgActReg_Chk01_DtlWk"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgActReg_Chk01_DtlWkR_MC_A extends MCConstRow {

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
	 * Man-hour 工数.<p>
	 *
	 */
	public static final String $act_wk_cost = "act_wk_cost";
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Work element unit number of decimal places 工数管理単位小数部有効桁数.<p>
	 *
	 */
	public static final String $wk_cost_dec_place = "wk_cost_dec_place";
	/**
	 * Man-hour recording date 工数計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Recording date before update 更新前計上日.<p>
	 *
	 */
	public static final String $old_ac_dt = "old_ac_dt";
	/**
	 * Start time 着手時刻.<p>
	 *
	 */
	public static final String $st_tm = "st_tm";
	/**
	 * End time 終了時刻.<p>
	 *
	 */
	public static final String $end_tm = "end_tm";
	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public static final String $brk_pd = "brk_pd";
	/**
	 * Work type cd. 勤務種類ＣＤ.<p>
	 *
	 */
	public static final String $wk_day_cd = "wk_day_cd";
	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public static final String $wk_rsn_cd = "wk_rsn_cd";
	/**
	 * Worker cd. 作業担当者ＣＤ.<p>
	 *
	 */
	public static final String $wk_usr_cd = "wk_usr_cd";
	/**
	 * Worker dept. cd. 作業者部門ＣＤ.<p>
	 *
	 */
	public static final String $wk_usr_dpt_cd = "wk_usr_dpt_cd";
	/**
	 * Equipment 設備.<p>
	 *
	 */
	public static final String $fclty = "fclty";
	/**
	 * Auto-calculate man-hour 自動工数計算.<p>
	 *
	 */
	public static final String $wk_cost_calc_flg = "wk_cost_calc_flg";
	/**
	 * Allow update of man-hour auto-calculation 自動工数計算更新許可.<p>
	 *
	 */
	public static final String $wk_cost_calc_upd_flg = "wk_cost_calc_upd_flg";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $wk_act_intr_rmrks = "wk_act_intr_rmrks";
	/**
	 * Spare 1 (Result) 予備１（実績）.<p>
	 *
	 */
	public static final String $wk_act_sub_char1 = "wk_act_sub_char1";
	/**
	 * Spare 2 (Result) 予備２（実績）.<p>
	 *
	 */
	public static final String $wk_act_sub_char2 = "wk_act_sub_char2";
	/**
	 * Spare 3 (Result) 予備３（実績）.<p>
	 *
	 */
	public static final String $wk_act_sub_char3 = "wk_act_sub_char3";
	/**
	 * Man-hour schedule No. 工数予定ＮＯ.<p>
	 *
	 */
	public static final String $wk_schd_no = "wk_schd_no";
	/**
	 * Man-hour result No. 工数実績ＮＯ.<p>
	 *
	 */
	public static final String $wk_act_no = "wk_act_no";
	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public static final String $mes_flg = "mes_flg";
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public static final String $ext_sys_cd = "ext_sys_cd";
	/**
	 * External man-hour result No. 外部工数実績ＮＯ.<p>
	 *
	 */
	public static final String $ext_wk_act_no = "ext_wk_act_no";


	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_peg_no_META = createCommonMeta($oper_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wk_cost_cd_META = createCommonMeta($wk_cost_cd, mcframe.commonMA.meta.MA_META.WK_COST_CD);
	public static final MCMeta act_wk_cost_META = createCommonMeta($act_wk_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wk_cost_dec_place_META = createCommonMeta($wk_cost_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta old_ac_dt_META = createCommonMeta($old_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta st_tm_META = createCommonMeta($st_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta end_tm_META = createCommonMeta($end_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta brk_pd_META = createCommonMeta($brk_pd, mcframe.commonMA.meta.MA_META.INT4);
	public static final MCMeta wk_day_cd_META = createCommonMeta($wk_day_cd, mcframe.commonMA.meta.MA_META.WK_DAY_CD);
	public static final MCMeta wk_rsn_cd_META = createCommonMeta($wk_rsn_cd, mcframe.commonMA.meta.MA_META.WK_RSN_CD);
	public static final MCMeta wk_usr_cd_META = createCommonMeta($wk_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta wk_usr_dpt_cd_META = createCommonMeta($wk_usr_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta fclty_META = createCommonMeta($fclty, mcframe.commonMA.meta.MA_META.FCLTY);
	public static final MCMeta wk_cost_calc_flg_META = createCommonMeta($wk_cost_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wk_cost_calc_upd_flg_META = createCommonMeta($wk_cost_calc_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wk_act_intr_rmrks_META = createCommonMeta($wk_act_intr_rmrks, mcframe.commonMS.meta.MS_META.WK_ACT_INTR_RMRKS);
	public static final MCMeta wk_act_sub_char1_META = createCommonMeta($wk_act_sub_char1, mcframe.commonMS.meta.MS_META.WK_ACT_SUB_CHAR1);
	public static final MCMeta wk_act_sub_char2_META = createCommonMeta($wk_act_sub_char2, mcframe.commonMS.meta.MS_META.WK_ACT_SUB_CHAR2);
	public static final MCMeta wk_act_sub_char3_META = createCommonMeta($wk_act_sub_char3, mcframe.commonMS.meta.MS_META.WK_ACT_SUB_CHAR3);
	public static final MCMeta wk_schd_no_META = createCommonMeta($wk_schd_no, mcframe.commonMA.meta.MA_META.WK_SCHD_NO);
	public static final MCMeta wk_act_no_META = createCommonMeta($wk_act_no, mcframe.commonMA.meta.MA_META.WK_ACT_NO);
	public static final MCMeta mes_flg_META = createCommonMeta($mes_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_wk_act_no_META = createCommonMeta($ext_wk_act_no, mcframe.commonMA.meta.MA_META.EXT_WK_ACT_NO);

	protected static final ConstMetaList<MfgActReg_Chk01_DtlWkR> constMetas = new ConstMetaList<MfgActReg_Chk01_DtlWkR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_crud_typ_META,
			hdr_peg_no_META,
			oper_peg_no_META,
			peg_no_META,
			err_flg_META,
			wk_cost_cd_META,
			act_wk_cost_META,
			abort_flg_META,
			wk_cost_dec_place_META,
			ac_dt_META,
			old_ac_dt_META,
			st_tm_META,
			end_tm_META,
			brk_pd_META,
			wk_day_cd_META,
			wk_rsn_cd_META,
			wk_usr_cd_META,
			wk_usr_dpt_cd_META,
			fclty_META,
			wk_cost_calc_flg_META,
			wk_cost_calc_upd_flg_META,
			wk_act_intr_rmrks_META,
			wk_act_sub_char1_META,
			wk_act_sub_char2_META,
			wk_act_sub_char3_META,
			wk_schd_no_META,
			wk_act_no_META,
			mes_flg_META,
			ext_sys_cd_META,
			ext_wk_act_no_META
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
				{$act_wk_cost, "E"},	// act_wk_cost
				{$ac_dt, "E"}	// ac_dt
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
				{$wk_cost_cd, "MA.MAUAL0010.WkCost"},	// wk_cost_cd
				{$wk_day_cd, "MA.MAUAL0010.WkDay"},	// wk_day_cd
				{$wk_rsn_cd, "MA.MAUAL0010.WkRsn"},	// wk_rsn_cd
				{$wk_usr_cd, "MA.MAUAL0010.Usr"},	// wk_usr_cd
				{$wk_usr_dpt_cd, "MA.MAUAL0010.Dpt"}	// wk_usr_dpt_cd
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
				{$wk_usr_dpt_cd, "ac_dt;wk_usr_cd;MAC_DPT_IS_SRCH_TYP.MFG"}	// wk_usr_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$wk_usr_dpt_cd, "dt;usr_cd;dpt_is_srch_typ"}	// wk_usr_dpt_cd
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
	protected MfgActReg_Chk01_DtlWkR_MC_A(ConstMetaList<? extends MfgActReg_Chk01_DtlWkR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActReg_Chk01_DtlWkR clone() {
		return (MfgActReg_Chk01_DtlWkR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActReg_Chk01_DtlWkR createInstance() {
		return (MfgActReg_Chk01_DtlWkR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActReg_Chk01_DtlWkR getValues(String... names) {
		return (MfgActReg_Chk01_DtlWkR) super.getValues(names);
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
	 * Man-hour 工数.<p>
	 *
	 */
	public MCNumber act_wk_cost() {
		return getConstNumber(offset + 6, $act_wk_cost);
	}

	/**
	 * Man-hour 工数.<p>
	 *
	 */
	public void act_wk_cost(MCNumber value) {
		setConstNumber(offset + 6, $act_wk_cost, value);
	}

	/**
	 * Man-hour 工数.<p>
	 *
	 */
	public void act_wk_cost(int value) {
		setConstNumber(offset + 6, $act_wk_cost, value);
	}

	/**
	 * Man-hour 工数.<p>
	 *
	 */
	public void act_wk_cost(long value) {
		setConstNumber(offset + 6, $act_wk_cost, value);
	}

	/**
	 * Man-hour 工数.<p>
	 *
	 */
	public void act_wk_cost(float value) {
		setConstNumber(offset + 6, $act_wk_cost, value);
	}

	/**
	 * Man-hour 工数.<p>
	 *
	 */
	public void act_wk_cost(double value) {
		setConstNumber(offset + 6, $act_wk_cost, value);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 7, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 7, $abort_flg, value);
	}


	/**
	 * Work element unit number of decimal places 工数管理単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber wk_cost_dec_place() {
		return getConstNumber(offset + 8, $wk_cost_dec_place);
	}

	/**
	 * Work element unit number of decimal places 工数管理単位小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_dec_place(MCNumber value) {
		setConstNumber(offset + 8, $wk_cost_dec_place, value);
	}

	/**
	 * Work element unit number of decimal places 工数管理単位小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_dec_place(int value) {
		setConstNumber(offset + 8, $wk_cost_dec_place, value);
	}

	/**
	 * Work element unit number of decimal places 工数管理単位小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_dec_place(long value) {
		setConstNumber(offset + 8, $wk_cost_dec_place, value);
	}

	/**
	 * Work element unit number of decimal places 工数管理単位小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_dec_place(float value) {
		setConstNumber(offset + 8, $wk_cost_dec_place, value);
	}

	/**
	 * Work element unit number of decimal places 工数管理単位小数部有効桁数.<p>
	 *
	 */
	public void wk_cost_dec_place(double value) {
		setConstNumber(offset + 8, $wk_cost_dec_place, value);
	}


	/**
	 * Man-hour recording date 工数計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 9, $ac_dt);
	}

	/**
	 * Man-hour recording date 工数計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 9, $ac_dt, value);
	}


	/**
	 * Recording date before update 更新前計上日.<p>
	 *
	 */
	public MCDate old_ac_dt() {
		return getConstDate(offset + 10, $old_ac_dt);
	}

	/**
	 * Recording date before update 更新前計上日.<p>
	 *
	 */
	public void old_ac_dt(MCDate value) {
		setConstDate(offset + 10, $old_ac_dt, value);
	}


	/**
	 * Start time 着手時刻.<p>
	 *
	 */
	public MCDate st_tm() {
		return getConstDate(offset + 11, $st_tm);
	}

	/**
	 * Start time 着手時刻.<p>
	 *
	 */
	public void st_tm(MCDate value) {
		setConstDate(offset + 11, $st_tm, value);
	}


	/**
	 * End time 終了時刻.<p>
	 *
	 */
	public MCDate end_tm() {
		return getConstDate(offset + 12, $end_tm);
	}

	/**
	 * End time 終了時刻.<p>
	 *
	 */
	public void end_tm(MCDate value) {
		setConstDate(offset + 12, $end_tm, value);
	}


	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public MCNumber brk_pd() {
		return getConstNumber(offset + 13, $brk_pd);
	}

	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public void brk_pd(MCNumber value) {
		setConstNumber(offset + 13, $brk_pd, value);
	}

	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public void brk_pd(int value) {
		setConstNumber(offset + 13, $brk_pd, value);
	}

	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public void brk_pd(long value) {
		setConstNumber(offset + 13, $brk_pd, value);
	}

	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public void brk_pd(float value) {
		setConstNumber(offset + 13, $brk_pd, value);
	}

	/**
	 * Downtime 中断時間.<p>
	 *
	 */
	public void brk_pd(double value) {
		setConstNumber(offset + 13, $brk_pd, value);
	}


	/**
	 * Work type cd. 勤務種類ＣＤ.<p>
	 *
	 */
	public String wk_day_cd() {
		return getConstString(offset + 14, $wk_day_cd);
	}

	/**
	 * Work type cd. 勤務種類ＣＤ.<p>
	 *
	 */
	public void wk_day_cd(String value) {
		setConstString(offset + 14, $wk_day_cd, value);
	}


	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public String wk_rsn_cd() {
		return getConstString(offset + 15, $wk_rsn_cd);
	}

	/**
	 * Man-hour reason cd. 工数理由ＣＤ.<p>
	 *
	 */
	public void wk_rsn_cd(String value) {
		setConstString(offset + 15, $wk_rsn_cd, value);
	}


	/**
	 * Worker cd. 作業担当者ＣＤ.<p>
	 *
	 */
	public String wk_usr_cd() {
		return getConstString(offset + 16, $wk_usr_cd);
	}

	/**
	 * Worker cd. 作業担当者ＣＤ.<p>
	 *
	 */
	public void wk_usr_cd(String value) {
		setConstString(offset + 16, $wk_usr_cd, value);
	}


	/**
	 * Worker dept. cd. 作業者部門ＣＤ.<p>
	 *
	 */
	public String wk_usr_dpt_cd() {
		return getConstString(offset + 17, $wk_usr_dpt_cd);
	}

	/**
	 * Worker dept. cd. 作業者部門ＣＤ.<p>
	 *
	 */
	public void wk_usr_dpt_cd(String value) {
		setConstString(offset + 17, $wk_usr_dpt_cd, value);
	}


	/**
	 * Equipment 設備.<p>
	 *
	 */
	public String fclty() {
		return getConstString(offset + 18, $fclty);
	}

	/**
	 * Equipment 設備.<p>
	 *
	 */
	public void fclty(String value) {
		setConstString(offset + 18, $fclty, value);
	}


	/**
	 * Auto-calculate man-hour 自動工数計算.<p>
	 *
	 */
	public boolean wk_cost_calc_flg() {
		return getConstBoolean(offset + 19, $wk_cost_calc_flg);
	}

	/**
	 * Auto-calculate man-hour 自動工数計算.<p>
	 *
	 */
	public void wk_cost_calc_flg(boolean value) {
		setConstBoolean(offset + 19, $wk_cost_calc_flg, value);
	}


	/**
	 * Allow update of man-hour auto-calculation 自動工数計算更新許可.<p>
	 *
	 */
	public boolean wk_cost_calc_upd_flg() {
		return getConstBoolean(offset + 20, $wk_cost_calc_upd_flg);
	}

	/**
	 * Allow update of man-hour auto-calculation 自動工数計算更新許可.<p>
	 *
	 */
	public void wk_cost_calc_upd_flg(boolean value) {
		setConstBoolean(offset + 20, $wk_cost_calc_upd_flg, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String wk_act_intr_rmrks() {
		return getConstString(offset + 21, $wk_act_intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void wk_act_intr_rmrks(String value) {
		setConstString(offset + 21, $wk_act_intr_rmrks, value);
	}


	/**
	 * Spare 1 (Result) 予備１（実績）.<p>
	 *
	 */
	public String wk_act_sub_char1() {
		return getConstString(offset + 22, $wk_act_sub_char1);
	}

	/**
	 * Spare 1 (Result) 予備１（実績）.<p>
	 *
	 */
	public void wk_act_sub_char1(String value) {
		setConstString(offset + 22, $wk_act_sub_char1, value);
	}


	/**
	 * Spare 2 (Result) 予備２（実績）.<p>
	 *
	 */
	public String wk_act_sub_char2() {
		return getConstString(offset + 23, $wk_act_sub_char2);
	}

	/**
	 * Spare 2 (Result) 予備２（実績）.<p>
	 *
	 */
	public void wk_act_sub_char2(String value) {
		setConstString(offset + 23, $wk_act_sub_char2, value);
	}


	/**
	 * Spare 3 (Result) 予備３（実績）.<p>
	 *
	 */
	public String wk_act_sub_char3() {
		return getConstString(offset + 24, $wk_act_sub_char3);
	}

	/**
	 * Spare 3 (Result) 予備３（実績）.<p>
	 *
	 */
	public void wk_act_sub_char3(String value) {
		setConstString(offset + 24, $wk_act_sub_char3, value);
	}


	/**
	 * Man-hour schedule No. 工数予定ＮＯ.<p>
	 *
	 */
	public String wk_schd_no() {
		return getConstString(offset + 25, $wk_schd_no);
	}

	/**
	 * Man-hour schedule No. 工数予定ＮＯ.<p>
	 *
	 */
	public void wk_schd_no(String value) {
		setConstString(offset + 25, $wk_schd_no, value);
	}


	/**
	 * Man-hour result No. 工数実績ＮＯ.<p>
	 *
	 */
	public String wk_act_no() {
		return getConstString(offset + 26, $wk_act_no);
	}

	/**
	 * Man-hour result No. 工数実績ＮＯ.<p>
	 *
	 */
	public void wk_act_no(String value) {
		setConstString(offset + 26, $wk_act_no, value);
	}


	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public boolean mes_flg() {
		return getConstBoolean(offset + 27, $mes_flg);
	}

	/**
	 * MES ＭＥＳ.<p>
	 *
	 */
	public void mes_flg(boolean value) {
		setConstBoolean(offset + 27, $mes_flg, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 28, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 28, $ext_sys_cd, value);
	}


	/**
	 * External man-hour result No. 外部工数実績ＮＯ.<p>
	 *
	 */
	public String ext_wk_act_no() {
		return getConstString(offset + 29, $ext_wk_act_no);
	}

	/**
	 * External man-hour result No. 外部工数実績ＮＯ.<p>
	 *
	 */
	public void ext_wk_act_no(String value) {
		setConstString(offset + 29, $ext_wk_act_no, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($wk_day_cd.equalsIgnoreCase(name)) {
			return wk_day_cd();
		}
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			return wk_rsn_cd();
		}
		if ($wk_usr_cd.equalsIgnoreCase(name)) {
			return wk_usr_cd();
		}
		if ($wk_usr_dpt_cd.equalsIgnoreCase(name)) {
			return wk_usr_dpt_cd();
		}
		if ($fclty.equalsIgnoreCase(name)) {
			return fclty();
		}
		if ($wk_act_intr_rmrks.equalsIgnoreCase(name)) {
			return wk_act_intr_rmrks();
		}
		if ($wk_act_sub_char1.equalsIgnoreCase(name)) {
			return wk_act_sub_char1();
		}
		if ($wk_act_sub_char2.equalsIgnoreCase(name)) {
			return wk_act_sub_char2();
		}
		if ($wk_act_sub_char3.equalsIgnoreCase(name)) {
			return wk_act_sub_char3();
		}
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			return wk_schd_no();
		}
		if ($wk_act_no.equalsIgnoreCase(name)) {
			return wk_act_no();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_wk_act_no.equalsIgnoreCase(name)) {
			return ext_wk_act_no();
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
		if ($act_wk_cost.equalsIgnoreCase(name)) {
			return act_wk_cost();
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			return wk_cost_dec_place();
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			return brk_pd();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($old_ac_dt.equalsIgnoreCase(name)) {
			return old_ac_dt();
		}
		if ($st_tm.equalsIgnoreCase(name)) {
			return st_tm();
		}
		if ($end_tm.equalsIgnoreCase(name)) {
			return end_tm();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_flg();
		}
		if ($wk_cost_calc_upd_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_upd_flg();
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			return mes_flg();
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
		if ($wk_day_cd.equalsIgnoreCase(name)) {
			return wk_day_cd();
		}
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			return wk_rsn_cd();
		}
		if ($wk_usr_cd.equalsIgnoreCase(name)) {
			return wk_usr_cd();
		}
		if ($wk_usr_dpt_cd.equalsIgnoreCase(name)) {
			return wk_usr_dpt_cd();
		}
		if ($fclty.equalsIgnoreCase(name)) {
			return fclty();
		}
		if ($wk_act_intr_rmrks.equalsIgnoreCase(name)) {
			return wk_act_intr_rmrks();
		}
		if ($wk_act_sub_char1.equalsIgnoreCase(name)) {
			return wk_act_sub_char1();
		}
		if ($wk_act_sub_char2.equalsIgnoreCase(name)) {
			return wk_act_sub_char2();
		}
		if ($wk_act_sub_char3.equalsIgnoreCase(name)) {
			return wk_act_sub_char3();
		}
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			return wk_schd_no();
		}
		if ($wk_act_no.equalsIgnoreCase(name)) {
			return wk_act_no();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_wk_act_no.equalsIgnoreCase(name)) {
			return ext_wk_act_no();
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
		if ($act_wk_cost.equalsIgnoreCase(name)) {
			return act_wk_cost();
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			return wk_cost_dec_place();
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			return brk_pd();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($old_ac_dt.equalsIgnoreCase(name)) {
			return old_ac_dt();
		}
		if ($st_tm.equalsIgnoreCase(name)) {
			return st_tm();
		}
		if ($end_tm.equalsIgnoreCase(name)) {
			return end_tm();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_flg();
		}
		if ($wk_cost_calc_upd_flg.equalsIgnoreCase(name)) {
			return wk_cost_calc_upd_flg();
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			return mes_flg();
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
		if ($wk_day_cd.equalsIgnoreCase(name)) {
			wk_day_cd(value);
			return;
		}
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			wk_rsn_cd(value);
			return;
		}
		if ($wk_usr_cd.equalsIgnoreCase(name)) {
			wk_usr_cd(value);
			return;
		}
		if ($wk_usr_dpt_cd.equalsIgnoreCase(name)) {
			wk_usr_dpt_cd(value);
			return;
		}
		if ($fclty.equalsIgnoreCase(name)) {
			fclty(value);
			return;
		}
		if ($wk_act_intr_rmrks.equalsIgnoreCase(name)) {
			wk_act_intr_rmrks(value);
			return;
		}
		if ($wk_act_sub_char1.equalsIgnoreCase(name)) {
			wk_act_sub_char1(value);
			return;
		}
		if ($wk_act_sub_char2.equalsIgnoreCase(name)) {
			wk_act_sub_char2(value);
			return;
		}
		if ($wk_act_sub_char3.equalsIgnoreCase(name)) {
			wk_act_sub_char3(value);
			return;
		}
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			wk_schd_no(value);
			return;
		}
		if ($wk_act_no.equalsIgnoreCase(name)) {
			wk_act_no(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_wk_act_no.equalsIgnoreCase(name)) {
			ext_wk_act_no(value);
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
		if ($act_wk_cost.equalsIgnoreCase(name)) {
			act_wk_cost(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
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
		if ($act_wk_cost.equalsIgnoreCase(name)) {
			act_wk_cost(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
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
		if ($act_wk_cost.equalsIgnoreCase(name)) {
			act_wk_cost(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
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
		if ($act_wk_cost.equalsIgnoreCase(name)) {
			act_wk_cost(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
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
		if ($act_wk_cost.equalsIgnoreCase(name)) {
			act_wk_cost(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($old_ac_dt.equalsIgnoreCase(name)) {
			old_ac_dt(value);
			return;
		}
		if ($st_tm.equalsIgnoreCase(name)) {
			st_tm(value);
			return;
		}
		if ($end_tm.equalsIgnoreCase(name)) {
			end_tm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_flg(value);
			return;
		}
		if ($wk_cost_calc_upd_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_upd_flg(value);
			return;
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			mes_flg(value);
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
		if ($wk_day_cd.equalsIgnoreCase(name)) {
			wk_day_cd(value);
			return;
		}
		if ($wk_rsn_cd.equalsIgnoreCase(name)) {
			wk_rsn_cd(value);
			return;
		}
		if ($wk_usr_cd.equalsIgnoreCase(name)) {
			wk_usr_cd(value);
			return;
		}
		if ($wk_usr_dpt_cd.equalsIgnoreCase(name)) {
			wk_usr_dpt_cd(value);
			return;
		}
		if ($fclty.equalsIgnoreCase(name)) {
			fclty(value);
			return;
		}
		if ($wk_act_intr_rmrks.equalsIgnoreCase(name)) {
			wk_act_intr_rmrks(value);
			return;
		}
		if ($wk_act_sub_char1.equalsIgnoreCase(name)) {
			wk_act_sub_char1(value);
			return;
		}
		if ($wk_act_sub_char2.equalsIgnoreCase(name)) {
			wk_act_sub_char2(value);
			return;
		}
		if ($wk_act_sub_char3.equalsIgnoreCase(name)) {
			wk_act_sub_char3(value);
			return;
		}
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			wk_schd_no(value);
			return;
		}
		if ($wk_act_no.equalsIgnoreCase(name)) {
			wk_act_no(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_wk_act_no.equalsIgnoreCase(name)) {
			ext_wk_act_no(value);
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
		if ($act_wk_cost.equalsIgnoreCase(name)) {
			act_wk_cost(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
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
		if ($act_wk_cost.equalsIgnoreCase(name)) {
			act_wk_cost(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
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
		if ($act_wk_cost.equalsIgnoreCase(name)) {
			act_wk_cost(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
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
		if ($act_wk_cost.equalsIgnoreCase(name)) {
			act_wk_cost(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
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
		if ($act_wk_cost.equalsIgnoreCase(name)) {
			act_wk_cost(value);
			return;
		}
		if ($wk_cost_dec_place.equalsIgnoreCase(name)) {
			wk_cost_dec_place(value);
			return;
		}
		if ($brk_pd.equalsIgnoreCase(name)) {
			brk_pd(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($old_ac_dt.equalsIgnoreCase(name)) {
			old_ac_dt(value);
			return;
		}
		if ($st_tm.equalsIgnoreCase(name)) {
			st_tm(value);
			return;
		}
		if ($end_tm.equalsIgnoreCase(name)) {
			end_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($wk_cost_calc_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_flg(value);
			return;
		}
		if ($wk_cost_calc_upd_flg.equalsIgnoreCase(name)) {
			wk_cost_calc_upd_flg(value);
			return;
		}
		if ($mes_flg.equalsIgnoreCase(name)) {
			mes_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

