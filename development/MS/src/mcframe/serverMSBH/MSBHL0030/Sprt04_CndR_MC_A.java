package mcframe.serverMSBH.MSBHL0030;

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
 * ブロック"Sprt04_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Sprt04_CndR_MC_A extends MCConstRow {

	/**
	 * AP details No. 買掛明細ＮＯ.<p>
	 *
	 */
	public static final String $ap_d_no = "ap_d_no";
	/**
	 * Chargeable supply balance 有償支給残高.<p>
	 *
	 */
	public static final String $onr_prov_bal = "onr_prov_bal";


	public static final MCMeta ap_d_no_META = createCommonMeta($ap_d_no, mcframe.commonMA.meta.MA_META.AP_D_NO);
	public static final MCMeta onr_prov_bal_META = createCommonMeta($onr_prov_bal, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<Sprt04_CndR> constMetas = new ConstMetaList<Sprt04_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ap_d_no_META,
			onr_prov_bal_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
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
	protected Sprt04_CndR_MC_A(ConstMetaList<? extends Sprt04_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt04_CndR clone() {
		return (Sprt04_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt04_CndR createInstance() {
		return (Sprt04_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt04_CndR getValues(String... names) {
		return (Sprt04_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * AP details No. 買掛明細ＮＯ.<p>
	 *
	 */
	public String ap_d_no() {
		return getConstString(offset + 0, $ap_d_no);
	}

	/**
	 * AP details No. 買掛明細ＮＯ.<p>
	 *
	 */
	public void ap_d_no(String value) {
		setConstString(offset + 0, $ap_d_no, value);
	}


	/**
	 * Chargeable supply balance 有償支給残高.<p>
	 *
	 */
	public MCNumber onr_prov_bal() {
		return getConstNumber(offset + 1, $onr_prov_bal);
	}

	/**
	 * Chargeable supply balance 有償支給残高.<p>
	 *
	 */
	public void onr_prov_bal(MCNumber value) {
		setConstNumber(offset + 1, $onr_prov_bal, value);
	}

	/**
	 * Chargeable supply balance 有償支給残高.<p>
	 *
	 */
	public void onr_prov_bal(int value) {
		setConstNumber(offset + 1, $onr_prov_bal, value);
	}

	/**
	 * Chargeable supply balance 有償支給残高.<p>
	 *
	 */
	public void onr_prov_bal(long value) {
		setConstNumber(offset + 1, $onr_prov_bal, value);
	}

	/**
	 * Chargeable supply balance 有償支給残高.<p>
	 *
	 */
	public void onr_prov_bal(float value) {
		setConstNumber(offset + 1, $onr_prov_bal, value);
	}

	/**
	 * Chargeable supply balance 有償支給残高.<p>
	 *
	 */
	public void onr_prov_bal(double value) {
		setConstNumber(offset + 1, $onr_prov_bal, value);
	}


	public String getString(String name) {
		if ($ap_d_no.equalsIgnoreCase(name)) {
			return ap_d_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($onr_prov_bal.equalsIgnoreCase(name)) {
			return onr_prov_bal();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($ap_d_no.equalsIgnoreCase(name)) {
			return ap_d_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($onr_prov_bal.equalsIgnoreCase(name)) {
			return onr_prov_bal();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($ap_d_no.equalsIgnoreCase(name)) {
			ap_d_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($onr_prov_bal.equalsIgnoreCase(name)) {
			onr_prov_bal(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($onr_prov_bal.equalsIgnoreCase(name)) {
			onr_prov_bal(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($onr_prov_bal.equalsIgnoreCase(name)) {
			onr_prov_bal(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($onr_prov_bal.equalsIgnoreCase(name)) {
			onr_prov_bal(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($onr_prov_bal.equalsIgnoreCase(name)) {
			onr_prov_bal(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ap_d_no.equalsIgnoreCase(name)) {
			ap_d_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($onr_prov_bal.equalsIgnoreCase(name)) {
			onr_prov_bal(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($onr_prov_bal.equalsIgnoreCase(name)) {
			onr_prov_bal(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($onr_prov_bal.equalsIgnoreCase(name)) {
			onr_prov_bal(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($onr_prov_bal.equalsIgnoreCase(name)) {
			onr_prov_bal(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($onr_prov_bal.equalsIgnoreCase(name)) {
			onr_prov_bal(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

