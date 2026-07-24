package mcframe.serverMSBD.MSBDL0040;

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
 * ブロック"Chk01_Dtl1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk01_Dtl1R_MC_A extends MCConstRow {

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
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public static final String $po_schd_no = "po_schd_no";
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
	 * Schedule split source No. 分割元予定ＮＯ.<p>
	 *
	 */
	public static final String $split_src_schd_no = "split_src_schd_no";
	/**
	 * Subcontracting item order No. 外注品目オーダＮＯ.<p>
	 *
	 */
	public static final String $outsrc_itm_ord_no = "outsrc_itm_ord_no";
	/**
	 * Plan item order No. 計画品目オーダＮＯ.<p>
	 *
	 */
	public static final String $pln_itm_ord_no = "pln_itm_ord_no";
	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public static final String $outsrc_flg = "outsrc_flg";
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * PO placed 発注済.<p>
	 *
	 */
	public static final String $po_flg = "po_flg";
	/**
	 * Subcontractor cd. 支給先ＣＤ.<p>
	 *
	 */
	public static final String $outsrc_sppl_cd = "outsrc_sppl_cd";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $po_schd_upd_cntr = "po_schd_upd_cntr";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_schd_no_META = createCommonMeta($po_schd_no, mcframe.commonMA.meta.MA_META.PO_SCHD_NO);
	public static final MCMeta po_schd_src_typ_META = createCommonMeta($po_schd_src_typ, mcframe.commonMS.meta.MS_META.PO_SCHD_SRC_TYP);
	public static final MCMeta po_schd_src_no_META = createCommonMeta($po_schd_src_no, mcframe.commonMA.meta.MA_META.PO_SCHD_SRC_NO);
	public static final MCMeta split_src_schd_no_META = createCommonMeta($split_src_schd_no, mcframe.commonMA.meta.MA_META.PO_SCHD_NO);
	public static final MCMeta outsrc_itm_ord_no_META = createCommonMeta($outsrc_itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta pln_itm_ord_no_META = createCommonMeta($pln_itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta outsrc_flg_META = createCommonMeta($outsrc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_flg_META = createCommonMeta($po_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta outsrc_sppl_cd_META = createCommonMeta($outsrc_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta po_schd_upd_cntr_META = createCommonMeta($po_schd_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<Chk01_Dtl1R> constMetas = new ConstMetaList<Chk01_Dtl1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			po_schd_no_META,
			po_schd_src_typ_META,
			po_schd_src_no_META,
			split_src_schd_no_META,
			outsrc_itm_ord_no_META,
			pln_itm_ord_no_META,
			outsrc_flg_META,
			abort_flg_META,
			po_flg_META,
			outsrc_sppl_cd_META,
			po_schd_upd_cntr_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[UPD_CNT_CHK]のキー定数 */
	public static final String $$UPD_CNT_CHK = "UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
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

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
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
	protected Chk01_Dtl1R_MC_A(ConstMetaList<? extends Chk01_Dtl1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_Dtl1R clone() {
		return (Chk01_Dtl1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_Dtl1R createInstance() {
		return (Chk01_Dtl1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_Dtl1R getValues(String... names) {
		return (Chk01_Dtl1R) super.getValues(names);
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
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public String po_schd_no() {
		return getConstString(offset + 2, $po_schd_no);
	}

	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public void po_schd_no(String value) {
		setConstString(offset + 2, $po_schd_no, value);
	}


	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public String po_schd_src_typ() {
		return getConstString(offset + 3, $po_schd_src_typ);
	}

	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public void po_schd_src_typ(String value) {
		setConstString(offset + 3, $po_schd_src_typ, value);
	}


	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public String po_schd_src_no() {
		return getConstString(offset + 4, $po_schd_src_no);
	}

	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public void po_schd_src_no(String value) {
		setConstString(offset + 4, $po_schd_src_no, value);
	}


	/**
	 * Schedule split source No. 分割元予定ＮＯ.<p>
	 *
	 */
	public String split_src_schd_no() {
		return getConstString(offset + 5, $split_src_schd_no);
	}

	/**
	 * Schedule split source No. 分割元予定ＮＯ.<p>
	 *
	 */
	public void split_src_schd_no(String value) {
		setConstString(offset + 5, $split_src_schd_no, value);
	}


	/**
	 * Subcontracting item order No. 外注品目オーダＮＯ.<p>
	 *
	 */
	public String outsrc_itm_ord_no() {
		return getConstString(offset + 6, $outsrc_itm_ord_no);
	}

	/**
	 * Subcontracting item order No. 外注品目オーダＮＯ.<p>
	 *
	 */
	public void outsrc_itm_ord_no(String value) {
		setConstString(offset + 6, $outsrc_itm_ord_no, value);
	}


	/**
	 * Plan item order No. 計画品目オーダＮＯ.<p>
	 *
	 */
	public String pln_itm_ord_no() {
		return getConstString(offset + 7, $pln_itm_ord_no);
	}

	/**
	 * Plan item order No. 計画品目オーダＮＯ.<p>
	 *
	 */
	public void pln_itm_ord_no(String value) {
		setConstString(offset + 7, $pln_itm_ord_no, value);
	}


	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public boolean outsrc_flg() {
		return getConstBoolean(offset + 8, $outsrc_flg);
	}

	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public void outsrc_flg(boolean value) {
		setConstBoolean(offset + 8, $outsrc_flg, value);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 9, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 9, $abort_flg, value);
	}


	/**
	 * PO placed 発注済.<p>
	 *
	 */
	public boolean po_flg() {
		return getConstBoolean(offset + 10, $po_flg);
	}

	/**
	 * PO placed 発注済.<p>
	 *
	 */
	public void po_flg(boolean value) {
		setConstBoolean(offset + 10, $po_flg, value);
	}


	/**
	 * Subcontractor cd. 支給先ＣＤ.<p>
	 *
	 */
	public String outsrc_sppl_cd() {
		return getConstString(offset + 11, $outsrc_sppl_cd);
	}

	/**
	 * Subcontractor cd. 支給先ＣＤ.<p>
	 *
	 */
	public void outsrc_sppl_cd(String value) {
		setConstString(offset + 11, $outsrc_sppl_cd, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber po_schd_upd_cntr() {
		return getConstNumber(offset + 12, $po_schd_upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void po_schd_upd_cntr(MCNumber value) {
		setConstNumber(offset + 12, $po_schd_upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void po_schd_upd_cntr(int value) {
		setConstNumber(offset + 12, $po_schd_upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void po_schd_upd_cntr(long value) {
		setConstNumber(offset + 12, $po_schd_upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void po_schd_upd_cntr(float value) {
		setConstNumber(offset + 12, $po_schd_upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void po_schd_upd_cntr(double value) {
		setConstNumber(offset + 12, $po_schd_upd_cntr, value);
	}


	public String getString(String name) {
		if ($po_schd_no.equalsIgnoreCase(name)) {
			return po_schd_no();
		}
		if ($po_schd_src_typ.equalsIgnoreCase(name)) {
			return po_schd_src_typ();
		}
		if ($po_schd_src_no.equalsIgnoreCase(name)) {
			return po_schd_src_no();
		}
		if ($split_src_schd_no.equalsIgnoreCase(name)) {
			return split_src_schd_no();
		}
		if ($outsrc_itm_ord_no.equalsIgnoreCase(name)) {
			return outsrc_itm_ord_no();
		}
		if ($pln_itm_ord_no.equalsIgnoreCase(name)) {
			return pln_itm_ord_no();
		}
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			return outsrc_sppl_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			return po_schd_upd_cntr();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($po_flg.equalsIgnoreCase(name)) {
			return po_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($po_schd_no.equalsIgnoreCase(name)) {
			return po_schd_no();
		}
		if ($po_schd_src_typ.equalsIgnoreCase(name)) {
			return po_schd_src_typ();
		}
		if ($po_schd_src_no.equalsIgnoreCase(name)) {
			return po_schd_src_no();
		}
		if ($split_src_schd_no.equalsIgnoreCase(name)) {
			return split_src_schd_no();
		}
		if ($outsrc_itm_ord_no.equalsIgnoreCase(name)) {
			return outsrc_itm_ord_no();
		}
		if ($pln_itm_ord_no.equalsIgnoreCase(name)) {
			return pln_itm_ord_no();
		}
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			return outsrc_sppl_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			return po_schd_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($po_flg.equalsIgnoreCase(name)) {
			return po_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($po_schd_no.equalsIgnoreCase(name)) {
			po_schd_no(value);
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
		if ($split_src_schd_no.equalsIgnoreCase(name)) {
			split_src_schd_no(value);
			return;
		}
		if ($outsrc_itm_ord_no.equalsIgnoreCase(name)) {
			outsrc_itm_ord_no(value);
			return;
		}
		if ($pln_itm_ord_no.equalsIgnoreCase(name)) {
			pln_itm_ord_no(value);
			return;
		}
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			outsrc_sppl_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($po_flg.equalsIgnoreCase(name)) {
			po_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($po_schd_no.equalsIgnoreCase(name)) {
			po_schd_no(value);
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
		if ($split_src_schd_no.equalsIgnoreCase(name)) {
			split_src_schd_no(value);
			return;
		}
		if ($outsrc_itm_ord_no.equalsIgnoreCase(name)) {
			outsrc_itm_ord_no(value);
			return;
		}
		if ($pln_itm_ord_no.equalsIgnoreCase(name)) {
			pln_itm_ord_no(value);
			return;
		}
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			outsrc_sppl_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($po_schd_upd_cntr.equalsIgnoreCase(name)) {
			po_schd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($po_flg.equalsIgnoreCase(name)) {
			po_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

