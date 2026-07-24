package mcframe.clientMSBF.MSBFP0060;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"VldLmtDtSrch"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class VldLmtDtSrchR_MC_A extends MCConstRow {

	/**
	 * Selected row No. 選択行ＮＯ.<p>
	 *
	 */
	public static final String $row_idx = "row_idx";
	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public static final String $insp_no = "insp_no";
	/**
	 * Base date 起算日.<p>
	 *
	 */
	public static final String $lmt_dt_frm = "lmt_dt_frm";
	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public static final String $vld_dt = "vld_dt";
	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public static final String $lmt_dt = "lmt_dt";


	public static final MCMeta row_idx_META = createCommonMeta($row_idx, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta insp_no_META = createCommonMeta($insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta lmt_dt_frm_META = createCommonMeta($lmt_dt_frm, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lmt_dt_META = createCommonMeta($lmt_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<VldLmtDtSrchR> constMetas = new ConstMetaList<VldLmtDtSrchR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			row_idx_META,
			insp_no_META,
			lmt_dt_frm_META,
			vld_dt_META,
			lmt_dt_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
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
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
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
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

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
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
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
	protected VldLmtDtSrchR_MC_A(ConstMetaList<? extends VldLmtDtSrchR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public VldLmtDtSrchR clone() {
		return (VldLmtDtSrchR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public VldLmtDtSrchR createInstance() {
		return (VldLmtDtSrchR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public VldLmtDtSrchR getValues(String... names) {
		return (VldLmtDtSrchR) super.getValues(names);
	}



	/**
	 * Selected row No. 選択行ＮＯ.<p>
	 *
	 */
	public MCNumber row_idx() {
		return getConstNumber(offset + 0, $row_idx);
	}

	/**
	 * Selected row No. 選択行ＮＯ.<p>
	 *
	 */
	public void row_idx(MCNumber value) {
		setConstNumber(offset + 0, $row_idx, value);
	}

	/**
	 * Selected row No. 選択行ＮＯ.<p>
	 *
	 */
	public void row_idx(int value) {
		setConstNumber(offset + 0, $row_idx, value);
	}

	/**
	 * Selected row No. 選択行ＮＯ.<p>
	 *
	 */
	public void row_idx(long value) {
		setConstNumber(offset + 0, $row_idx, value);
	}

	/**
	 * Selected row No. 選択行ＮＯ.<p>
	 *
	 */
	public void row_idx(float value) {
		setConstNumber(offset + 0, $row_idx, value);
	}

	/**
	 * Selected row No. 選択行ＮＯ.<p>
	 *
	 */
	public void row_idx(double value) {
		setConstNumber(offset + 0, $row_idx, value);
	}


	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 1, $insp_no);
	}

	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 1, $insp_no, value);
	}


	/**
	 * Base date 起算日.<p>
	 *
	 */
	public MCDate lmt_dt_frm() {
		return getConstDate(offset + 2, $lmt_dt_frm);
	}

	/**
	 * Base date 起算日.<p>
	 *
	 */
	public void lmt_dt_frm(MCDate value) {
		setConstDate(offset + 2, $lmt_dt_frm, value);
	}


	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 3, $vld_dt);
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 3, $vld_dt, value);
	}


	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return getConstDate(offset + 4, $lmt_dt);
	}

	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		setConstDate(offset + 4, $lmt_dt, value);
	}


	public String getString(String name) {
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($row_idx.equalsIgnoreCase(name)) {
			return row_idx();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			return lmt_dt_frm();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($row_idx.equalsIgnoreCase(name)) {
			return row_idx();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			return lmt_dt_frm();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($row_idx.equalsIgnoreCase(name)) {
			row_idx(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($row_idx.equalsIgnoreCase(name)) {
			row_idx(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($row_idx.equalsIgnoreCase(name)) {
			row_idx(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($row_idx.equalsIgnoreCase(name)) {
			row_idx(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($row_idx.equalsIgnoreCase(name)) {
			row_idx(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			lmt_dt_frm(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($row_idx.equalsIgnoreCase(name)) {
			row_idx(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($row_idx.equalsIgnoreCase(name)) {
			row_idx(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($row_idx.equalsIgnoreCase(name)) {
			row_idx(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($row_idx.equalsIgnoreCase(name)) {
			row_idx(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($row_idx.equalsIgnoreCase(name)) {
			row_idx(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			lmt_dt_frm(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

