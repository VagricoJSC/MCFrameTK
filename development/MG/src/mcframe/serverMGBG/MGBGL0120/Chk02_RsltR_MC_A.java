package mcframe.serverMGBG.MGBGL0120;

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
 * ブロック"Chk02_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk02_RsltR_MC_A extends MCConstRow {

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
	public static final String $dbc = "dbc";
	/**
	 * Plan monthly ratio flg. string 計画月次比率ＦＬＧ文字列.<p>
	 *
	 */
	public static final String $pln_mly_flg_str = "pln_mly_flg_str";
	/**
	 * Result monthly ratio flg. string 実績月次比率ＦＬＧ文字列.<p>
	 *
	 */
	public static final String $act_mly_flg_str = "act_mly_flg_str";

	public static final String $upd_cntr = $dbc + ".upd_cntr";
	public static final String $pre_alc_rate_cd = $dbc + ".pre_alc_rate_cd";
	public static final String $sa_typ = $dbc + ".sa_typ";
	public static final String $ym = $dbc + ".ym";
	public static final String $calc_ctg_cd = $dbc + ".calc_ctg_cd";
	public static final String $wg_cd = $dbc + ".wg_cd";
	public static final String $dpt_cd = $dbc + ".dpt_cd";
	public static final String $loc_cd = $dbc + ".loc_cd";
	public static final String $oper_cd = $dbc + ".oper_cd";
	public static final String $bp_cd = $dbc + ".bp_cd";
	public static final String $ctg_cd = $dbc + ".ctg_cd";
	public static final String $itm_cd = $dbc + ".itm_cd";
	public static final String $itm_sub1 = $dbc + ".itm_sub1";
	public static final String $itm_sub2 = $dbc + ".itm_sub2";
	public static final String $itm_sub3 = $dbc + ".itm_sub3";
	public static final String $lot_no = $dbc + ".lot_no";
	public static final String $sublot_no = $dbc + ".sublot_no";
	public static final String $sno1 = $dbc + ".sno1";
	public static final String $sno2 = $dbc + ".sno2";
	public static final String $sno3 = $dbc + ".sno3";
	public static final String $sno4 = $dbc + ".sno4";
	public static final String $itm_mfg_inst_no = $dbc + ".itm_mfg_inst_no";
	public static final String $iv_no = $dbc + ".iv_no";
	public static final String $po_no = $dbc + ".po_no";
	public static final String $slo_no = $dbc + ".slo_no";
	public static final String $alc_ac_cd = $dbc + ".alc_ac_cd";
	public static final String $trd_wg_cd = $dbc + ".trd_wg_cd";
	public static final String $pre_alc_rate = $dbc + ".pre_alc_rate";
	public static final String $adj_flg = $dbc + ".adj_flg";
	public static final String $rmrks = $dbc + ".rmrks";
	public static final String $sub_char1 = $dbc + ".sub_char1";
	public static final String $sub_char2 = $dbc + ".sub_char2";
	public static final String $sub_char3 = $dbc + ".sub_char3";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta dbc_META = createInnerRowMeta($dbc, mcframe.serverMG.dbc.MGT_PRE_RATE_MLY_R.class);
	public static final MCMeta pln_mly_flg_str_META = createStringMeta($pln_mly_flg_str);
	public static final MCMeta act_mly_flg_str_META = createStringMeta($act_mly_flg_str);

	protected static final ConstMetaList<Chk02_RsltR> constMetas = new ConstMetaList<Chk02_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			rtn_sts_typ_META,
			dbc_META,
			pln_mly_flg_str_META,
			act_mly_flg_str_META
		},
		new String[][]{
			{
				"upd_cntr",
				"pre_alc_rate_cd",
				"sa_typ",
				"ym",
				"calc_ctg_cd",
				"wg_cd",
				"dpt_cd",
				"loc_cd",
				"oper_cd",
				"bp_cd",
				"ctg_cd",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"lot_no",
				"sublot_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"itm_mfg_inst_no",
				"iv_no",
				"po_no",
				"slo_no",
				"alc_ac_cd",
				"trd_wg_cd",
				"pre_alc_rate",
				"adj_flg",
				"rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3"
			},
			{
				$upd_cntr,
				$pre_alc_rate_cd,
				$sa_typ,
				$ym,
				$calc_ctg_cd,
				$wg_cd,
				$dpt_cd,
				$loc_cd,
				$oper_cd,
				$bp_cd,
				$ctg_cd,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$lot_no,
				$sublot_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$itm_mfg_inst_no,
				$iv_no,
				$po_no,
				$slo_no,
				$alc_ac_cd,
				$trd_wg_cd,
				$pre_alc_rate,
				$adj_flg,
				$rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3
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
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
				{$dbc + ".pre_alc_rate_cd", "E"},	// dbc.pre_alc_rate_cd
				{$dbc + ".sa_typ", "E"},	// dbc.sa_typ
				{$dbc + ".ym", "E"},	// dbc.ym
				{$dbc + ".calc_ctg_cd", "E"},	// dbc.calc_ctg_cd
				{$dbc + ".wg_cd", "E"}	// dbc.wg_cd
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
				{$dbc + ".pre_alc_rate_cd", "MG.MGUAL0010.PreAlcRateWithPtn"},	// dbc.pre_alc_rate_cd
				{$dbc + ".calc_ctg_cd", "MA.MAUAL0010.CalcCtg"},	// dbc.calc_ctg_cd
				{$dbc + ".wg_cd", "MA.MAUAL0010.CostWg"},	// dbc.wg_cd
				{$dbc + ".dpt_cd", "MA.MAUAL0010.CostDpt"},	// dbc.dpt_cd
				{$dbc + ".loc_cd", "MA.MAUAL0010.Loc"},	// dbc.loc_cd
				{$dbc + ".oper_cd", "MA.MAUAL0010.Oper"},	// dbc.oper_cd
				{$dbc + ".bp_cd", "MA.MAUAL0010.Bp"},	// dbc.bp_cd
				{$dbc + ".ctg_cd", "MA.MAUAL0010.CostCtg"},	// dbc.ctg_cd
				{$dbc + ".itm_sub3", "MA.MAUAL0010.ItmSub3"},	// dbc.itm_sub3
				{$dbc + ".alc_ac_cd", "MA.MAUAL0010.AlcAc"},	// dbc.alc_ac_cd
				{$dbc + ".trd_wg_cd", "MA.MAUAL0010.CostWg"}	// dbc.trd_wg_cd
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
				{$dbc + ".pre_alc_rate_cd", "pln_mly_flg_str;act_mly_flg_str"},	// dbc.pre_alc_rate_cd
				{$dbc + ".dpt_cd", "ym"},	// dbc.dpt_cd
				{$dbc + ".loc_cd", "MAC_LOC_IS_SRCH_TYP.MFG_WG_ALL"},	// dbc.loc_cd
				{$dbc + ".bp_cd", "MAC_BP_IS_SRCH_TYP.COMM"},	// dbc.bp_cd
				{$dbc + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2"}	// dbc.itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$dbc + ".pre_alc_rate_cd", "pln_mly_flg_str;act_mly_flg_str"},	// dbc.pre_alc_rate_cd
				{$dbc + ".dpt_cd", "ym"},	// dbc.dpt_cd
				{$dbc + ".loc_cd", "loc_is_srch_typ"},	// dbc.loc_cd
				{$dbc + ".bp_cd", "bp_is_srch_typ"},	// dbc.bp_cd
				{$dbc + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"}	// dbc.itm_sub3
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$dbc + ".sa_typ", "MAC_SA_TYP"}	// dbc.sa_typ
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$dbc + ".itm_sub1", "E"},	// dbc.itm_sub1
				{$dbc + ".itm_sub2", "E"},	// dbc.itm_sub2
				{$dbc + ".itm_sub3", "E"}	// dbc.itm_sub3
			}
		)),
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
				{$dbc + ".dpt_cd", "dpt_alc_typ"},	// dbc.dpt_cd
				{$dbc + ".loc_cd", "loc_alc_typ"},	// dbc.loc_cd
				{$dbc + ".oper_cd", "oper_alc_typ"},	// dbc.oper_cd
				{$dbc + ".bp_cd", "bp_alc_typ"},	// dbc.bp_cd
				{$dbc + ".ctg_cd", "ctg_alc_typ"},	// dbc.ctg_cd
				{$dbc + ".itm_cd", "itm_alc_typ"},	// dbc.itm_cd
				{$dbc + ".itm_sub1", "itm_alc_typ"},	// dbc.itm_sub1
				{$dbc + ".itm_sub2", "itm_alc_typ"},	// dbc.itm_sub2
				{$dbc + ".itm_sub3", "itm_alc_typ"},	// dbc.itm_sub3
				{$dbc + ".lot_no", "lot_alc_typ"},	// dbc.lot_no
				{$dbc + ".sublot_no", "sublot_alc_typ"},	// dbc.sublot_no
				{$dbc + ".sno1", "sno1_alc_typ"},	// dbc.sno1
				{$dbc + ".sno2", "sno2_alc_typ"},	// dbc.sno2
				{$dbc + ".sno3", "sno3_alc_typ"},	// dbc.sno3
				{$dbc + ".sno4", "sno4_alc_typ"},	// dbc.sno4
				{$dbc + ".itm_mfg_inst_no", "inst_alc_typ"},	// dbc.itm_mfg_inst_no
				{$dbc + ".iv_no", "iv_alc_typ"},	// dbc.iv_no
				{$dbc + ".po_no", "po_alc_typ"},	// dbc.po_no
				{$dbc + ".slo_no", "slo_alc_typ"},	// dbc.slo_no
				{$dbc + ".alc_ac_cd", "alc_ac_alc_typ"},	// dbc.alc_ac_cd
				{$dbc + ".trd_wg_cd", "wg_alc_typ"}	// dbc.trd_wg_cd
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
	protected Chk02_RsltR_MC_A(ConstMetaList<? extends Chk02_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_RsltR clone() {
		return (Chk02_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_RsltR createInstance() {
		return (Chk02_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk02_RsltR getValues(String... names) {
		return (Chk02_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 2, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 2, $rtn_sts_typ, value);
	}


	public mcframe.serverMG.dbc.MGT_PRE_RATE_MLY_R dbc(){
		return (mcframe.serverMG.dbc.MGT_PRE_RATE_MLY_R) getConstInnerRow(offset + 3, $dbc);
	}
	
	public void dbc(mcframe.serverMG.dbc.MGT_PRE_RATE_MLY_R row){
		setConstInnerRow(offset + 3, $dbc, row);
	}


	/**
	 * Plan monthly ratio flg. string 計画月次比率ＦＬＧ文字列.<p>
	 *
	 */
	public String pln_mly_flg_str() {
		return getConstString(offset + 4, $pln_mly_flg_str);
	}

	/**
	 * Plan monthly ratio flg. string 計画月次比率ＦＬＧ文字列.<p>
	 *
	 */
	public void pln_mly_flg_str(String value) {
		setConstString(offset + 4, $pln_mly_flg_str, value);
	}


	/**
	 * Result monthly ratio flg. string 実績月次比率ＦＬＧ文字列.<p>
	 *
	 */
	public String act_mly_flg_str() {
		return getConstString(offset + 5, $act_mly_flg_str);
	}

	/**
	 * Result monthly ratio flg. string 実績月次比率ＦＬＧ文字列.<p>
	 *
	 */
	public void act_mly_flg_str(String value) {
		setConstString(offset + 5, $act_mly_flg_str, value);
	}


	public String getString(String name) {
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($pln_mly_flg_str.equalsIgnoreCase(name)) {
			return pln_mly_flg_str();
		}
		if ($act_mly_flg_str.equalsIgnoreCase(name)) {
			return act_mly_flg_str();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($pln_mly_flg_str.equalsIgnoreCase(name)) {
			return pln_mly_flg_str();
		}
		if ($act_mly_flg_str.equalsIgnoreCase(name)) {
			return act_mly_flg_str();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($pln_mly_flg_str.equalsIgnoreCase(name)) {
			pln_mly_flg_str(value);
			return;
		}
		if ($act_mly_flg_str.equalsIgnoreCase(name)) {
			act_mly_flg_str(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($pln_mly_flg_str.equalsIgnoreCase(name)) {
			pln_mly_flg_str(value);
			return;
		}
		if ($act_mly_flg_str.equalsIgnoreCase(name)) {
			act_mly_flg_str(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($dbc.equalsIgnoreCase(name)) {
			return dbc();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($dbc.equalsIgnoreCase(name)) {
			dbc(
				((MCContainerMeta) dbc_META).castInnerRow(mcframe.serverMG.dbc.MGT_PRE_RATE_MLY_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return dbc().upd_cntr();
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		dbc().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		dbc().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		dbc().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		dbc().upd_cntr(value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		dbc().upd_cntr(value);
	}

	/**
	 * Departmental alloc. basis cd. 一次配賦基準ＣＤ.<p>
	 *
	 */
	public String pre_alc_rate_cd() {
		return dbc().pre_alc_rate_cd();
	}

	/**
	 * Departmental alloc. basis cd. 一次配賦基準ＣＤ.<p>
	 *
	 */
	public void pre_alc_rate_cd(String value) {
		dbc().pre_alc_rate_cd(value);
	}

	/**
	 * Plan/Result type 予実区分.<p>
	 *
	 */
	public String sa_typ() {
		return dbc().sa_typ();
	}

	/**
	 * Plan/Result type 予実区分.<p>
	 *
	 */
	public void sa_typ(String value) {
		dbc().sa_typ(value);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDate ym() {
		return dbc().ym();
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		dbc().ym(value);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd() {
		return dbc().calc_ctg_cd();
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		dbc().calc_ctg_cd(value);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return dbc().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		dbc().wg_cd(value);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return dbc().dpt_cd();
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		dbc().dpt_cd(value);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return dbc().loc_cd();
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		dbc().loc_cd(value);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return dbc().oper_cd();
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		dbc().oper_cd(value);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return dbc().bp_cd();
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		dbc().bp_cd(value);
	}

	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public String ctg_cd() {
		return dbc().ctg_cd();
	}

	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public void ctg_cd(String value) {
		dbc().ctg_cd(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return dbc().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		dbc().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return dbc().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		dbc().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return dbc().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		dbc().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return dbc().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		dbc().itm_sub3(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return dbc().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		dbc().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return dbc().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		dbc().sublot_no(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return dbc().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		dbc().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return dbc().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		dbc().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return dbc().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		dbc().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return dbc().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		dbc().sno4(value);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return dbc().itm_mfg_inst_no();
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		dbc().itm_mfg_inst_no(value);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return dbc().iv_no();
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		dbc().iv_no(value);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return dbc().po_no();
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		dbc().po_no(value);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return dbc().slo_no();
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		dbc().slo_no(value);
	}

	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public String alc_ac_cd() {
		return dbc().alc_ac_cd();
	}

	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public void alc_ac_cd(String value) {
		dbc().alc_ac_cd(value);
	}

	/**
	 * Transfer WG cd. 振替ワーキンググループＣＤ.<p>
	 *
	 */
	public String trd_wg_cd() {
		return dbc().trd_wg_cd();
	}

	/**
	 * Transfer WG cd. 振替ワーキンググループＣＤ.<p>
	 *
	 */
	public void trd_wg_cd(String value) {
		dbc().trd_wg_cd(value);
	}

	/**
	 * Ratio 比率.<p>
	 *
	 */
	public MCNumber pre_alc_rate() {
		return dbc().pre_alc_rate();
	}

	/**
	 * Ratio 比率.<p>
	 *
	 */
	public void pre_alc_rate(MCNumber value) {
		dbc().pre_alc_rate(value);
	}

	/**
	 * Ratio 比率.<p>
	 *
	 */
	public void pre_alc_rate(int value) {
		dbc().pre_alc_rate(value);
	}

	/**
	 * Ratio 比率.<p>
	 *
	 */
	public void pre_alc_rate(long value) {
		dbc().pre_alc_rate(value);
	}

	/**
	 * Ratio 比率.<p>
	 *
	 */
	public void pre_alc_rate(float value) {
		dbc().pre_alc_rate(value);
	}

	/**
	 * Ratio 比率.<p>
	 *
	 */
	public void pre_alc_rate(double value) {
		dbc().pre_alc_rate(value);
	}

	/**
	 * Difference adjustment flg. 差額調整ＦＬＧ.<p>
	 *
	 */
	public boolean adj_flg() {
		return dbc().adj_flg();
	}

	/**
	 * Difference adjustment flg. 差額調整ＦＬＧ.<p>
	 *
	 */
	public void adj_flg(boolean value) {
		dbc().adj_flg(value);
	}

	/**
	 * Remarks 備考.<p>
	 *
	 */
	public String rmrks() {
		return dbc().rmrks();
	}

	/**
	 * Remarks 備考.<p>
	 *
	 */
	public void rmrks(String value) {
		dbc().rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return dbc().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		dbc().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return dbc().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		dbc().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return dbc().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		dbc().sub_char3(value);
	}

}

