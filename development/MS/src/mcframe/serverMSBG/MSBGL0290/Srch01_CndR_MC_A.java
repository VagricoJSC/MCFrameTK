package mcframe.serverMSBG.MSBGL0290;

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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public static final String $bill_no = "bill_no";
	/**
	 * Invoice rev. number 請求書改訂番号.<p>
	 *
	 */
	public static final String $bill_rev = "bill_rev";
	/**
	 * Latest flg. 最新ＦＬＧ.<p>
	 *
	 */
	public static final String $latest_flg = "latest_flg";


	public static final MCMeta bill_no_META = createCommonMeta($bill_no, mcframe.commonMA.meta.MA_META.BILL_NO);
	public static final MCMeta bill_rev_META = createCommonMeta($bill_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta latest_flg_META = createCommonMeta($latest_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			bill_no_META,
			bill_rev_META,
			latest_flg_META
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public String bill_no() {
		return getConstString(offset + 0, $bill_no);
	}

	/**
	 * Invoice No. 請求書ＮＯ.<p>
	 *
	 */
	public void bill_no(String value) {
		setConstString(offset + 0, $bill_no, value);
	}


	/**
	 * Invoice rev. number 請求書改訂番号.<p>
	 *
	 */
	public MCNumber bill_rev() {
		return getConstNumber(offset + 1, $bill_rev);
	}

	/**
	 * Invoice rev. number 請求書改訂番号.<p>
	 *
	 */
	public void bill_rev(MCNumber value) {
		setConstNumber(offset + 1, $bill_rev, value);
	}

	/**
	 * Invoice rev. number 請求書改訂番号.<p>
	 *
	 */
	public void bill_rev(int value) {
		setConstNumber(offset + 1, $bill_rev, value);
	}

	/**
	 * Invoice rev. number 請求書改訂番号.<p>
	 *
	 */
	public void bill_rev(long value) {
		setConstNumber(offset + 1, $bill_rev, value);
	}

	/**
	 * Invoice rev. number 請求書改訂番号.<p>
	 *
	 */
	public void bill_rev(float value) {
		setConstNumber(offset + 1, $bill_rev, value);
	}

	/**
	 * Invoice rev. number 請求書改訂番号.<p>
	 *
	 */
	public void bill_rev(double value) {
		setConstNumber(offset + 1, $bill_rev, value);
	}


	/**
	 * Latest flg. 最新ＦＬＧ.<p>
	 *
	 */
	public boolean latest_flg() {
		return getConstBoolean(offset + 2, $latest_flg);
	}

	/**
	 * Latest flg. 最新ＦＬＧ.<p>
	 *
	 */
	public void latest_flg(boolean value) {
		setConstBoolean(offset + 2, $latest_flg, value);
	}


	public String getString(String name) {
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			return bill_rev();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			return bill_rev();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($latest_flg.equalsIgnoreCase(name)) {
			latest_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($latest_flg.equalsIgnoreCase(name)) {
			latest_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

