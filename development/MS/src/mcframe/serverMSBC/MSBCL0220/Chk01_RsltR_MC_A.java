package mcframe.serverMSBC.MSBCL0220;

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
 * ブロック"Chk01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk01_RsltR_MC_A extends MCConstRow {

	/**
	 * MRP calculation No. ＭＲＰ計算ＮＯ.<p>
	 *
	 */
	public static final String $mrp_calc_no = "mrp_calc_no";
	/**
	 * Sequence シーケンス.<p>
	 *
	 */
	public static final String $seq_no = "seq_no";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";


	public static final MCMeta mrp_calc_no_META = createCommonMeta($mrp_calc_no, mcframe.commonMA.meta.MA_META.MRP_CALC_NO);
	public static final MCMeta seq_no_META = createCommonMeta($seq_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);

	protected static final ConstMetaList<Chk01_RsltR> constMetas = new ConstMetaList<Chk01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			mrp_calc_no_META,
			seq_no_META,
			wg_cd_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	protected Chk01_RsltR_MC_A(ConstMetaList<? extends Chk01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_RsltR clone() {
		return (Chk01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_RsltR createInstance() {
		return (Chk01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_RsltR getValues(String... names) {
		return (Chk01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * MRP calculation No. ＭＲＰ計算ＮＯ.<p>
	 *
	 */
	public String mrp_calc_no() {
		return getConstString(offset + 0, $mrp_calc_no);
	}

	/**
	 * MRP calculation No. ＭＲＰ計算ＮＯ.<p>
	 *
	 */
	public void mrp_calc_no(String value) {
		setConstString(offset + 0, $mrp_calc_no, value);
	}


	/**
	 * Sequence シーケンス.<p>
	 *
	 */
	public MCNumber seq_no() {
		return getConstNumber(offset + 1, $seq_no);
	}

	/**
	 * Sequence シーケンス.<p>
	 *
	 */
	public void seq_no(MCNumber value) {
		setConstNumber(offset + 1, $seq_no, value);
	}

	/**
	 * Sequence シーケンス.<p>
	 *
	 */
	public void seq_no(int value) {
		setConstNumber(offset + 1, $seq_no, value);
	}

	/**
	 * Sequence シーケンス.<p>
	 *
	 */
	public void seq_no(long value) {
		setConstNumber(offset + 1, $seq_no, value);
	}

	/**
	 * Sequence シーケンス.<p>
	 *
	 */
	public void seq_no(float value) {
		setConstNumber(offset + 1, $seq_no, value);
	}

	/**
	 * Sequence シーケンス.<p>
	 *
	 */
	public void seq_no(double value) {
		setConstNumber(offset + 1, $seq_no, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 2, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 2, $wg_cd, value);
	}


	public String getString(String name) {
		if ($mrp_calc_no.equalsIgnoreCase(name)) {
			return mrp_calc_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($seq_no.equalsIgnoreCase(name)) {
			return seq_no();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($mrp_calc_no.equalsIgnoreCase(name)) {
			return mrp_calc_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($seq_no.equalsIgnoreCase(name)) {
			return seq_no();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($mrp_calc_no.equalsIgnoreCase(name)) {
			mrp_calc_no(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mrp_calc_no.equalsIgnoreCase(name)) {
			mrp_calc_no(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

