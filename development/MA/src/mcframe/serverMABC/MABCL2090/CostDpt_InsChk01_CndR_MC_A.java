package mcframe.serverMABC.MABCL2090;

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
 * ブロック"CostDpt_InsChk01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CostDpt_InsChk01_CndR_MC_A extends MCConstRow {

	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Date 対象日.<p>
	 *
	 */
	public static final String $tgt_dt = "tgt_dt";
	/**
	 * Add only 追加のみ.<p>
	 *
	 */
	public static final String $ins_only_flg = "ins_only_flg";


	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tgt_dt_META = createCommonMeta($tgt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ins_only_flg_META = createCommonMeta($ins_only_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CostDpt_InsChk01_CndR> constMetas = new ConstMetaList<CostDpt_InsChk01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			err_flg_META,
			tgt_dt_META,
			ins_only_flg_META
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
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$tgt_dt, "E"}	// tgt_dt
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
	protected CostDpt_InsChk01_CndR_MC_A(ConstMetaList<? extends CostDpt_InsChk01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CostDpt_InsChk01_CndR clone() {
		return (CostDpt_InsChk01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CostDpt_InsChk01_CndR createInstance() {
		return (CostDpt_InsChk01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CostDpt_InsChk01_CndR getValues(String... names) {
		return (CostDpt_InsChk01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 0, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 0, $err_flg, value);
	}


	/**
	 * Date 対象日.<p>
	 *
	 */
	public MCDate tgt_dt() {
		return getConstDate(offset + 1, $tgt_dt);
	}

	/**
	 * Date 対象日.<p>
	 *
	 */
	public void tgt_dt(MCDate value) {
		setConstDate(offset + 1, $tgt_dt, value);
	}


	/**
	 * Add only 追加のみ.<p>
	 *
	 */
	public boolean ins_only_flg() {
		return getConstBoolean(offset + 2, $ins_only_flg);
	}

	/**
	 * Add only 追加のみ.<p>
	 *
	 */
	public void ins_only_flg(boolean value) {
		setConstBoolean(offset + 2, $ins_only_flg, value);
	}


	public MCDate getDate(String name) {
		if ($tgt_dt.equalsIgnoreCase(name)) {
			return tgt_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($ins_only_flg.equalsIgnoreCase(name)) {
			return ins_only_flg();
		}
		return super.getBoolean(name);
	}

	public MCDate getDateNE(String name) {
		if ($tgt_dt.equalsIgnoreCase(name)) {
			return tgt_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($ins_only_flg.equalsIgnoreCase(name)) {
			return ins_only_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setDate(String name, MCDate value) {
		if ($tgt_dt.equalsIgnoreCase(name)) {
			tgt_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($ins_only_flg.equalsIgnoreCase(name)) {
			ins_only_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($tgt_dt.equalsIgnoreCase(name)) {
			tgt_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($ins_only_flg.equalsIgnoreCase(name)) {
			ins_only_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

