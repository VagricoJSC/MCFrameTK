package mcframe.serverMABC.MABCL1250;

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
 * ブロック"SchdPay_UpdChk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class SchdPay_UpdChk01_DtlR_MC_A extends mcframe.serverMA.dbc.MAM_SCHD_PAY_R {

	/**
	 * Use subsidiary account 補助科目使用.<p>
	 *
	 */
	public static final String $sub_flg = "sub_flg";


	public static final MCMeta sub_flg_META = createCommonMeta($sub_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<SchdPay_UpdChk01_DtlR> constMetas = new ConstMetaList<SchdPay_UpdChk01_DtlR>(
		mcframe.serverMA.dbc.MAM_SCHD_PAY_R.constMetas,
		new MCMeta[]{
			sub_flg_META,
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
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
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
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$pay_ap_typ, "E"},	// pay_ap_typ
				{$seq, "E"},	// seq
				{$prio, "E"},	// prio
				{$ac_cd, "E"},	// ac_cd
				{$abs_typ, "E"}	// abs_typ
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$pay_ap_typ, "MAC_PAY_AP_TYP"},	// pay_ap_typ
				{$foreign_typ, "MAC_FOREIGN_TYP"},	// foreign_typ
				{$abs_typ, "MAC_ABS_TYP"}	// abs_typ
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$cur_cd, "MA.MAUAL0010.Cur"},	// cur_cd
				{$asppl_cd, "MA.MAUAL0010.Bp"},	// asppl_cd
				{$ac_cd, "MA.MAUAL0010.Account"},	// ac_cd
				{$sub_ac_cd, "MA.MAUAL0010.SubAccount"}	// sub_ac_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$ac_cd, "sub_flg"}	// ac_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$ac_cd, "sub_flg"}	// ac_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$asppl_cd, "MAC_BP_IS_SRCH_TYP.ASPPL"},	// asppl_cd
				{$sub_ac_cd, "ac_cd"}	// sub_ac_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$asppl_cd, "bp_is_srch_typ"},	// asppl_cd
				{$sub_ac_cd, "ac_cd"}	// sub_ac_cd
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$seq, "1:9999"},	// seq
				{$prio, "0:"}	// prio
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
	protected SchdPay_UpdChk01_DtlR_MC_A(ConstMetaList<? extends SchdPay_UpdChk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SchdPay_UpdChk01_DtlR clone() {
		return (SchdPay_UpdChk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SchdPay_UpdChk01_DtlR createInstance() {
		return (SchdPay_UpdChk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SchdPay_UpdChk01_DtlR getValues(String... names) {
		return (SchdPay_UpdChk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Use subsidiary account 補助科目使用.<p>
	 *
	 */
	public boolean sub_flg() {
		return getConstBoolean(offset + 0, $sub_flg);
	}

	/**
	 * Use subsidiary account 補助科目使用.<p>
	 *
	 */
	public void sub_flg(boolean value) {
		setConstBoolean(offset + 0, $sub_flg, value);
	}


	public String getString(String name) {
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($sub_flg.equalsIgnoreCase(name)) {
			return sub_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($sub_flg.equalsIgnoreCase(name)) {
			return sub_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($sub_flg.equalsIgnoreCase(name)) {
			sub_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($sub_flg.equalsIgnoreCase(name)) {
			sub_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

