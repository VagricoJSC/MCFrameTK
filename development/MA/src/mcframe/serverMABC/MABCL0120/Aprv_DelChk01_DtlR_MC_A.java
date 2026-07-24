package mcframe.serverMABC.MABCL0120;

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
 * ブロック"Aprv_DelChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Aprv_DelChk01_DtlR_MC_A extends MCConstRow {

	/**
	 * Approval function type 承認機能区分.<p>
	 *
	 */
	public static final String $aprv_func_typ = "aprv_func_typ";
	/**
	 * Approver row number 承認行番号.<p>
	 *
	 */
	public static final String $aprv_row_num = "aprv_row_num";
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public static final String $st_dt = "st_dt";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";


	public static final MCMeta aprv_func_typ_META = createCommonMeta($aprv_func_typ, mcframe.commonMA.meta.MA_META.APRV_FUNC_TYP);
	public static final MCMeta aprv_row_num_META = createCommonMeta($aprv_row_num, mcframe.commonMA.meta.MA_META.APRV_ROW_NUM);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<Aprv_DelChk01_DtlR> constMetas = new ConstMetaList<Aprv_DelChk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			aprv_func_typ_META,
			aprv_row_num_META,
			st_dt_META,
			upd_cntr_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$aprv_func_typ, "E"},	// aprv_func_typ
				{$aprv_row_num, "E"},	// aprv_row_num
				{$st_dt, "E"}	// st_dt
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
	protected Aprv_DelChk01_DtlR_MC_A(ConstMetaList<? extends Aprv_DelChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Aprv_DelChk01_DtlR clone() {
		return (Aprv_DelChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Aprv_DelChk01_DtlR createInstance() {
		return (Aprv_DelChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Aprv_DelChk01_DtlR getValues(String... names) {
		return (Aprv_DelChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Approval function type 承認機能区分.<p>
	 *
	 */
	public String aprv_func_typ() {
		return getConstString(offset + 0, $aprv_func_typ);
	}

	/**
	 * Approval function type 承認機能区分.<p>
	 *
	 */
	public void aprv_func_typ(String value) {
		setConstString(offset + 0, $aprv_func_typ, value);
	}


	/**
	 * Approver row number 承認行番号.<p>
	 *
	 */
	public MCNumber aprv_row_num() {
		return getConstNumber(offset + 1, $aprv_row_num);
	}

	/**
	 * Approver row number 承認行番号.<p>
	 *
	 */
	public void aprv_row_num(MCNumber value) {
		setConstNumber(offset + 1, $aprv_row_num, value);
	}

	/**
	 * Approver row number 承認行番号.<p>
	 *
	 */
	public void aprv_row_num(int value) {
		setConstNumber(offset + 1, $aprv_row_num, value);
	}

	/**
	 * Approver row number 承認行番号.<p>
	 *
	 */
	public void aprv_row_num(long value) {
		setConstNumber(offset + 1, $aprv_row_num, value);
	}

	/**
	 * Approver row number 承認行番号.<p>
	 *
	 */
	public void aprv_row_num(float value) {
		setConstNumber(offset + 1, $aprv_row_num, value);
	}

	/**
	 * Approver row number 承認行番号.<p>
	 *
	 */
	public void aprv_row_num(double value) {
		setConstNumber(offset + 1, $aprv_row_num, value);
	}


	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 2, $st_dt);
	}

	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 2, $st_dt, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 3, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 3, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 3, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 3, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 3, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 3, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($aprv_func_typ.equalsIgnoreCase(name)) {
			return aprv_func_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			return aprv_row_num();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($aprv_func_typ.equalsIgnoreCase(name)) {
			return aprv_func_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			return aprv_row_num();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($aprv_func_typ.equalsIgnoreCase(name)) {
			aprv_func_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($aprv_func_typ.equalsIgnoreCase(name)) {
			aprv_func_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($aprv_row_num.equalsIgnoreCase(name)) {
			aprv_row_num(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

