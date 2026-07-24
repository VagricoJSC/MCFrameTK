package mcframe.serverMAUC.MAUCL0020;

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
 * ブロック"Licence"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class LicenceR_MC_A extends MCConstRow {

	/**
	 * Pharmaceutical and process option valid 医薬・プロセスオプション有効.<p>
	 *
	 */
	public static final String $medicine_enable_flg = "medicine_enable_flg";
	/**
	 * PLM-LINK enabled ＰＬＭ－ＬＩＮＫ有効.<p>
	 *
	 */
	public static final String $plmlink_enable_flg = "plmlink_enable_flg";


	public static final MCMeta medicine_enable_flg_META = createCommonMeta($medicine_enable_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta plmlink_enable_flg_META = createCommonMeta($plmlink_enable_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<LicenceR> constMetas = new ConstMetaList<LicenceR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			medicine_enable_flg_META,
			plmlink_enable_flg_META
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
	protected LicenceR_MC_A(ConstMetaList<? extends LicenceR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LicenceR clone() {
		return (LicenceR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LicenceR createInstance() {
		return (LicenceR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public LicenceR getValues(String... names) {
		return (LicenceR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pharmaceutical and process option valid 医薬・プロセスオプション有効.<p>
	 *
	 */
	public boolean medicine_enable_flg() {
		return getConstBoolean(offset + 0, $medicine_enable_flg);
	}

	/**
	 * Pharmaceutical and process option valid 医薬・プロセスオプション有効.<p>
	 *
	 */
	public void medicine_enable_flg(boolean value) {
		setConstBoolean(offset + 0, $medicine_enable_flg, value);
	}


	/**
	 * PLM-LINK enabled ＰＬＭ－ＬＩＮＫ有効.<p>
	 *
	 */
	public boolean plmlink_enable_flg() {
		return getConstBoolean(offset + 1, $plmlink_enable_flg);
	}

	/**
	 * PLM-LINK enabled ＰＬＭ－ＬＩＮＫ有効.<p>
	 *
	 */
	public void plmlink_enable_flg(boolean value) {
		setConstBoolean(offset + 1, $plmlink_enable_flg, value);
	}


	public boolean getBoolean(String name) {
		if ($medicine_enable_flg.equalsIgnoreCase(name)) {
			return medicine_enable_flg();
		}
		if ($plmlink_enable_flg.equalsIgnoreCase(name)) {
			return plmlink_enable_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($medicine_enable_flg.equalsIgnoreCase(name)) {
			return medicine_enable_flg();
		}
		if ($plmlink_enable_flg.equalsIgnoreCase(name)) {
			return plmlink_enable_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($medicine_enable_flg.equalsIgnoreCase(name)) {
			medicine_enable_flg(value);
			return;
		}
		if ($plmlink_enable_flg.equalsIgnoreCase(name)) {
			plmlink_enable_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($medicine_enable_flg.equalsIgnoreCase(name)) {
			medicine_enable_flg(value);
			return;
		}
		if ($plmlink_enable_flg.equalsIgnoreCase(name)) {
			plmlink_enable_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

