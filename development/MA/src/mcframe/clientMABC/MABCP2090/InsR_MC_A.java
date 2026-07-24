package mcframe.clientMABC.MABCP2090;

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
 * ブロック"Ins"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class InsR_MC_A extends MCConstRow {

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


	public static final MCMeta tgt_dt_META = createCommonMeta($tgt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ins_only_flg_META = createCommonMeta($ins_only_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<InsR> constMetas = new ConstMetaList<InsR>(
		MCConstRow.constMetas,
		new MCMeta[]{
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
	protected InsR_MC_A(ConstMetaList<? extends InsR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InsR clone() {
		return (InsR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InsR createInstance() {
		return (InsR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InsR getValues(String... names) {
		return (InsR) super.getValues(names);
	}



	/**
	 * Date 対象日.<p>
	 *
	 */
	public MCDate tgt_dt() {
		return getConstDate(offset + 0, $tgt_dt);
	}

	/**
	 * Date 対象日.<p>
	 *
	 */
	public void tgt_dt(MCDate value) {
		setConstDate(offset + 0, $tgt_dt, value);
	}


	/**
	 * Add only 追加のみ.<p>
	 *
	 */
	public boolean ins_only_flg() {
		return getConstBoolean(offset + 1, $ins_only_flg);
	}

	/**
	 * Add only 追加のみ.<p>
	 *
	 */
	public void ins_only_flg(boolean value) {
		setConstBoolean(offset + 1, $ins_only_flg, value);
	}


	public MCDate getDate(String name) {
		if ($tgt_dt.equalsIgnoreCase(name)) {
			return tgt_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
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
		if ($ins_only_flg.equalsIgnoreCase(name)) {
			ins_only_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

