package mcframe.serverMGBD.MGBDL0320;

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
 * ブロック"Chk01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk01_RsltR_MC_A extends MCConstRow {

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
	 * Calculation run pattern name 計算実行パタン名.<p>
	 *
	 */
	public static final String $act_ptn_nm = "act_ptn_nm";
	/**
	 * Term name 期名称.<p>
	 *
	 */
	public static final String $term_nm = "term_nm";
	/**
	 * End month of term 期終了年月.<p>
	 *
	 */
	public static final String $term_end_ym = "term_end_ym";
	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public static final String $calc_grp_nm = "calc_grp_nm";
	/**
	 * Calculation sequence group 計算順序グループ.<p>
	 *
	 */
	public static final String $calc_seq_grp = "calc_seq_grp";
	/**
	 * Max. number of month 最大月数.<p>
	 *
	 */
	public static final String $max_mons = "max_mons";
	/**
	 * Calculation sequence 計算順序.<p>
	 *
	 */
	public static final String $calc_seq = "calc_seq";
	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public static final String $xrate_nm = "xrate_nm";

	public static final String $act_ptn_cd = $dbc + ".act_ptn_cd";
	public static final String $calc_act_seq = $dbc + ".calc_act_seq";
	public static final String $term = $dbc + ".term";
	public static final String $calc_grp_cd = $dbc + ".calc_grp_cd";
	public static final String $st_ym = $dbc + ".st_ym";
	public static final String $end_ym = $dbc + ".end_ym";
	public static final String $xrate_cd = $dbc + ".xrate_cd";
	public static final String $carry_flg = $dbc + ".carry_flg";
	public static final String $err_proceed_flg = $dbc + ".err_proceed_flg";
	public static final String $rmrks = $dbc + ".rmrks";
	public static final String $sub_char1 = $dbc + ".sub_char1";
	public static final String $sub_char2 = $dbc + ".sub_char2";
	public static final String $sub_char3 = $dbc + ".sub_char3";
	public static final String $upd_cntr = $dbc + ".upd_cntr";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta dbc_META = createInnerRowMeta($dbc, mcframe.serverMG.dbc.MGT_ACT_PTN_CONFIG_R.class);
	public static final MCMeta act_ptn_nm_META = createCommonMeta($act_ptn_nm, mcframe.commonMA.meta.MA_META.ACT_PTN_NM);
	public static final MCMeta term_nm_META = createCommonMeta($term_nm, mcframe.commonMA.meta.MA_META.TERM_NM);
	public static final MCMeta term_end_ym_META = createCommonMeta($term_end_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta calc_grp_nm_META = createCommonMeta($calc_grp_nm, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta calc_seq_grp_META = createCommonMeta($calc_seq_grp, mcframe.commonMA.meta.MA_META.CALC_SEQ_GRP);
	public static final MCMeta max_mons_META = createCommonMeta($max_mons, mcframe.commonMA.meta.MA_META.MAX_MONS);
	public static final MCMeta calc_seq_META = createCommonMeta($calc_seq, mcframe.commonMA.meta.MA_META.INT3);
	public static final MCMeta xrate_nm_META = createCommonMeta($xrate_nm, mcframe.commonMA.meta.MA_META.XRATE_NM);

	protected static final ConstMetaList<Chk01_RsltR> constMetas = new ConstMetaList<Chk01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			rtn_sts_typ_META,
			dbc_META,
			act_ptn_nm_META,
			term_nm_META,
			term_end_ym_META,
			calc_grp_nm_META,
			calc_seq_grp_META,
			max_mons_META,
			calc_seq_META,
			xrate_nm_META
		},
		new String[][]{
			{
				"act_ptn_cd",
				"calc_act_seq",
				"term",
				"calc_grp_cd",
				"st_ym",
				"end_ym",
				"xrate_cd",
				"carry_flg",
				"err_proceed_flg",
				"rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"upd_cntr"
			},
			{
				$act_ptn_cd,
				$calc_act_seq,
				$term,
				$calc_grp_cd,
				$st_ym,
				$end_ym,
				$xrate_cd,
				$carry_flg,
				$err_proceed_flg,
				$rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$upd_cntr
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
				{$dbc + ".act_ptn_cd", "E"},	// dbc.act_ptn_cd
				{$dbc + ".calc_act_seq", "E"}	// dbc.calc_act_seq
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$dbc + ".calc_act_seq", "positive"}	// dbc.calc_act_seq
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
				{$dbc + ".st_ym", "calc_tgt_ym:BF"},	// dbc.st_ym
				{$dbc + ".end_ym", "calc_tgt_ym:AF"}	// dbc.end_ym
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
				{$dbc + ".act_ptn_cd", "E"},	// dbc.act_ptn_cd
				{$dbc + ".calc_act_seq", "E"}	// dbc.calc_act_seq
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
				{$dbc + ".act_ptn_cd", "MA.MAUAL0010.ActPtn"},	// dbc.act_ptn_cd
				{$dbc + ".term", "MA.MAUAL0010.Term"},	// dbc.term
				{$dbc + ".calc_grp_cd", "MA.MAUAL0010.CalcGrp"},	// dbc.calc_grp_cd
				{$dbc + ".xrate_cd", "MA.MAUAL0010.Xrate"}	// dbc.xrate_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$dbc + ".act_ptn_cd", "act_ptn_nm"},	// dbc.act_ptn_cd
				{$dbc + ".term", "term_nm;term_end_ym"},	// dbc.term
				{$dbc + ".calc_grp_cd", "calc_grp_nm;max_mons"},	// dbc.calc_grp_cd
				{$dbc + ".xrate_cd", "xrate_nm"}	// dbc.xrate_cd
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
	protected Chk01_RsltR_MC_A(ConstMetaList<? extends Chk01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_RsltR clone() {
		return (Chk01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_RsltR createInstance() {
		return (Chk01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_RsltR getValues(String... names) {
		return (Chk01_RsltR) super.getValues(names);
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


	public mcframe.serverMG.dbc.MGT_ACT_PTN_CONFIG_R dbc(){
		return (mcframe.serverMG.dbc.MGT_ACT_PTN_CONFIG_R) getConstInnerRow(offset + 3, $dbc);
	}
	
	public void dbc(mcframe.serverMG.dbc.MGT_ACT_PTN_CONFIG_R row){
		setConstInnerRow(offset + 3, $dbc, row);
	}


	/**
	 * Calculation run pattern name 計算実行パタン名.<p>
	 *
	 */
	public String act_ptn_nm() {
		return getConstString(offset + 4, $act_ptn_nm);
	}

	/**
	 * Calculation run pattern name 計算実行パタン名.<p>
	 *
	 */
	public void act_ptn_nm(String value) {
		setConstString(offset + 4, $act_ptn_nm, value);
	}


	/**
	 * Term name 期名称.<p>
	 *
	 */
	public String term_nm() {
		return getConstString(offset + 5, $term_nm);
	}

	/**
	 * Term name 期名称.<p>
	 *
	 */
	public void term_nm(String value) {
		setConstString(offset + 5, $term_nm, value);
	}


	/**
	 * End month of term 期終了年月.<p>
	 *
	 */
	public MCDate term_end_ym() {
		return getConstDate(offset + 6, $term_end_ym);
	}

	/**
	 * End month of term 期終了年月.<p>
	 *
	 */
	public void term_end_ym(MCDate value) {
		setConstDate(offset + 6, $term_end_ym, value);
	}


	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public String calc_grp_nm() {
		return getConstString(offset + 7, $calc_grp_nm);
	}

	/**
	 * Calculation group name 計算グループ名.<p>
	 *
	 */
	public void calc_grp_nm(String value) {
		setConstString(offset + 7, $calc_grp_nm, value);
	}


	/**
	 * Calculation sequence group 計算順序グループ.<p>
	 *
	 */
	public String calc_seq_grp() {
		return getConstString(offset + 8, $calc_seq_grp);
	}

	/**
	 * Calculation sequence group 計算順序グループ.<p>
	 *
	 */
	public void calc_seq_grp(String value) {
		setConstString(offset + 8, $calc_seq_grp, value);
	}


	/**
	 * Max. number of month 最大月数.<p>
	 *
	 */
	public MCNumber max_mons() {
		return getConstNumber(offset + 9, $max_mons);
	}

	/**
	 * Max. number of month 最大月数.<p>
	 *
	 */
	public void max_mons(MCNumber value) {
		setConstNumber(offset + 9, $max_mons, value);
	}

	/**
	 * Max. number of month 最大月数.<p>
	 *
	 */
	public void max_mons(int value) {
		setConstNumber(offset + 9, $max_mons, value);
	}

	/**
	 * Max. number of month 最大月数.<p>
	 *
	 */
	public void max_mons(long value) {
		setConstNumber(offset + 9, $max_mons, value);
	}

	/**
	 * Max. number of month 最大月数.<p>
	 *
	 */
	public void max_mons(float value) {
		setConstNumber(offset + 9, $max_mons, value);
	}

	/**
	 * Max. number of month 最大月数.<p>
	 *
	 */
	public void max_mons(double value) {
		setConstNumber(offset + 9, $max_mons, value);
	}


	/**
	 * Calculation sequence 計算順序.<p>
	 *
	 */
	public MCNumber calc_seq() {
		return getConstNumber(offset + 10, $calc_seq);
	}

	/**
	 * Calculation sequence 計算順序.<p>
	 *
	 */
	public void calc_seq(MCNumber value) {
		setConstNumber(offset + 10, $calc_seq, value);
	}

	/**
	 * Calculation sequence 計算順序.<p>
	 *
	 */
	public void calc_seq(int value) {
		setConstNumber(offset + 10, $calc_seq, value);
	}

	/**
	 * Calculation sequence 計算順序.<p>
	 *
	 */
	public void calc_seq(long value) {
		setConstNumber(offset + 10, $calc_seq, value);
	}

	/**
	 * Calculation sequence 計算順序.<p>
	 *
	 */
	public void calc_seq(float value) {
		setConstNumber(offset + 10, $calc_seq, value);
	}

	/**
	 * Calculation sequence 計算順序.<p>
	 *
	 */
	public void calc_seq(double value) {
		setConstNumber(offset + 10, $calc_seq, value);
	}


	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public String xrate_nm() {
		return getConstString(offset + 11, $xrate_nm);
	}

	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public void xrate_nm(String value) {
		setConstString(offset + 11, $xrate_nm, value);
	}


	public String getString(String name) {
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($act_ptn_nm.equalsIgnoreCase(name)) {
			return act_ptn_nm();
		}
		if ($term_nm.equalsIgnoreCase(name)) {
			return term_nm();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($calc_seq_grp.equalsIgnoreCase(name)) {
			return calc_seq_grp();
		}
		if ($xrate_nm.equalsIgnoreCase(name)) {
			return xrate_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($max_mons.equalsIgnoreCase(name)) {
			return max_mons();
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			return calc_seq();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($term_end_ym.equalsIgnoreCase(name)) {
			return term_end_ym();
		}
		return super.getDate(name);
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
		if ($act_ptn_nm.equalsIgnoreCase(name)) {
			return act_ptn_nm();
		}
		if ($term_nm.equalsIgnoreCase(name)) {
			return term_nm();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($calc_seq_grp.equalsIgnoreCase(name)) {
			return calc_seq_grp();
		}
		if ($xrate_nm.equalsIgnoreCase(name)) {
			return xrate_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($max_mons.equalsIgnoreCase(name)) {
			return max_mons();
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			return calc_seq();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($term_end_ym.equalsIgnoreCase(name)) {
			return term_end_ym();
		}
		return super.getDateNE(name);
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
		if ($act_ptn_nm.equalsIgnoreCase(name)) {
			act_ptn_nm(value);
			return;
		}
		if ($term_nm.equalsIgnoreCase(name)) {
			term_nm(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
			return;
		}
		if ($calc_seq_grp.equalsIgnoreCase(name)) {
			calc_seq_grp(value);
			return;
		}
		if ($xrate_nm.equalsIgnoreCase(name)) {
			xrate_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($term_end_ym.equalsIgnoreCase(name)) {
			term_end_ym(value);
			return;
		}
		super.setDate(name, value);
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
		if ($act_ptn_nm.equalsIgnoreCase(name)) {
			act_ptn_nm(value);
			return;
		}
		if ($term_nm.equalsIgnoreCase(name)) {
			term_nm(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
			return;
		}
		if ($calc_seq_grp.equalsIgnoreCase(name)) {
			calc_seq_grp(value);
			return;
		}
		if ($xrate_nm.equalsIgnoreCase(name)) {
			xrate_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_seq.equalsIgnoreCase(name)) {
			calc_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($term_end_ym.equalsIgnoreCase(name)) {
			term_end_ym(value);
			return;
		}
		super.setDateNE(name, value);
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
				((MCContainerMeta) dbc_META).castInnerRow(mcframe.serverMG.dbc.MGT_ACT_PTN_CONFIG_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Calculation run pattern cd. 計算実行パタンＣＤ.<p>
	 *
	 */
	public String act_ptn_cd() {
		return dbc().act_ptn_cd();
	}

	/**
	 * Calculation run pattern cd. 計算実行パタンＣＤ.<p>
	 *
	 */
	public void act_ptn_cd(String value) {
		dbc().act_ptn_cd(value);
	}

	/**
	 * Calculation execute sequence 計算実行順序.<p>
	 *
	 */
	public MCNumber calc_act_seq() {
		return dbc().calc_act_seq();
	}

	/**
	 * Calculation execute sequence 計算実行順序.<p>
	 *
	 */
	public void calc_act_seq(MCNumber value) {
		dbc().calc_act_seq(value);
	}

	/**
	 * Calculation execute sequence 計算実行順序.<p>
	 *
	 */
	public void calc_act_seq(int value) {
		dbc().calc_act_seq(value);
	}

	/**
	 * Calculation execute sequence 計算実行順序.<p>
	 *
	 */
	public void calc_act_seq(long value) {
		dbc().calc_act_seq(value);
	}

	/**
	 * Calculation execute sequence 計算実行順序.<p>
	 *
	 */
	public void calc_act_seq(float value) {
		dbc().calc_act_seq(value);
	}

	/**
	 * Calculation execute sequence 計算実行順序.<p>
	 *
	 */
	public void calc_act_seq(double value) {
		dbc().calc_act_seq(value);
	}

	/**
	 * Term 期.<p>
	 *
	 */
	public MCDate term() {
		return dbc().term();
	}

	/**
	 * Term 期.<p>
	 *
	 */
	public void term(MCDate value) {
		dbc().term(value);
	}

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public String calc_grp_cd() {
		return dbc().calc_grp_cd();
	}

	/**
	 * Calculation group cd. 計算グループＣＤ.<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		dbc().calc_grp_cd(value);
	}

	/**
	 * Calculation first month 計算対象先頭月.<p>
	 *
	 */
	public MCDate st_ym() {
		return dbc().st_ym();
	}

	/**
	 * Calculation first month 計算対象先頭月.<p>
	 *
	 */
	public void st_ym(MCDate value) {
		dbc().st_ym(value);
	}

	/**
	 * Calculation last month 計算対象末尾月.<p>
	 *
	 */
	public MCDate end_ym() {
		return dbc().end_ym();
	}

	/**
	 * Calculation last month 計算対象末尾月.<p>
	 *
	 */
	public void end_ym(MCDate value) {
		dbc().end_ym(value);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return dbc().xrate_cd();
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		dbc().xrate_cd(value);
	}

	/**
	 * Carry-over 繰越.<p>
	 *
	 */
	public boolean carry_flg() {
		return dbc().carry_flg();
	}

	/**
	 * Carry-over 繰越.<p>
	 *
	 */
	public void carry_flg(boolean value) {
		dbc().carry_flg(value);
	}

	/**
	 * Continue on error エラー時続行.<p>
	 *
	 */
	public boolean err_proceed_flg() {
		return dbc().err_proceed_flg();
	}

	/**
	 * Continue on error エラー時続行.<p>
	 *
	 */
	public void err_proceed_flg(boolean value) {
		dbc().err_proceed_flg(value);
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

}

