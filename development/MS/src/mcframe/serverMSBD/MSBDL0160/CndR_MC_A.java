package mcframe.serverMSBD.MSBDL0160;

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
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * Search target type 検索対象区分.<p>
	 *
	 */
	public static final String $srch_tgt_typ = "srch_tgt_typ";
	/**
	 * Search target No. 検索対象ＮＯ.<p>
	 *
	 */
	public static final String $srch_tgt_no = "srch_tgt_no";
	/**
	 * Search target rev. number 検索対象改訂番号.<p>
	 *
	 */
	public static final String $srch_tgt_rev = "srch_tgt_rev";
	/**
	 * Latest search target 検索対象最新.<p>
	 *
	 */
	public static final String $newest_flg = "newest_flg";
	/**
	 * Operation type 操作種別.<p>
	 *
	 */
	public static final String $ope = "ope";


	public static final MCMeta srch_tgt_typ_META = createCommonMeta($srch_tgt_typ, mcframe.commonMS.meta.MS_META.SLS_SRCH_TGT_TYP);
	public static final MCMeta srch_tgt_no_META = createCommonMeta($srch_tgt_no, mcframe.commonMS.meta.MS_META.SRCH_TGT_NO);
	public static final MCMeta srch_tgt_rev_META = createCommonMeta($srch_tgt_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta newest_flg_META = createCommonMeta($newest_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ope_META = createStringMeta($ope);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			srch_tgt_typ_META,
			srch_tgt_no_META,
			srch_tgt_rev_META,
			newest_flg_META,
			ope_META
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Search target type 検索対象区分.<p>
	 *
	 */
	public String srch_tgt_typ() {
		return getConstString(offset + 0, $srch_tgt_typ);
	}

	/**
	 * Search target type 検索対象区分.<p>
	 *
	 */
	public void srch_tgt_typ(String value) {
		setConstString(offset + 0, $srch_tgt_typ, value);
	}


	/**
	 * Search target No. 検索対象ＮＯ.<p>
	 *
	 */
	public String srch_tgt_no() {
		return getConstString(offset + 1, $srch_tgt_no);
	}

	/**
	 * Search target No. 検索対象ＮＯ.<p>
	 *
	 */
	public void srch_tgt_no(String value) {
		setConstString(offset + 1, $srch_tgt_no, value);
	}


	/**
	 * Search target rev. number 検索対象改訂番号.<p>
	 *
	 */
	public MCNumber srch_tgt_rev() {
		return getConstNumber(offset + 2, $srch_tgt_rev);
	}

	/**
	 * Search target rev. number 検索対象改訂番号.<p>
	 *
	 */
	public void srch_tgt_rev(MCNumber value) {
		setConstNumber(offset + 2, $srch_tgt_rev, value);
	}

	/**
	 * Search target rev. number 検索対象改訂番号.<p>
	 *
	 */
	public void srch_tgt_rev(int value) {
		setConstNumber(offset + 2, $srch_tgt_rev, value);
	}

	/**
	 * Search target rev. number 検索対象改訂番号.<p>
	 *
	 */
	public void srch_tgt_rev(long value) {
		setConstNumber(offset + 2, $srch_tgt_rev, value);
	}

	/**
	 * Search target rev. number 検索対象改訂番号.<p>
	 *
	 */
	public void srch_tgt_rev(float value) {
		setConstNumber(offset + 2, $srch_tgt_rev, value);
	}

	/**
	 * Search target rev. number 検索対象改訂番号.<p>
	 *
	 */
	public void srch_tgt_rev(double value) {
		setConstNumber(offset + 2, $srch_tgt_rev, value);
	}


	/**
	 * Latest search target 検索対象最新.<p>
	 *
	 */
	public boolean newest_flg() {
		return getConstBoolean(offset + 3, $newest_flg);
	}

	/**
	 * Latest search target 検索対象最新.<p>
	 *
	 */
	public void newest_flg(boolean value) {
		setConstBoolean(offset + 3, $newest_flg, value);
	}


	/**
	 * Operation type 操作種別.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 4, $ope);
	}

	/**
	 * Operation type 操作種別.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 4, $ope, value);
	}


	public String getString(String name) {
		if ($srch_tgt_typ.equalsIgnoreCase(name)) {
			return srch_tgt_typ();
		}
		if ($srch_tgt_no.equalsIgnoreCase(name)) {
			return srch_tgt_no();
		}
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($srch_tgt_rev.equalsIgnoreCase(name)) {
			return srch_tgt_rev();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($newest_flg.equalsIgnoreCase(name)) {
			return newest_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($srch_tgt_typ.equalsIgnoreCase(name)) {
			return srch_tgt_typ();
		}
		if ($srch_tgt_no.equalsIgnoreCase(name)) {
			return srch_tgt_no();
		}
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($srch_tgt_rev.equalsIgnoreCase(name)) {
			return srch_tgt_rev();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($newest_flg.equalsIgnoreCase(name)) {
			return newest_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($srch_tgt_typ.equalsIgnoreCase(name)) {
			srch_tgt_typ(value);
			return;
		}
		if ($srch_tgt_no.equalsIgnoreCase(name)) {
			srch_tgt_no(value);
			return;
		}
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($srch_tgt_rev.equalsIgnoreCase(name)) {
			srch_tgt_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($srch_tgt_rev.equalsIgnoreCase(name)) {
			srch_tgt_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($srch_tgt_rev.equalsIgnoreCase(name)) {
			srch_tgt_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($srch_tgt_rev.equalsIgnoreCase(name)) {
			srch_tgt_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($srch_tgt_rev.equalsIgnoreCase(name)) {
			srch_tgt_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($newest_flg.equalsIgnoreCase(name)) {
			newest_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($srch_tgt_typ.equalsIgnoreCase(name)) {
			srch_tgt_typ(value);
			return;
		}
		if ($srch_tgt_no.equalsIgnoreCase(name)) {
			srch_tgt_no(value);
			return;
		}
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($srch_tgt_rev.equalsIgnoreCase(name)) {
			srch_tgt_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($srch_tgt_rev.equalsIgnoreCase(name)) {
			srch_tgt_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($srch_tgt_rev.equalsIgnoreCase(name)) {
			srch_tgt_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($srch_tgt_rev.equalsIgnoreCase(name)) {
			srch_tgt_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($srch_tgt_rev.equalsIgnoreCase(name)) {
			srch_tgt_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($newest_flg.equalsIgnoreCase(name)) {
			newest_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

