package mcframe.serverMSBD.MSBDL5290;

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
 * ブロック"PoBulkReg_Chk01_Cnt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PoBulkReg_Chk01_CntR_MC_A extends MCConstRow {

	/**
	 * Number of PO schedules successfully processed 処理が成功した発注予定件数.<p>
	 *
	 */
	public static final String $po_schd_success_cnt = "po_schd_success_cnt";
	/**
	 * Number of PO schedules failed to process 処理が失敗した発注予定件数.<p>
	 *
	 */
	public static final String $po_schd_error_cnt = "po_schd_error_cnt";
	/**
	 * Number of PO schedules to be processed 処理対象の発注予定件数.<p>
	 *
	 */
	public static final String $total_cnt = "total_cnt";


	public static final MCMeta po_schd_success_cnt_META = createCommonMeta($po_schd_success_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta po_schd_error_cnt_META = createCommonMeta($po_schd_error_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta total_cnt_META = createCommonMeta($total_cnt, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<PoBulkReg_Chk01_CntR> constMetas = new ConstMetaList<PoBulkReg_Chk01_CntR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			po_schd_success_cnt_META,
			po_schd_error_cnt_META,
			total_cnt_META
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
	protected PoBulkReg_Chk01_CntR_MC_A(ConstMetaList<? extends PoBulkReg_Chk01_CntR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoBulkReg_Chk01_CntR clone() {
		return (PoBulkReg_Chk01_CntR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoBulkReg_Chk01_CntR createInstance() {
		return (PoBulkReg_Chk01_CntR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoBulkReg_Chk01_CntR getValues(String... names) {
		return (PoBulkReg_Chk01_CntR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Number of PO schedules successfully processed 処理が成功した発注予定件数.<p>
	 *
	 */
	public MCNumber po_schd_success_cnt() {
		return getConstNumber(offset + 0, $po_schd_success_cnt);
	}

	/**
	 * Number of PO schedules successfully processed 処理が成功した発注予定件数.<p>
	 *
	 */
	public void po_schd_success_cnt(MCNumber value) {
		setConstNumber(offset + 0, $po_schd_success_cnt, value);
	}

	/**
	 * Number of PO schedules successfully processed 処理が成功した発注予定件数.<p>
	 *
	 */
	public void po_schd_success_cnt(int value) {
		setConstNumber(offset + 0, $po_schd_success_cnt, value);
	}

	/**
	 * Number of PO schedules successfully processed 処理が成功した発注予定件数.<p>
	 *
	 */
	public void po_schd_success_cnt(long value) {
		setConstNumber(offset + 0, $po_schd_success_cnt, value);
	}

	/**
	 * Number of PO schedules successfully processed 処理が成功した発注予定件数.<p>
	 *
	 */
	public void po_schd_success_cnt(float value) {
		setConstNumber(offset + 0, $po_schd_success_cnt, value);
	}

	/**
	 * Number of PO schedules successfully processed 処理が成功した発注予定件数.<p>
	 *
	 */
	public void po_schd_success_cnt(double value) {
		setConstNumber(offset + 0, $po_schd_success_cnt, value);
	}


	/**
	 * Number of PO schedules failed to process 処理が失敗した発注予定件数.<p>
	 *
	 */
	public MCNumber po_schd_error_cnt() {
		return getConstNumber(offset + 1, $po_schd_error_cnt);
	}

	/**
	 * Number of PO schedules failed to process 処理が失敗した発注予定件数.<p>
	 *
	 */
	public void po_schd_error_cnt(MCNumber value) {
		setConstNumber(offset + 1, $po_schd_error_cnt, value);
	}

	/**
	 * Number of PO schedules failed to process 処理が失敗した発注予定件数.<p>
	 *
	 */
	public void po_schd_error_cnt(int value) {
		setConstNumber(offset + 1, $po_schd_error_cnt, value);
	}

	/**
	 * Number of PO schedules failed to process 処理が失敗した発注予定件数.<p>
	 *
	 */
	public void po_schd_error_cnt(long value) {
		setConstNumber(offset + 1, $po_schd_error_cnt, value);
	}

	/**
	 * Number of PO schedules failed to process 処理が失敗した発注予定件数.<p>
	 *
	 */
	public void po_schd_error_cnt(float value) {
		setConstNumber(offset + 1, $po_schd_error_cnt, value);
	}

	/**
	 * Number of PO schedules failed to process 処理が失敗した発注予定件数.<p>
	 *
	 */
	public void po_schd_error_cnt(double value) {
		setConstNumber(offset + 1, $po_schd_error_cnt, value);
	}


	/**
	 * Number of PO schedules to be processed 処理対象の発注予定件数.<p>
	 *
	 */
	public MCNumber total_cnt() {
		return getConstNumber(offset + 2, $total_cnt);
	}

	/**
	 * Number of PO schedules to be processed 処理対象の発注予定件数.<p>
	 *
	 */
	public void total_cnt(MCNumber value) {
		setConstNumber(offset + 2, $total_cnt, value);
	}

	/**
	 * Number of PO schedules to be processed 処理対象の発注予定件数.<p>
	 *
	 */
	public void total_cnt(int value) {
		setConstNumber(offset + 2, $total_cnt, value);
	}

	/**
	 * Number of PO schedules to be processed 処理対象の発注予定件数.<p>
	 *
	 */
	public void total_cnt(long value) {
		setConstNumber(offset + 2, $total_cnt, value);
	}

	/**
	 * Number of PO schedules to be processed 処理対象の発注予定件数.<p>
	 *
	 */
	public void total_cnt(float value) {
		setConstNumber(offset + 2, $total_cnt, value);
	}

	/**
	 * Number of PO schedules to be processed 処理対象の発注予定件数.<p>
	 *
	 */
	public void total_cnt(double value) {
		setConstNumber(offset + 2, $total_cnt, value);
	}


	public MCNumber getNumber(String name) {
		if ($po_schd_success_cnt.equalsIgnoreCase(name)) {
			return po_schd_success_cnt();
		}
		if ($po_schd_error_cnt.equalsIgnoreCase(name)) {
			return po_schd_error_cnt();
		}
		if ($total_cnt.equalsIgnoreCase(name)) {
			return total_cnt();
		}
		return super.getNumber(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($po_schd_success_cnt.equalsIgnoreCase(name)) {
			return po_schd_success_cnt();
		}
		if ($po_schd_error_cnt.equalsIgnoreCase(name)) {
			return po_schd_error_cnt();
		}
		if ($total_cnt.equalsIgnoreCase(name)) {
			return total_cnt();
		}
		return super.getNumberNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($po_schd_success_cnt.equalsIgnoreCase(name)) {
			po_schd_success_cnt(value);
			return;
		}
		if ($po_schd_error_cnt.equalsIgnoreCase(name)) {
			po_schd_error_cnt(value);
			return;
		}
		if ($total_cnt.equalsIgnoreCase(name)) {
			total_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($po_schd_success_cnt.equalsIgnoreCase(name)) {
			po_schd_success_cnt(value);
			return;
		}
		if ($po_schd_error_cnt.equalsIgnoreCase(name)) {
			po_schd_error_cnt(value);
			return;
		}
		if ($total_cnt.equalsIgnoreCase(name)) {
			total_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($po_schd_success_cnt.equalsIgnoreCase(name)) {
			po_schd_success_cnt(value);
			return;
		}
		if ($po_schd_error_cnt.equalsIgnoreCase(name)) {
			po_schd_error_cnt(value);
			return;
		}
		if ($total_cnt.equalsIgnoreCase(name)) {
			total_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($po_schd_success_cnt.equalsIgnoreCase(name)) {
			po_schd_success_cnt(value);
			return;
		}
		if ($po_schd_error_cnt.equalsIgnoreCase(name)) {
			po_schd_error_cnt(value);
			return;
		}
		if ($total_cnt.equalsIgnoreCase(name)) {
			total_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($po_schd_success_cnt.equalsIgnoreCase(name)) {
			po_schd_success_cnt(value);
			return;
		}
		if ($po_schd_error_cnt.equalsIgnoreCase(name)) {
			po_schd_error_cnt(value);
			return;
		}
		if ($total_cnt.equalsIgnoreCase(name)) {
			total_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($po_schd_success_cnt.equalsIgnoreCase(name)) {
			po_schd_success_cnt(value);
			return;
		}
		if ($po_schd_error_cnt.equalsIgnoreCase(name)) {
			po_schd_error_cnt(value);
			return;
		}
		if ($total_cnt.equalsIgnoreCase(name)) {
			total_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($po_schd_success_cnt.equalsIgnoreCase(name)) {
			po_schd_success_cnt(value);
			return;
		}
		if ($po_schd_error_cnt.equalsIgnoreCase(name)) {
			po_schd_error_cnt(value);
			return;
		}
		if ($total_cnt.equalsIgnoreCase(name)) {
			total_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($po_schd_success_cnt.equalsIgnoreCase(name)) {
			po_schd_success_cnt(value);
			return;
		}
		if ($po_schd_error_cnt.equalsIgnoreCase(name)) {
			po_schd_error_cnt(value);
			return;
		}
		if ($total_cnt.equalsIgnoreCase(name)) {
			total_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($po_schd_success_cnt.equalsIgnoreCase(name)) {
			po_schd_success_cnt(value);
			return;
		}
		if ($po_schd_error_cnt.equalsIgnoreCase(name)) {
			po_schd_error_cnt(value);
			return;
		}
		if ($total_cnt.equalsIgnoreCase(name)) {
			total_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($po_schd_success_cnt.equalsIgnoreCase(name)) {
			po_schd_success_cnt(value);
			return;
		}
		if ($po_schd_error_cnt.equalsIgnoreCase(name)) {
			po_schd_error_cnt(value);
			return;
		}
		if ($total_cnt.equalsIgnoreCase(name)) {
			total_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

