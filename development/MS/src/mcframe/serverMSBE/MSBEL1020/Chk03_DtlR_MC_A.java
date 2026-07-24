package mcframe.serverMSBE.MSBEL1020;

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
 * ブロック"Chk03_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk03_DtlR_MC_A extends MCConstRow {

	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public static final String $pr_sts_typ = "pr_sts_typ";
	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public static final String $pr_sts_typ_nm = "pr_sts_typ_nm";
	/**
	 * Movement result details No. 移動実績明細ＮＯ.<p>
	 *
	 */
	public static final String $xfr_act_d_no = "xfr_act_d_no";
	/**
	 * Movement allocation status No. 移動引当状況ＮＯ.<p>
	 *
	 */
	public static final String $xfr_alloc_sts_no = "xfr_alloc_sts_no";
	/**
	 * Update counter (Result details) 更新カウンタ(実績明細).<p>
	 *
	 */
	public static final String $act_d_upd_cntr = "act_d_upd_cntr";
	/**
	 * Update counter (Movement allocation status) 更新カウンタ(移動引当状況).<p>
	 *
	 */
	public static final String $alloc_sts_upd_cntr = "alloc_sts_upd_cntr";


	public static final MCMeta pr_sts_typ_META = createCommonMeta($pr_sts_typ, mcframe.commonMS.meta.MS_META.PR_STS_TYP);
	public static final MCMeta pr_sts_typ_nm_META = createCommonMeta($pr_sts_typ_nm, mcframe.commonMS.meta.MS_META.PR_STS_TYP_NM);
	public static final MCMeta xfr_act_d_no_META = createCommonMeta($xfr_act_d_no, mcframe.commonMA.meta.MA_META.XFR_ACT_D_NO);
	public static final MCMeta xfr_alloc_sts_no_META = createCommonMeta($xfr_alloc_sts_no, mcframe.commonMA.meta.MA_META.XFR_ALLOC_STS_NO);
	public static final MCMeta act_d_upd_cntr_META = createCommonMeta($act_d_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta alloc_sts_upd_cntr_META = createCommonMeta($alloc_sts_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<Chk03_DtlR> constMetas = new ConstMetaList<Chk03_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			pr_sts_typ_META,
			pr_sts_typ_nm_META,
			xfr_act_d_no_META,
			xfr_alloc_sts_no_META,
			act_d_upd_cntr_META,
			alloc_sts_upd_cntr_META
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
	protected Chk03_DtlR_MC_A(ConstMetaList<? extends Chk03_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk03_DtlR clone() {
		return (Chk03_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk03_DtlR createInstance() {
		return (Chk03_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk03_DtlR getValues(String... names) {
		return (Chk03_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public String pr_sts_typ() {
		return getConstString(offset + 0, $pr_sts_typ);
	}

	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public void pr_sts_typ(String value) {
		setConstString(offset + 0, $pr_sts_typ, value);
	}


	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public String pr_sts_typ_nm() {
		return getConstString(offset + 1, $pr_sts_typ_nm);
	}

	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public void pr_sts_typ_nm(String value) {
		setConstString(offset + 1, $pr_sts_typ_nm, value);
	}


	/**
	 * Movement result details No. 移動実績明細ＮＯ.<p>
	 *
	 */
	public String xfr_act_d_no() {
		return getConstString(offset + 2, $xfr_act_d_no);
	}

	/**
	 * Movement result details No. 移動実績明細ＮＯ.<p>
	 *
	 */
	public void xfr_act_d_no(String value) {
		setConstString(offset + 2, $xfr_act_d_no, value);
	}


	/**
	 * Movement allocation status No. 移動引当状況ＮＯ.<p>
	 *
	 */
	public String xfr_alloc_sts_no() {
		return getConstString(offset + 3, $xfr_alloc_sts_no);
	}

	/**
	 * Movement allocation status No. 移動引当状況ＮＯ.<p>
	 *
	 */
	public void xfr_alloc_sts_no(String value) {
		setConstString(offset + 3, $xfr_alloc_sts_no, value);
	}


	/**
	 * Update counter (Result details) 更新カウンタ(実績明細).<p>
	 *
	 */
	public MCNumber act_d_upd_cntr() {
		return getConstNumber(offset + 4, $act_d_upd_cntr);
	}

	/**
	 * Update counter (Result details) 更新カウンタ(実績明細).<p>
	 *
	 */
	public void act_d_upd_cntr(MCNumber value) {
		setConstNumber(offset + 4, $act_d_upd_cntr, value);
	}

	/**
	 * Update counter (Result details) 更新カウンタ(実績明細).<p>
	 *
	 */
	public void act_d_upd_cntr(int value) {
		setConstNumber(offset + 4, $act_d_upd_cntr, value);
	}

	/**
	 * Update counter (Result details) 更新カウンタ(実績明細).<p>
	 *
	 */
	public void act_d_upd_cntr(long value) {
		setConstNumber(offset + 4, $act_d_upd_cntr, value);
	}

	/**
	 * Update counter (Result details) 更新カウンタ(実績明細).<p>
	 *
	 */
	public void act_d_upd_cntr(float value) {
		setConstNumber(offset + 4, $act_d_upd_cntr, value);
	}

	/**
	 * Update counter (Result details) 更新カウンタ(実績明細).<p>
	 *
	 */
	public void act_d_upd_cntr(double value) {
		setConstNumber(offset + 4, $act_d_upd_cntr, value);
	}


	/**
	 * Update counter (Movement allocation status) 更新カウンタ(移動引当状況).<p>
	 *
	 */
	public MCNumber alloc_sts_upd_cntr() {
		return getConstNumber(offset + 5, $alloc_sts_upd_cntr);
	}

	/**
	 * Update counter (Movement allocation status) 更新カウンタ(移動引当状況).<p>
	 *
	 */
	public void alloc_sts_upd_cntr(MCNumber value) {
		setConstNumber(offset + 5, $alloc_sts_upd_cntr, value);
	}

	/**
	 * Update counter (Movement allocation status) 更新カウンタ(移動引当状況).<p>
	 *
	 */
	public void alloc_sts_upd_cntr(int value) {
		setConstNumber(offset + 5, $alloc_sts_upd_cntr, value);
	}

	/**
	 * Update counter (Movement allocation status) 更新カウンタ(移動引当状況).<p>
	 *
	 */
	public void alloc_sts_upd_cntr(long value) {
		setConstNumber(offset + 5, $alloc_sts_upd_cntr, value);
	}

	/**
	 * Update counter (Movement allocation status) 更新カウンタ(移動引当状況).<p>
	 *
	 */
	public void alloc_sts_upd_cntr(float value) {
		setConstNumber(offset + 5, $alloc_sts_upd_cntr, value);
	}

	/**
	 * Update counter (Movement allocation status) 更新カウンタ(移動引当状況).<p>
	 *
	 */
	public void alloc_sts_upd_cntr(double value) {
		setConstNumber(offset + 5, $alloc_sts_upd_cntr, value);
	}


	public String getString(String name) {
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			return pr_sts_typ();
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			return pr_sts_typ_nm();
		}
		if ($xfr_act_d_no.equalsIgnoreCase(name)) {
			return xfr_act_d_no();
		}
		if ($xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			return xfr_alloc_sts_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($act_d_upd_cntr.equalsIgnoreCase(name)) {
			return act_d_upd_cntr();
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			return alloc_sts_upd_cntr();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			return pr_sts_typ();
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			return pr_sts_typ_nm();
		}
		if ($xfr_act_d_no.equalsIgnoreCase(name)) {
			return xfr_act_d_no();
		}
		if ($xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			return xfr_alloc_sts_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($act_d_upd_cntr.equalsIgnoreCase(name)) {
			return act_d_upd_cntr();
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			return alloc_sts_upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			pr_sts_typ(value);
			return;
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			pr_sts_typ_nm(value);
			return;
		}
		if ($xfr_act_d_no.equalsIgnoreCase(name)) {
			xfr_act_d_no(value);
			return;
		}
		if ($xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			xfr_alloc_sts_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($act_d_upd_cntr.equalsIgnoreCase(name)) {
			act_d_upd_cntr(value);
			return;
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			alloc_sts_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($act_d_upd_cntr.equalsIgnoreCase(name)) {
			act_d_upd_cntr(value);
			return;
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			alloc_sts_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($act_d_upd_cntr.equalsIgnoreCase(name)) {
			act_d_upd_cntr(value);
			return;
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			alloc_sts_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($act_d_upd_cntr.equalsIgnoreCase(name)) {
			act_d_upd_cntr(value);
			return;
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			alloc_sts_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($act_d_upd_cntr.equalsIgnoreCase(name)) {
			act_d_upd_cntr(value);
			return;
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			alloc_sts_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			pr_sts_typ(value);
			return;
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			pr_sts_typ_nm(value);
			return;
		}
		if ($xfr_act_d_no.equalsIgnoreCase(name)) {
			xfr_act_d_no(value);
			return;
		}
		if ($xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			xfr_alloc_sts_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($act_d_upd_cntr.equalsIgnoreCase(name)) {
			act_d_upd_cntr(value);
			return;
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			alloc_sts_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($act_d_upd_cntr.equalsIgnoreCase(name)) {
			act_d_upd_cntr(value);
			return;
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			alloc_sts_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($act_d_upd_cntr.equalsIgnoreCase(name)) {
			act_d_upd_cntr(value);
			return;
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			alloc_sts_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($act_d_upd_cntr.equalsIgnoreCase(name)) {
			act_d_upd_cntr(value);
			return;
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			alloc_sts_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($act_d_upd_cntr.equalsIgnoreCase(name)) {
			act_d_upd_cntr(value);
			return;
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			alloc_sts_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

