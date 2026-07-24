package mcframe.clientMSBE.MSBEP1730;

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
 * ブロック"Ttl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class TtlR_MC_A extends MCConstRow {

	/**
	 * Total amount for invoice インボイス表記金額計.<p>
	 *
	 */
	public static final String $ttl_iv_amt = "ttl_iv_amt";
	/**
	 * Total free of charge 無償計.<p>
	 *
	 */
	public static final String $ttl_ncv_amt = "ttl_ncv_amt";
	/**
	 * Main body 本体.<p>
	 *
	 */
	public static final String $ttl_base_amt = "ttl_base_amt";
	/**
	 * Freight 運賃.<p>
	 *
	 */
	public static final String $ttl_freight_amt = "ttl_freight_amt";
	/**
	 * Insurance 保険料.<p>
	 *
	 */
	public static final String $ttl_insurance_amt = "ttl_insurance_amt";
	/**
	 * Other expenses その他経費.<p>
	 *
	 */
	public static final String $ttl_other_amt = "ttl_other_amt";


	public static final MCMeta ttl_iv_amt_META = createCommonMeta($ttl_iv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_ncv_amt_META = createCommonMeta($ttl_ncv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_base_amt_META = createCommonMeta($ttl_base_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_freight_amt_META = createCommonMeta($ttl_freight_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_insurance_amt_META = createCommonMeta($ttl_insurance_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_other_amt_META = createCommonMeta($ttl_other_amt, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<TtlR> constMetas = new ConstMetaList<TtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ttl_iv_amt_META,
			ttl_ncv_amt_META,
			ttl_base_amt_META,
			ttl_freight_amt_META,
			ttl_insurance_amt_META,
			ttl_other_amt_META
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
	protected TtlR_MC_A(ConstMetaList<? extends TtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public TtlR clone() {
		return (TtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public TtlR createInstance() {
		return (TtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public TtlR getValues(String... names) {
		return (TtlR) super.getValues(names);
	}



	/**
	 * Total amount for invoice インボイス表記金額計.<p>
	 *
	 */
	public MCNumber ttl_iv_amt() {
		return getConstNumber(offset + 0, $ttl_iv_amt);
	}

	/**
	 * Total amount for invoice インボイス表記金額計.<p>
	 *
	 */
	public void ttl_iv_amt(MCNumber value) {
		setConstNumber(offset + 0, $ttl_iv_amt, value);
	}

	/**
	 * Total amount for invoice インボイス表記金額計.<p>
	 *
	 */
	public void ttl_iv_amt(int value) {
		setConstNumber(offset + 0, $ttl_iv_amt, value);
	}

	/**
	 * Total amount for invoice インボイス表記金額計.<p>
	 *
	 */
	public void ttl_iv_amt(long value) {
		setConstNumber(offset + 0, $ttl_iv_amt, value);
	}

	/**
	 * Total amount for invoice インボイス表記金額計.<p>
	 *
	 */
	public void ttl_iv_amt(float value) {
		setConstNumber(offset + 0, $ttl_iv_amt, value);
	}

	/**
	 * Total amount for invoice インボイス表記金額計.<p>
	 *
	 */
	public void ttl_iv_amt(double value) {
		setConstNumber(offset + 0, $ttl_iv_amt, value);
	}


	/**
	 * Total free of charge 無償計.<p>
	 *
	 */
	public MCNumber ttl_ncv_amt() {
		return getConstNumber(offset + 1, $ttl_ncv_amt);
	}

	/**
	 * Total free of charge 無償計.<p>
	 *
	 */
	public void ttl_ncv_amt(MCNumber value) {
		setConstNumber(offset + 1, $ttl_ncv_amt, value);
	}

	/**
	 * Total free of charge 無償計.<p>
	 *
	 */
	public void ttl_ncv_amt(int value) {
		setConstNumber(offset + 1, $ttl_ncv_amt, value);
	}

	/**
	 * Total free of charge 無償計.<p>
	 *
	 */
	public void ttl_ncv_amt(long value) {
		setConstNumber(offset + 1, $ttl_ncv_amt, value);
	}

	/**
	 * Total free of charge 無償計.<p>
	 *
	 */
	public void ttl_ncv_amt(float value) {
		setConstNumber(offset + 1, $ttl_ncv_amt, value);
	}

	/**
	 * Total free of charge 無償計.<p>
	 *
	 */
	public void ttl_ncv_amt(double value) {
		setConstNumber(offset + 1, $ttl_ncv_amt, value);
	}


	/**
	 * Main body 本体.<p>
	 *
	 */
	public MCNumber ttl_base_amt() {
		return getConstNumber(offset + 2, $ttl_base_amt);
	}

	/**
	 * Main body 本体.<p>
	 *
	 */
	public void ttl_base_amt(MCNumber value) {
		setConstNumber(offset + 2, $ttl_base_amt, value);
	}

	/**
	 * Main body 本体.<p>
	 *
	 */
	public void ttl_base_amt(int value) {
		setConstNumber(offset + 2, $ttl_base_amt, value);
	}

	/**
	 * Main body 本体.<p>
	 *
	 */
	public void ttl_base_amt(long value) {
		setConstNumber(offset + 2, $ttl_base_amt, value);
	}

	/**
	 * Main body 本体.<p>
	 *
	 */
	public void ttl_base_amt(float value) {
		setConstNumber(offset + 2, $ttl_base_amt, value);
	}

	/**
	 * Main body 本体.<p>
	 *
	 */
	public void ttl_base_amt(double value) {
		setConstNumber(offset + 2, $ttl_base_amt, value);
	}


	/**
	 * Freight 運賃.<p>
	 *
	 */
	public MCNumber ttl_freight_amt() {
		return getConstNumber(offset + 3, $ttl_freight_amt);
	}

	/**
	 * Freight 運賃.<p>
	 *
	 */
	public void ttl_freight_amt(MCNumber value) {
		setConstNumber(offset + 3, $ttl_freight_amt, value);
	}

	/**
	 * Freight 運賃.<p>
	 *
	 */
	public void ttl_freight_amt(int value) {
		setConstNumber(offset + 3, $ttl_freight_amt, value);
	}

	/**
	 * Freight 運賃.<p>
	 *
	 */
	public void ttl_freight_amt(long value) {
		setConstNumber(offset + 3, $ttl_freight_amt, value);
	}

	/**
	 * Freight 運賃.<p>
	 *
	 */
	public void ttl_freight_amt(float value) {
		setConstNumber(offset + 3, $ttl_freight_amt, value);
	}

	/**
	 * Freight 運賃.<p>
	 *
	 */
	public void ttl_freight_amt(double value) {
		setConstNumber(offset + 3, $ttl_freight_amt, value);
	}


	/**
	 * Insurance 保険料.<p>
	 *
	 */
	public MCNumber ttl_insurance_amt() {
		return getConstNumber(offset + 4, $ttl_insurance_amt);
	}

	/**
	 * Insurance 保険料.<p>
	 *
	 */
	public void ttl_insurance_amt(MCNumber value) {
		setConstNumber(offset + 4, $ttl_insurance_amt, value);
	}

	/**
	 * Insurance 保険料.<p>
	 *
	 */
	public void ttl_insurance_amt(int value) {
		setConstNumber(offset + 4, $ttl_insurance_amt, value);
	}

	/**
	 * Insurance 保険料.<p>
	 *
	 */
	public void ttl_insurance_amt(long value) {
		setConstNumber(offset + 4, $ttl_insurance_amt, value);
	}

	/**
	 * Insurance 保険料.<p>
	 *
	 */
	public void ttl_insurance_amt(float value) {
		setConstNumber(offset + 4, $ttl_insurance_amt, value);
	}

	/**
	 * Insurance 保険料.<p>
	 *
	 */
	public void ttl_insurance_amt(double value) {
		setConstNumber(offset + 4, $ttl_insurance_amt, value);
	}


	/**
	 * Other expenses その他経費.<p>
	 *
	 */
	public MCNumber ttl_other_amt() {
		return getConstNumber(offset + 5, $ttl_other_amt);
	}

	/**
	 * Other expenses その他経費.<p>
	 *
	 */
	public void ttl_other_amt(MCNumber value) {
		setConstNumber(offset + 5, $ttl_other_amt, value);
	}

	/**
	 * Other expenses その他経費.<p>
	 *
	 */
	public void ttl_other_amt(int value) {
		setConstNumber(offset + 5, $ttl_other_amt, value);
	}

	/**
	 * Other expenses その他経費.<p>
	 *
	 */
	public void ttl_other_amt(long value) {
		setConstNumber(offset + 5, $ttl_other_amt, value);
	}

	/**
	 * Other expenses その他経費.<p>
	 *
	 */
	public void ttl_other_amt(float value) {
		setConstNumber(offset + 5, $ttl_other_amt, value);
	}

	/**
	 * Other expenses その他経費.<p>
	 *
	 */
	public void ttl_other_amt(double value) {
		setConstNumber(offset + 5, $ttl_other_amt, value);
	}


	public MCNumber getNumber(String name) {
		if ($ttl_iv_amt.equalsIgnoreCase(name)) {
			return ttl_iv_amt();
		}
		if ($ttl_ncv_amt.equalsIgnoreCase(name)) {
			return ttl_ncv_amt();
		}
		if ($ttl_base_amt.equalsIgnoreCase(name)) {
			return ttl_base_amt();
		}
		if ($ttl_freight_amt.equalsIgnoreCase(name)) {
			return ttl_freight_amt();
		}
		if ($ttl_insurance_amt.equalsIgnoreCase(name)) {
			return ttl_insurance_amt();
		}
		if ($ttl_other_amt.equalsIgnoreCase(name)) {
			return ttl_other_amt();
		}
		return super.getNumber(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($ttl_iv_amt.equalsIgnoreCase(name)) {
			return ttl_iv_amt();
		}
		if ($ttl_ncv_amt.equalsIgnoreCase(name)) {
			return ttl_ncv_amt();
		}
		if ($ttl_base_amt.equalsIgnoreCase(name)) {
			return ttl_base_amt();
		}
		if ($ttl_freight_amt.equalsIgnoreCase(name)) {
			return ttl_freight_amt();
		}
		if ($ttl_insurance_amt.equalsIgnoreCase(name)) {
			return ttl_insurance_amt();
		}
		if ($ttl_other_amt.equalsIgnoreCase(name)) {
			return ttl_other_amt();
		}
		return super.getNumberNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($ttl_iv_amt.equalsIgnoreCase(name)) {
			ttl_iv_amt(value);
			return;
		}
		if ($ttl_ncv_amt.equalsIgnoreCase(name)) {
			ttl_ncv_amt(value);
			return;
		}
		if ($ttl_base_amt.equalsIgnoreCase(name)) {
			ttl_base_amt(value);
			return;
		}
		if ($ttl_freight_amt.equalsIgnoreCase(name)) {
			ttl_freight_amt(value);
			return;
		}
		if ($ttl_insurance_amt.equalsIgnoreCase(name)) {
			ttl_insurance_amt(value);
			return;
		}
		if ($ttl_other_amt.equalsIgnoreCase(name)) {
			ttl_other_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($ttl_iv_amt.equalsIgnoreCase(name)) {
			ttl_iv_amt(value);
			return;
		}
		if ($ttl_ncv_amt.equalsIgnoreCase(name)) {
			ttl_ncv_amt(value);
			return;
		}
		if ($ttl_base_amt.equalsIgnoreCase(name)) {
			ttl_base_amt(value);
			return;
		}
		if ($ttl_freight_amt.equalsIgnoreCase(name)) {
			ttl_freight_amt(value);
			return;
		}
		if ($ttl_insurance_amt.equalsIgnoreCase(name)) {
			ttl_insurance_amt(value);
			return;
		}
		if ($ttl_other_amt.equalsIgnoreCase(name)) {
			ttl_other_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($ttl_iv_amt.equalsIgnoreCase(name)) {
			ttl_iv_amt(value);
			return;
		}
		if ($ttl_ncv_amt.equalsIgnoreCase(name)) {
			ttl_ncv_amt(value);
			return;
		}
		if ($ttl_base_amt.equalsIgnoreCase(name)) {
			ttl_base_amt(value);
			return;
		}
		if ($ttl_freight_amt.equalsIgnoreCase(name)) {
			ttl_freight_amt(value);
			return;
		}
		if ($ttl_insurance_amt.equalsIgnoreCase(name)) {
			ttl_insurance_amt(value);
			return;
		}
		if ($ttl_other_amt.equalsIgnoreCase(name)) {
			ttl_other_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($ttl_iv_amt.equalsIgnoreCase(name)) {
			ttl_iv_amt(value);
			return;
		}
		if ($ttl_ncv_amt.equalsIgnoreCase(name)) {
			ttl_ncv_amt(value);
			return;
		}
		if ($ttl_base_amt.equalsIgnoreCase(name)) {
			ttl_base_amt(value);
			return;
		}
		if ($ttl_freight_amt.equalsIgnoreCase(name)) {
			ttl_freight_amt(value);
			return;
		}
		if ($ttl_insurance_amt.equalsIgnoreCase(name)) {
			ttl_insurance_amt(value);
			return;
		}
		if ($ttl_other_amt.equalsIgnoreCase(name)) {
			ttl_other_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($ttl_iv_amt.equalsIgnoreCase(name)) {
			ttl_iv_amt(value);
			return;
		}
		if ($ttl_ncv_amt.equalsIgnoreCase(name)) {
			ttl_ncv_amt(value);
			return;
		}
		if ($ttl_base_amt.equalsIgnoreCase(name)) {
			ttl_base_amt(value);
			return;
		}
		if ($ttl_freight_amt.equalsIgnoreCase(name)) {
			ttl_freight_amt(value);
			return;
		}
		if ($ttl_insurance_amt.equalsIgnoreCase(name)) {
			ttl_insurance_amt(value);
			return;
		}
		if ($ttl_other_amt.equalsIgnoreCase(name)) {
			ttl_other_amt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($ttl_iv_amt.equalsIgnoreCase(name)) {
			ttl_iv_amt(value);
			return;
		}
		if ($ttl_ncv_amt.equalsIgnoreCase(name)) {
			ttl_ncv_amt(value);
			return;
		}
		if ($ttl_base_amt.equalsIgnoreCase(name)) {
			ttl_base_amt(value);
			return;
		}
		if ($ttl_freight_amt.equalsIgnoreCase(name)) {
			ttl_freight_amt(value);
			return;
		}
		if ($ttl_insurance_amt.equalsIgnoreCase(name)) {
			ttl_insurance_amt(value);
			return;
		}
		if ($ttl_other_amt.equalsIgnoreCase(name)) {
			ttl_other_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($ttl_iv_amt.equalsIgnoreCase(name)) {
			ttl_iv_amt(value);
			return;
		}
		if ($ttl_ncv_amt.equalsIgnoreCase(name)) {
			ttl_ncv_amt(value);
			return;
		}
		if ($ttl_base_amt.equalsIgnoreCase(name)) {
			ttl_base_amt(value);
			return;
		}
		if ($ttl_freight_amt.equalsIgnoreCase(name)) {
			ttl_freight_amt(value);
			return;
		}
		if ($ttl_insurance_amt.equalsIgnoreCase(name)) {
			ttl_insurance_amt(value);
			return;
		}
		if ($ttl_other_amt.equalsIgnoreCase(name)) {
			ttl_other_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($ttl_iv_amt.equalsIgnoreCase(name)) {
			ttl_iv_amt(value);
			return;
		}
		if ($ttl_ncv_amt.equalsIgnoreCase(name)) {
			ttl_ncv_amt(value);
			return;
		}
		if ($ttl_base_amt.equalsIgnoreCase(name)) {
			ttl_base_amt(value);
			return;
		}
		if ($ttl_freight_amt.equalsIgnoreCase(name)) {
			ttl_freight_amt(value);
			return;
		}
		if ($ttl_insurance_amt.equalsIgnoreCase(name)) {
			ttl_insurance_amt(value);
			return;
		}
		if ($ttl_other_amt.equalsIgnoreCase(name)) {
			ttl_other_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($ttl_iv_amt.equalsIgnoreCase(name)) {
			ttl_iv_amt(value);
			return;
		}
		if ($ttl_ncv_amt.equalsIgnoreCase(name)) {
			ttl_ncv_amt(value);
			return;
		}
		if ($ttl_base_amt.equalsIgnoreCase(name)) {
			ttl_base_amt(value);
			return;
		}
		if ($ttl_freight_amt.equalsIgnoreCase(name)) {
			ttl_freight_amt(value);
			return;
		}
		if ($ttl_insurance_amt.equalsIgnoreCase(name)) {
			ttl_insurance_amt(value);
			return;
		}
		if ($ttl_other_amt.equalsIgnoreCase(name)) {
			ttl_other_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($ttl_iv_amt.equalsIgnoreCase(name)) {
			ttl_iv_amt(value);
			return;
		}
		if ($ttl_ncv_amt.equalsIgnoreCase(name)) {
			ttl_ncv_amt(value);
			return;
		}
		if ($ttl_base_amt.equalsIgnoreCase(name)) {
			ttl_base_amt(value);
			return;
		}
		if ($ttl_freight_amt.equalsIgnoreCase(name)) {
			ttl_freight_amt(value);
			return;
		}
		if ($ttl_insurance_amt.equalsIgnoreCase(name)) {
			ttl_insurance_amt(value);
			return;
		}
		if ($ttl_other_amt.equalsIgnoreCase(name)) {
			ttl_other_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

